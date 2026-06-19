/**
 * Assignment-4: Arrays in Java
 * Author: Anil Jagari
 */
public class ArraysAssignment {

    // =====================================================
    // 1. Add all integer values of an array
    // =====================================================
    public void sumOfArray(int[] arr) {
        System.out.println("===== 1. Sum of Array =====");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum : " + sum);
    }

    // =====================================================
    // 2. Calculate average of array
    // =====================================================
    public void averageOfArray(int[] arr) {
        System.out.println("\n===== 2. Average of Array =====");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("Average : " + average);
    }

    // =====================================================
    // 3. Find index of a specific element
    // =====================================================
    public void findIndex(int[] arr, int target) {
        System.out.println("\n===== 3. Find Index of Element =====");
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element " + target + " found at index : " + index);
        } else {
            System.out.println("Element " + target + " not found in array");
        }
    }

    // =====================================================
    // 4. Check if array contains a specific value
    // =====================================================
    public void containsValue(int[] arr, int target) {
        System.out.println("\n===== 4. Array Contains Value =====");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Array CONTAINS " + target);
        } else {
            System.out.println("Array does NOT contain " + target);
        }
    }

    // =====================================================
    // 5. Remove a specific element from array
    // =====================================================
    public void removeElement(int[] arr, int target) {
        System.out.println("\n===== 5. Remove Element from Array =====");
        int count = 0;

        // Count how many times target appears
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        // New array without target
        int[] newArr = new int[arr.length - count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                newArr[j] = arr[i];
                j++;
            }
        }

        System.out.print("Array after removing " + target + " : ");
        printArray(newArr);
    }

    // =====================================================
    // 6. Copy array to another array
    // =====================================================
    public void copyArray(int[] arr) {
        System.out.println("\n===== 6. Copy Array =====");
        int[] copiedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copiedArr[i] = arr[i];
        }
        System.out.print("Original Array : ");
        printArray(arr);
        System.out.print("Copied   Array : ");
        printArray(copiedArr);
    }

    // =====================================================
    // 7. Insert element at a specific position
    // =====================================================
    public void insertAtPosition(int[] arr, int position, int value) {
        System.out.println("\n===== 7. Insert Element at Position =====");
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];                  // copy before position
        }
        newArr[position] = value;                // insert new value

        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];              // shift remaining right
        }

        System.out.print("Array after inserting " + value + " at index " + position + " : ");
        printArray(newArr);
    }

    // =====================================================
    // 8. Find minimum and maximum value
    // =====================================================
    public void minAndMax(int[] arr) {
        System.out.println("\n===== 8. Minimum and Maximum =====");
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
    }

    // =====================================================
    // 9. Reverse an array
    // =====================================================
    public void reverseArray(int[] arr) {
        System.out.println("\n===== 9. Reverse Array =====");
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array : ");
        printArray(arr);
    }

    // =====================================================
    // 10. Find duplicate values in array
    // =====================================================
    public void findDuplicates(int[] arr) {
        System.out.println("\n===== 10. Find Duplicate Values =====");
        System.out.print("Duplicates : ");