import controller.SplitWiseController;

public class Main {

    public static void fun2() throws ClassNotFoundException{
        throw new ClassNotFoundException("sdf");
    }

    public static void fun1 () throws ClassNotFoundException{
        fun2();
    }
    public static void main(String[] args) {
        /*int [] arr={1,4,7};
        try {
            System.out.println("Inside the catch");
            int x = arr[3];
            System.out.println("Behind the catch");
        }catch(Exception e){
            System.out.println("Exception catch");
        }*/


//        try {
//            throw new ClassNotFoundException("nice");
//        }catch(Exception w){
//
//        }
        try {
            fun1();
        }catch(Exception e){
            System.out.println("hello");
        }
    }

}