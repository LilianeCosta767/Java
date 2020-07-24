package aula08lutador;

public class Aula08lutador {
    public static void main(String[] args) {
        PessoaLutador p[] = new PessoaLutador[6];
        
        p[0] = new PessoaLutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        p[1] = new PessoaLutador("PutScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        p[2] = new PessoaLutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        p[3] = new PessoaLutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        p[4] = new PessoaLutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        p[5] = new PessoaLutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(p[0], p[1]);
        UEC01.lutar();
        p[0].status();
        p[1].status();
    }
    
}
