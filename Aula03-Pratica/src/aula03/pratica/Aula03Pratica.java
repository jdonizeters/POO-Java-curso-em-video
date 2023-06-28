package aula03.pratica;

public class Aula03Pratica {

    public static void main(String[] args) {

        Dadinho dado = new Dadinho();
        
        dado.cor = "branco";
        dado.lados = 6;
        dado.material = "plástico";
        dado.definirTipoFuro("Redondo");
        dado.statusDado();
        dado.metodoProtegido();
        //dado.metodoPrivado();
    }
    
}
