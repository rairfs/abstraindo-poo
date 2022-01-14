package one.digitalinnovation.dominio;

public class Funcionario extends Pessoa {
    String cargo;

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
