import java.util.Scanner;
public class reverse_rectangular_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r =sc.nextInt();
        for(int i=r;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
