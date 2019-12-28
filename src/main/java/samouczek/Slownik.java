package samouczek;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Slownik {

    public static void main(String[] args) {


        Scanner odczyt = new Scanner(System.in);

        System.out.println("Witaj! Dodawanie wpisu - 1; Sprawdzanie - 2; Usuwanie - 3; Wyjście - 4" +
                "Którą czynność chcesz wykonać?");

        int czynnosc;
        System.out.println("Podaj nr czynności: ");
        czynnosc = odczyt.nextInt();

        int dodawanie = 1;
        int sprawdzanie = 2;
        int usuwanie = 3;
        int wyjscie = 4;


        Dictionary<String, String> dictionary = new Hashtable<>();
        dictionary.put("Magda", "burak");


        switch(czynnosc){
            case 1:
                String klucz;
                System.out.println("Podaj klucz:");
                klucz = odczyt.next();

                String hasło;
                System.out.println("Podaj hasło:");
                hasło = odczyt.next();

                System.out.println("Dodane slowa to: " + dictionary.put(klucz, hasło) + dictionary);
                break;

            case 2:
                String klucz1;
                System.out.println("Podaj klucz:");
                klucz1 = odczyt.next();

                for(int i=0; i<dictionary.size(); i++){
                    if(klucz1.equals(i)){
                        System.out.println("Już istnieje taki klucz");
                    }else
                        System.out.println("Twoj klucz jest OK");
                }

                String hasło1;
                System.out.println("Podaj hasło:");
                hasło1 = odczyt.next();

                for(int i=0; i<dictionary.size(); i++){
                    if(hasło1.equals(i)){
                        System.out.println("Już istnieje takie hasło");
                    }else
                        System.out.println("Twóje hasło jest ok");
                }


                dictionary.put(klucz1, hasło1);

                System.out.println("Teraz slownik zawiera: " + dictionary);
                break;

            case 3:
                System.out.println("Podaj klucz:");
                klucz = odczyt.next();

                System.out.println("SLownik usunal: " + dictionary.remove(klucz) +  dictionary);
                break;
            case 4:
                System.out.println("Wyjscie");
                break;
            default:
                System.out.println("Koniec");





        }












    }


}
