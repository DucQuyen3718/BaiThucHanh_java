import java.util.Scanner;

public class slide75 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b, sum =0;
        
        do {
            System.out.print("Nhap so hang cua mang :");
            b = sc.nextInt();
            System.out.print("Nhap so cot cua mang :");
            a = sc.nextInt();
        }while(a <= 0 || b <= 0);
        int A[][] = new int [a][b];
    for( int i = 0; i < a; i++){
        for(int j = 0; j < b; j++){
        System.out.printf("Nhap vao phan tu thu A[%d,%d] =", i,j);
        A[i][j] = sc.nextInt();
        if( A[i][j] % 2 == 0){
            sum += A[i][j];
        }
    }
}
System.out.print("Tong cac phan tu chan trong mang la: " + sum);
sc.close();
}
}