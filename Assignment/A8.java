\\6TH

public class BonusCalculator {
    public static void main(String[] args) {
        String grade = 'A'
        double salary = 11000.00;
        double bonus = 0.0;
        
        if (grade.equals("A")) {
            bonus = salary * 0.05;
        } else if (grade.equals("B")) {
            bonus = salary * 0.10;
        }
        
        if (salary < 10000) {
            bonus += salary * 0.02;
        }
        
        double totalSalary = salary + bonus;
        
        System.out.printf("Salary = %.2f%n", salary);
        System.out.printf("Bonus = %.2f%n", bonus);
        System.out.printf("Total to be paid: %.2f%n", totalSalary);
    }
}
\\7TH
public class PerfectNumbers {
    public static void main(String[] args) {
        int n =3 ;
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer for N.");
            return;
        }
        
        int count = 0;
        int num = 1;
        
        while (count < n) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
    
    private static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
\\8TH
 public class StudentGrade {
    public static void main(String[] args) {
        double python = 98.2;
        double cProgramming = 97.0;
        double mathematics = 95.5;
        double physics = 82.0;
        double total = python + cProgramming + mathematics + physics;
        double aggregate = total / 4.0;
        
        System.out.printf("Total = %.2f%n", total);
        System.out.printf("Aggregate = %.2f%n", aggregate);
        
        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 50) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 40) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }
    }
}
\\9TH
public class AverageNumbers {
    public static void main(String[] args) {
        int[] numbers = {7, -2, 9, -8, -6, -4, 10, -1}; // hardcoded array of numbers

        int positiveSum = 0, positiveCount = 0;
        int negativeSum = 0, negativeCount = 0;

        for (int num : numbers) {
            if (num == -1) {
                break;
            }
            
            if (num > 0) {
                positiveSum += num;
                positiveCount++;
            } else if (num < 0) {
                negativeSum += num;
                negativeCount++;
            }
        }

        if (negativeCount > 0) {
            System.out.println("The average of negative numbers is: " + (negativeSum / (double) negativeCount));
        } else {
            System.out.println("No negative numbers entered.");
        }
        
        if (positiveCount > 0) {
            System.out.println("The average of positive numbers is: " + (positiveSum / (double) positiveCount));
        } else {
            System.out.println("No positive numbers entered.");
        }
    }
}

\\10TH
public class CharacterCount {
    public static void main(String[] args) {
        char[] characters = {'W', 'd', 'A', 'G', 'g', 'H', '*'}; 
        int upperCount = 0;
        int lowerCount = 0;
        int numberCount = 0;
        
        for (char ch : characters) {
            if (ch == '*') {
                break;
            }
            
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }

        System.out.println("Total count of lower case: " + lowerCount);
        System.out.println("Total count of upper case: " + upperCount);
        System.out.println("Total count of numbers: " + numberCount);
    }
}
