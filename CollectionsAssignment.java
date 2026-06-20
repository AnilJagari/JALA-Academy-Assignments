import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Assignment-16: Collections
 * Topics: ArrayList, HashMap, HashSet
 * Author: Anil Jagari
 */
public class CollectionsAssignment {

    // =====================================================
    // PART 1: ArrayList Operations
    // =====================================================
    public void arrayListOperations() {

        System.out.println("================================================");
        System.out.println("  PART 1: ArrayList Operations                  ");
        System.out.println("================================================");

        // Create ArrayList with 10 String elements
        ArrayList<String> list = new ArrayList<String>();
        list.add("Anil Jagari");
        list.add("Ravi Kumar");
        list.add("Sita Devi");
        list.add("Gita Sharma");
        list.add("Mohan Rao");
        list.add("Priya Singh");
        list.add("Suresh Babu");
        list.add("Deepa Nair");
        list.add("Kiran Shah");
        list.add("Vijay Reddy");

        System.out.println("\nInitial ArrayList:");
        System.out.println(list);

        // -------------------------------------------------
        // Add an element to ArrayList
        // -------------------------------------------------
        System.out.println("\n--- Add Element ---");
        list.add("Lakshmi Rao");
        System.out.println("After add('Lakshmi Rao') : " + list);

        // -------------------------------------------------
        // Iterate using Iterator object
        // -------------------------------------------------
        System.out.println("\n--- Iterate using Iterator ---");
        Iterator<String> iterator = list.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("  [" + index + "] " + element);
            index++;
        }

        // -------------------------------------------------
        // Add element at specific index
        // -------------------------------------------------
        System.out.println("\n--- Add at Specific Index ---");
        list.add(2, "New Student at Index 2");
        System.out.println("After add(2, 'New Student') : " + list);

        // -------------------------------------------------
        // Remove element by value
        // -------------------------------------------------
        System.out.println("\n--- Remove by Value ---");
        boolean removed = list.remove("New Student at Index 2");
        System.out.println("remove('New Student at Index 2') : " + removed);
        System.out.println("After remove by value : " + list);

        // -------------------------------------------------
        // Remove element at index
        // -------------------------------------------------
        System.out.println("\n--- Remove at Index ---");
        String removedElement = list.remove(0);
        System.out.println("remove(0) removed : " + removedElement);
        System.out.println("After remove at index 0 : " + list);

        // -------------------------------------------------
        // Update element at specific index
        // -------------------------------------------------
        System.out.println("\n--- Update at Index ---");
        System.out.println("Before update index 0 : " + list.get(0));
        list.set(0, "Updated - Ravi Kumar");
        System.out.println("After  set(0, 'Updated - Ravi Kumar') : " + list.get(0));

        // -------------------------------------------------
        // Check element at specific index
        // -------------------------------------------------
        System.out.println("\n--- Check Element at Index ---");
        System.out.println("Element at index 1 : " + list.get(1));
        System.out.println("Element at index 2 : " + list.get(2));
        System.out.println("Element at index 3 : " + list.get(3));

        // -------------------------------------------------
        // Get element at specific index
        // -------------------------------------------------
        System.out.println("\n--- Get Element at Index ---");
        String elementAt4 = list.get(4);
        System.out.println("get(4) : " + elementAt4);

        // -------------------------------------------------
        // Size of ArrayList
        // -------------------------------------------------
        System.out.println("\n--- Size of ArrayList ---");
        System.out.println("size() : " + list.size());

        // -------------------------------------------------
        // Check if element is present
        // -------------------------------------------------
        System.out.println("\n--- Contains Check ---");
        System.out.println("contains('Sita Devi')    : " + list.contains("Sita Devi"));
        System.out.println("contains('John Doe')     : " + list.contains("John Doe"));
        System.out.println("indexOf('Sita Devi')     : " + list.indexOf("Sita Devi"));

