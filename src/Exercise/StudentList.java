package Exercise;

import java.util.ArrayList;

public class StudentList {
    public ArrayList <Student> studentList;
    public StudentList(){
        studentList= new ArrayList<Student>();
    }

    public static void main (String args[]){
        Student s1 = new Student("n1", "e1", "y1");
        Student s2 = new Student("n2","e2", "y2");
        Student s3 = new Student("n3", "e3", "y3");

        StudentList list1 = new StudentList();
        list1.addToList(s1);
        list1.addToList(s2);
        list1.addToList(s3);
        System.out.println();

        list1.removeStudent(s2);
        System.out.println();
        list1.printList();



    }

    public void addToList(Student s){
        this.studentList.add(s);
        System.out.println(s.getName() + " has been added to the list");
    }
    public void printList(){
        System.out.println("---------------");
        for (int i =0; i<this.studentList.size(); i++){
            System.out.println(this.studentList.get(i));
        }
        System.out.println("---------------");
    }
    public void removeStudent(Student s){
        this.studentList.remove(s);
        System.out.println( s.getName()+ " has been removed from list");
    }

}
