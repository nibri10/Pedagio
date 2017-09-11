/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudantemain;

/**
 *
 * @author 23034-2
 */
public class Estudante {
    private String ra, nome, curso;
    
    public Estudante(String ra, String nome, String curso){
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
	this.caodsorwer= coorasd;


    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString(){
    String resultado;
    
    resultado = "Ra"+getRa()+"\n"+ "\n"+ "Nome" + getNome()+"\n"+"Curso"+ getCurso();
    
    return resultado;
    
    }
}
    

