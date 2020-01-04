package samouczek;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class Slownik {

    public static void main(String[] args) {


        Scanner odczyt = new Scanner(System.in);

        System.out.println("Witaj! Dodawanie wpisu - 1; Sprawdzanie - 2; Usuwanie - 3; Wyjście - 4" +
                " Którą czynność chcesz wykonać?");

        int czynnosc;
        System.out.println("Podaj nr czynności: ");
        czynnosc = odczyt.nextInt();

        int dodawanie = 1;
        int sprawdzanie = 2;
        int usuwanie = 3;
        int wyjscie = 4;

        Dictionary<String, String> dictionary = new Hashtable<>();
        dictionary.put("Magda", "Sii");
        dictionary.put("Anna", "Lego");


        if(czynnosc>=4 && czynnosc<0) {
            System.out.println("Mozesz podac tylko numer od 1 do 4");
        }

        switch(czynnosc){
            case 1:
                String klucz;
                System.out.println("Podaj klucz:");
                klucz = odczyt.next();

                String hasło;
                System.out.println("Podaj hasło:");
                hasło = odczyt.next();

                dictionary.put(klucz, hasło);
                System.out.println("W słowniku są: " + dictionary);

                break;

            case 2:
                String klucz1;
                System.out.println("Podaj klucz:");
                klucz1 = odczyt.next();
                boolean spr = ((Hashtable<String, String>) dictionary).containsKey(klucz1);

                System.out.println("Czy ten klucz istnieje? " + spr);
                break;

            case 3:
                System.out.println("Podaj klucz:");
                klucz = odczyt.next();

                String usunietyWyraz = dictionary.remove(klucz);

                System.out.println("Słownik usunał: " + usunietyWyraz  + " W słowniku pozostało: " + dictionary);
                break;
            case 4:
                System.out.println("Wyjście");
                break;
            default:
                System.out.println("Koniec");

        }


        }



}
