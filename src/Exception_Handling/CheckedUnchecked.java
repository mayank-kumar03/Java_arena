package Exception_Handling;


class LowBalanceException extends Exception{
    public String toString(){
        return "Balance is not sufficient !Try again...";
    }
}

public class CheckedUnchecked {
    static void fun1() {
//        try{
//            System.out.println(10/0);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//       checked Excption FileInputStream f1=new FileInputStream("My.txt");
        try {
            throw new LowBalanceException();

        } catch (LowBalanceException e) {
            System.out.println(e);
        }
    }




    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
