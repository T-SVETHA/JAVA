//11
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];
        int[][] result = new int[2][2];
        
        System.out.println("Enter elements of matrix 1 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements of matrix 2 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        
        System.out.println("Matrix Multiplication Result:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//12
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];
        int[][] result = new int[2][2];
        
        System.out.println("Enter elements of matrix 1 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements of matrix 2 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
        System.out.println("Matrix Sum:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//13
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        ArrayList<Integer> mergedList = new ArrayList<>();
        
        for (int i : arr1) {
            mergedList.add(i);
        }
        
        for (int i : arr2) {
            mergedList.add(i);
        }
        
        Collections.sort(mergedList);
        
        System.out.print("Merged and Sorted Array: ");
        for (int i : mergedList) {
            System.out.print(i + " ");
        }
    }
}

//14
import java.util.Arrays;

public class MeanMedianMode {
    public static void main(String[] args) {
        int[] array = {16, 18, 27, 16, 23, 21, 19};
        
        //Mean
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double mean = sum / array.length;
        
        // Median
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0) {
            median = (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0;
        } else {
            median = array[array.length / 2];
        }
        
        // Mode
        int mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }
        
        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);
    }
}


//15
public class CompositeNumbers {
    public static void main(String[] args) {
        int[] array = {16, 18, 27, 16, 23, 21, 19};
        int count = 0;
        
        for (int i : array) {
            if (isComposite(i)) {
                count++;
            }
        }
        
        System.out.println("Number of Composite Numbers = " + count);
    }
    
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}

//16
import java.util.Scanner;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            
            }
            System.out.println();
        }
    }
}

//17
import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

//18
import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a symbol: ");
        char symbol = scanner.next().charAt(0);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}

//19
import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to be printed: ");
        int num = scanner.nextInt();
        System.out.print("Max Number of time printed: ");
        int max = scanner.nextInt();
        
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
        
        for (int i = max - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}

//20
import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
