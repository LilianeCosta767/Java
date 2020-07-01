package aula06java;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Construtor
    public ControleRemoto () {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }
    
    // Métodos getters e setters
    private int getVolume () {
        return this.volume;
    }
    private void setVolume(int v) {
        this.volume = v;
    }
    
    private boolean getLigado() {
        return this.ligado;
    }
    private void setLigado(boolean l) {
        this.ligado = l;
    }
    
    private boolean getTocando() {
        return this.tocando;
    }
    private void setTocando(boolean t) {
        this.tocando = t;
    }
    
    // Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()) {
            System.out.println("-------ABRIR MENU-------");
            System.out.println("Está ligando? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            if(this.getVolume() == 0) {
                System.out.println("MUDO");
            }
            else {
                for(int i = 0; i <= this.getVolume(); i += 10) {
                    System.out.print("|");
                }
            }
        } else {
            System.out.println("ERRO, O controle está desligado");
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()) {
            this.setVolume(getVolume() + 10);
        } else {
            System.out.println("ERRO, Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()) {
            this.setVolume(getVolume() - 10);
        } else {
            System.out.println("ERRO, Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("ERRO, Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("ERRO, Não consegui reproduzir");
        }
    }
    
}
