package exercicioarvorepessoa;
public class Bolsista extends Aluno {
    // Atributos
    private int bolsa;
    
    // Métodos Especiais
    public int getBolsa() {
        return bolsa;
    }
    public void setBolsa(int bolsa){
        this.bolsa = bolsa;
    }
    
    // Métodos Públicos
    public void renovarBolsa() {
        System.out.println("Renovando bolsa do bolsista " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do bolsista " + this.getNome());
    }
}
