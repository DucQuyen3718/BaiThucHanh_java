import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so phan tu can nhap: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri cho phan tu thu " + (i + 1));
            int value = sc.nextInt();
            sum += value;
        }
        double trungbinhcong = (double) sum / n;
        System.out.println("Trung binh cong cua " + n + "so nhap vao la: " + trungbinhcong);
        sc.close();
    }

}
