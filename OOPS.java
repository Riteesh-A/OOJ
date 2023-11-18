import School.People.PersonTypes.Student;
import School.People.PersonTypes.Teacher;
import School.Room.LabTypes.ComputerLab;
import java.util.Scanner;

public class OOPS {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);

      // System.out.println("Options:\n1. Hire Teacher\n2. Create Lab\n3. Enroll
      // Student\n4. Admit Student");
      // String option = scan.nextLine();

      System.out.println("Enter teacher name, age and subject:");
      String teachName = scan.nextLine();
      int teachAge = scan.nextInt();
      String subj = scan.nextLine();

      Teacher t1 = new Teacher(teachName, teachAge, subj);
      // Teacher javaTeacher = new Teacher("Bob", 45, "java");
      // Teacher pyTeacher = new Teacher("John", 75, "python");

      // Student s1 = new Student("Riteesh", 16);
      // Student s2 = new Student("Kanye", 21);

      // ComputerLab javaLab = new ComputerLab(12, javaTeacher);
      // ComputerLab pyLab = new ComputerLab(15, pyTeacher);

      // javaTeacher.teacherType = "Java";
      // pyTeacher.teacherType = "Python";

      // pyLab.enroll(s1);
      // System.out.println(s2);
      System.out.println(t1);
   }
}

/*
 * What do you want to do
 * 1. Hire Teacher (create teacher obj)
 * 2. Create Lab
 * 3. Enroll Student to class DONE
 * 4. Admit Student (create student)
 */
