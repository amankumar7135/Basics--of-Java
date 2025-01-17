import java.util.Scanner;
public class star_symbol_while_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
    while(num>0){
        for(int i=1;i<=num;i++){
            System.out.print("*");
        }
        System.out.println();
        num--;
    }

    }
}
