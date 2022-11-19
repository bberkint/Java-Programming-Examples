public class Rectangle {
    private float length;
    private float width;
    private float xLocation;
    private float yLocation;

    public Rectangle()
    {
        length = 3.0f;
        width = 3.0f;
        xLocation = 2.0f;
        yLocation = 2.0f;
    }
    public Rectangle(float l, float w)
    {
        length = l;
        width = w;
        xLocation = 1.0f;
        yLocation = 1.0f;
    }
    public Rectangle(float l, float w, float x, float y)
    {
        length = l;
        width = w;
        xLocation = x;
        yLocation = y;
    }
    public float getArea()
    {
        return length * width * xLocation * yLocation;
    }
}
