import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String correctOperation;
    int operation;
    
    do {
      System.out.println("Welcome to Braeden's calculator");
      System.out.print("Choose one of the following options,\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\nYour choice: ");
      operation = scanner.nextInt();
      
      System.out.printf("You chose option %d, is this correct? (Yes or No): ", operation);
      correctOperation = scanner.next();
    } while (!correctOperation.equalsIgnoreCase("yes"));
    
    if (operation == 1) {
      int x, y;
      do {
        System.out.print("Enter the first number: ");
        x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        y = scanner.nextInt();
        
        System.out.printf("You have entered the numbers %d and %d, is this correct? Please type \"Yes\" or \"No\": ", x, y);
        scanner.nextLine();
        correctOperation = scanner.nextLine();
      } while (!correctOperation.equalsIgnoreCase("yes"));
      
      int solution = x + y;
      System.out.printf("The sum of %d and %d is %d", x, y, solution);
    }
    
    if (operation == 2) {
      int x, y;
      do {
        System.out.print("Enter the first number: ");
        x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        y = scanner.nextInt();
        
        System.out.printf("You have entered the numbers %d and %d, is this correct? Please type \"Yes\" or \"No\": ", x, y);
        scanner.nextLine();
        correctOperation = scanner.nextLine();
      } while (!correctOperation.equalsIgnoreCase("yes"));
      
      int solution = x - y;
      System.out.printf("%d minus %d equals %d", x, y, solution);
    }

    if (operation == 3) {
      int x, y;
      do {
        System.out.print("Enter the first number: ");
        x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        y = scanner.nextInt();
        
        System.out.printf("You have entered the numbers %d and %d, is this correct? Please type \"Yes\" or \"No\": ", x, y);
        scanner.nextLine();
        correctOperation = scanner.nextLine();
      } while (!correctOperation.equalsIgnoreCase("yes"));
      
      int solution = x * y;
      System.out.printf("%d times %d is %d", x, y, solution);
    }

    if (operation == 4) {
      double x, y;
      do {
        System.out.print("Enter the first number: ");
        x = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        y = scanner.nextDouble();
        
        System.out.printf("You have entered the numbers %.2f and %.2f, is this correct? Please type \"Yes\" or \"No\": ", x, y);
        scanner.nextLine();
        correctOperation = scanner.nextLine();
      } while (!correctOperation.equalsIgnoreCase("yes"));
      
      double solution = x / y;
      System.out.printf("The result of dividing %.2f by %.2f is %f", x, y, solution);
    }
    
    scanner.close();
  }
}
