package Enum.Rozszerzony;

public enum Volkswagen implements EnumUsable{
    GOLF("white", 2019),
    PASSAT("red", 1998),
    ARTEON("black", 2022);

    private String color;
    private int productionYear;
    Volkswagen(){

    }

    Volkswagen(String color, int productionYear) {
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

    @Override
    public String doSomethingUsingEnum() {
        return productionYear + ""; //" " po to żeby oszukać kompilator że to String
        //getProductionYear();
    }
}