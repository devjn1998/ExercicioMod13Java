package ExercicioMod13;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cpf) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + nome + '\'' +
                "cnpj='" + cnpj + '\'' +
                '}';
    }
}
