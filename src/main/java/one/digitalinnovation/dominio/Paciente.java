package one.digitalinnovation.dominio;

public class Paciente extends Pessoa{
    String motivoVisita;

    public Paciente(String nome, String cpf, String motivoVisita) {
        setNome(nome);
        setCpf(cpf);
        this.motivoVisita = motivoVisita;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + getNome() + '\'' +
                "cpf='" + getCpf() + '\'' +
                "motivoVisita='" + motivoVisita + '\'' +
                '}';
    }
}
