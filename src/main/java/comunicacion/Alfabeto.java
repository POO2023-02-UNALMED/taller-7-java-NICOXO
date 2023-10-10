package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;

    public Alfabeto(String nombre, String[] letras) {
        super(nombre);
        this.letras = letras;
    }

    public int cantidadLetras() {
        return letras.length;
    }

    @Override
    public String toString() {
        return String.join(", ", letras);
    }

    @Override
    public String interpretacion() {
        return getOrigen();
    }
}