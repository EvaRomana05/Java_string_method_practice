import java.util.Scanner;

public class solutions {
    public static void main(String arg[]) {
        int number = 57;
        int count = 0;
        String msg = Integer.toString(number);
        //  String msg = "56";
        for (int i = 0; i < msg.length(); i++) {
            char value = msg.charAt(i);
            count += Character.getNumericValue(value);
        }
        System.out.println(count);


        //        printName(); //1
        //        addition(); //2
        //        divideResult(); //3
        //        result(); //4
        //        multiply(); //5
        //        additionMultiplySubtractDivideRemainde(); //6
        //        multiplicationTable(); //7
        //        printJAVA(); //8
        //        formula9(); //9
        //        formula10(); //10
        //        circle(); //11
        //        average(); //12
        //        rectangle(); //13
        //        flag();  //14
        //        swap();  //15
        //        emoji(); //16
        //        javaVersionCheck(); //31
        //compare(); //32
        reverseString();
    }

    public static void reverseString() {

        String str = "romana evaa";

        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);

    }

    public static void printName() {

        System.out.println("Hello");
        System.out.println("Romana Eva");
    }

    public static void addition() {
        int a = 45;
        int b = 34;
        int c = a + b;
        System.out.println("Total is: " + c);

    }

    public static void divideResult() {

        int d = 55;
        int e = 4;
        int f = d / e;
        System.out.println("Divide result is: " + f);

    }

    public static void result() {

        int r = -5 + 8 * 6;
        int r2 = (55 + 9) % 9;
        int r3 = 20 + -3 * 5 / 8;
        int r4 = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(r + "\n" + r2 + "\n" + r3 + "\n" + r4);
    }

    public static void multiply() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("First User Input is: ");  // Output user input
        int userInput = myObj.nextInt();  // Read user input

        System.out.println("Second User Input is: ");  // Output user input
        int userInput2 = myObj.nextInt();  // Read user input

        System.out.println(userInput + " * " + userInput2 + " = " + userInput * userInput2);

    }

    public static void additionMultiplySubtractDivideRemainde() {
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println("First User Input is: ");  // Output user input
        int firstInput = input.nextInt();  // Read user input

        System.out.println("Second User Input is: ");  // Output user input
        int secondInput = input.nextInt();  // Read user input

        System.out.println(firstInput + " + " + secondInput + " = " + (firstInput + secondInput));
        System.out.println(firstInput + " - " + secondInput + " = " + (firstInput - secondInput));
        System.out.println(firstInput + " * " + secondInput + " = " + firstInput * secondInput);
        System.out.println(firstInput + " / " + secondInput + " = " + (firstInput / secondInput));
        System.out.println(firstInput + " % " + secondInput + " = " + (firstInput % secondInput));

    }

    public static void multiplicationTable() {
        int i;
        for (i = 0; i <= 10; i++) {
//            System.out.println(i);
            System.out.println("8" + " * " + i + " = " + (8 * i));
        }
    }

    public static void printJAVA() {

        System.out.println("    J    a   v    v  a");
        System.out.println("    J   a a   v   v  a a");
        System.out.println("J   J  aaaaa   v v  aaaaa");
        System.out.println(" JJ   a     a   v  a     a");
    }

    public static void formula9() {
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }

    public static void formula10() {
        System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
    }

    public static void circle() {

        double radius = 7.5;
        double radiusSquare = Math.pow(radius, 2);
        double perameter = 2 * (Math.PI) * radius;

        System.out.println("Perameter is: " + perameter);
        System.out.println("Area is: " + (Math.PI) * radiusSquare);

    }

    public static void average() {

        Scanner input2 = new Scanner(System.in);  // Create a Scanner object

        System.out.println("First User Input is: ");  // Output user input
        int firstInput11 = input2.nextInt();  // Read user input

        System.out.println("Second User Input is: ");  // Output user input
        int secondInput22 = input2.nextInt();  // Read user input

        System.out.println("Third User Input is: ");  // Output user input
        int thirdInput33 = input2.nextInt();  // Read user input

        System.out.println("Average is: " + (firstInput11 + secondInput22 + thirdInput33) / 3);

    }

    public static void rectangle() {
        double width = 5.6;
        double height = 8.5;

        double area = (5.6 * 8.5);
        double perimeter = 2 * (width + height);
        System.out.println("The area of a rectangle is : " + area);
        System.out.println("The perimeter of a rectangleis : " + perimeter);

    }

    public static void flag() {
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int ip = 0; ip < 4; ip++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int im = 0; im < 6; im++) {
            System.out.println(p2);
        }
    }

    public static void swap() {
        int ab = 14;
        int bc = 23;
        System.out.println("Before swapping: ab, bc = " + ab + ", " + bc);

        int temp = ab;
        ab = bc;
        bc = temp;
        System.out.println("After swapping : ab, bc = " + ab + ", " + bc);
    }

    public static void emoji() {

        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

    public static void javaVersionCheck() {
        System.out.println("Java version is: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version is: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home is: " + System.getProperty("java.home"));
        System.out.println("Java Vendor is: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL is: " + System.getProperty("java.Java.vendor.url"));
        System.out.println("Java Class Path is: " + System.getProperty("Java.class.path"));

    }

    public static void compare() {
        {
            // create Scanner to obtain input from command window
            Scanner inputNum = new Scanner(System.in);

            System.out.print("Input first integer: "); // prompt
            int number1 = inputNum.nextInt(); // read first number from user

            System.out.print("Input second integer: "); // prompt
            int number2 = inputNum.nextInt(); // read second number from user

            if (number1 == number2)
                System.out.printf("num1 == num2\n", number1, number2);
            if (number1 != number2)
                System.out.printf("num1 != num2\n", number1, number2);
            if (number1 < number2)
                System.out.printf("num1 < num2\n", number1, number2);
            if (number1 > number2)
                System.out.printf("num1 > num2\n", number1, number2);
            if (number1 <= number2)
                System.out.printf("num1 <= num2\n", number1, number2);
            if (number1 >= number2)
                System.out.printf("num1 >= num2\n", number1, number2);
        }

    }
}
