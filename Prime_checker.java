import java.util.Scanner;

public class Prime_checker {
    public static boolean isprime(int num){
        if(num<=1){
            return false;
    }
      for(int i=2;i<=Math.sqrt(num);i++){
          if(num%i==0){
              return false;
          }
      }
      return true;
    }
    public static void main(String args[]){
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
if(isprime(num)){
    System.out.println(num+" is a prime number.");
}
else{
    System.out.println(num+" is not a prime number.");
}

        }
    }

