import java.util.Scanner;


public class math {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("");

    double num1 = 3.0;
    double num2 = 1.5;
    double num3 = 5;

    // Processes
    double division = num1 / num2;
    /*double multiplication = num1 * num2;
    double addition = num1 + num2;
    double subtraction = num1 - num2; */

    System.out.println(division);

    num2 = 2.0;
    System.out.println(division);
    num1 = 10;
    division = (num3 + num1) / num2;
    System.out.println((int)division);
    num2 = 2.0;
    System.out.println(division);
    System.out.println("");


    int kidsInClass1;
    int kidsInClass2;
    int numClasses;

    kidsInClass1 = 9;
    kidsInClass2 = 2;
    numClasses = 2;

    System.out.println((kidsInClass1 + kidsInClass2) / (numClasses));

    System.out.println((double)(kidsInClass1 + kidsInClass2) / (double)(numClasses));


    final int MILLIOUNCES_PER_OUNCE = 1000;
    int numMilliounces;
    double numOunces;

    numMilliounces = 2543;

    numOunces = numMilliounces / MILLIOUNCES_PER_OUNCE;

    System.out.print(numOunces);
    System.out.println(" ounces");

    char a = 'x';
    char b = 'y';
    char c = 'z';

    System.out.println(""+a+b+c+" "+a+c+b+" "+b+a+c+" "+b+c+a+" "+c+a+b+" "+c+b+a);

    
    String str1 = "owl";        //scan.next();
    String str2 = "whale";      //scan.nextLine();

    System.out.println(str1);
    System.out.println(str2);

    System.out.println("");
    for (int musicianCount = 0; musicianCount < 5; musicianCount++){
            if (musicianCount == 4){
              System.out.println("Quartet");
            }
            else if (musicianCount == 2){
              System.out.println("Duo");
            }
            else if (musicianCount == 1){
              System.out.println("Solo");
            }
            else {
              System.out.println("Other number of musicians");   
            }
    }

    int x;

    x = 7;
      
    if ( !((x > 5) || (x < 3)) ) {
       System.out.println("a");
    }
    if ( (x > 3) && (x < 10) ) {
       System.out.println("b");
    }
    System.out.println("c");


  

    int carYear = 0;
    int car = carYear;
      if( car >= 1957){
         System.out.println("Probably can carry several people.");
      }
      if (car <= 1961){
         System.out.println("Probably only has a few safety features.");
      }
      if (car >= 1990){
         System.out.println("Probably has traction control.");
      }
      
      boolean isRed = false;
      boolean isBalloon = true;
      System.out.println("");

      if(isBalloon && !isRed){
         System.out.println("Balloon");
      }
      if(isBalloon && isRed){
         System.out.println("Red balloon");         
      }
      else{
         System.out.println("Not a balloon");   
      }
      


  }
}
     






