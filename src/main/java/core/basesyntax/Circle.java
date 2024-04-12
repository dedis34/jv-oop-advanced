package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle,\n"
                + "area: " + getArea() + " sq. units,\n"
                + "radius: " + radius + " units,\n"
                + "color: " + getColor() + "\n");
    }

}