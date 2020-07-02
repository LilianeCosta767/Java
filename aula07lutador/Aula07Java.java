package aula07java;

public class Aula07Java {

    public static void main(String[] args) {
        PessoaLutador p1 = new PessoaLutador();
        PessoaLutador p2 = new PessoaLutador();
        
        // p1("PutScript", "Brasil", 29, 1.68f, 57.8f, "leve", 14, 2, 3);
        p1.setNome("PutScript");
        p1.setNacionalidade("Brasil");
        p1.setIdade(29);
        p1.setAltura(1.68f);
        p1.setPeso(57.8f);
        p1.setCategoria("leve");
        p1.setVitorias(14);
        p1.setDerrotas(2);
        p1.setEmpates(3);
        
        p2.setNome("Snapshadow");
        p2.setNacionalidade("EUA");
        p2.setIdade(35);
        p2.setAltura(1.65f);
        p2.setPeso(80.9f);
        p2.setCategoria("medio");
        p2.setVitorias(12);
        p2.setDerrotas(2);
        p2.setEmpates(1);
        
    }
    
}
