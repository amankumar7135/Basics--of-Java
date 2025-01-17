public class patternWithIFElse {

        public static void main(String[] args) {
            int n = 4;

            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


