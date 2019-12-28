package samouczek;

public class Tablice {

    public static void main(String[] args) {

        //Napisz metodę pobierającą dwuelementową tablicę liczb i zwracający ich sumę.//

        Tablice tab1 = new Tablice();
        int tab[] = {12,23};
        System.out.println(tab1.sumaLiczb(tab));

    }

    public int sumaLiczb(int tab []){
        return tab[0] + tab[1];
        }

    }

