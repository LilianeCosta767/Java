package aula08lutador;


public class PessoaLutador implements Lutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    // Construtor
    public PessoaLutador (String no, String na, int id, float  al, float pe,
            int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    PessoaLutador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Métodos Especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    
    public float getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }
    
    public float getPeso() {
        return peso;
    }
    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }
    
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        } else if(this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int v) {
        this.vitorias = v;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int d) {
        this.derrotas = d;
    }
    
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int e) {
        this.empates = e;
    }

    
    // Métodos públicos
    @Override
    public void apresentar() {
        System.out.println("------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " metros");
        System.out.println("pesando " + this.getPeso() + " Kg");
        System.out.println(this.getVitorias() + "vitórias");
        System.out.println(this.getDerrotas() + "derrotas e");
        System.out.println(this.getEmpates() + "empates");
    }

    @Override
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empartarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
