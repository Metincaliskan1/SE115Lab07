public class Scenerio0 {
    public static void main(String[] args){
        Point p1 = new Point(10, 20);
        Circle c1 = new Circle(p1, 5.0f);

        System.out.println("Radius: " + c1.r);

        System.out.println("Center X: " + c1.center.getX());
        System.out.println("Center Y: " + c1.center.getY());







    }
}
