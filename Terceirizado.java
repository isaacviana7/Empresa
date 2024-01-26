package Empresa;

public class Terceirizado extends Trabalhador {
    private String empresaOrigem;
    
    public Terceirizado(String matricula, String nome, String empresaOrigem) {
        super(matricula, nome);
        this.empresaOrigem = empresaOrigem;
    }
    
    @Override
    public void receberSalario() {
        System.out.println("O terceirizado " + getNome() + " recebeu o salario.");
    }
    
    public void receberVales() {
        System.out.println("O terceirizado " + getNome() + " recebeu os vales.");
    }
    
    public String getEmpresaOrigem() {
        return empresaOrigem;
    }
}

