import java.util.Scanner;

public class slide40 {
    public static void main(String[] args) {
        int ngay; 

        System.out.println("Nhap so ngay: ");
        Scanner sc = new Scanner(System.in);
        ngay = sc.nextInt();
        switch(ngay){
            case 0: System.out.println("Chu nhat");break;
            case 1: System.out.println("Thu hai"); break;
            case 2: System.out.println("Thu ba"); break;
            case 3: System.out.println("Thu tu"); break;
            case 4: System.out.println("Thu nam"); break;
            case 5: System.out.println("Thu sau"); break;
            case 6: System.out.println("Thu bay"); break;
            default: System.out.println("So ngay khong hop le");
        }
        sc.close();
    }
  
}
