package Exercise3;

import java.util.Objects;

public class Square {
        private double squareSideLength;

        Square(){
        squareSideLength = 5;
    }

    Square(double squareSideLength){
        this.squareSideLength = squareSideLength;
    }

    public double getSquareSideLength() {
        return squareSideLength;
    }

    public void setSquareSideLength(double squareSideLength) {
        this.squareSideLength = squareSideLength;
    }

    public double squarePerimeter(){
        return 4*squareSideLength;
    }
    public double squareSurfaceArea(){
        return Math.pow(squareSideLength,2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.squareSideLength, squareSideLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(squareSideLength);
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareSideLength=" + squareSideLength +
                '}';
    }
}
