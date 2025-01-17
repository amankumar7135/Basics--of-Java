public class pattern_{

        public static void main(String [] args){
            int s = 1;
            int m = 2;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (j % 2 == 0) {
                        System.out.print(s);
                    } else
                        System.out.print(m);
                }
                System.out.println();
                int l = s;
                s = m;
                m = l;
            }
        }
    }