//31
class NaturalNumberThread extends Thread {
    private int start, end;

    public NaturalNumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        try {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
                Thread.sleep(100); // Sleep for 100 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new NaturalNumberThread(1, 10);
        Thread t2 = new NaturalNumberThread(11, 20);
        Thread t3 = new NaturalNumberThread(21, 30);

        t1.start();
        t2.start();
        t3.start();
    }
}

//32
public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 7, 8, 6}; // Given array
        int n = 8; // Range from 1 to 8

        int totalSum = n * (n + 1) / 2; // Sum of numbers from 1 to n
        int arraySum = 0;

        for (int num : a) {
            arraySum += num;
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing number: " + missingNumber);
    }
}

//33
class Parent {
    void display() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is child class");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent parentChild = new Child();

        parent.display(); // Method of parent class by object of parent class
        child.show(); // Method of child class by object of child class
        parentChild.display(); // Method of parent class by object of child class
    }
}

//34
class Student {
    String name;
    int regNo;
    int[] marks;
    int total;
    double average;

    public Student(String name, int regNo, int[] marks) {
        this.name = name;
        this.regNo = regNo;
        this.marks = marks;
        calculateTotalAndAverage();
    }

    private void calculateTotalAndAverage() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / (double) marks.length;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + regNo);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 92};
        Student student = new Student("John Doe", 12345, marks);
        student.displayDetails();
    }
}

//35
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWordCharLineCount {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // Replace with your file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int wordCount = 0, charCount = 0, lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
