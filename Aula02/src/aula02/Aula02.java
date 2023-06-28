package aula02;

public class Aula02 {

    public static void main(String[] args) {
        
        ControleRemoto controleRemoto = new ControleRemoto();
        
        controleRemoto.ligar();
        controleRemoto.status();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarCanal();
        controleRemoto.status();        
        controleRemoto.aumentarCanal();
        controleRemoto.status();        
        
    }
    
}
