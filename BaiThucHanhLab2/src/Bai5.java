import java.util.Scanner;

//  Viết chương trình nhập vào các số nguyên 
//  và tính tổng các số đó, nếu tổng lớn hơn > 100 
//  thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập.



public class Bai5 {
    public static void main(String[] args) {
        int Tong = 0, i = 0;
        System.out.println("Nhap vao so bat ky");
        Scanner sc = new Scanner(System.in);
        while(Tong < 100){
            i = sc.nextInt();
            Tong = Tong + i;
             i++;
        }
        System.out.println("Tong = " + Tong);


        sc.close();
    }
    
}
