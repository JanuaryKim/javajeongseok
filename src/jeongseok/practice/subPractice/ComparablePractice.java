package jeongseok.practice.subPractice;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;

public class ComparablePractice {

    public static void main(String[] args) {

        ArrayList studentList = new ArrayList();

        studentList.add(new Student(10, "제뉴어리"));
        studentList.add(new Student(2, "준"));
        studentList.add(new Student(9, "메이"));
        studentList.add(new Student(7, "마치"));
        studentList.add(new Student(8, "줄라이"));
        studentList.add(new Student(9, "어거스트"));

        Collections.sort(studentList);

        Iterator iterator = studentList.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

    }
}


class Student implements Comparable<Student> {

    int grade;
    String name;

    public Student(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {

        int result;

        if (this.grade > o.grade)
            result = 1;
        else if (this.grade == o.grade)
            result = 0;
        else
            result = -1;

        return result;
    }

    @Override
    public String toString() {
        return String.format("[%s : %d]", name, grade);
    }
}

