import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}


import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}


public class PrimeCheck {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;

        if (num <= 1) isPrime = false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}


public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}


public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 89, 12};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest Number: " + max);
    }
}


import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}


import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("Largest number is " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest number is " + b);
        else
            System.out.println("Largest number is " + c);
    }
}


import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}


public class Palindrome {
    public static void main(String[] args) {
        int num = 121, rev = 0, temp = num;

        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}


public class PrimeNumber {
    public static void main(String[] args) {
        int num = 7;
        boolean prime = true;

        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                prime = false;
                break;
            }
        }

        if(prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
}


public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}


public class Table {
    public static void main(String[] args) {
        int num = 5;

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}


public class LargestThree {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if(a >= b && a >= c)
            System.out.println("Largest: " + a);
        else if(b >= a && b >= c)
            System.out.println("Largest: " + b);
        else
            System.out.println("Largest: " + c);
    }
}

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}


public class Palindrome {
    public static void main(String[] args) {
        int num = 121, original = num, reverse = 0;

        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if(original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

public class PrintNumbers {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}


public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}


public class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Addition = " + (a+b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Multiplication = " + (a*b));
        System.out.println("Division = " + (a/b));
    }
}


public class EvenNumbers {
    public static void main(String[] args) {

        for(int i=1; i<=20; i++) {
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
}


public class StarPattern {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}


public class ReverseString {
    public static void main(String[] args) {

        String str = "Java";
        String rev = "";

        for(int i=str.length()-1; i>=0; i--)
            rev += str.charAt(i);

        System.out.println(rev);
    }
}


public class Pattern2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


public class Pattern3 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a=" + a + " b=" + b);
    }
}


import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {5,2,8,1};

        Arrays.sort(arr);

        for(int i: arr)
            System.out.print(i + " ");
    }
}


public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int key = 30;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("Element found");
                break;
            }
        }
    }
}


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        int index = Arrays.binarySearch(arr,30);

        System.out.println("Index: " + index);
    }
}


import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(100);
        System.out.println(num);
    }
}


import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random rand = new Random();

        int number = rand.nextInt(100); // 0 to 99
        System.out.println("Random Number: " + number);
    }
}