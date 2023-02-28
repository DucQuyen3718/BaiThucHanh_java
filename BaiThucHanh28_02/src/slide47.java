import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        int n, sum = 0;
        String str = "";
        Scanner sc = new Scanner(System.in);
        do 
        {
            System.out.println("Nhap vao mot so nguyen: ");
            n = sc.nextInt();
            sum += n;
            str += n + "+";
        }
        while(sum < 100);
        str = str.substring(0, str.length()-1);
        System.out.println("Tong cac so vua nhap vao: " + str + "=" + sum);
    sc.close();
    }
    
}
