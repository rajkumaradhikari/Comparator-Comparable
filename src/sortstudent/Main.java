package sortstudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Comparator<Student > comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               if (o1.age>o2.age){
                   return 1;
               }else{
                   return -1;
               }
            }
        };

        List<Student> students = new ArrayList<>();

        students.add(new Student("Rajkumar",25));
        students.add(new Student("Raj",22));
        students.add(new Student("Abin",30));
        students.add(new Student("Test",20));

        Collections.sort(students,comparator);

       for (Student student : students){
           System.out.println(student);
       }
    }
}
