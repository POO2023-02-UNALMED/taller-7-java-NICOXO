package comunicacion;

public class Alfabeto extends Pictograma {

    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen,String[] letras,String interpretacion){
        super(origen);
        this.letras=letras;
        this.interpretacion=interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return this.letras.length;
    }

    public String interpretacion(){
        return interpretacion;
    }


    public String toString(){
        String letras1="";
        for(String i: letras){
            letras1+=i;
            if(i!=letras[letras.length-1]){
                letras1+=", ";
            }
        }

        return letras1;
    }
}