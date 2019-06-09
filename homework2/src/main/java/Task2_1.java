public class Task2_1 {



    public static void main (String [] args){
        System.out.println("working");
    }

    public static int intMethod(int a, int b){
        return a + b;
    }

    public static String hello(){
        return "Hello";
    }

    public static void exceptionThrower() throws ArrayIndexOutOfBoundsException{
        int [] arr = {1,2,3};
        arr[4] = 5;
    }

    public static void timeout(){
        for (int i = 0; i < 1000000; i++) {

        }
    }




}
