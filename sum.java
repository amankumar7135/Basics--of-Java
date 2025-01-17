import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int sum=0;
        int num=2;
        int count=0;
        while (count<n){
            sum+=num;
            num+=2;
            count++;
        }
        System.out.println("First n even numbers: "+sum);
    }
}
