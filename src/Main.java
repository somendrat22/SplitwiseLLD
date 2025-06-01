import controller.SplitWiseController;

public class Main {



    public static void fun2() throws ClassNotFoundException{
        throw new ClassNotFoundException("dnndjendjejdbejdb");
    }

    public static void fun1() throws ClassNotFoundException{
        fun2();
    }


    public static void main(String[] args) throws ClassNotFoundException {
//        SplitWiseController splitWiseController = new SplitWiseController();
//        splitWiseController.startProgram();
//        int a = 10;
//        int b = 0;
//
//        try{
//            System.out.println("hey inside try");
////            int [] arr = {10, 2, 4};
////            int x = arr[10];
//            Integer y = null;
//            y.toString();
//            System.out.println("behind try");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception caught array ");
//        }catch (ArithmeticException e){
//            System.out.println("Exception Caught");
//        }

//       throw new NullPointerException("jdjiejd"); // unchecked exception

           // throw new ClassNotFoundException("fndhccnjdfnjnfjndf");
        try{

        }
            fun1();

    }

}