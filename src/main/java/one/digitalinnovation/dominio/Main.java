package one.digitalinnovation.dominio;

public class Main {
    public static void main(String[] args) {
        Pessoa funcionario1 = new Funcionario("Carla", "056.563.465-11", "Medico");
        Pessoa funcionario2 = new Funcionario("Joao", "795.593.451-41", "Enfermeiro");
        Pessoa paciente1 = new Paciente("Maria", "123.564.413-52", "Tosse");
        Pessoa paciente2 = new Paciente("Marcos", "552.659.132-44", "Vômito");

        Hospital hospital = new Hospital("Hospital Estadual de Sergipe");

        hospital.contratarFuncionario(funcionario1);
        hospital.contratarFuncionario(funcionario2);

        hospital.registrarPaciente(paciente1);
        hospital.registrarPaciente(paciente2);

        hospital.atenderPaciente(paciente1, funcionario2);
        hospital.atenderPaciente(paciente2, funcionario1);
    }
}
