package Oops.Static;

public class StaticBlock {
    static {
        System.out.println("block 1");

    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
    static {
        System.out.println("block2 ");
    }
}
