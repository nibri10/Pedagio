/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudantemain;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author 23034-2
 */
public class EstudanteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome, ra,curso,area;
        int ano;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("RA");
        ra = scanner.next();
        System.out.println("Nome");
        nome = scanner.next();
        System.out.println("Curso");
        curso = scanner.next();
        System.out.println("Ano");
        ano = scanner.nextInt();
        
        Graduacao aluno1 = new Graduacao(ra, nome,curso,ano);
        
        System.out.println(aluno1.toString());
        
        
        System.out.println("RA");
        ra = scanner.next();
        System.out.println("Nome");
        nome = scanner.next();
        System.out.println("Curso");
        curso = scanner.next();
        System.out.println("Area");
        area = scanner.next();
        System.out.println("Curso");
       
        
        Pos aluno2 = new Pos(ra, nome, curso, area);
        
       
        
        
        System.out.println(aluno2.toString());
    }
    
}
