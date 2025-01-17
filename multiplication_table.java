import java.util.Scanner;
public class multiplication_table {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(num+ " * "+i+
                    " ="+i*num);
        }
    }
}
