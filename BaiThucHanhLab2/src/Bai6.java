import java.util.Scanner;

//  Viết chương trình nhập vào 1 số nguyên dương bất kỳ từ bàn phím.
//  Sau đó tính và in ra giai thừa của số đó.


public class Bai6 {
    public static void main(String[] args) {
        int i , giaithua;
        System.out.println("Nhap vao so nguyen bat ky");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

        do giaithua = i * (i-1);
        while (i > 0);  
        
        
        System.out.println("giai thua cua " + i + " la " + giaithua);   


        sc.close();
    }

}
