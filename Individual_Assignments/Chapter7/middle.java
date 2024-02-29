package Individual_Assignments.Chapter7;

public class middle {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;
        System.out.println("The middle number is : " + middle(a, b, c));
    }

    public static int middle(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            // a is the smallest
            if (b < c) {
                // b is the middle
                return b;
            } else {
                // c is the middle
                return c;
            }
        } else if ((b < a) && (b < c)) {
            // b is the smallest
            if (a < c) {
                // a is the middle
                return a;
            } else {
                // c is the middle
                return c;
            }
        } else if ((c < a) && (c < b)) {
            // c is the smallest
            if (a < b) {
                // a is the middle
                return a;
            } else {
                // b is the middle
                return b;
            }
        } else if( a ==  b ||  a ==  c ||  b ==  c){
            if (a == b){
                if (a < c){
                    return a;
                } else {
                    return c;
                }
            }
            if (a == c){
                if (a < b){
                    return a;
                } else {
                    return b;
                }
            }
        }
        return -1; // error
    }
}
