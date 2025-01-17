import java.util.Scanner;
class PrintArguments{
    public static void main(String[] args){
        System.out.println("Enter your argumner with space : ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        //if(input.trim().isEmpty()){
        if(input.isEmpty()){
            System.out.println("NO Argument Found");
        }
        else{
            String[] argument=input.split(" ");
            System.out.println("arguments Provided:" );
            for(int i=0;i<argument.length;i++){
                System.out.println("Argument "+ (i+1) +": "+ argument[i] );
            }
        }
    }
}
