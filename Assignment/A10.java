//16
class Bank {
    public double rate() {
        return 0;
    }
}
class SBI extends Bank {
    public double rate() {
        return 8.4;
    }
}
class ICICI extends Bank {
    public double rate() {
        return 7.3;
    }
}
class AXIS extends Bank {
    public double rate() {
        return 9.7;
    }
}
public class Main {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();        
        System.out.println("SBI Rate of Interest: " + sbi.rate());
        System.out.println("ICICI Rate of Interest: " + icici.rate());
        System.out.println("AXIS Rate of Interest: " + axis.rate());
    }
}

//17
class SuperClass {
    int value;
    SuperClass(int value) {
        this.value = value;
    }
    void display() {
        System.out.println("SuperClass value: " + value);
    }
}
class SubClass extends SuperClass {
    int value;
    SubClass(int superValue, int subValue) {
        super(superValue);
        this.value = subValue;
    }
    void display() {
        super.display();
        System.out.println("SubClass value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass(100, 200);
        obj.display();
    }
}

//18
class MultiplicationTable extends Thread {
    private int number;

    MultiplicationTable(int number) {
        this.number = number;
    }  
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MultiplicationTable table5 = new MultiplicationTable(5);
        MultiplicationTable table10 = new MultiplicationTable(10);

        table5.start();
        table10.start();
    }
}

//19
class FibonacciSeries implements Runnable {
    private int count;

    FibonacciSeries(int count) {
        this.count = count;
    }
    public void run() {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < count; ++i) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        FibonacciSeries fib = new FibonacciSeries(5);
        Thread thread = new Thread(fib);
        thread.start();
    }
}

//20
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int n = 5;
        int sum = 0;
        try {
            for (int i = 0; i <= n; i++) {
                sum += numbers[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }
        System.out.println("Sum: " + sum);
    }
}