public class Figure {
    // поля класса
    double x;
    double y;
    // конструктор класса
    public Figure(double x, double y){
         this.x = x;
         this.y = y;
    }
    
    // методы
   public double calculateArea(){
        return x * y;
   }
   public double calculatePerimeter(){
        return x + y;
   }
} 

class Circle extends Figure {
    double radius;
    public Circle(double radius){
        super(radius, radius);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return (double) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculatePerimeter(){
        return (double) (2 * Math.PI * radius);
    }

}

class Rectangle extends Figure {
   
    public Rectangle(double x, double y){
        super(x, y);
        
    }

    @Override
    public double calculateArea(){
        return (double) (x * y);
    }
    @Override
    public double calculatePerimeter(){
        return (double) ((x * 2) + (y * 2));
    }
}

class Square extends Rectangle {
    double side;
    public Square(double side){
        super(side, side);
        this.side = side;  
    }

    @Override
    public double calculateArea(){
        return (double) Math.pow(side, 2);
    }
    @Override
    public double calculatePerimeter(){
        return (double) (side * 4);
    }
}

