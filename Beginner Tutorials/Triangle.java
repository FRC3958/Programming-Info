public class Triangle {
    public Point p1, p2, p3; 

    public Triangle(Point p_1, Point p_2, Point p_3) {
        p1 = p_1;
        p2 = p_2;
        p3 = p_3; 
    }

    public double findPerimeter() {
        double perimeter = p1.distanceToPoint(p2) + p2.distanceToPoint(p3) + p3.distanceToPoint(p1); 

        return perimeter; 
    }


    public static void main(String[] args) {
        Triangle t1 = new Triangle(new Point(), new Point(3,4), new Point(0,4)); 

        System.out.println(t1.findPerimeter()); 
    }

}