package aula10java;
public class Funcionario extends Pessoa {
    // Atributos
    private String setor;
    private boolean trabalhando;
    
    // Construtor
//    public Funcionario (String setor, boolean trabalhando) {
//        this.setor = setor;
//        this.trabalhando = trabalhando;
//    }
    
    // Métodos Especias
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public boolean getTrrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    //Métodos Públicos
    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }
}
