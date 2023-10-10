package comunicacion;

public class Tesis extends Escrito {
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;

    public Tesis(String origen, String titulo, String autor, int paginas, String resumen, String idea, String[] argumentos, String conclusion, String referencias) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return this.getPaginas() * palabrasPagina * 5;
    }

    @Override
    public String interpretacion() {
        return idea;
    }

    @Override
    public String toString() {
        return super.resumen() + "\n" + this.idea + "\n" + String.join(", ", argumentos) + "\n" + this.conclusion + "\n" + this.referencias;
    }
}