import java.util.Scanner;

class Menu {

public static void main(String[] args) {

int choice;

Scanner input = new Scanner(System.in);

System.out.println("Please choose an item from the menu:");

System.out.println("1. Chicken");

System.out.println("2. Beef");

System.out.println("3. Pork");

System.out.println("4. Vegetables");

choice = input.nextInt();

switch (choice) {

case 1:

System.out.println("Chicken: Rs.200");

break;

case 2:

System.out.println("Beef: Rs.250");

break;

case 3:

System.out.println("Pork: Rs.150");

break;

case 4:

System.out.println("Vegetables: Rs.100");

break;

default:

System.out.println("Invalid choice");

}

}

}