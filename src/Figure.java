public abstract class Figure {
    public float x;
    public float y;

    Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract float getArea();

    public abstract float getPerimeter();

}
