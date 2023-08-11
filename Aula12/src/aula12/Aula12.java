package aula12;
public class Aula12 {
    public static void main(String[] args) {
        // Animal n = new Animal(); //errado
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru canguru = new Canguru();
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        System.out.println("---------------------");
        r.locomover();
        
        System.out.println("---------------------");
        p.locomover();
        
        System.out.println("---------------------");
        a.locomover();
        
        System.out.println("---------------------");
        canguru.locomover();
    }
    
}
