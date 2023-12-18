public class Main {

    public static void main(String[] args) {
        // Figure fig = new Figure();
        // fig.x = 2.0;
        // fig.y = 6.25;
        // System.out.println(fig.calculateArea());
        // System.out.println(fig.calculatePerimeter());

        Circle circle = new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(3, 7);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square(3.5);
        //square.side = 3.5;
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());



    }
}