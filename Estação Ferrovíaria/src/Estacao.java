public class Estacao {
    public class Estacao {

        private String sigla;
        private String descricao;
        private Linhas linhas;
        private Trens trem;

        public String setSigla(String s){
            this.sigla = s;
        }

        public String getSigla() {
            return this.sigla;
        }

        public String setDescricao(String d){
            this.descricao = d;
        }

        public String getDescricao() {
            return this.descricao;
        }
        public Linhas setLinhas(Linhas l){
            this.linhas = l;
        }

        public Linhas getLinhas() {
            return this.linhas;
        }

        public Trens setTrem(Trens t){
            this.trem = t;
        }

        public Trens getTrem() {
            return this.trem;
        }

        public String toString(){

            String str = "";
            str = str + "Silga da Estação: " +this.sigla;
            str = str + "Descrição da Estação: " +this.descricao;
            str = str + this.linhas;
            str = str + this.trem;

            return str;
        }

    }

}