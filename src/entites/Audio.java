package entites;

import interfaces.Riproducibile;

public class Audio extends ElementoMultimediale implements Riproducibile {
    // ho impostato il codice in modo tale che Audio fosse una sottoclasse di ElementoMultimediale e al contempo implementi anche l'interfaccia Riproducibile
    private int duration; // creo una variabile private durata(Best Practice)
    private int quantity; //volume;

    public Audio(String titolo, int duration, int quantity) {
        super(titolo); // eredita il titolo dal padre ElementoMultimediale
        this.duration = duration;
        this.quantity = quantity;
    }

    public int turnUpTheQuantity() {  // creo un metodo che mi permette di alzare il volume
        return quantity++;
    }

    public int turnDownTheQuantity() { // creo un metodo che abbassa il volume
        if (quantity > 0) {
            quantity--;
        }
        return quantity;
    }


    @Override
    public void play() { //Metodo preso dall'interfaccia Riproducibile
        //L'utilizzo di questo metodo mi permette di stampare il titolo tante volte quanto la durata dell'audio
        //Dopo il titolo vengono stampati dei punti esclamativi, tante volte in base al volume

        for (int counter = 0; counter < duration; counter++) {

            System.out.print(titolo);

            for (int counterj = 0; counterj < quantity; counterj++) {
                System.out.print("!");
            }

            System.out.println();
        }

    }
}
