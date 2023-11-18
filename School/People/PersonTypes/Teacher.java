package School.People.PersonTypes;

import School.People.Person;

public class Teacher extends Person {
   public String subject;

   public Teacher(String name, int age, String subj) {
      super(name, age);
      this.subject = subj;
   }

   // public void createTeacher() { // why are we using void when void is supposed
   // to not return a value back no?
   // // why are we using static while we're at it too?
   // Scanner scan = new Scanner(System.in);
   // System.out.println("Enter teacher name:");
   // String teachName = scan.nextLine();
   // Person.scan.nextLine();
   // System.out.println("Enter teacher age:");
   // int teachAge = scan.nextInt();

   // System.out.println("Teacher Hired! \nName:" + teachName + "\nAge:" +
   // teachAge);
   // }
}
