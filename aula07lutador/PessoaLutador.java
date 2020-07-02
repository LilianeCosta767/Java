package aula07java;

public class PessoaLutador implements Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Construtor
    public PessoaLutador (String nome, String nacio, int i, float  a, float p, int v, int d, int e) {
        this.nome = nome;
        this.nacionalidade = nacio;
        this.idade = i;
        this.altura = a;
        this.peso = p;
        this.vitorias = v;
        this.derrotas = d;
        this.empates = e;
    }

    PessoaLutador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Métodos Especiais
    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    public void setNacionalidade(String n) {
        this.nacionalidade = n;
    }
    
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    
    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float a) {
        this.altura = a;
    }
    
    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float p) {
        this.peso = p;
    }
    
    public String getCategoria() {
        return this.categoria;
    }
    public void setCategoria(String c) {
        this.categoria = c;
    }
    
    public int getVitorias() {
        return this.vitorias;
    }
    public void setVitorias(int v) {
        this.vitorias = v;
    }
    
    public int getDerrotas() {
        return this.derrotas;
    }
    public void setDerrotas(int d) {
        this.derrotas = d;
    }
    
    public int getEmpates() {
        return this.empates;
    }
    public void setEmpates(int e) {
        this.empates = e;
    }

    @Override
    public void apresentar() {
    }

    @Override
    public void status() {
    }

    @Override
    public void ganharLuta() {
    }

    @Override
    public void perderLuta() {
    }

    @Override
    public void empartarLuta() {
    }
}
