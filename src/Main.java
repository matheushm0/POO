public class Main {

    public static void main(String[] args) {

        GrupoEmpresa ge = new GrupoEmpresa();

        ge.setCnpj("0000 201\n");
        ge.setFaturamentoAnual(10000.00);

        Pessoa p = new Pessoa();

        p.setNome("Matheus\n");
        p.setEndereco("Av.Sargento Herminio\n");
        p.setNascimento("19/04/1999\n");

        ge.setPresidente(p);

        System.out.println(ge);

    }
}
