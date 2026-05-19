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


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch(op) {

            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                System.out.println("Result = " + (a / b));
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}

public class Main {
    public static void main(String[] args) {

        int year = 2024;

        if((year%4==0 && year%100!=0) || year%400==0)
            System.out.println("Leap Year");

    }
}

public class Main {
    public static void main(String[] args) {

        String str="Java is easy";
        String words[]=str.split(" ");

        System.out.println(words.length);

    }
}

String s="Java";
System.out.println(s.indexOf('a'));


String s="Java";
System.out.println(s.replace('a','o'));


double r=5;
System.out.println(3.14*r*r);


class TestMethod {

    void display() {
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        TestMethod obj = new TestMethod();
        obj.display();
    }
}


class Person {
    String name = "Mohan";
}

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
    }
}


public class Vowels {
    public static void main(String[] args) {
        String text = "java";
        int count = 0;

        for(char c : text.toCharArray()){
            if("aeiou".indexOf(c) != -1)
                count++;
        }

        System.out.println(count);
    }
}


public class Pattern1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


class Person {
    String name = "Mohan";
}

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
    }
}


public class RightTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


public class InvertedTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


public class PyramidPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


class Demo {
	int a;
	float b;
	boolean c;
}

public class Variables {

	public static void main(String[] args) {
//		created object of the class
	     Demo d = new Demo();
	     System.out.println(d.a);
	     System.out.println(d.b);
	     System.out.println(d.c);

	}

}


public class Example {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println(b);
    }
}


public class Example {
    public static void main(String[] args) {
        char ch = 'A';
        int num = ch;
        System.out.println(num);
    }
}





import java.util.Scanner;

class Car {
	String name;
	float cost;
	float mileage;
	
//	                  CREATING METHOD
	
	void start()
	{
		System.out.println("Car is starting:");
	}
	
	void accelerate()
	{
		System.out.println("Car is accelerating:");
	}
	
	void stop()
	{
		System.out.println("Car is Stopping:");
	}
}



public class Demo1 {

	public static void main(String[] args) {
		Car c= new Car();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter a name of car:");
		c.name = scan.nextLine();
		
		System.out.println("Enter a name of cost:");
		c.cost = scan.nextFloat();
		
		System.out.println("Enter a mileage:");
		c.mileage = scan.nextFloat();
		
		
		
		System.out.println(c.name);
		System.out.println(c.cost);
		System.out.println(c.mileage);
			
	}

}


public class Main {
    public static void main(String[] args) {
        double num = 10.75;
        int result = (int) num;  // explicit casting

        System.out.println(result);
    }
}


public class Main {
    public static void main(String[] args) {
        int num = 130;
        byte result = (byte) num;  // explicit casting

        System.out.println(result);
    }
}


public class Main {
    public static void main(String[] args) {
        float num = 25.99f;
        short result = (short) num;  // explicit casting

        System.out.println(result);
    }
}


class Employee {
    int eid;
    String ename;
    int esalary;
}


public class Main1 {
    public static void main(String[] args) 
    {
        Employee e1= new Employee();
        System.out.println(e1.eid);
        System.out.println(e1.ename);
        System.out.println(e1.esalary);
    }
}


class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        
        // creating one object
        Student s1 = new Student("Mohan", 20);

        // accessing object data
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}


public class Demo {
    public static void main(String[] args) {
        String s1 = "MOHAN";
        String s2 = "MAHESH";
        System.out.println(s1.compareTo(S2));
    }
}


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial is: " + fact);
    }
}


long l = 9876543210L;
        int intVal = (int) l;
        System.out.println("Long value: " + l);
        System.out.println("After casting to int (data loss): " + intVal);

        System.out.println("-----------------------------");



import java.util.StringTokenizer;

public class Demo {

	public static void main(String[] args) {
        	StringTokenizer s = new StringTokenizer("JAVA PYTHON AI ML");
	while(s.hasMoreTokens())
	{
		System.out.println(s.nextToken());
	}
	
		}

}

class Calculator {
    int add(int a, intb) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add(10,20));
    }
}


class Calculator {

    // method with no arguments
    int add() {
        return 0;
    }

    // method with 1 argument
    int add(int a) {
        return a;
    }

    // method with 2 arguments
    int add(int a, int b) {
        return a + b;
    }

    // method with 3 arguments
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating object
        Calculator obj = new Calculator();

        // Calling methods with different arguments
        System.out.println(obj.add(10, 20));      // 2 arguments
        System.out.println(obj.add(10, 20, 30));  // 3 arguments
        System.out.println(obj.add(10));          // 1 argument
        System.out.println(obj.add());            // 0 arguments
    }
}


public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial is: " + fact);
    }
}


// Define a class
class Animal {
    
    String name;      // object variable
    String species;   // object variable

    // Constructor (initializes object data)
    Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Method (function inside class)
    void display() {
        System.out.println("Animal Name: " + name);
        System.out.println("Species: " + species);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        
        // Create an object
        Animal a1 = new Animal("Leo", "Lion");

        // Access object data using method
        a1.display();
    }
}

// Encapsulation Example
class Student {

    // Step 1: Declare variables as private (data hiding)
    private String name;
    private int age;

    // Step 2: Create setter methods (to set values)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Step 3: Create getter methods (to get values)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create object
        Student s1 = new Student();

        // Set values using setter methods
        s1.setName("Mohan");
        s1.setAge(20);

        // Get values using getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}



public class Main {
    public static void main(String[] args) {
        
       
        String name = "mohan";
        
        
        String upperName = name.toUpperCase();
        
   
        System.out.println("Original: " + name);
        System.out.println("Uppercase: " + upperName);
    }
}


class BankAccount {

    
    private double balance;

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

        public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Invalid amount!");
        }
    }

        public double getBalance() {
        return balance;
    }
}


class Car {
    String name;
    String getName()
    {
        return name;
    }
}

class Demo {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getName());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          String str1 = scanner.nextLine();
          String str2 = scanner.nextLine();

           boolean result = str1.equals(str2);

        System.out.println(result);
              scanner.close();
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}


public class Main {

    static
    {
         System.out.println("Java");
    }
    public static void main(String[] args) {
        System.out.println("Python");
    }
}


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] arr = new float[n];
                for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
                    }

        for (int i = 0; i < n; i++) {
        System.out.println(arr[i]);
        }
            scanner.close();
                }
}

public class Main {
    public static void main(String[] args) {
         int number = 10;
         String name = "Mohan";
         System.out.println(number);
         System.out.println(name);
        }
}


class Animal {
    void sound() {
    }
}
class Dog extends Animal {
    void bark() {
    System.out.println("Dog barks");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}

class Employee {

    // Private variable
    private String name;

    // Setter method
    public void setName(String n) {
        name = n;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Mohan");
        System.out.println(e.getName());
    }
}


public class Main {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// Polymorphism Example in Java

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Animal a = new Dog(); // Parent reference, child object
        
        a.sound(); // Calls Dog class method
    }
}  

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Animal a = new Dog(); // Parent reference, child object
        
        a.sound(); // Calls Dog class method
    }
}  


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
        System.out.println(i);
        }
    }
}


public class Main {
    public static void main(String[] args) {

        int number = 7;
            if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}


public class Main {

    static
    {
         System.out.println("Java");
    }
    public static void main(String[] args) {
        System.out.println("Python");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Animal a = new Dog(); 
        
        a.sound(); 
    }
}  


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}