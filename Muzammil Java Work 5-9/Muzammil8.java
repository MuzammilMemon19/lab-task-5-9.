import java.util.Scanner;

class Calculation {

public static void main(String[] args) {

int x, y;

Scanner in = new Scanner(System.in);

System.out.println("Enter two integers to calculate their sum, difference, product and quotient.");

x = in.nextInt();

y = in.nextInt();

System.out.println("Sum of entered integers = " + (x+y));

System.out.println("Difference of entered integers = " + (x-y));

System.out.println("Product of entered integers = " + (x*y));

System.out.println("Quotient of entered integers = " + (x/y));

}

}