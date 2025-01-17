import java.util.Scanner;

public class Rectmat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sc.nextInt();
        System.out.println("Enter no of cols");
        int x=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=x;j++){
                if( ( i == 1 ) || ( i == n ) || ( j == 1 ) || ( j==x ) ){
                    System.out.print("*");
                    System.out.print(" ");
                }
                else{
                System.out.print(" ");
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
