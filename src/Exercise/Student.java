package Exercise;

public class Student {
    private String name;
    private String email;
    private String registrationYear;

    public Student(){
    }
    public Student(String name, String email, String registrationYear){
        this.name=name;
        this.email= email;
        this.registrationYear=registrationYear;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name;
    }
}
