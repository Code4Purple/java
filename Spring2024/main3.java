
public class main3 {
   public static void main(String [] args){
      int result;
      int stop;
      int a;
      int b;
      
      stop = 6;
      result = 0;
      
      for (a = 1; a < 3; ++a) {
          System.out.print(a + ": ");
          
          for (b = 0; b < 2; ++b) {
              result += a;
              
              if (result > stop) {
                  System.out.print("_ ");
                  continue;
              }
              
              System.out.print(result + ",");
          }
          
          System.out.println();
      }
    
    }
}