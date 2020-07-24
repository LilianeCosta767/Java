package aula10java;
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    // Construtor
//    public Aluno (int matricula, String curso) {
//        this.matricula = matricula;
//        this.curso = curso;
//    }
    
    // Métodos Especiais
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // Métodos Privados
    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada");
         //this.matricula = false;
    }
}
