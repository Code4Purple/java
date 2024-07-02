import java.util.Scanner; // import the Scanner class
//import java.util.ArrayList; // import the ArrayList class

import java.io.PrintWriter;
import java.io.StringWriter;

public class workStation {
    public static void main(String[] args) {
        String item;
        int quantity;
        int discount;
  
        StringWriter itemCharStream = new StringWriter();
        PrintWriter itemOSS = new PrintWriter(itemCharStream);
  
        item = "Mug";
        quantity = 10;
        discount = 30;
  
        itemOSS.println(item + " x" + quantity);
        itemOSS.print(discount + "% off");
  
        System.out.print(itemCharStream.toString());
     }
  }