package aula03.pratica;

public class Dadinho {
    
    public String cor;
    public int lados;
    private String tipoFuros;
    protected String material;
    
    public void statusDado(){
        System.out.println("Status do dado");
        System.out.println("------------------");
        System.out.println("Cor         : " + this.cor);
        System.out.println("Lados       : " + this.lados);
        System.out.println("Tipo de furo: " + this.tipoFuros);
        System.out.println("Material    : " + this.material);
    }
    
    public void definirTipoFuro(String tipoFuro){
        this.tipoFuros = tipoFuro;
    }
    
    public void metodoQueAcessaMetodoPrivado(){
        metodoPrivado();
    }
    
    private void metodoPrivado(){
        System.out.println("Acesso ao método privado");
    }
       
    protected void metodoProtegido(){
        System.out.println("Acesso ao método protegido");
    }
    
    
}
