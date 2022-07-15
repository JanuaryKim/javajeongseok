package ch11.practice;

import java.util.ArrayList;
import java.util.List;

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }
}

class SoccerPlayer{
    String name;

    public SoccerPlayer(String name) {
        this.name = name;
    }
}

class School {
    public static void printStudentList(List<? extends Student> list) {

        String nameList = "학생 출석부 : [ ";
        for (Student s : list) {
               nameList += s.name + " ";
        }
        nameList += " ]";
        System.out.println(nameList);
    }
}

class GeneClass <T> {

}

public class WildCardEx {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("제뉴어리맨"));
        students.add(new Student("줄라이맨"));
        students.add(new Student("악토버맨"));
        students.add(new Student("악토버맨"));

        School.printStudentList(students);

        List<SoccerPlayer> soccerPlayers = new ArrayList<>();
        soccerPlayers.add(new SoccerPlayer("제뉴어리맨"));
        soccerPlayers.add(new SoccerPlayer("줄라이맨"));

//        School.printStudentList(soccerPlayers); //에러 발생, 와일드카드에 어긋난 타입
    }
}


