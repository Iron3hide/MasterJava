package arrayList2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class student1 {

    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public student1(String name, int...marks)
    {
        this.name = name;
        for (int mark:marks){
            this.marks.add(mark);
        }
    }

    public int sumOfMarks()
    {
        int sum = 0;
        for (int mark:marks)
        {
            sum += mark;
        }
        return sum;
    }

    public int lengthOfMarks()
    {
        return marks.size();
    }

    public int minimumOfMarks()
    {
        return Collections.min(marks);
    }

    public int maximumOfMarks()
    {
        return Collections.max(marks);
    }

    public BigDecimal averageOfMarks()
    {
        int sum = sumOfMarks();
        int number = lengthOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

    public String toString()
    {
        return name + marks;
    }

    public void addMark(int mark)
    {
        marks.add(mark);
    }

    public void removeMark(int mark)
    {
        marks.remove(mark);
    }
}