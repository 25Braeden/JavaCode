import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    System.out.printf("Hello %s", name);

    scanner.close();
      
    }
}
    