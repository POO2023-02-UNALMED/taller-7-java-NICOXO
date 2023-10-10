package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;

    public Fabula(String origen, String titulo, String autor, int paginas, String resumen, String ensenanza) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
    }
    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return this.getPaginas() * palabrasPagina;
    }

    @Override
    String interpretacion() {
        return ensenanza;
    }

    @Override
    public String toString() {
        return super.resumen();
    }
}