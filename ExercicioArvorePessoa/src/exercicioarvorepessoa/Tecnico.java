package exercicioarvorepessoa;
public class Tecnico extends Aluno {
    // Atributos
    private int registroProfissional;
    
    // Métodos Especiais
    public int getRegistroProfissional(){
        return registroProfissional;
    }
    public void setRegistroProfissional(int rf) {
        this.registroProfissional = rf;
    }
    
    // Métodos Públicos
    public void praticar() {
        System.out.println("Praticando");
    }
}
