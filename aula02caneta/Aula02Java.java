package aula02java;
public class Aula02Java {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();  
        c1.rabiscar();
        System.out.println("Caneta 1");
        c1.status();
        
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnent";
        c2.cor = "preta";
        c2.destampar();
        c2.rabiscar();
        System.out.println("Caneta 2");
        c2.status();
    }
    
}
