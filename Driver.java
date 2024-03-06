public class Driver {
    public static void main(String[] args) {
        foo(7);
        bar(1);
    }
    static void foo(int x) {
        System.out.print(x);
    }
    static void bar(int x) {
        foo(x+1);
        System.out.print(x);
    }    
}
