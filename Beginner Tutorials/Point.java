public class Point {
    //fields, the data stored by the class 
    public int x, y; 

    //constructor: makes specific instances of the abstract class definition
    public Point(int input_x, int input_y) {
        x = input_x;
        y = input_y;
    }

    //default constructor 
    public Point() {
        x = 0;
        y = 0; 
    }

    //methods: can be called on instances of the class 
    public void reflectYAxis() {
        x = x * -1; 
    }

    //methods can take arguments, which can be of any type
    public double distanceToPoint(Point b) {
        double distance = Math.pow(Math.pow(x-b.x, 2)+Math.pow(y-b.y, 2), 0.5);

        return distance; 
    }

    public void display() {
        System.out.println(String.format("(%s, %s)", x, y));
    }

    //static methods can be accessed without making an instance of the class
    public static void staticDisplay(Point p) {
        p.display(); 
    }


    public static void main(String[] args) {
        Point p1  = new Point(3, 4);
        p1.reflectYAxis();
        System.out.println(p1); 
        p1.display(); 
       
        Point.staticDisplay(p1);

        Point p2 = new Point(); 

        System.out.println(p1.distanceToPoint(p2)); 
        
    }
}