//21
class PrimeChecker implements Runnable {
    private int number;

    public PrimeChecker(int number) {
        this.number = number;
    }

    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is not Prime");
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] testCases = {4, -10, 0, 87, 11};
        for (int testCase : testCases) {
            Thread t = new Thread(new PrimeChecker(testCase));
            t.start();
        }
    }
}

//22
public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int a = 5, b = 0;
            int[] arr = new int[2];
            String str = null;
            
            // ArithmeticException
            System.out.println(a / b);
            
            // ArrayIndexOutOfBoundsException
            System.out.println(arr[5]);
            
            // NullPointerException
            System.out.println(str.length());
            
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("An exception occurred: " + e);
        }
    }
}

//23
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String data = "Computer Science and Engineering";
        String filePath = "output.txt";

        // Write to file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from file
        try (FileReader reader = new FileReader(filePath)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//24
class Box {
    private double width;
    private double height;
    private double depth;

    // Default constructor
    public Box() {
        this.width = 1.0;
        this.height = 1.0;
        this.depth = 1.0;
    }

    public double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box myBox = new Box();
        System.out.println("Volume of the box is: " + myBox.volume());
    }
}

//25
public class StringOperations {
    public static void main(String[] args) {
        String input = "Welcome to Saveetha university";
        
        // i) Replace any word in the given String
        String replacedString = input.replace("Saveetha", "XYZ");
        System.out.println("Replaced String: " + replacedString);

        // ii) Find the length
        int length = input.length();
        System.out.println("Length of String: " + length);

        // iii) Uppercase Conversion
        String upperCaseString = input.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);
    }
}
