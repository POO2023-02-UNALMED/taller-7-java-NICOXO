package comunicacion;

public class Tesis extends Escrito {
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }
    public String getInterpretacion() {
    	return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
    	this.interpretacion = interpretacion;
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
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina * 5; // Factor 5 para tesis
    }

    @Override
    public String toString() {
        StringBuilder argumentosStr = new StringBuilder();
        for (String argumento : argumentos) {
            argumentosStr.append(argumento).append(", ");
        }
        return super.resumen() + "\n" + idea + "\n" + argumentosStr.substring(0, argumentosStr.length() - 2) + "\n" + conclusion + "\n" + referencias;
    }
    @Override
    public String interpretacion() {
        return getInterpretacion();
    }
}