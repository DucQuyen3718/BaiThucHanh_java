import java.util.Calendar;
import java.util.Scanner;


public class Bai3 {
    public static void main(String[] args) {

        String ten;
        int ns; 
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);


        Scanner sc = new Scanner(System.in);
        System.out.println("Ten cua ban: ");
        ten = sc.nextLine();
        System.out.println("Nhap nam sinh cua ban");
        ns = sc.nextInt();

// Tinh so tuoi va chia nhom tuoi
        if ( (year - ns) < 16)
            System.out.println("Ban" + ten + "dang o tuoi vi thanh nien");
        else if ( (year - ns) <= 18 && 16 <=  (year - ns) )
                System.out.println("Ban" + ten + "dang o tuoi truong thanh");
            else if ( (year - ns) > 18)
                    System.out.println("Ban " + ten + "da gia");
        

        sc.close();
    }
    
}
