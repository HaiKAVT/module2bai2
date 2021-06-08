import java.util.Scanner;

public class PrintMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                for(int i = 0; i < 5; i++){
                    for(int j = 0 ; j < 5; j++){
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                for (int i = 0 ; i <= 5; i++){
                    for(int j = 0; j<i ; j++){
                        System.out.print(" * ");
                    }
                    System.out.println("  ");
                }
                break;
            case 3:
                for(int i = 7; i>0; i--){
                    for(int j = 0 ; j<i; j++){
                        System.out.print(" * ");
                    }
                    System.out.println("   ");
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No Choice!!");


        }
    }
}
