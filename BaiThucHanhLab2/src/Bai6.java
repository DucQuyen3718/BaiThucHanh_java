import java.util.Scanner;

//  Viết chương trình nhập vào 1 số nguyên dương bất kỳ từ bàn phím.
//  Sau đó tính và in ra giai thừa của số đó.


public class Bai6 {
    public static void main(String[] args) {
        int i = 1 , giaithua = 1, n;
        System.out.println("Nhap vao so nguyen bat ky");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        do { giaithua *= i;
            i++;}
        while (i <= n);  
        
        
        System.out.println("giai thua cua " + n + " la " + giaithua);   


        sc.close();
    }

}
