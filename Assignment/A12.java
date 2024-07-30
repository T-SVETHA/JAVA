//26
import java.util.Hashtable;

public class BankDetails {
    public static void main(String[] args) {
        Hashtable<Integer, String> bankDetails = new Hashtable<>();

        // i) Add 3 records
        bankDetails.put(1001, "John Doe");
        bankDetails.put(1002, "Jane Smith");
        bankDetails.put(1003, "Alice Johnson");

        // ii) Display the size of HashTable
        System.out.println("Size of HashTable: " + bankDetails.size());

        // iii) Clear the HashTable
        bankDetails.clear();
        System.out.println("HashTable cleared. Size: " + bankDetails.size());
    }
}

//27
import java.util.HashMap;
import java.util.Map;

public class EmployeeRecord {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        // i) Add object
        employeeMap.put(1, "John Doe");
        employeeMap.put(2, "Jane Smith");
        employeeMap.put(3, "Alice Johnson");

        // ii) isEmpty or not
        System.out.println("Is the employee map empty? " + employeeMap.isEmpty());

        // iii) Remove specified object
        employeeMap.remove(2);
        System.out.println("Employee map after removing key 2: " + employeeMap);

        // iv) Clear
        employeeMap.clear();
        System.out.println("Employee map cleared. Is it empty? " + employeeMap.isEmpty());
    }
}

//28
import java.util.Arrays;

public class GenericSorter<T extends Comparable<T>> {
    private T[] values;

    public GenericSorter(T[] values) {
        this.values = values;
    }

    public void sort() {
        Arrays.sort(values);
    }

    public void print() {
        for (T value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intValues = {5, 3, 8, 1, 2};
        GenericSorter<Integer> intSorter = new GenericSorter<>(intValues);
        intSorter.sort();
        intSorter.print();

        String[] stringValues = {"banana", "apple", "cherry", "date"};
        GenericSorter<String> stringSorter = new GenericSorter<>(stringValues);
        stringSorter.sort();
        stringSorter.print();
    }
}

//29
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            iterator.set(element + "+");
        }

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}

//30
public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; 
        try {
            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Division: " + (a / b)); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }
    }
}

