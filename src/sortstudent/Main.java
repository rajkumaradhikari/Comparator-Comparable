package sortstudent;

import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static void main(String[] args){

        List<Student> students = new ArrayList<>();

        students.add(new Student("Rajkumar",25));
        students.add(new Student("Raj",22));
        students.add(new Student("Abin",30));
        students.add(new Student("Test",20));

       for (Student student : students){
           System.out.println(student);
       }
    }
}
