package array1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class array
{

    private String name;
    private int[] marks;

    public array(String name, int[] marks)
    {
        this.name = name;
        this.marks = marks;
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
        return marks.length;
    }

    public int minimumOfMarks()
    {
        int minimum = Integer.MAX_VALUE;
        for (int mark:marks)
        {
            if (mark<minimum)
            {
                minimum=mark;
            }
        }
        return minimum;
    }

    public int maximumOfMarks()
    {
        int maximum = Integer.MIN_VALUE;
        for (int mark:marks)
        {
            if(mark>maximum)
            {
                maximum=mark;
            }
        }
        return maximum;
    }

    public BigDecimal averageOfMarks()
    {
        int sum = sumOfMarks();
        int number = lengthOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }
}