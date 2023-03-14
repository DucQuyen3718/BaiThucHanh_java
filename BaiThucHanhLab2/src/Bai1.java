import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int a , b;
        System.out.println("Nhap 2 so a , b");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    //Tính tổng, Hiệu, Tích, Thương 2 số
        System.out.println("Tong = " + (a+b) ); 
        System.out.println("Hieu = " + (a-b));
        System.out.println("Tich = " + (a*b));
        System.out.println("Thuong = " + (a/b));
        System.out.println("a Chia lay du cho b = " + (a%b));
    //So sánh 
        
        System.out.println("a < b : " + (a<b));
        System.out.println("a > b :" +(a >b));
        System.out.println("a = b :" + (a == b));


        sc.close();
    }
    
}
