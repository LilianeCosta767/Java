package aula08lutador;

import java.util.Random;

public class Luta {
    // Atributos
    private PessoaLutador desafiado;
    private PessoaLutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos Públicos
    public void marcarLuta(PessoaLutador l1, PessoaLutador l2) {
        // verificar se são da mesma categoria
        if(l1.getCategoria().equals(l2.getCategoria()) 
                && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar() {
        // Realização da luta
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // gera 3 resultados entre 0 e 2
            System.out.println("======= Resultado da luta =======");
            switch(vencedor){
                case 0: // Empate
                    System.out.println("Empatou!!");
                    this.desafiado.empartarLuta();
                    this.desafiante.empartarLuta();
                    break;
                case 1: // Desafiado vence
                    System.out.println(this.desafiado.getNome() + " venceu");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiante vence
                    System.out.println(this.desafiante.getNome() + " venceu");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("=================================");
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
    
    // Métodos Especiais

    public PessoaLutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(PessoaLutador desafiado) {
        this.desafiado = desafiado;
    }

    public PessoaLutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(PessoaLutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
