import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("nhập số a : ");
        a = scanner.nextInt();
        System.out.print("nhập số b : ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 || b==0){
            System.out.print("không có ước chung lớn nhất");
        }
        while (a!=b){
            if(a>b){
                a = a - b;
            } else  b = b-a;
        }
        System.out.print("ước chung lớn nhất là : " + a );
    }
}
