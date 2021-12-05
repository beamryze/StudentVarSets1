/*
 *
 *  Description: A Student class which declares variables, setters and getters, then provides results
 *  Name: Rick
 *  Semester: Fall 2021
 */

public class Student {

    // Declare vars
    public static int studentCount;
    private String name;
    private int points;

    // Declare default constructor
    public Student() {

    }

    // Declare constructor assigning to vars
    public Student(String nameArg) {
        this.name = nameArg;
        this.points = 0;
        this.studentCount++;
    }

    // Method to return name.
    public String getName() {
        return this.name;
    }

    // Method to return points
    public int getPoints() {
        return this.points;
    }

    // Method to set points
    public void setPoints(int pointsArg) {
        this.points = pointsArg;
    }

    // Method to increment and return points
    public int tutorStudent(Student otherStudent){
        otherStudent.setPoints(otherStudent.getPoints() + 1);
        return otherStudent.getPoints();
    }

}


