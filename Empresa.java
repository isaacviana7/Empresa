package Empresa;

import java.util.ArrayList;
import java.util.List;

class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;
    private List<Terceirizado> terceirizados;
    
    public Empresa(String nome) {
        this.setNome(nome);
        this.funcionarios = new ArrayList<>();
        this.terceirizados = new ArrayList<>();
    }
    
    public void admitirFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionario " + funcionario.getNome() + " contratado!");
    }
    
    public void demitirFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
        System.out.println("Funcionario " + funcionario.getNome() + " demitido.");
    }
    
    public void admitirTerceirizado(Terceirizado terceirizado) {
        if (terceirizados.size() < 0.3 * (funcionarios.size() + terceirizados.size())) {
            terceirizados.add(terceirizado);
            System.out.println("Funcionario " + terceirizado.getNome() + " contratado.");
        } else {
            System.out.println("Funcionario: " + terceirizado.getNome() + " nao contratado. Limite de terceirizados excedido!");
        }
    }
    
    public void pagarTodosFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.receberSalario();
        }
        
        for (Terceirizado terceirizado : terceirizados) {
            terceirizado.receberSalario();
            terceirizado.receberVales();
        }
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}