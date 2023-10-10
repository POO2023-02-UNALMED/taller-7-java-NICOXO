package comunicacion;

public class Periodico extends Escrito {
    private String fecha;
    private String primicia;

    public Periodico(String origen, String titulo, String autor, int paginas, String resumen, String fecha, String primicia) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return this.getPaginas() * palabrasPagina * 10;
    }

    @Override
    public String interpretacion() {
        return primicia;
    }

    @Override
    public String toString() {
        return super.resumen() + "\n" + this.fecha + "\n" + this.primicia;
    }
}