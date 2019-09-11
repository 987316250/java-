public class Circle implements Shape {
   private double radius;

    public double getPerimeter() {
       return 2*Math.PI*radius;
    }


    public double getArea() {
      return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        Circle c=new Circle();
        c.radius=1;
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
}
