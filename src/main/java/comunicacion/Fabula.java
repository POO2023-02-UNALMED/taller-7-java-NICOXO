package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;

    public Fabula(String origen, String titulo, String autor, int paginas, String resumen, String ensenanza) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
    }

    public String interpretacion() {
        return ensenanza;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina;
    }
    @Override
    public String toString() {
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + ensenanza;
    }

}
