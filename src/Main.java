import entites.Audio;
import entites.ElementoMultimediale;
import entites.Immagine;
import entites.Video;
import interfaces.Riproducibile;

public class Main {

    public static void main(String[] args) {
        // Creo un array che può contenere 5 elementi multimediali
        // Uso il tipo della superclasse così posso inserire Audio, Video e Immagine
        ElementoMultimediale[] elements = new ElementoMultimediale[5];

        // Inserisco manualmente gli oggetti nell'array

        // Audio: titolo, durata, volume
        elements[0] = new Audio("Weight of The World", 3, 4);

        // Video: titolo, durata, volume, luminosità
        elements[1] = new Video("Jujutsu Kaisen", 2, 3, 2);

        // Immagine: titolo, luminosità
        elements[2] = new Immagine("PhotoShop", 5);

        // Altri esempi di elementi
        elements[3] = new Audio("Murder Melody", 4, 2);
        elements[4] = new Video("Naruto", 3, 2, 4);

        // prendo il primo elemento dell'array e lo tratto come Audio
        Audio firstElementsOfArray = (Audio) elements[0];
        firstElementsOfArray.turnUpTheQuantity();   // aumento il volume

        // prendo il quarto elemento che è un altro Audio
        Audio fourthElementOfArray = (Audio) elements[3];
        fourthElementOfArray.turnDownTheQuantity();   // diminuisco il volume

        // prendo l'immagine e aumento la luminosità
        Immagine thirdElementOfArray = (Immagine) elements[2];
        thirdElementOfArray.increaseBrightness();

        // prendo il video e diminuisco la luminosità
        Video secondElementOfArray = (Video) elements[1];
        secondElementOfArray.decreasesBrightness();


        // Ciclo che scorre tutto l'array degli elementi multimediali
        for (ElementoMultimediale element : elements) {

            // Controllo se l'elemento è un'immagine
            if (element instanceof Immagine) {

                // Faccio il cast perché l'array è di tipo ElementoMultimediale
                Immagine img = (Immagine) element;

                // Chiamo il metodo show per mostrare l'immagine
                img.show();

            } else {

                // Se non è un'immagine significa che è riproducibile (Audio o Video)

                // Cast all'interfaccia Riproducibile
                Riproducibile r = (Riproducibile) element;

                // Riproduco l'elemento
                r.play();

            }

        }


    }

}