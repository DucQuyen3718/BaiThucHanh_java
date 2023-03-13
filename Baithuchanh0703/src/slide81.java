import java.util.Scanner;

public class slide81 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua mang");
        m = sc.nextInt();
        System.out.println("Nhap vao so cot cua mang");
        n = sc.nextInt();
        int A[][] = new int [m][n];
        System.out.println("Nhap cac phan tu cua mang");
        for (int i = 0; i < m; i++){
            for (int j = 0; j <n; j++){
                System.out.println("A[" +i+"][" +j+"]=");
                A[i][j] = sc.nextInt();
            }
        }
        int max = A[0][0];
        for (int i = 0; i < m; i++){
            for (int j = 0; j <n; j++){
                if (max < A[i][j]){
                    max = A[i][j];
                }
            }
            System.out.println("Phan tu lon nhat trong mang la: " + max);
        }

        sc.close();
    }
    
}
