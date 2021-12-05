public class Classroom {
    public static void main(String[] args){
        Student studentOne = new Student("William");
        System.out.println("Name is " + studentOne.getName());
        System.out.println("Points are: " + studentOne.getPoints());
        studentOne.setPoints(50);
        System.out.println("Updated Points are: " + studentOne.getPoints());
        studentOne.setPoints(studentOne.getPoints()-75);
        System.out.println("Update Points are: " + studentOne.getPoints());

        Student studentTwo = new Student("Larry");
        System.out.println("Number of students: " + Student.studentCount);
        System.out.println("Name of other student: " + studentTwo.getName());

        studentTwo.tutorStudent(studentOne);
        System.out.println("Points of " + studentOne.getName() + " are " + studentOne.getPoints()) ;
     }
}
