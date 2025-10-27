package Exception_Handling;

class  DivedeByExceeption extends Exception{
    public String toString(){
        return " denonminator should not be zero!";
    }
}

public class ThrowthrowsDemo {
    static int meth1(int a,int b) throws  DivedeByExceeption{
        if(b==0) throw new DivedeByExceeption();
        return a/b;
    }
    static void meth2(){
        try{
            int c=meth1(10,2);
            System.out.println(c);

        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Execution will completed successfully...");
        }

    }
    static void meth3(){
        meth2();
    }

    public static void main(String[] args) {
        meth3();


    }
}
