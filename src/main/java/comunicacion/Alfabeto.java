package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;

    public Alfabeto(String[] letras) {
        this.letras = letras;
    }

    public int cantidadLetras() {
        return letras.length;
    }

    @Override
    public String toString() {
        return String.join(", ", letras);
    }
}