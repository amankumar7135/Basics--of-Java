public class traingle_with_hole {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1||k==2*i-1||i==4){
                System.out.print(i);
            }
                else{
                    System.out.print(" ");
                }
            }
            for(int l=1;l<i;l++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
