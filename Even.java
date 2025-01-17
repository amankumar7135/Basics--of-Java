
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to check: ");
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
//        if(num==0){
//            System.out.println(" it is neither even nor odd  number");
//        } else if (num%2==0) {
//            System.out.println("it is an even number");
//
//        } else{
//            System.out.println("it is an odd number.");
//        }
      String ans;
      ans= (num%2==0)? "Even":"odd";
        System.out.println(ans);
    }
}
