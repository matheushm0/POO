public class GrupoEmpresa {

    private Pessoa presidente;
    private String cnpj;
    private Double faturamentoAnual;

    public void setPresidente(Pessoa pr){

        presidente = pr;
    }

    public Pessoa getPresidente(){

        return this.presidente;
    }



    public void setCnpj(String cn) {
        cnpj = cn;
    }

    public String getCnpj(){

        return this.cnpj;

    }

    public void setFaturamentoAnual(double fat) {
        faturamentoAnual = fat;
    }
    public Double getFaturamentoAnual(){

        return this.faturamentoAnual;
    }

    public String toString (){

        String str = "";
        str = str + presidente;
        str = str + "CNPJ: " + this.cnpj;
        str = str + "Faturamento Anual: " + this.faturamentoAnual;

        return str;
    }

}
