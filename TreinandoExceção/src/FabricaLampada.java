public class FabricaLampada extends Lampada{

    private String novaLampada;

    public FabricaLampada(char tipo,String novaLampada){
        super(tipo);
        this.novaLampada = novaLampada;
    }

    public void setNovaLampada (String novaLampada){
        this.novaLampada = novaLampada;
    }

    public String getNovaLampada(){
        return this.novaLampada;
    }

    public String toString(){

        String str = "";
        str += "Nome da Lâmpada: " + this.novaLampada + "\n";
        str += "Tipo: " + this.tipo + "\n";
        return str;
    }

    public void FabricaLampada(char t){

        t = this.tipo;

        System.out.println("A Lâmpada foi criada com sucesso.");

    }
}