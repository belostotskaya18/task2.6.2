public class Circle extends Figure implements Moveable {
    private float radius;

    Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        float s = (float) (Math.PI * radius * radius);
        return s;
    }

    @Override
    public float getPerimeter() {
        float l = (float) (2 * Math.PI * radius);
        return l;
    }

    @Override
    public void move(float dx, float dy) {
        x = x + dx;
        y = y + dy;
    }

    @Override
    public void resize(float koeff) {
        radius = radius*koeff;
    }
    @Override
    public String toString(){
        return new StringBuilder().append("Circle").append("\n").append("Center: ").append("(").append(x).append(", ").append(y).append(")").append("\n").append("Radius: ").append(radius).toString();
    }
}
