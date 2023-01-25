public class Main {
    public static void main(String[] args) {

    Instructor instructor = new Instructor();
    instructor.setFirstName("ENGİN DEMİROĞ");

    Student student = new Student();
    student.setFirstName("YUSUF DEMİRAY");

    InstructorManager instructorManager = new InstructorManager(instructor);
    StudentManager studentManager = new StudentManager(student);
    instructorManager.add();
    studentManager.add();

}

}