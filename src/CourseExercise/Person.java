package CourseExercise;

/**
 * simple program for OOP basics
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    //getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (age> 100 || age <0){
            this.age=0;
        }else {
            this.age = age;
        }
    }
    public boolean isTeen(){
        if (this.age>12 && this.age<20){
            return  true;
        }else {
            return false;
        }
    }
    public String getFullName(){
        if (this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "No names yet ";
        } else if (this.lastName.isEmpty()){
            return this.firstName;
        } else if (this.firstName.isEmpty()){
            return this.lastName;
        }
        return null;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Jack");
        person1.setLastName("");
        person1.setAge(17);
        System.out.println(person1.getFullName()+" "+ person1.getAge() +" "+ person1.isTeen());

    }


}

