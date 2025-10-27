package Exception_Handling;

import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int A[]={4,6,8,2};

        try{
            c=a/b;
            try {
                System.out.println(A[10]);

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

            System.out.println("This is from c: "+c);

        } catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("hello");

        }

        System.out.println("Hello India");
    }
}
