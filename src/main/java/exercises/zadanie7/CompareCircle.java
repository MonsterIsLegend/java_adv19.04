package exercises.zadanie7;

public class CompareCircle  implements CompareGeometricObjects {
    @Override
    public double compareRadius(Circle c1, Circle c2) {
        double b = 0;
        if( c1.getRadius() > c2.getRadius()){
             b =  c1.getRadius() - c2.getRadius();

        }else if(c1.getRadius() < c2.getRadius()){
            b =  c2.getRadius() - c1.getRadius();
        }
        return b;
    }

    @Override
    public double compareAreas(Circle c1, Circle c2) {
        double c = 0;
        if (c1.getArea() > c2.getArea()) {
            c = c1.getArea() - c2.getArea();

        } else if (c1.getArea() < c2.getArea()) {
            c = c2.getArea() - c1.getArea();
        }
        return c;
    }


    @Override
    public double comparePerimeters(Circle c1, Circle c2) {
        double d = 0;
        if (c1.getPerimeter() > c2.getPerimeter()) {
            d = c1.getPerimeter() - c2.getPerimeter();

        } else if (c1.getPerimeter() < c2.getPerimeter()) {
            d = c2.getPerimeter() - c1.getPerimeter();
        }
        return d;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7);
        CompareCircle compareCircle = new CompareCircle();
        System.out.println(compareCircle.compareRadius(c1,c2));
        System.out.println(compareCircle.compareAreas(c1,c2));
        System.out.println(compareCircle.comparePerimeters(c1,c2));

    }



}


