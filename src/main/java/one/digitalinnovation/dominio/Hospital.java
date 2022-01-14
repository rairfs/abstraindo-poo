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

    public void contratarFuncionario(Funcionario f){
        this.funcionarios.add(f);
    }

    public void registrarPaciente(Paciente p){
        this.aguardandoAtendimento.add(p);
    }

    public void atenderPaciente(Paciente p, Funcionario f){
        if (!this.aguardandoAtendimento.contains(p)){
            System.out.println("Paciente inexistente");
        } else if (!this.funcionarios.contains(f)) {
            System.out.println("Funcionario inexistente");
        } else {
            this.atendidos.add(p);
            this.aguardandoAtendimento.remove(p);
            System.out.println("O paciente " + p + " foi atendido por " + f);
        }
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

    public Set<Paciente> getAguardandoAtendimento() {
        return aguardandoAtendimento;
    }


    public Set<Paciente> getAtendidos() {
        return atendidos;
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
