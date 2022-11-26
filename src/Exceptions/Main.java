package Exceptions;

public class Main {
    public static void main(String[] args) {
        try {
          //  int c = 8/0;
            //exceptionalMethod();
            int a = 4/1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("wiadomość z catch");
        }
        finally {
            System.out.println("Ta linijka zawsze sie wydrukuje");
        }
    }

public static void exceptionalMethod()throws RuntimeException{
        //throw new Exception("My exception message");
}

}
