package sample;

import sample.exceptions.GroupOverflowException;
import sample.exceptions.StudentNotFoundException;

public class Group {
    private String groupName;
    private Student[] students = new Student[10];
    private int size = 0;

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        if (size >= students.length) {
            throw new GroupOverflowException("Group is full. Cannot add more students.");
        }
        students[size++] = student;
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < size; i++) {
            if (students[i].getLastName().equals(lastName)) {
                return students[i];
            }
        }
        throw new StudentNotFoundException("Student with last name '" + lastName + "' not found.");
    }

    public String removeStudentByID(int id) throws StudentNotFoundException {
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                students[i] = students[size - 1];
                students[size - 1] = null;
                size--;
                return "Student with ID " + id + " removed";
            }
        }
        throw new StudentNotFoundException("Student with id '" + id + "' not found.");
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        String students = "";
        for (int i = 0; i < size; i++) {
            students += System.lineSeparator() + this.students[i];
        }
        return groupName + ": " + students;
    }
}