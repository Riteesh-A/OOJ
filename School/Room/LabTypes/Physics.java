package School.Room.LabTypes;

import School.People.PersonTypes.Teacher;
import School.Room.Lab;

public class Physics extends Lab {
    int caliperCount;

    public Physics(Teacher assTeacher) {
        super(assTeacher);
        this.caliperCount = 30;
    }
}
