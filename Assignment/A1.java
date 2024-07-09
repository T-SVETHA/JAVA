//1
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = b.nextLine();
        String rev = "";
        
        for (int i = word.length() - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }
        
        System.out.println("Reverse String: " + rev);
    }
}

//2
import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int number = 0;
        
        for (int i = 0; i < str.length(); i++) {
            number = number * 10 + (str.charAt(i) - '0');
        }
        
        System.out.println("Output String: " + number);
    }
}

//3
import java.util.Scanner;

public class UsernameValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        
        if (username.matches("[A-Za-z0-9_]+")) {
            System.out.println("Valid username.");
        } else {
            System.out.println("Invalid username. Only alphanumeric characters and underscores are allowed.");
        }
    }
}

//4
import java.util.Scanner;
import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        
        System.out.println("Enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }
        
        System.out.print("Order (A/D): ");
        char order = scanner.next().charAt(0);
        
        Arrays.sort(names);
        
        if (order == 'D' || order == 'd') {
            for (int i = names.length - 1; i >= 0; i--) {
                System.out.println(names[i]);
            }
        } else {
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}

//5
import java.util.Scanner;

public class SpecialCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String specialChars = "";
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialChars += ch + " ";
                count++;
            }
        }
        
        System.out.println("Special characters: " + specialChars.trim());
        System.out.println("Number of special characters: " + count);
    }
}

//6
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine();
        int vowelCount = 0;
        
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        
        System.out.println("Number of vowels = " + vowelCount);
    }
}

//7
import java.util.Scanner;

public class ConsonantsVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        String consonants = "";
        String vowels = "";
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels += ch + " ";
            } else if (Character.isLetter(ch)) {
                consonants += ch + " ";
            }
        }
        
        System.out.println("Consonants: " + consonants.trim());
        System.out.println("Vowels: " + vowels.trim());
    }
}

//8
import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to be searched: ");
        char ch = scanner.next().charAt(0);
        boolean found = false;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println(ch + " is found in the string at index: " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println(ch + " is not found in the string.");
        }
    }
}

//9
import java.util.Scanner;
import java.util.Arrays;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        
        System.out.print("Alphabetical Order: ");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }
    }
}

//10
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String withoutVowels = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                withoutVowels += str.charAt(i);
            }
        }
        
        System.out.println("The string without vowels is: " + withoutVowels);
    }
}
