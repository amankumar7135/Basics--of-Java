import java.util.Scanner;
public class numberic_pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=1;l<i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
