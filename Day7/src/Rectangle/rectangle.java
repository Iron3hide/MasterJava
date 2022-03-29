package Rectangle;

public class rectangle {

    private int length;
    private int width;
    public rectangle(int length,int width)
    {
        this.length = length;
        this.width = width;
    }

    public int calcArea()
    {
        return length * width;
    }

    public int calcPerimeter()
    {
        return 2 * (length + width);
    }
}