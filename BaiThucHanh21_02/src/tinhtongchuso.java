import java.util.Scanner;
public class tinhtongchuso {
    private static Scanner sc = new Scanner(System.in);

     
   
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong n = ");
        int n = sc.nextInt();
        System.out.printf("Tong cua cac chu so "
                + "cua %d la: %d", n, tongcacchuso(n));
    }

    public static int tongcacchuso(int n) {
        int tong = 0;
        do {
            tong = tong + n % 10;
            n = n / 10;
        } while (n > 0);
        return tong;
    }
}
