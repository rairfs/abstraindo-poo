package one.digitalinnovation.dominio;

import java.util.*;

public class Hospital {
    private String nome;
    private Set<Funcionario> funcionarios;
    private Set<Paciente> aguardandoAtendimento;
    private Set<Paciente> atendidos;

    public Hospital() {
        this.funcionarios = new LinkedHashSet<>();
        this.aguardandoAtendimento = new LinkedHashSet<>();
        this.atendidos = new LinkedHashSet<>();
    }

    public Hospital(String nome) {
        this.nome = nome;
        this.funcionarios = new LinkedHashSet<>();
        this.aguardandoAtendimento = new LinkedHashSet<>();
        this.atendidos = new LinkedHashSet<>();
    }

    public Pessoa atenderPaciente(Pessoa p){
        return p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Set<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Set<Paciente> getAguardandoAtendimento() {
        return aguardandoAtendimento;
    }

    public void setAguardandoAtendimento(Set<Paciente> aguardandoAtendimento) {
        this.aguardandoAtendimento = aguardandoAtendimento;
    }

    public Set<Paciente> getAtendidos() {
        return atendidos;
    }

    public void setAtendidos(Set<Paciente> atendidos) {
        this.atendidos = atendidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(nome, hospital.nome) && Objects.equals(funcionarios, hospital.funcionarios) && Objects.equals(aguardandoAtendimento, hospital.aguardandoAtendimento) && Objects.equals(atendidos, hospital.atendidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, funcionarios, aguardandoAtendimento, atendidos);
    }
}
