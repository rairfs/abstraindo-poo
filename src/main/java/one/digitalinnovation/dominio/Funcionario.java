package one.digitalinnovation.dominio;

public class Funcionario extends Pessoa {
    String cargo;

    public Funcionario(String nome, String cpf, String cargo) {
        setNome(nome);
        setCpf(cpf);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                "cpf='" + getCpf() + '\'' +
                "cargo='" + cargo + '\'' +
                '}';
    }
}
