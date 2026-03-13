package entites;

import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int duration;
    private int quantity;
    private int brightness; // aggiungo variabile per consegna dell'esercizio

    public Video(String titolo, int duration, int quantity, int brightness) {
        // per la classe video opto per un costruttore a cui, a differenza di Audio, gli passo quattro parametri
        super(titolo); // elemento sempre ereditato dalla classe padre
        this.duration = duration;
        this.quantity = quantity;
        this.brightness = brightness;
    }

    public int turnUpTheQuantity() {
        return quantity++;
    }

    public int turnDownTheQuantity() {
        if (quantity > 0) {
            quantity--;
        }
        return quantity;
    }

    public int increaseBrightness() {
        // Differenza dalla classe Audio, creo altri due metodi per decidere se aumentare o dimuire la luminosità
        return brightness++;
    }

    public int decreasesBrightness() {
        if (brightness > 0) {
            return brightness--;
        }
        return brightness;
    }

    @Override
    public void play() {

        for (int contatore = 0; contatore < duration; contatore++) {

            System.out.print(titolo);

            for (int contatorej = 0; contatorej < quantity; contatorej++) {
                System.out.print("!");
            }

            for (int contatorez = 0; contatorez < brightness; contatorez++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
