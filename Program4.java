//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        int numberFour = 0;
        int sum = 0;
        double average = 0;
        Scanner numScanner = new Scanner (System.in);
        System.out.println("Enter first number:");
        numberOne = numScanner.nextInt();
        System.out.println("Enter second number:");
        numberTwo = numScanner.nextInt();
        System.out.println("Enter third number:");
        numberThree = numScanner.nextInt();
        System.out.println("Enter fourth number:");
        numberFour = numScanner.nextInt();
        sum = numberOne + numberTwo + numberThree + numberFour;
        average = sum/4.00;
        System.out.println("The sum is: " + sum);
        System.out.println();
        System.out.println("The average is: " + average);
    }
}

//Paste console output below:
/*
Enter first number:
475
Enter second number:
821
Enter third number:
369
Enter fourth number:
562
The sum is: 2227

The average is: 556.75


*/
