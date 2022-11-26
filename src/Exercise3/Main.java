package Exercise3;

public class Main {
    public static void main(String[] args) {
    Square square = new Square(8);
        System.out.println("squareSurfaceArea: " + square.squareSurfaceArea());
        System.out.println("squarePerimeter: " + square.squarePerimeter());

    Square[] squares = new Square[7];
        squares[0] = new Square(2);
        squares[1] = new Square(15.5);
        squares[2] = new Square(2);
        squares[3] = new Square(75);
        squares[4] = new Square(2);
        squares[5] = new Square(3);
        squares[6] = new Square(3);

        double[] arrayToSort = new double[squares.length];
        for (int i = 0; i < squares.length; i++) {
            arrayToSort[i] = squares[i].squareSurfaceArea();
        }
        //new MySortingMethod(arrayToSort);
        new RemoveDoubleValues(arrayToSort); //ta klasa rozszerza moją klasę MySortingMethod o usuwanie z tabeli duplikatów
    }



}
