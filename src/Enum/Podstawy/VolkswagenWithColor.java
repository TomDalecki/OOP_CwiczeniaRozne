package Enum.Podstawy;
/* żeby dodać dodatkowe parametry do Enum trzeba zdefiniować zmienną pod którą będą przechowywane i konstruktor
*/
public enum VolkswagenWithColor {
//    GOLF("white"),
//    PASSAT("red"),
//    ARTEON("black"); //średnik na końcu jeżeli coś chcemy więcej pisać w Enum
//
//    private String color;
//
//    VolkswagenWithColor(String color) {
//        this.color = color;
//    }
//}

/* żeby mieć kilka zmiennych w Enum można je włożyć w tablicę albo użyć varargs
*/

//    GOLF(new String[]{"white", "yellow"}),
//    PASSAT(new String[]{"red"}),
//    ARTEON(new String[]{"black"});
//
//    private String[] colors;
//
//    VolkswagenWithColor(String[] colors) {
//        this.colors = colors;
//    }
//}

//    GOLF("white", "yellow"),
//    PASSAT("red"),
//    ARTEON("black");
//
//    private String[] colors; //przy varargs tu tablica
//
//    VolkswagenWithColor(String... colors) {
//        this.colors = colors;
//    }
//}

/* żeby mieć kilka zmiennych w Enum można też tak
 */

    GOLF("white", 2019),
    PASSAT("red", 1998),
    ARTEON("black", 2022);

    private String color; //przy varargs tu tablica
    private int productionYear;

    VolkswagenWithColor(String color, int productionYear) {
        this.color = color;
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return "VolkswagenWithColor{" +
                "color='" + color + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}