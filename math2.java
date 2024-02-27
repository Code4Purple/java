

public class math2 {
    public static void main(String[] args) {
        String fullName;
		int index1;
		int index2;
      
      fullName = "Koharu Rhys Fox";

      /* Your code goes here */
      index1 = fullName.indexOf(' ') + 1;
      index2 = fullName.lastIndexOf(' ');
      
      String output = fullName.substring(index1,index2);
      System.out.println(output);    
    }
}
