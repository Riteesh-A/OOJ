package School.Room.LabTypes;

import School.People.PersonTypes.Student;
import School.People.PersonTypes.Teacher;
import School.Room.Lab;
import School.Interfaces.*;

import java.util.ArrayList;
import java.util.List;

import School.Equipment.*;

public class ComputerLab extends Lab implements RoomInterface {
    // Computer computers;
    List<Student> students = new ArrayList<>();
    List<Computer> computers = new ArrayList<>();
    int idCount = 0;

    int compCount;

    public ComputerLab(int computerCount, Teacher teacher) {
        super(teacher);
        this.compCount = computerCount;
    }

    public void enroll(Student student) {

        Computer comp = new Computer(student, idCount + 1);
        this.computers.add(comp);
        this.students.add(student);
        System.out.println(computers);
    }
}
