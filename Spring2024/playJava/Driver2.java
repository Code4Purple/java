package playJava;
public class Driver2 {
    public static void main(String[] args) {
        int a = bar(3);
        int b = foo(a);
    }
    static int foo(int x) {
        System.out.print(x);
        x = bar(x-1);
        return x;
    }
    static int bar(int x) {
        System.out.print(x);
        return x + 1;
    }
}
