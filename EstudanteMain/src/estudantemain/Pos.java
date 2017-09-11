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
public class Pos  extends Estudante{
    
    private String area;
    public Pos(String ra, String nome, String curso, String area) {
        super(ra, nome, curso);
        
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    @Override
     public String toString(){
    String resultado = super.toString();
    
    resultado += "\n"+ "Area"+getArea();
    
    return resultado;
    
    }
    
    
}
