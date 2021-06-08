import java.util.Scanner;

public class InterestCaculator {
    public static void main(String[] args) {
        int month = 1;
        double money = 1.0;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.print("nhập số tiền gửi : ");
        money = input.nextDouble();
        System.out.print("nhập vào số tháng gửi : ");
        month = input.nextInt();
        System.out.print("nhập vào tiền lãi : ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 1 ; i < month; i ++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.print("totalInterest is : " + totalInterest);
    }
}
