public class AnimalsPrint {

    public static void spacingPrints(){
        System.out.println(" ");
    }
    
    public static void printBunny1(){
        // Bunny Front View
        String topView    = " /\\_/\\";
        String middleView = "( o.o )";
        String bottomView = " > ^ <";
        System.out.printf("%s\n%s\n%s\n",topView,middleView,bottomView);
    }
    
    public static void printBunny2(){
         // Bunny Laying Down
        String sideEars = "(\\(\\";
        String sleepyEyes = "(-_-)";
        String bunnySit = "o_(\")(\")";
        System.out.printf("%s\n%s\n%s\n",sideEars, sleepyEyes, bunnySit);
    }
    public static void printSpider(){
        // Spider Values
        String topSpider = "  / _ \\";
        String buttSpider = "\\_\\(_)/_/";
        String spiderEyes = " _//\"\\\\_";
        String spiderArms = "  /   \\";
        System.out.printf("%s\n%s\n%s\n%s\n",topSpider,buttSpider,spiderEyes,spiderArms);
    }
    
    
    public static void main(String[] args){

        printBunny1();
        spacingPrints();
        printBunny2();
        spacingPrints();
        printSpider();

    }
}
