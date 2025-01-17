public class numerical_rectangular_pattern {
    public static void main(String[] args) {
//        int m=7;
        for(int i=1;i<=7;i++){
            for(int j=i;j<=7;j++){
                System.out.print(j);
            }
            for(int j=1;j<i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


