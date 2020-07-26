package aula12java;
public class Ave extends Animal{
    // Atributos
    private String corPena;
    
    // Métodos Abstratos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    
    public void construirNinho() {
        System.out.println("Construindo Ninho");
    }
    
    // Métodos Especiais
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
