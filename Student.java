public class Student {
    private String name;
    private int rollNumber;
    private double marks;
    
    public void setDetails(String studentName, int roll, double studentMarks) {
        this.name = studentName;
        this.rollNumber = roll;
        this.marks = studentMarks;
    }
    
    public void displayInfo(String prefix) {
        System.out.println(prefix + " Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
    
    public String calculateGrade(double passingMarks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= passingMarks) return "C";
        else return "F";
    }
    
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public double getMarks() {
        return marks;
    }
}