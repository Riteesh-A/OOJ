package School.Room;

import School.People.PersonTypes.Teacher;

public abstract class Lab {
    public String subject;
    int chairs;
    public Teacher assignedTeacher;
    // Student[] enrolledStudents;

    public String toString() {
        return "LAB: \nSubject: " + this.subject + "\nChairs: " + this.chairs + "\nTEACHER: "
                + this.assignedTeacher;
    }

    public Lab(Teacher teach) {
        this.subject = teach.subject;
        this.chairs = 30;
        this.assignedTeacher = teach;
    }
}
