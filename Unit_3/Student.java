package Unit_3;

public class Student {
    public String name;
    public int age;
    public int id;

    public String setValue(String name, int age, int id){
        this.name = name + " - CSE";
        this.age = age;
        this.id = id;
        return this.name;
    }
    public void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
}
