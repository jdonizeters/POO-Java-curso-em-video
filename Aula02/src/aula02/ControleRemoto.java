package aula02;

public class ControleRemoto {
    boolean ligado;
    int canal;
    int volume;
    
    void ligar(){
        this.ligado = true;
        System.out.println("TV Ligada!");
    }
    
    void desligar(){
        this.ligado = false;
    }
    
    void aumentarCanal(){
        if(this.canal == 20){
            this.canal = 1;
        } else {
            this.canal++;
        }
        System.out.println("Canal: " + this.canal);
    }
    
    void diminuirCanal(){
        if(this.canal == 1){
            this.canal = 20;
        } else {
            this.canal--;
        }
        System.out.println("Canal: " + this.canal);
    }
    
    void aumentarVolume(){
        if(this.volume == 16){
            System.out.println("Volume esta no máximo!");
        } else {
            this.volume = this.volume + 2;
            System.out.println("Volume: " + this.volume);
        }
    }
    
    void diminuirVolume(){
        if(this.volume==0){
            System.out.println("Volume esta no mínimo!");
        } else {
            this.volume = this.volume - 2;
            System.out.println("Volume: " + this.volume);
        }
    }
    
    void status(){
        System.out.println("Status da TV");
        System.out.println("Canal  : " + this.canal);
        System.out.println("Volume : " + this.volume);
        System.out.println("----------------");
    }
    
}
