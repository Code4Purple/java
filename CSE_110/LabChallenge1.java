// Properties of a Circle

class LabChallenge1 {
    public static void main(String[] args){

        // Normal Computed Values
        double pi = 3.1415;
        double radius = 10.25;
        double diameter = radius * 2;
        double circumference = pi * diameter;
        double area = pi * (radius * radius);
        double semiCircle = area / 2;
         
        // Rounded Down Computed Values
        int rRadius = (int)radius;
        int rDiameter = (int)diameter;
        int rCircumference = (int)circumference;
        int rArea = (int)area;
        int rSemiCircle = (int)semiCircle;

        // All the Outputs - Normal
        System.out.println("Properties of a Circle");
        System.out.println("Radius                : " + radius);
        System.out.println("Diameter              : " + diameter);
        System.out.println("Circumference         : " + circumference);
        System.out.println("Area                  : " + area);
        System.out.println("Area of a Semicircle  : " + semiCircle);
        
        //Spacing
        System.out.println("");
        
        // All the Outputs - Rounded Down
        System.out.println("Properties \"Rounded\" Down");
        System.out.println("Radius                : " + rRadius);
        System.out.println("Diameter              : " + rDiameter);
        System.out.println("Circumference         : " + rCircumference);
        System.out.println("Area                  : " + rArea);
        System.out.println("Area of a Semicircle  : " + rSemiCircle);

    }
}