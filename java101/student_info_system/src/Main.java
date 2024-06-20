/*
Student Grading System
Course Class Features:

Attributes: name, code, prefix, note, Teacher
Methods: Course() , addTeacher() , printTeacher()
Teacher Class Features:

Attributes: name, mpno, branch
Methods: Teacher()
Student Class Features:

Attributes: name,stuNo,classes,course1,course2,course3,avarage,isPass
Methods: Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
 */

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alican", "539", "Software");
        Teacher t2 = new Teacher("Dilan", "535", "Physics");
        Teacher t3 = new Teacher("Eylül", "542", "Math");

        Course software = new Course("Software", "101", "Software");
        software.addTeacher(t1);

        Course physics = new Course("Physics", "201", "Physics");
        physics.addTeacher(t2);

        Course math = new Course("Math", "301", "Math");
        math.addTeacher(t3);


        Student s1 = new Student("Emine", "123", "1", software, physics, math);
        s1.addBulkExamNote(100, 100, 75);
        s1.isPass();

        Student s2 = new Student("Ahmet", "456", "2", software, physics, math);
        s2.addBulkExamNote(100,50,30);
        s2.isPass();
    }
}