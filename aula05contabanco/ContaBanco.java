package aula05java;
public class ContaBanco {
    // Variáveis
    public int numConta;
    protected String tipo;
    private String nomeDono;
    private float saldo;
    private boolean status;

    // Método Construtor
    public ContaBanco () {
        this.status = false;
        this.saldo = 0.0f;
    }
    
    // Métodos Getters e Setters
    public int getNumConta () {
        return this.numConta;
    }
    public void setNumConta (int nc) {
        this.numConta = nc;
    }
    
    public String getTipo () {
        return this.tipo;
    }
    public void setTipo (String t) {
        this.tipo = t;
    }
    
    public String getNomeDono () {
        return this.nomeDono;
    }
    public void setNomeDono (String nd) {
        this.nomeDono = nd;
    }
    
    public float getSaldo () {
        return this.saldo;
    }
    public void setSaldo (float s) {
        this.saldo = s;
    }
    
    public boolean getStatus () {
        return this.status;
    }
    public void setStatus (boolean s) {
        this.status = s;
    }
    
    // Métodos
    public void estadoAtual () {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getNomeDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta (String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("cc".equals(t)) {
            this.setSaldo(50);
        }
        if ("cp".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharConta () {
        if (this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
        else {
            if (this.getSaldo() > 0) {
                System.out.println("ERRO, conta não pode fechar pois tem dinheiro");
            }
            else {
                System.out.println("ERRO, conta não pode fechar pois tem débito");
            }
        }
    }
    
    public void depositar (int valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + this.getNomeDono());
        }
        else {
            System.out.println("ERRO, impossível depositar em uma conta fechada");
        }
    }
    
    public void sacar (float valor) {
        if (this.getStatus()) { // se a conta estiver ativa
            if (this.getSaldo() == 0) {
                System.out.println("ERRO, você não tem saldo");
            }
            else {
                if (this.getSaldo() >= valor) {
                    this.setSaldo(this.getSaldo() - valor);
                    System.out.println("Saque realizado na conta de " + this.getNomeDono());
                }
                else {
                    System.out.println("ERRO, seu saldo é insuficiente para sacar");
                }
            }
        }
        else {
            System.out.println("ERRO, impossível sacar de uma conta fechada");
        }
    }
    
    public void pagarMensal () {
        int v = 0;
        if ("cc".equals(tipo)) {
            v = 12;
        }
        else if ("cp".equals(tipo)) {
            v = 20;
        }
        if (this.getStatus()) { // verifica se conta está ativa
            if (this.getSaldo() > v) {
                sacar(v);
            }
            else {
                System.out.println("ERRO, saldo insuficiente para pagamento de mensalidade");
            }
        }
        else {
            System.out.println("ERRO, essa conta está fechada, impossível cobrar mensalidade");
        }
    }
}
