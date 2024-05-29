package bookrecommender.struttura;

import bookrecommender.struttura.menu.MenuIniziale;
import bookrecommender.struttura.menu.MenuPrincipale;

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

            //accesso utente
        }

        if(menuIniziale.getScelta()==2) {

            //registrazione

        }

        if(menuIniziale.getScelta()==3) {

            var menuPrincipale=new MenuPrincipale(0);

        }

        return controllo;
    }

}
