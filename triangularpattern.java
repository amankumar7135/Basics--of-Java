import java.util.stream.IntStream;

public class triangularpattern {
    public static void main(String args[]){
        int row=10;
        for(int i=1;i<=row;i++){
            for (int j=0;j<=row-i;j++){
                System.out.print(" ");
            }
            IntStream.rangeClosed(1, (2 * i - 1)).mapToObj(k -> "*" +
                    "").forEach(System.out::print);
        System.out.println();
    }
}}
