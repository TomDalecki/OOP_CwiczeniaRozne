package Enum.Podstawy;
//typ wyliczeniowy
//żeby wydrukować zawartość Enum (jakie mam przypisane wartości zmiennych) to potrzebna jest metoda toString;
// domyślna metoda toString wydrukuje tylko nazwę Enuma np. "GPLF"

//Enum sie nie dziedziczy
//Enumy się nie rozszerzają po sobie
//Enum może implementować interfejsy

import java.util.Arrays;

public class Enum {
    public static void main(String[] args) {
        String theCar = "golf";
        Volkswagen volkswagen = Volkswagen.GOLF; // !!! w Enum nie ma "new"

        VolkswagenWithColor volkswagenWithColor = VolkswagenWithColor.ARTEON;
        System.out.println(volkswagenWithColor.getColor());

        System.out.println("zawartość Enum z metodą to String " + VolkswagenWithColor.PASSAT);
        System.out.println(VolkswagenWithColor.PASSAT.getColor());
        System.out.println(VolkswagenWithColor.PASSAT.getProductionYear());

//iterowanie po elementach
        Volkswagen[] volkswagens = Volkswagen.values(); //konieczna jest metoda values
        System.out.println("iterowanie po wartościach " + Arrays.toString(volkswagens));
        // oczywiście może być też z wykorzystaniem pętli

// WAŻNE przypisanie Enum do zmiennej(np.otrzymanej z zewnątrz)
        Volkswagen golf2 = Volkswagen.valueOf("GOLF"); //w valueOf zapis musi się zgadzać z wartością Enum (np. wielkość liter)
        System.out.println("Enum po przypisaniu dio zmiennej " + golf2);

//użycie Enum w if
        if(theCar.equalsIgnoreCase(String.valueOf(volkswagen.GOLF))){
            System.out.println("theCar is Golf");
        }
        else {
            System.out.println("theCar is other Car");
        }}

//użycie Enum w SwitchCase
    public static void switchUseEnum (Volkswagen volkswagen){
       switch (volkswagen){
           case GOLF:{
               System.out.println();
               break;
           }
           case ARTEON:{
               System.out.println("a");
               break;
           }
           case PASSAT:{
               System.out.println("b");
               break;
           }
           default:{
               System.out.println();
           }}}


}
