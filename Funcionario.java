package Empresa;

public class Funcionario extends Trabalhador {
    public Funcionario(String matricula, String nome) {
        super(matricula, nome);
    }
    
    @Override
    public void receberSalario() {
        System.out.println("O funcionario " + getNome() + " recebeu o salario.");
    }
}

