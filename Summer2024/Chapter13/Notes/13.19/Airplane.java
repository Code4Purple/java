//package Chapter13.Notes.13.19;

public class Airplane {
    private int elevation;

    public Airplane() {
       this.elevation = 0;
    }
 
    public void setAltitude(int elevation) {
       this.elevation = elevation;
    }
 
    public void print() {
       System.out.println(this.elevation + " meters");
    }
 }