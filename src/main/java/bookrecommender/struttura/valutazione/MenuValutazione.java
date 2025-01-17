package bookrecommender.struttura.valutazione;

import bookrecommender.interfaccia.NuovaSchermata;
import bookrecommender.interfaccia.menu.SceltaMenuMessaggi;
import bookrecommender.interfaccia.valutazione.MenuValutazioneMessaggi;

public class MenuValutazione {

  private int scelta;

  public MenuValutazione() {

    boolean controllo;

    do {

      controllo=true;

      //verifica se valutazione è presente
      NuovaSchermata.nuovaSchermata();
      if(true) {

        MenuValutazioneMessaggi.menuValutazionePresente();
        scelta = SceltaMenuMessaggi.inserimentoSceltaMenu(5);

        if(scelta==1) {
          var inserimentoValutazione=new InserimentoValutazione();
          controllo=false;
        }

        if(scelta==2) {
          var modificaValutazione=new ModificaValutazione();
          controllo=false;
        }

      }

      else {

        MenuValutazioneMessaggi.menuValutazioneAssente();
        scelta = SceltaMenuMessaggi.inserimentoSceltaMenu(4);

        if(scelta==1) {
          var inserimentoValutazione=new InserimentoValutazione();
          controllo=false;
        }

        if(scelta>=2&&scelta<=4) {
          scelta++;
        }
      }

    } while (!controllo);

  }

  public int getScelta() {
    return scelta;
  }
}
