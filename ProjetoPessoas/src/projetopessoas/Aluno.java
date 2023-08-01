package projetopessoas;
public class Aluno extends Pessoa{
    boolean matr;
    String curso;
    
    public void cancelarMatr(){
        this.matr = !this.matr;
    }

    public boolean getMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
