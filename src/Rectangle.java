public class Rectangle extends Figure implements Moveable {
    private float height;
    private float width;

    Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public float getArea() {
        float s = height * width;
        return s;
    }

    @Override
    public float getPerimeter() {
        float p = (height + width) * 2;
        return p;
    }

    @Override
    public void move(float dx, float dy) {
        x = x + dx;
        y = y + dy;
    }

    @Override
    public void resize(float koeff) {
        height = height * koeff;
        width = width * koeff;
    }

    @Override
    public String toString() {
        float centerX = x+(width/2) ;
        float centerY = y+(height/2);
        return new StringBuilder().append("Rectangle").append("\n").append("Center: ").append("(").append(centerX).append(", ").append(centerY).append(")").append("\n").append("Height: ").append(height).append("\n").append("Width: ").append(width).toString();
    }
}
