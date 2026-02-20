import java.util.*;

public class MarksProcessing {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(80); // autoboxing
        marks.add(90);
        marks.add(70);
        marks.add(85);

        int sum = 0;

        for (int m : marks) { // unboxing
            sum += m;
        }

        double avg = (double) sum / marks.size();

        System.out.println("Marks: " + marks);
        System.out.println("Average = " + avg);
    }
}