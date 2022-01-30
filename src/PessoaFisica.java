public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String documento, String nome) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public String getDocumento() {
        return cpf;
    }

    @Override
    public void setDocumento(String documento) {
        this.cpf = documento;
    }
}
