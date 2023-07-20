import java.util.Scanner;

public class MatrixProduct {
    public static void matrixProduct(int arr[][],int r,int c,int B){
        int ans[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=arr[i][j]*B;
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int B= sc.nextInt();
        matrixProduct(arr,r,c,B);
    }
}