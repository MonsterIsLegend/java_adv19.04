package zadanie7;


import lombok.Data;

@Data
public class Circle implements GeometricalObject {

    private double radius;

    public Circle( double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter(  ) {
        return radius*(Math.PI*2);

    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
