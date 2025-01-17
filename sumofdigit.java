import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number: ");
        int num=sc.nextInt();
        int sum=0;
        int a=0;
        while(num>0){
            a=num%10;
            sum+=a;
            num=num/10;
        }
        System.out.println("sum of digit= "+sum);
    }
}
