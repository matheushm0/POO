public class Lampada{

    protected char tipo;

    public void setTipo (char tipo){
        this.tipo = tipo;
    }
    public char getTipo (){
        return this.tipo;
    }

    public Lampada(char tipo){
        this.tipo = tipo;
    }
}