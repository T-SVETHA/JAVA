//41
public class SquareCube {
    public static void main(String[] args) {
        double number = 0.6;
        System.out.println("Given Number: " + number);
        System.out.println("Square Number: " + Math.pow(number, 2));
        System.out.println("Cube Number: " + Math.pow(number, 3));
    }
}

//42
public class NthOddNumber {
    public static void main(String[] args) {
        int n = 7;
        System.out.print((2*n-1)+ 2*n + " ");
        }
}

//43
public class frequency{
    public static void main(String[]args){
        int[] nums={1,1,2,3,4,3};
        int n=nums.length;
        int[] freq=new int[n];
        boolean[] visited=new boolean[n];
        int count=0;
        for (int i=0;i<n;i++){
            visited[i]=false;
        }
       count=1;
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    visited[j]=true;
                    count++;
                }
            }
            freq[i]=count;
            count=1;
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                 System.out.println(nums[i]+"    |    "+freq[i]);
            }
        }
    }
}

//44
public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        System.out.println("Enter number: " + number);
        if (isArmstrong(number)) {
            System.out.println("Given number is Armstrong number");
        } else {
            System.out.println("Given number is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length();

        while (num != 0) {
            int remainder = num % 10;
            result += Math.pow(remainder, n);
            num /= 10;
        }

        return result == originalNum;
    }
}

//45
public class digits{
    public static void main(String[] args){
        int num=123;
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.print(sum);
    }
}

//46
public class SquareRoot {
    public static void main(String[] args) {
        int number = 6561;
        double sqrt = Math.sqrt(number);
        if (sqrt == (int) sqrt) {
            System.out.println("Square Root: " + (int)sqrt + ", " + -(int)sqrt);
        } else {
            System.out.println("Number is not a perfect square");
        }
    }
}

//47
public class PowerOfThree {
    public static void main(String[] args) {
        int number = 27;
        System.out.println("Input: " + number);
        System.out.println("Output: " + isPowerOfThree(number));
    }

    public static boolean isPowerOfThree(int num) {
        if (num <= 0) return false;
        while (num % 3 == 0) {
            num /= 3;
        }
        return num == 1;
    }
}

//48
import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println("Input: " + Arrays.toString(arr));
        duplicateZeros(arr);
        System.out.println("Output: " + Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;

        for (int i = 0; i <= length - possibleDups; i++) {
            if (arr[i] == 0) {
                if (i == length - possibleDups) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        int last = length - possibleDups;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}


//49
import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println("Input: " + Arrays.toString(arr));
        duplicateZeros(arr);
        System.out.println("Output: " + Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;

        for (int i = 0; i <= length - possibleDups; i++) {
            if (arr[i] == 0) {
                if (i == length - possibleDups) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        int last = length - possibleDups;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}

//50
public class missing{
    public static void main(String[] args){
        int[] nums={3,0,1};
        int t, n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (nums[i]>nums[j]){
                    t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                System.out.print(i+",");
            }
        }
    }
}
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        for (int num : nums) {
            total -= num;
        }
        return total;
    }
}
