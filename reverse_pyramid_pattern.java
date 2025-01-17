
    public class reverse_pyramid_pattern {
        public static void main(String[] args) {
            for (int i = 4; i >=1; i--) {
                for (int j =4-i; j>=0; j--) {
                    System.out.print(" ");
                }
                for (int j = i*2-1; j>=1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }


