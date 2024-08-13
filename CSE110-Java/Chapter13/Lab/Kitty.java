//package Chapter13.Lab;

public class Kitty {
    private String name;
    private int age;

    public Kitty() {
        this.name = "Kitty";
        this.age = 0;
    }

    public Kitty(String catsName, int catsAge) {
        this.name = catsName;
        this.age = catsAge;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String meow(){
        String meow = "\'Meow!\'";  
        String name = getName();
        int age = getAge();
        return age + " year old " + name + " says " + meow;
    }

}
