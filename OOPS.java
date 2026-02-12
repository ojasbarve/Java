class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int PRN;

    public void printName() {
        System.out.println(this.name);
        System.out.println(this.PRN);
    }
}

public class OOPS {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ball";

        pen1.write();

        Pen p2 = new Pen();
        p2.color = "red";
        p2.type = "roller";

        pen1.printColor();
        p2.printColor();
*/
        Student s1 = new Student();
        s1.name = "Ojas";
        s1.PRN = 124;

        s1.printName();
    }
}
