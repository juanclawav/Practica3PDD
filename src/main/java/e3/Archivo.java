package e3;

class Archivo implements Component {
    private int numPalabras;

    public Archivo(int numPalabras) {
        this.numPalabras = numPalabras;
    }

    public int getNumPalabras() {
        return numPalabras;
    }
}
