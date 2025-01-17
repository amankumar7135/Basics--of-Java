import java.util.Scanner;
public class countofdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter your number:");
        int num=sc.nextInt();
        int numofdigit=0;
while(num>0){
    num=num/10;
    numofdigit++;
}
        System.out.println("number of digits = "+numofdigit);
        }
    }

