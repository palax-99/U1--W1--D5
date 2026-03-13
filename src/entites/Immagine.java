package entites;

public class Immagine extends ElementoMultimediale {
    private int brightness;
    // A differenza delle altre due classi figlie, necessitò solo della variabile brightness(luminosità)
    // In quanto titolo, la eredito sempre dal padre

    public Immagine(String titolo, int brightness) {
        super(titolo);
        this.brightness = brightness;
    }

    public int increaseBrightness() {
        return brightness++;
    }

    public int decreasesBrightness() {
        if (brightness > 0) {
            return brightness--;
        }
        return brightness;
    }

    public void show() {
        // Metodo specifico della classe Immagine.
        // Non uso play() perché le immagini non sono riproducibili.

        System.out.print(titolo);

        for (int contatore = 0; contatore < brightness; contatore++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
