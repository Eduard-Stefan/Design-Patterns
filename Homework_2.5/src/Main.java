public class Main {
    public static void main(String[] args) {
        float[] rectangleParams = {3, 7};
        Shape rectangle = ShapeFactory.createShape(rectangleParams);
        float rectangleArea = rectangle.getArea();
        System.out.println("Rectangle area = " + rectangleArea);
        float[] circleParams = {2};
        Shape circle = ShapeFactory.createShape(circleParams);
        float circleArea = circle.getArea();
        System.out.println("Circle area = " + circleArea);
    }
}