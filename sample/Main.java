package sample;

import sample.exceptions.GroupOverflowException;
import sample.exceptions.StudentNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            Group group = new Group("Group A");

            // for (int i = 0; i < 8; i++) {
            // group.addStudent(new Student("Nick#" + i, "Last#" + i, Gender.MALE, i + 1,
            // group.getGroupName()));
            // }

            Student student1 = new Student("John", "Doe", Gender.MALE, 9, group.getGroupName());
            Student student2 = new Student("Jane", "Smith", Gender.FEMALE, 10, group.getGroupName());
            Student student3 = new Student("Mike", "Johnson", Gender.MALE, 11, group.getGroupName());

            group.addStudent(student1);
            group.addStudent(student2);
            group.addStudent(student3);

            System.out.println(group);

            System.out.println();

            Student foundStudent = group.searchStudentByLastName("Smith");
            System.out.println("Found Student: " + foundStudent);

            System.out.println();

            System.out.println(group.removeStudentByID(11));

            System.out.println();

            System.out.println(group);
        } catch (GroupOverflowException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}