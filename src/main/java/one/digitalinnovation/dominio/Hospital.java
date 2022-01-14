package one.digitalinnovation.dominio;

import java.util.*;

public class Hospital {
    private String nome;
    private Set<Pessoa> funcionarios;
    private Set<Pessoa> aguardandoAtendimento;
    private Set<Pessoa> atendidos;

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

    public void contratarFuncionario(Pessoa f){
        this.funcionarios.add(f);
    }

    public void registrarPaciente(Pessoa p){
        this.aguardandoAtendimento.add(p);
    }

    public void atenderPaciente(Pessoa paciente, Pessoa funcionario){
        if (!this.aguardandoAtendimento.contains(paciente)){
            System.out.println("Paciente inexistente");
        } else if (!this.funcionarios.contains(funcionario)) {
            System.out.println("Funcionario inexistente");
        } else {
            this.atendidos.add(paciente);
            this.aguardandoAtendimento.remove(paciente);
            System.out.println("O paciente " + paciente + " foi atendido por " + funcionario + " no " + this.nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Pessoa> getFuncionarios() {
        return funcionarios;
    }

    public Set<Pessoa> getAguardandoAtendimento() {
        return aguardandoAtendimento;
    }


    public Set<Pessoa> getAtendidos() {
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
