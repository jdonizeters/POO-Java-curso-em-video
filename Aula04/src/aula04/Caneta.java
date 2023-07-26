package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta() {
        this.modelo = "Bic";
        this.ponta = 0.5f;
        this.cor = "Azul";
        this.tampada = true;
    }

    public Caneta(String modelo, float ponta, String cor, boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    public void Status(){
        System.out.println("------------------------");
        System.out.println("Sobre a caneta:");
        System.out.println("");
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Ponta  : " + this.ponta);
        System.out.println("Cor    : " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
        
}
