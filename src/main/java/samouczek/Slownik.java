package samouczek;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class Slownik {

        static Map<String, String> dictionary;

    public static void main(String[] args) {

       dictionary = new HashMap<String, String>();

        boolean showMenu = true;
        while (showMenu) {
            showMenu = mainMenu();
        }

}
    private static boolean mainMenu()
    {

        String name=""; //klucz
        String phoneNumber=""; //wartość
        Scanner odczyt = new Scanner(System.in);

        System.out.println("Dodawanie wpisu - 1\nSprawdzanie czy imię jest w słowniku - 2;\nSprawdzanie czy nr tel jest w słowniku - 3;\nUsuwanie wpisu - 4;\n " +
                "Wyświetl wszystkie wpisy - 5\nZamknij apke - 6\nKtórą czynność chcesz wykonać?");

        int czynnosc;
        System.out.println("Podaj nr czynności: ");
        czynnosc = odczyt.nextInt();


        switch(czynnosc){
            case 1:
                System.out.println("Podaj imię:");
                name = odczyt.next();

                System.out.println("Podaj nr tel:");
                phoneNumber = odczyt.next();


                if(!dictionary.containsKey(name))
                {
                    dictionary.put(name, phoneNumber);
                    System.out.println("Użytkownik: " + name + " nr tel: " + phoneNumber + " został dodany do bazy.");
                }
                else
                {
                    System.out.println("Wpis już istnieje: " + name + " z nr tel: " + phoneNumber);
                }
                return true;

            case 2:
                System.out.println("Podaj imię: ");
                name = odczyt.next();
                phoneNumber = dictionary.get(name);

                if (dictionary.containsKey(name))
                {
                    System.out.println("Użytkownik o imieniu " + name + " istnieje w bazie." + " Jego numer telefonu to: " + phoneNumber);
                }
                else
                {
                    System.out.println("Użytkownik o takim imieniu nie ma w bazie. " +
                            "Jeśli chcesz go dodać to przejdź do menu głownego wybierz 1 z menu głownego ");
                }

                return true;

            case 3:
                System.out.println("Wpisz nr tel: ");
                phoneNumber = odczyt.next();
                name = dictionary.get(phoneNumber);

                if (dictionary.containsValue(phoneNumber))
                {
                    System.out.println("Użytkownik o tym " + phoneNumber + " numerze telefonu znajduje się już w bazie. Nazywa się " + name );
                    System.out.println("Wciśnij 1, aby dodać nowego użytkownika");
                }
                else
                {
                    System.out.println("Nie ma takiego użytkownika w bazie. Wciśnij 1, aby dodać użytkownika");
                }
                return true;

            case 4: //usuniecie wpisu
                System.out.println("Jesli chcesz usunąc użytkownika z bazy wpisz jego imię:");
                name = odczyt.next();
                dictionary.get(name);

                if(dictionary.containsKey(name)){
                    dictionary.remove(name);
                    System.out.println("Wpis o imieniu " + name + " i numerze telefonu: " + phoneNumber + " został usuniety z bazy.");
                    System.out.println("Wciśnij 1, aby dodać nowego użytkownika");
            }
                else
                {
                    System.out.println("Nie ma takiego wpisu w bazie dla hasła: " + name + " więc nie może być on usunięty");
                    System.out.println("Wciśnij 1, aby dodać nowego użytkownika");
                }

                return true;

            case 5:
                if(dictionary.size()>0) {
                    Set<Map.Entry<String, String>> entrySet = dictionary.entrySet();
                    for (Map.Entry<String, String> entry : entrySet) {
                        System.out.println("Wszystkie wpisy: ");
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                }
                    else{
                    System.out.println("Wciśnij 1, aby dodać nowego użytkownika");
                    }
                return true;

            case 6:
                return false;

            default:
                System.out.println("Wybierz cyfre z menu!");
                System.console().reader();
                return true;

    }
}

}
