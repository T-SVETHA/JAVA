//31
import java.util.Scanner;

public class LCMandGCD {

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values (N): ");
        int N = sc.nextInt();
        
        if (N <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int resultGCD = numbers[0];
        int resultLCM = numbers[0];
        for (int i = 1; i < N; i++) {
            resultGCD = gcd(resultGCD, numbers[i]);
            resultLCM = lcm(resultLCM, numbers[i]);
        }

        System.out.println("GCD = " + resultGCD);
        System.out.println("LCM = " + resultLCM);
    }
}

//32
import java.util.Scanner;

public class SimpleInterest {

    public static double calculateInterest(double principal, int years, boolean isSeniorCitizen) {
        double rate = isSeniorCitizen ? 0.12 : 0.10;
        return principal * rate * years;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();
        System.out.print("Is customer senior citizen (y/n): ");
        char seniorCitizen = sc.next().charAt(0);

        boolean isSeniorCitizen = (seniorCitizen == 'y' || seniorCitizen == 'Y');
        double interest = calculateInterest(principal, years, isSeniorCitizen);

        System.out.println("Interest: " + interest);
    }
}

//33
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}

//34
import java.util.Scanner;

public class EvenSumFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        
        int sum = 0;
        int a = 0, b = 1;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += a;
            }
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Even Sum of Fibonacci series till number " + n + " is: " + sum);
    }
}

//35
import java.util.Scanner;

public class SkipNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.print("Enter K: ");
        int K = sc.nextInt();
        
        if (M > N) {
            System.out.println("Invalid range");
            return;
        }

        for (int i = M; i <= N; i += (K + 1)) {
            System.out.print(i + " ");
        }
    }
}

//36
import java.util.Scanner;

public class CompositeNumbers {

    public static boolean isComposite(int num) {
        if (num < 4) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = sc.nextInt();
        System.out.print("Enter B: ");
        int B = sc.nextInt();
        
        if (A > B) {
            System.out.println("Invalid range");
            return;
        }

        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

//37
import java.util.Scanner;

public class Factorial {

    public static long factorial(int n) {
        if (n < 0) return -1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        
        long result = factorial(N);
        if (result == -1) {
            System.out.println("Invalid input");
        } else {
            System.out.println(N + " Factorial = " + result);
        }
    }
}

//38
import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        
        if (isLeapYear(year)) {
            System.out.println("Given year is Leap Year");
        } else {
            System.out.println("Given year is Non Leap Year");
        }
    }
}

//39
import java.util.Scanner;

public class NumberOfFactors {

    public static int countFactors(int num) {
        if (num <= 0) return 0;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        int factors = countFactors(num);
        System.out.println("Number of factors = " + factors);
    }
}

//40
import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfect(int num) {
        if (num <= 0) return false;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        if (isPerfect(num)) {
            System.out.println("It’s a Perfect Number");
        } else {
            System.out.println("It’s not a Perfect Number");
        }
    }
}

