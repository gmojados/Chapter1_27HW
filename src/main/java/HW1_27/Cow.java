package HW1_27;

public class Cow {
    private String name;
    private int age;

    public String toString (){
        StringBuilder build = new StringBuilder();
        build.append(name).append(": ").append(age);
        return build.toString();
    }
    public Cow (String name, int age){
        this.name = name;
        this.age = age;

    }
}
