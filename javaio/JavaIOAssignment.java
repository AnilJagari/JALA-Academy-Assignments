package jala.javaio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Assignment-15: Java IO
 * Topics: InputStream, OutputStream, BufferedInputStream,
 *         BufferedOutputStream, FileReader, FileWriter,
 *         BufferedReader, BufferedWriter, Properties,
 *         CSV read/write (Excel simulation)
 * Author: Anil Jagari
 */
public class JavaIOAssignment {

    // =====================================================
    // File paths - adjust if running outside Eclipse
    // =====================================================
    static final String SAMPLE_TXT          = "src/jala/javaio/sample.txt";
    static final String OUTPUT_TXT          = "src/jala/javaio/output.txt";
    static final String CONFIG_PROPERTIES   = "src/jala/javaio/config.properties";
    static final String STUDENTS_CSV        = "src/jala/javaio/students.csv";
    static final String STUDENTS_OUTPUT_CSV = "src/jala/javaio/students_output.csv";

    // =====================================================
    // Task 1: Read text from .txt file using InputStream
    //         InputStream reads RAW BYTES (not characters)
    //         Lowest level of file reading
    // =====================================================
    public void readUsingInputStream() {
        System.out.println("===== Task 1: Read using InputStream =====");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(SAMPLE_TXT);
            int byteData;
            StringBuilder content = new StringBuilder();

            // read() returns one byte at a time → -1 means end of file
            while ((byteData = inputStream.read()) != -1) {
                content.append((char) byteData);  // cast byte to char
            }
            System.out.println("File Content:");
            System.out.println(content.toString());

        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        } finally {
            // Always close stream in finally
            if (inputStream != null) {
                try {
                    inputStream.close();
                    System.out.println("InputStream closed.");
                } catch (IOException e) {
                    System.out.println("Error closing stream : " + e.getMessage());
                }
            }
        }
    }

    // =====================================================
    // Task 2: Write text to .txt file using OutputStream
    //         OutputStream writes RAW BYTES
    // =====================================================
    public void writeUsingOutputStream() {
        System.out.println("\n===== Task 2: Write using OutputStream =====");
        OutputStream outputStream = null;
        try {
            // false → overwrite file | true → append to file
            outputStream = new FileOutputStream(OUTPUT_TXT, false);

            String content = "===== Written using OutputStream =====\n"
                    + "Institute : JALA Academy\n"
                    + "Location  : Hyderabad\n"
                    + "Course    : Full Stack Java\n"
                    + "Duration  : 6 Months\n"
                    + "Written at: " + new java.util.Date() + "\n";

            // Convert string to bytes and write
            byte[] bytes = content.getBytes();
            outputStream.write(bytes);
            outputStream.flush();   // flush remaining bytes to file

            System.out.println("Content written to : " + OUTPUT_TXT);
            System.out.println("Content:\n" + content);

        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                    System.out.println("OutputStream closed.");
                } catch (IOException e) {
                    System.out.println("Error closing stream : " + e.getMessage());
                }
            }
        }
    }

    // =====================================================
    // Task 3: Read text using BufferedInputStream
    //         Wraps InputStream → reads chunks (buffer)
    //         Much FASTER than plain InputStream
    // =====================================================
    public void readUsingBufferedInputStream() {
        System.out.println("\n===== Task 3: Read using BufferedInputStream =====");
        BufferedInputStream bufferedInputStream = null;
        try {
            // Wrap FileInputStream in BufferedInputStream
            bufferedInputStream = new BufferedInputStream(
                    new FileInputStream(SAMPLE_TXT)
            );

            int byteData;
            StringBuilder content = new StringBuilder();

            while ((byteData = bufferedInputStream.read()) != -1) {
                content.append((char) byteData);
            }

            System.out.println("File Content (via BufferedInputStream):");
            System.out.println(content.toString());
            System.out.println("BufferedInputStream reads in CHUNKS → faster than InputStream");

        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                    System.out.println("BufferedInputStream closed.");
                } catch (IOException e) {
                    System.out.println("Error closing : " + e.getMessage());
                }
            }
        }
    }

    // =====================================================
    // Task 4: Write text using BufferedOutputStream
    //         Wraps OutputStream → writes in buffer chunks
    //         More efficient than plain OutputStream
    // =====================================================
    public void writeUsingBufferedOutputStream() {
        System.out.println("\n===== Task 4: Write using BufferedOutputStream =====");
        BufferedOutputStream bufferedOutputStream = null;
        try {
            // true → append to existing output.txt
            bufferedOutputStream = new BufferedOutputStream(
                    new FileOutputStream(OUTPUT_TXT, true)
            );

            String content = "\n===== Written using BufferedOutputStream =====\n"
                    + "Course    : MERN Stack\n"
                    + "Duration  : 4 Months\n"
                    + "Fees      : 20000\n"
                    + "Written at: " + new java.util.Date() + "\n";

            bufferedOutputStream.write(content.getBytes());
            bufferedOutputStream.flush();   // flush buffer to file

            System.out.println("Content appended to : " + OUTPUT_TXT);
            System.out.println("Content:\n" + content);

        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        } finally {
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                    System.out.println("BufferedOutputStream closed.");
                } catch (IOException e) {
                    System.out.println("Error closing : " + e.getMessage());
                }
            }
        }
    }

    // =====================================================
    // Task 5: Read text using FileReader
    //         FileReader reads CHARACTERS (not bytes)
    //         Better than InputStream for text files
    // =====================================================
    public void readUsingFileReader() {
        System.out.println("\n===== Task 5: Read using FileReader =====");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(SAMPLE_TXT);
            int charData;
            StringBuilder content = new StringBuilder();

            // read() returns one character at a time → -1 at end
            while ((charData = fileReader.read()) != -1) {
                content.append((char) charData);
            }

            System.out.println("File Content (via FileReader):");
            System.out.println(content.toString());
            System.out.println("FileReader reads CHARACTERS → better for text files");

        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                    System.out.println("FileReader closed.");
                } catch (IOException e) {
                    System.out.println("Error closing : " + e.getMessage());
                }
            }
        }
    }

    // =====================================================
    // Task 6: Write text using FileWriter
    //         FileWriter writes CHARACTERS to file
    // =====================================================
    public void writeUsingFileWriter() {
        System.out.println("\n===== Task 6: Write using FileWriter =====");
        FileWriter fileWriter = null;
        try {
            // true → append | false → overwrite
            fileWriter = new FileWriter(OUTPUT_TXT, true);

            String content = "\n===== Written using FileWriter =====\n"
                    + "Student   : Anil Jagari\n"
                    + "Course    : Full Stack Java\n"
                    + "Status    : Active\n"
                    + "Written at: " + new java.util.Date() + "\n";

            fileWriter.write(content);  // write string directly (no getBytes needed)
            fileWriter.flush();

            System.out.println("Content appended to : " + OUTPUT_TXT);
            System.out.println("Content:\n" + content);

        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                    System.out.println("FileWriter closed.");
                } catch (IOException e) {
                    System.out.println("Error closing : " + e.getMessage());
                }
            }
        }
    }

    // =====================================================
    // Task 7: Read text using BufferedReader
    //         Wraps FileReader → reads WHOLE LINES
    //         Most common and efficient way for text reading
    // =====================================================
    public void readUsingBufferedReader() {
        System.out.println("\n===== Task 7: Read using BufferedReader =====");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(SAMPLE_TXT));
            String line;
            int lineNumber = 1;

            System.out.println("File Content (via BufferedReader - line by line):");
            System.out.println("-------------------------------------------");

            // readLine() reads full line → null at end of file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line " + lineNumber + " : " + line);
                lineNumber++;
            }
            System.out.println("-------------------------------------------");
            System.out.println("Total lines read : " + (lineNumber - 1));

        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                    System.out.println("BufferedReader closed.");
                } catch (IOException e) {
                    System.out.println("Error closing : " + e.getMessage());
                }
            }
        }
    }

    // =====================================================
    // Task 8: Write text using BufferedWriter
    //         Wraps FileWriter → buffered character writing
    //         newLine() adds OS-specific line separator
    // =====================================================
    public void writeUsingBufferedWriter() {
        System.out.println("\n===== Task 8: Write using BufferedWriter =====");
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_TXT, true));

            String[] lines = {
                "",
                "===== Written using BufferedWriter =====",
                "Line 1 : JALA Academy - Hyderabad",
                "Line 2 : Full Stack Java - 6 Months",
                "Line 3 : QA Automation - 3 Months",
                "Line 4 : DevOps - 3 Months",
                "Line 5 : Cyber Security - 6 Months",
                "Written at: " + new java.util.Date()
            };

            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();   // OS-specific line break
            }
            bufferedWriter.flush();

            System.out.println("Content appended to : " + OUTPUT_TXT);
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                    System.out.println("BufferedWriter closed.");
                } catch (IOException e) {
                    System.out.println("Error closing : " + e.getMessage());
                }
            }
        }
    }

    // =====================================================
    // Task 9: Read data from properties file
    //         Properties file → key=value pairs
    //         Used for configuration settings
    // =====================================================
    public void readFromPropertiesFile() {
        System.out.println("\n===== Task 9: Read from Properties File =====");
        Properties properties = new Properties();
        FileInputStream fis    = null;
        try {
            fis = new FileInputStream(CONFIG_PROPERTIES);
            properties.load(fis);   // load key=value pairs

            System.out.println("Properties loaded from : " + CONFIG_PROPERTIES);
            System.out.println("-------------------------------------------");

            // Read specific keys
            System.out.println("institute.name        : "
                    + properties.getProperty("institute.name"));
            System.out.println("institute.location    : "
                    + properties.getProperty("institute.location"));
            System.out.println("institute.established : "
                    + properties.getProperty("institute.established"));
            System.out.println("course.name           : "
                    + properties.getProperty("course.name"));
            System.out.println("course.duration       : "
                    + properties.getProperty("course.duration") + " months");
            System.out.println("course.fees           : "
                    + properties.getProperty("course.fees"));
            System.out.println("job.guarantee         : "
                    + properties.getProperty("job.guarantee"));
            System.out.println("max.students          : "
                    + properties.getProperty("max.students"));
            System.out.println("contact.email         : "
                    + properties.getProperty("contact.email"));
            System.out.println("contact.phone         : "
                    + properties.getProperty("contact.phone"));

            // Read with default value (key doesn't exist)
            System.out.println("website (default)     : "
                    + properties.getProperty("website", "www.jalaacademy.com"));

            System.out.println("-------------------------------------------");
            System.out.println("Total properties loaded : " + properties.size());

        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                    System.out.println("Properties FileInputStream closed.");
                } catch (IOException e) {
                    System.out.println("Error closing : " + e.getMessage());
                }
            }
        }
    }

    // =====================================================
    // Task 10: Read data from CSV (Excel simulation)
    //          CSV = Comma Separated Values
    //          Excel files (.xlsx) need Apache POI library
    //          CSV is readable without external library
    // =====================================================
    public void readFromCSV() {
        System.out.println("\n===== Task 10: Read from CSV (Excel) =====");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(STUDENTS_CSV));
            String line;
            int rowNumber = 0;

            System.out.println("Reading from : " + STUDENTS_CSV);
            System.out.println("-------------------------------------------");
            System.out.printf("%-12s %-20s %-20s %-10s %-10s%n",
                    "StudentId", "StudentName", "Course", "Duration", "Fees");
            System.out.println("-------------------------------------------");

            while ((line = bufferedReader.readLine()) != null) {
                if (rowNumber == 0) {
                    // Skip header row
                    rowNumber++;
                    continue;
                }

                // Split by comma → get each column
                String[] columns = line.split(",");

                String studentId   = columns[0].trim();
                String studentName = columns[1].trim();
                String course      = columns[2].trim();
                String duration    = columns[3].trim();
                String fees        = columns[4].trim();

                System.out.printf("%-12s %-20s %-20s %-10s %-10s%n",
                        studentId, studentName, course, duration, fees);

                rowNumber++;
            }

            System.out.println("-------------------------------------------");
            System.out.println("Total data rows read : " + (rowNumber - 1));

        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                    System.out.println("CSV BufferedReader closed.");
                } catch (IOException e) {
                    System.out.println("Error closing : " + e.getMessage());
                }
            }
        }
    }

    // =====================================================
    // Task 11: Write data to CSV (Excel simulation)
    //          Writing rows with commas → CSV format
    // =====================================================
    public void writeToCSV() {
        System.out.println("\n===== Task 11: Write to CSV (Excel) =====");
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(
                    new FileWriter(STUDENTS_OUTPUT_CSV, false)
            );

            // Data to write
            String[][] students = {
                {"StudentId", "StudentName",   "Course",          "Duration", "Fees",  "Status"},
                {"1",         "Anil Jagari",   "Full Stack Java",  "6",       "25000", "Active"},
                {"2",         "Ravi Kumar",    "MERN Stack",       "4",       "20000", "Active"},
                {"3",         "Sita Devi",     "QA Automation",    "3",       "15000", "Active"},
                {"4",         "Gita Sharma",   "DevOps",           "3",       "18000", "Completed"},
                {"5",         "Mohan Rao",     "Cyber Security",   "6",       "30000", "Active"},
                {"6",         "Priya Singh",   "RPA",              "2",       "12000", "Active"},
                {"7",         "Suresh Babu",   "Cloud AWS",        "4",       "22000", "Completed"}
            };

            System.out.println("Writing to : " + STUDENTS_OUTPUT_CSV);
            System.out.println("-------------------------------------------");

            for (String[] row : students) {
                // Join columns with comma → CSV format
                StringBuilder csvLine = new StringBuilder();
                for (int i = 0; i < row.length; i++) {
                    csvLine.append(row[i]);
                    if (i < row.length - 1) {
                        csvLine.append(",");
                    }
                }
                bufferedWriter.write(csvLine.toString());
                bufferedWriter.newLine();
                System.out.println(csvLine.toString());
            }

            bufferedWriter.flush();
            System.out.println("-------------------------------------------");
            System.out.println("Total rows written : " + students.length);
            System.out.println("File saved at      : " + STUDENTS_OUTPUT_CSV);

        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                    System.out.println("CSV BufferedWriter closed.");
                } catch (IOException e) {
                    System.out.println("Error closing : " + e.getMessage());
                }
            }
        }
    }

    // =====================================================
    // MAIN METHOD
    // =====================================================
    public static void main(String[] args) {

        JavaIOAssignment obj = new JavaIOAssignment();

        obj.readUsingInputStream();           // Task 1
        obj.writeUsingOutputStream();         // Task 2
        obj.readUsingBufferedInputStream();   // Task 3
        obj.writeUsingBufferedOutputStream(); // Task 4
        obj.readUsingFileReader();            // Task 5
        obj.writeUsingFileWriter();           // Task 6
        obj.readUsingBufferedReader();        // Task 7
        obj.writeUsingBufferedWriter();       // Task 8
        obj.readFromPropertiesFile();         // Task 9
        obj.readFromCSV();                    // Task 10
        obj.writeToCSV();                     // Task 11

        // Summary
        System.out.println("\n================================================");
        System.out.println("  SUMMARY: Java IO Classes                      ");
        System.out.println("================================================");
        System.out.println("InputStream          → reads raw bytes, byte by byte");
        System.out.println("OutputStream         → writes raw bytes");
        System.out.println("BufferedInputStream  → wraps InputStream, faster (chunks)");
        System.out.println("BufferedOutputStream → wraps OutputStream, faster (chunks)");
        System.out.println("FileReader           → reads characters (text files)");
        System.out.println("FileWriter           → writes characters (text files)");
        System.out.println("BufferedReader       → wraps FileReader, reads full lines");
        System.out.println("BufferedWriter       → wraps FileWriter, newLine() support");
        System.out.println("Properties           → reads key=value from .properties");
        System.out.println("CSV read             → BufferedReader + split(',')");
        System.out.println("CSV write            → BufferedWriter + join with ','");
        System.out.println("Always               → close streams in finally block");
    }
}