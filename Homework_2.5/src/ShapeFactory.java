public class ShapeFactory {
    public static Shape createShape(float[] parameters) {
        if (parameters.length == 2) {
            return new Rectangle(parameters[0], parameters[1]);
        } else if (parameters.length == 1) {
            return new Circle(parameters[0]);
        } else {
            throw new IllegalArgumentException("Invalid number of parameters");
        }
    }
}