import java.util.Scanner;

class New{
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum =a+b;
    int product=a*b;
    System.out.println(product);
    System.out.println(sum);
    float radius=sc.nextFloat();
    float area=radius*radius*3.14f;
    System.out.println(area);
}
}