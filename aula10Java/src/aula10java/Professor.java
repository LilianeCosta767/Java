package aula10java;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    // Construtor
//    public Professor (String especialidade, float salario) {
//        this.especialidade = especialidade;
//        this.salario = salario;
//    }
    
    // Métodos Especiais
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    // Métodos Públicos
    public void receberAumento(float aum) {
        this.salario += aum;
    }
}
