//1
import java.util.Scanner;

public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeCount = 0, compositeCount = 0;

        System.out.println("Enter the numbers (enter any non-integer to stop):");

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num <= 1) {
                compositeCount++;
            } else {
                boolean isPrime = true;
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeCount++;
                } else {
                    compositeCount++;
                }
            }
        }

        System.out.println("Composite number: " + compositeCount);
        System.out.println("Prime number: " + primeCount);
    }
}

//2
import java.util.Scanner;

public class MaxMinSumDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {14, 16, 87, 36, 25, 89, 34};
        System.out.print("M = ");
        int M = scanner.nextInt();
        System.out.print("N = ");
        int N = scanner.nextInt();

        if (M <= 0 || M > array.length || N <= 0 || N > array.length) {
            System.out.println("Invalid M or N value");
            return;
        }

        // Manual sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        int mthMax = array[array.length - M];
        int nthMin = array[N - 1];

        System.out.println(M + "th Maximum Number = " + mthMax);
        System.out.println(N + "th Minimum Number = " + nthMin);
        System.out.println("Sum = " + (mthMax + nthMin));
        System.out.println("Difference = " + (mthMax - nthMin));
    }
}

//3
import java.util.Scanner;

public class ATMBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBalance = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter the " + i + "th Denomination: ");
            int denomination = scanner.nextInt();
            System.out.print("Enter the " + i + "th Denomination number of notes: ");
            int numOfNotes = scanner.nextInt();

            totalBalance += denomination * numOfNotes;
        }

        System.out.println("Total Available Balance in ATM: " + totalBalance);
    }
}
//4
import java.util.Scanner;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        boolean isPalindrome = true;

        // Convert the input string to uppercase to make the check case-insensitive
        input = input.toUpperCase();

        // Check if the string is a palindrome
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

//5
import java.util.Scanner;

public class DecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the decimal number:");
        int decimal = scanner.nextInt();

        // Convert to binary
        String binary = "";
        int temp = decimal;
        if (temp == 0) {
            binary = "0";
        } else {
            while (temp > 0) {
                binary = (temp % 2) + binary;
                temp /= 2;
            }
        }

        // Convert to octal
        String octal = "";
        temp = decimal;
        if (temp == 0) {
            octal = "0";
        } else {
            while (temp > 0) {
                octal = (temp % 8) + octal;
                temp /= 8;
            }
        }

        System.out.println("Binary Number = " + binary);
        System.out.println("Octal = " + octal);
    }
}


//project 1
public class sample{
 public static void main(String[]args){
   System.out.print("hello world");
 } 
}

1. yes it runs
2. it gives error. yes java is case sensitive
3. syntax error

//project 2
public class smile {
    public static void main(String[] args) {
        System.out.println("   # # # #   ");
        System.out.println(" #         #  ");
        System.out.println("#  #     #  #");
        System.out.println("#           #");
        System.out.println("#  #     #  #");
        System.out.println("#    # #    #");
        System.out.println(" #        # ");
        System.out.println("  # # # #  ");
    }
}



