//11

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("The factorial of " + n + " is: " + factorial(n));
        }
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}

//12
public class NthLargest {
    public static void main(String[] args) {
        int[] array = {14, 67, 48, 23, 5, 62};
        int N = 4;

        if (N <= 0 || N > array.length) {
            System.out.println("Invalid input for N.");
        } else {
            System.out.println(N + "th largest number: " + findNthLargest(array, N));
        }
    }

    public static int findNthLargest(int[] array, int N) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[N-1];
    }
}

//13
import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        String binaryString = scanner.nextLine();

        if (!binaryString.matches("[01]+")) {
            System.out.println("Invalid binary number.");
        } else {
            int decimal = binaryToDecimal(binaryString);
            String octal = decimalToOctal(decimal);
            System.out.println("Decimal Number: " + decimal);
            System.out.println("Octal Number: " + octal);
        }
    }

    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int length = binaryString.length();
        for (int i = 0; i < length; i++) {
            char bit = binaryString.charAt(length - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }

    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal /= 8;
        }
        return octal.toString();
    }
}

//14
import java.util.Scanner;

public class SpecialCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given statement: ");
        String statement = scanner.nextLine();

        int specialCharCount = 0;
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }

        System.out.println("Number of special Characters: " + specialCharCount);
    }
}

//15
import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        ArrayList<Integer> uniqueList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueList.size(); j++) {
                if (array[i] == uniqueList.get(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueList.add(array[i]);
            }
        }

        System.out.println("Non-duplicate items: " + uniqueList);
    }
}
