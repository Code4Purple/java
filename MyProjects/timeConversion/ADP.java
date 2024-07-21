package MyProjects.timeConversion;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
//import java.lang.reflect.Array;
import java.util.ArrayList;

public class ADP {
    public static void main(String[] args) {
        ArrayList<String> onSettings = new ArrayList<String>();
        try {
            onSettings = settings();
        } catch (IOException e) {
            // Handle the exception here
            e.printStackTrace();
        }
        
        
    }

    public static void startApp(){
        
    }

    public static ArrayList<String> settings() throws IOException{
        FileInputStream inputFile = new FileInputStream("settings.data");
        Scanner myFileReader = new Scanner(inputFile);
        ArrayList<String> workingSettings = new ArrayList<String>();

        while(myFileReader.hasNextLine()){
            String reader = myFileReader.nextLine();
            int gettingState = reader.indexOf("=") + 2; 
            String stateOfSettings = reader.substring(gettingState, reader.length());;  
            if(stateOfSettings.equals("on")){
                reader = reader.substring(0, gettingState - 3);
                workingSettings.add(reader);
            }
        }
        myFileReader.close();
        return workingSettings;
    }

    public static String settingsCheck(ArrayList<String> settings, String functionName){
        for(String setting : settings){
            if(setting.equals(functionName)){
                return "on";
            }
            else{
                //System.out.println("Functionality is turned off");
                return "off";
            }
        }

    }

    public static void timeConversion(ArrayList<String> settings){
            settingsCheck(settings, "timeConversion");
            if(settingsCheck(settings, "timeConversion").equals("on")){
                System.out.print("Enter ADP value time: ");
                Scanner scnr = new Scanner(System.in);
                double time = scnr.nextDouble();
                
            }
            else{
                System.out.println("Time Conversion is turned off");
            }
            
        
    }
}
