import java.util.Scanner;

public class Print20Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số lượng cần in ra : ");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count<number){
            boolean check = true;
            for(int i = 2; i <= Math.sqrt(N); i++ ){
                if(N%i==0){
                    check = false;
                    break;
                }

            }
            if(check){
                count++;
                System.out.println(N);
            }
            N++;
        }
    }
}
