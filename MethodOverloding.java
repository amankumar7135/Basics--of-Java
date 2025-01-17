public class MethodOverloding {
    public static void main(String[] args){
        System.out.println("hello");
        MethodOverloding.main(23);
    }
    public static void main(int arg1){

        System.out.println(arg1);
    MethodOverloding.main("hello","baby");
    }

    public static void main(String args2,String args3) {
        System.out.println(args2+ " "+args3);

    }

}
