package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Lizzy = new Teacher(1,"Lizzy",50000);
        Teacher Melisa = new Teacher(2,"Melisa",70000);
        Teacher Lisa = new Teacher(3,"Lisa",90000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Melisa);
        teacherList.add(Lisa);

        Student Tamara = new Student(1, "Tamara", 4);
        Student Lex = new Student(2, "Lex", 12);
        Student Cate = new Student(3, "Cate", 5);
        List<Student> studentList = new ArrayList();

        studentList.add(Tamara);
        studentList.add(Lex);
        studentList.add(Cate);

        School ghs = new School(teacherList,studentList);

        Teacher Megan = new Teacher(6,"Megan",50000);

        ghs.addTeacher(Megan);

        Tamara.payFees(150000);
        Lex.payFees(96000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making GRS PAY SALARY----");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("GHS has spent salary to " + Lizzy.getName()
        +" and now has " + ghs.getTotalMoneyEarned());

        Melisa.receiveSalary(Melisa.getSalary());
        System.out.println("GHS has spent salary to " + Melisa.getName()
                +" and now has " + ghs.getTotalMoneyEarned());

        System.out.println(Lex);
        System.out.println(Melisa);
    }
}