        // -------------------------------------------------
        // Remove all elements
        // -------------------------------------------------
        System.out.println("\n--- Remove All Elements ---");
        System.out.println("Before clear() size : " + list.size());
        list.clear();
        System.out.println("After  clear() size : " + list.size());
        System.out.println("isEmpty()           : " + list.isEmpty());
        System.out.println("List after clear()  : " + list);
    }

    // =====================================================
    // PART 2: HashMap Operations
    // =====================================================
    public void hashMapOperations() {

        System.out.println("\n================================================");
        System.out.println("  PART 2: HashMap Operations                    ");
        System.out.println("================================================");

        // Create HashMap with 10 key-value pairs (StudentId → Name)
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(101, "Anil Jagari");
        map.put(102, "Ravi Kumar");
        map.put(103, "Sita Devi");
        map.put(104, "Gita Sharma");
        map.put(105, "Mohan Rao");
        map.put(106, "Priya Singh");
        map.put(107, "Suresh Babu");
        map.put(108, "Deepa Nair");
        map.put(109, "Kiran Shah");
        map.put(110, "Vijay Reddy");

        System.out.println("\nInitial HashMap:");
        System.out.println(map);

        // -------------------------------------------------
        // Insert a key-value mapping
        // -------------------------------------------------
        System.out.println("\n--- Insert Key-Value ---");
        map.put(111, "Lakshmi Rao");
        System.out.println("put(111, 'Lakshmi Rao') done");
        System.out.println("HashMap : " + map);

        // -------------------------------------------------
        // Fetch value of a key
        // -------------------------------------------------
        System.out.println("\n--- Fetch Value by Key ---");
        String name101 = map.get(101);
        String name105 = map.get(105);
        System.out.println("get(101) : " + name101);
        System.out.println("get(105) : " + name105);
        System.out.println("get(999) : " + map.get(999));  // key not found → null

        // -------------------------------------------------
        // Clone / Copy of HashMap
        // -------------------------------------------------
        System.out.println("\n--- Clone/Copy HashMap ---");
        HashMap<Integer, String> clonedMap = new HashMap<Integer, String>(map);
        System.out.println("Cloned map size : " + clonedMap.size());
        System.out.println("Cloned map      : " + clonedMap);

        // -------------------------------------------------
        // Check if key is in map
        // -------------------------------------------------
        System.out.println("\n--- containsKey() ---");
        System.out.println("containsKey(101) : " + map.containsKey(101));
        System.out.println("containsKey(999) : " + map.containsKey(999));

        // -------------------------------------------------
        // Check if value is in map
        // -------------------------------------------------
        System.out.println("\n--- containsValue() ---");
        System.out.println("containsValue('Sita Devi') : " + map.containsValue("Sita Devi"));
        System.out.println("containsValue('John Doe')  : " + map.containsValue("John Doe"));

        // -------------------------------------------------
        // Check if map is empty
        // -------------------------------------------------
        System.out.println("\n--- isEmpty() ---");
        System.out.println("isEmpty() : " + map.isEmpty());

        // -------------------------------------------------
        // Print size of map
        // -------------------------------------------------
        System.out.println("\n--- size() ---");
        System.out.println("size() : " + map.size());

        // -------------------------------------------------
        // Print all keys
        // -------------------------------------------------
        System.out.println("\n--- Print All Keys (keySet()) ---");
        Set<Integer> keys = map.keySet();
        System.out.println("All Keys : " + keys);
        System.out.println("Iterating keys:");
        for (Integer key : keys) {
            System.out.println("  Key : " + key);
        }

        // -------------------------------------------------
        // Print all values
        // -------------------------------------------------
        System.out.println("\n--- Print All Values (values()) ---");
        System.out.println("All Values : " + map.values());
        System.out.println("Iterating values:");
        for (String value : map.values()) {
            System.out.println("  Value : " + value);
        }

        // -------------------------------------------------
        // Print all key-value pairs using entrySet
        // -------------------------------------------------
        System.out.println("\n--- Print All Key-Value Pairs (entrySet()) ---");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("  StudentId : " + entry.getKey()
                    + "  Name : " + entry.getValue());
        }

        // -------------------------------------------------
        // Remove specific key-value pair
        // -------------------------------------------------
        System.out.println("\n--- Remove Key-Value Pair ---");
        System.out.println("Before remove(111) size : " + map.size());
        String removedValue = map.remove(111);
        System.out.println("remove(111) removed : " + removedValue);
        System.out.println("After  remove(111) size : " + map.size());

        // -------------------------------------------------
        // Copy all elements to another map
        // -------------------------------------------------
        System.out.println("\n--- Copy All Elements to Another Map (putAll) ---");
        HashMap<Integer, String> anotherMap = new HashMap<Integer, String>();
        anotherMap.put(201, "New Student");      // existing entry
        System.out.println("anotherMap before putAll : " + anotherMap);
        anotherMap.putAll(map);                  // copy all from map
        System.out.println("anotherMap after  putAll : " + anotherMap);
        System.out.println("anotherMap size          : " + anotherMap.size());
    }

    // =====================================================
    // PART 3: HashSet Operations
    // =====================================================
    public void hashSetOperations() {

        System.out.println("\n================================================");
        System.out.println("  PART 3: HashSet Operations                    ");
        System.out.println("================================================");

        // Create HashSet with 10 String elements
        // HashSet → NO duplicates, NO guaranteed order
        HashSet<String> set = new HashSet<String>();
        set.add("Full Stack Java");
        set.add("MERN Stack");
        set.add("QA Automation");
        set.add("DevOps");
        set.add("Cyber Security");
        set.add("Cloud AWS");
        set.add("RPA");
        set.add("Python");
        set.add("Data Science");
        set.add("UI UX Design");

        System.out.println("\nInitial HashSet:");
        System.out.println(set);
        System.out.println("Note: HashSet does NOT maintain insertion order");

        // -------------------------------------------------
        // Add element
        // -------------------------------------------------
        System.out.println("\n--- add() ---");
        boolean added1 = set.add("Angular");
        boolean added2 = set.add("Full Stack Java");   // duplicate → not added
        System.out.println("add('Angular')         : " + added1 + " (added)");
        System.out.println("add('Full Stack Java') : " + added2
                + " (duplicate → NOT added)");
        System.out.println("HashSet : " + set);

        // -------------------------------------------------
        // Iterate using Iterator
        // -------------------------------------------------
        System.out.println("\n--- Iterate using Iterator ---");
        Iterator<String> iterator = set.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            System.out.println("  [" + index + "] " + iterator.next());
            index++;
        }

        // -------------------------------------------------
        // Iterate using for-each
        // -------------------------------------------------
        System.out.println("\n--- Iterate using for-each ---");
        for (String course : set) {
            System.out.println("  Course : " + course);
        }

        // -------------------------------------------------
        // Check if element exists (contains)
        // -------------------------------------------------
        System.out.println("\n--- contains() ---");
        System.out.println("contains('DevOps')      : " + set.contains("DevOps"));
        System.out.println("contains('Blockchain')  : " + set.contains("Blockchain"));

        // -------------------------------------------------
        // Size of HashSet
        // -------------------------------------------------
        System.out.println("\n--- size() ---");
        System.out.println("size() : " + set.size());

        // -------------------------------------------------
        // Check if empty
        // -------------------------------------------------
        System.out.println("\n--- isEmpty() ---");
        System.out.println("isEmpty() : " + set.isEmpty());

        // -------------------------------------------------
        // Remove specific element
        // -------------------------------------------------
        System.out.println("\n--- remove() ---");
        System.out.println("Before remove size : " + set.size());
        boolean removedAngular = set.remove("Angular");
        System.out.println("remove('Angular')  : " + removedAngular);
        System.out.println("After  remove size : " + set.size());

        // -------------------------------------------------
        // Remove non-existing element
        // -------------------------------------------------
        System.out.println("\n--- remove() non-existing ---");
        boolean removedNone = set.remove("Blockchain");
        System.out.println("remove('Blockchain') : " + removedNone + " (not found)");

        // -------------------------------------------------
        // Copy / Clone HashSet
        // -------------------------------------------------
        System.out.println("\n--- Copy HashSet ---");
        HashSet<String> copiedSet = new HashSet<String>(set);
        System.out.println("Copied set size : " + copiedSet.size());
        System.out.println("Copied set      : " + copiedSet);

        // -------------------------------------------------
        // addAll → Union of two sets
        // -------------------------------------------------
        System.out.println("\n--- addAll() → Union ---");
        HashSet<String> set2 = new HashSet<String>();
        set2.add("Blockchain");
        set2.add("AI ML");
        set2.add("DevOps");       // duplicate with set → only added once
        set2.add("React Native");

        System.out.println("set2     : " + set2);
        HashSet<String> unionSet = new HashSet<String>(set);
        unionSet.addAll(set2);
        System.out.println("Union    : " + unionSet);

        // -------------------------------------------------
        // retainAll → Intersection of two sets
        // -------------------------------------------------
        System.out.println("\n--- retainAll() → Intersection ---");
        HashSet<String> intersectSet = new HashSet<String>(set);
        intersectSet.retainAll(set2);
        System.out.println("Intersection (common elements) : " + intersectSet);

        // -------------------------------------------------
        // removeAll → Difference of two sets
        // -------------------------------------------------
        System.out.println("\n--- removeAll() → Difference ---");
        HashSet<String> differenceSet = new HashSet<String>(set);
        differenceSet.removeAll(set2);
        System.out.println("Difference (set - set2) : " + differenceSet);

        // -------------------------------------------------
        // containsAll → Check if all elements present
        // -------------------------------------------------
        System.out.println("\n--- containsAll() ---");
        HashSet<String> checkSet = new HashSet<String>();
        checkSet.add("DevOps");
        checkSet.add("Python");
        System.out.println("checkSet              : " + checkSet);
        System.out.println("set.containsAll(checkSet) : " + set.containsAll(checkSet));

        // -------------------------------------------------
        // Convert HashSet to Array
        // -------------------------------------------------
        System.out.println("\n--- toArray() ---");
        Object[] arr = set.toArray();
        System.out.println("HashSet as Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("  [" + i + "] " + arr[i]);
        }

        // -------------------------------------------------
        // Clear HashSet
        // -------------------------------------------------
        System.out.println("\n--- clear() ---");
        System.out.println("Before clear() size : " + set.size());
        set.clear();
        System.out.println("After  clear() size : " + set.size());
        System.out.println("isEmpty()           : " + set.isEmpty());
        System.out.println("HashSet             : " + set);
    }

    // =====================================================
    // MAIN METHOD
    // =====================================================
    public static void main(String[] args) {

        CollectionsAssignment obj = new CollectionsAssignment();

        obj.arrayListOperations();    // Part 1
        obj.hashMapOperations();      // Part 2
        obj.hashSetOperations();      // Part 3

        System.out.println("\n================================================");
        System.out.println("  SUMMARY: Collections                          ");
        System.out.println("================================================");
        System.out.println("ArrayList → ordered, allows duplicates, index-based");
        System.out.println("HashMap   → key-value pairs, no duplicate keys");
        System.out.println("HashSet   → no duplicates, no order guaranteed");
        System.out.println("Iterator  → safe way to iterate any Collection");
        System.out.println("addAll    → Union   | retainAll → Intersection");
        System.out.println("removeAll → Difference of two sets");
        System.out.println("putAll    → copy all entries to another HashMap");
    }
}