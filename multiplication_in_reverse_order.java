import java.util.Scanner;
public class multiplication_in_reverse_order {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the multiplaction of a number you want : ");
            int num=sc.nextInt();
            System.out.println("how many time you want: ");
            int times= sc.nextInt();
            for(int i=times;i>=1;i--){
                System.out.println(num+" times "+ i+" ="+ num*i);
            }


        }
    }


