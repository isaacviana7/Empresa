package Empresa;

public class testeQ1 {

	    public static void main(String[] args) {
	        Empresa empresa = new Empresa("Minha Empresa");
	        
	        Funcionario funcionario1 = new Funcionario("001", "Joao");
	        Funcionario funcionario2 = new Funcionario("002", "Maria");
	        
	        Terceirizado terceirizado1 = new Terceirizado("003", "Pedro", "Empresa A");
	        Terceirizado terceirizado2 = new Terceirizado("004", "Anna", "Empresa B");
	        
	        empresa.admitirFuncionario(funcionario1);
	        empresa.admitirFuncionario(funcionario2);
	        
	        empresa.admitirTerceirizado(terceirizado1);
	        empresa.admitirTerceirizado(terceirizado2);
	        
	        empresa.pagarTodosFuncionarios();
	        
	        empresa.demitirFuncionario(funcionario1);
	        
	        empresa.pagarTodosFuncionarios();

	}


}
