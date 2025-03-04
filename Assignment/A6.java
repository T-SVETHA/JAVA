//51
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + maxSubArraySum(nums));
    }

    public static int maxSubArraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
//52.Multiplication Table
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "x" + m + "=" + (i * m));
        }
    }
}



//53.Multiple Threads with Join
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "x" + m + "=" + (i * m));
        }
    }
}

//54.Selection and Iteration Statements with Do-While Loop
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. If statement");
            System.out.println("2. While loop");
            System.out.println("3. For loop");
            System.out.println("4. Switch case");
            System.out.println("Enter your choice (0 to exit): ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Syntax: if (condition) { // statements }");
                    break;
                case 2:
                    System.out.println("Syntax: while (condition) { // statements }");
                    break;
                case 3:
                    System.out.println("Syntax: for (initialization; condition; iteration) { // statements }");
                    break;
                case 4:
                    System.out.println("Syntax: switch (expression) { case value: // statements break; }");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);
    }
}




//55.Generics Class for Sorting
import java.util.Arrays;

class GenClass<T extends Comparable<T>> {
    private T[] array;

    public GenClass(T[] array) {
        this.array = array;
    }

    public void sort() {
        Arrays.sort(array);
    }

    public void print() {
        System.out.print("Sorted Array: ");
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 8, 1, 3};
        GenClass<Integer> genInt = new GenClass<>(intArray);
        genInt.sort();
        genInt.print();

        String[] strArray = {"apple", "orange", "banana"};
        GenClass<String> genStr = new GenClass<>(strArray);
        genStr.sort();
        genStr.print();
    }
}

//56.Overloaded Function with Different Number of Arguments
public class Overload {
    public void assign(int a) {
        System.out.println("Assigning value: " + a);
    }

    public void assign(int a, int b) {
        System.out.println("Assigning values: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.assign(10);
        obj.assign(20, 30);
    }
}



//57.Count Number of Words in a String using HashMap
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = s.nextLine().trim();

        String[] words = input.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



//58.Read Email and Password from Excel Using Apache POI
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(new File("input.xlsx"));
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0);
            Cell emailCell = row.getCell(0);
            Cell passwordCell = row.getCell(1);

            String email = emailCell.getStringCellValue();
            String password = passwordCell.getStringCellValue();

            System.out.println("Email: " + email);
            System.out.println("Password: " + password);

            workbook.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//59.Sort Values Using HashMap
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        // Sorting by keys
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}


//60.Find Distinct Characters and Their Count in a String
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "abcb";
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Distinct Characters:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

//61.Print Unique Characters in a String
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "abcb";
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Unique Characters:");
        for (char c : input.toCharArray()) {
            if (charCount.get(c) == 1) {
                System.out.println(c);
            }
        }
    }
}
