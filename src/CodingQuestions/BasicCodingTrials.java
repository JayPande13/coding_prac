package CodingQuestions;

import java.util.Scanner;

public class BasicCodingTrials {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        Integer num1 = input.nextInt();
        String binaryNum1 =  Integer.toBinaryString(num1);


        System.out.print("Enter second number: ");
        Integer num2 = input.nextInt();
        String binaryNum2 =  Integer.toBinaryString(num2);

        System.out.println("Binary Values are : " + binaryNum1 + " " + binaryNum2);
        System.out.println("Bitwise AND: " + (num1 & num2) + " its Binary Conversion: " + Integer.toBinaryString(num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2) + " its Binary Conversion: " + Integer.toBinaryString(num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2) + " its Binary Conversion: " + Integer.toBinaryString(num1 ^ num2));
        System.out.println("Bitwise NOT: " + (~num1) + " its Binary Conversion: " + Integer.toBinaryString(~num1));
        System.out.println("Bitwise Left Shift: " + (num1 << 2) + " its Binary Conversion: " + Integer.toBinaryString(num1  << 2));
        System.out.println("Bitwise Right Shift: " + (num1 >> 2) + " its Binary Conversion: " + Integer.toBinaryString(num1  >> 2));
        System.out.println("Bitwise Unsigned Right Shift: " + (num1 >>> 2) + " its Binary Conversion: " + Integer.toBinaryString(num1 >>> 2));

        input.close();
    }
}
//1010 ->0101 -> 0010