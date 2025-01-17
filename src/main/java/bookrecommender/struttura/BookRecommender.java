package bookrecommender.struttura;

import bookrecommender.elaborazione.entities.user.User;
import bookrecommender.struttura.menu.MenuIniziale;
import bookrecommender.struttura.menu.MenuPrincipale;

import java.io.PrintStream;

/**
 * Classe principale che contiene il metodo main.
 *
 * @author Angelo Penafiel
 * @version 1.0
 */
public class BookRecommender {

    //METODI

    /**
     * Main che dirige il flusso del programma
     */
    public static void main(String[] args) {

        boolean controllo;

        do {
            controllo=true;

            controllo=menuIniziale(controllo);

        } while (!controllo);

    }

    /**
     * Stampa il menu iniziale e dirige il flusso del
     * programma.
     *
     * @param controllo flag che indica se ripetere la
     *                  stampa del menu iniziale
     * @return flag controllo modificato
     */
    private static boolean menuIniziale(boolean controllo) {

        var menuIniziale=new MenuIniziale();

        if(menuIniziale.getScelta()==1) {
            String UserID = User.login();
            if (UserID != null) {
                System.out.println("Welcome " + UserID);
                var menuPrincipale=new MenuPrincipale(UserID);
                if(menuPrincipale.getScelta()==3) controllo=false;
            }
        }

        if(menuIniziale.getScelta()==2) {
            String UserID = User.register();
            if (UserID != null) {
                System.out.println("Welcome " + UserID);
                var menuPrincipale=new MenuPrincipale(UserID);
                if(menuPrincipale.getScelta()==3) controllo=false;
            }
        }

        if(menuIniziale.getScelta()==3) {
            var menuPrincipale=new MenuPrincipale();
        }

        return controllo;
    }

}
