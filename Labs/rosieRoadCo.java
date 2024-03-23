package Labs;

public class RosieRoadCo {
    public static void main(String[] args) {
        
                                   //Test Cases  
        System.out.println(numberOfStopLights(1.0,  1));  //should return the value 3
        System.out.println(numberOfStopLights(1.0,  2));  //should return the value 4
        System.out.println(numberOfStopLights(2.0,  1));  //should return the value 6
        System.out.println(numberOfStopLights(2.75,  3)); //should return the value 10
        
    }

    public static int numberOfStopLights(double miles, int lanes){
        int intersections = (int)(Math.floor(miles));
        int stopLights = intersections * (2 + lanes);
        return stopLights;
    }
}

// Lab P @ 18:00 mins
