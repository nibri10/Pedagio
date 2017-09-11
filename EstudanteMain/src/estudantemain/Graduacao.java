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
public class Graduacao extends Estudante {
    private int anoIngresso;

    public Graduacao(String ra, String nome, String curso, int ano) {
        super(ra, nome, curso);
        
        this.anoIngresso = ano;
        
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
    
    @Override
  public String toString(){
    String resultado = super.toString();
    
    resultado += "\n"+"Ingresso"+getAnoIngresso();
    
    return resultado;
    
    }
    
    
    
}
