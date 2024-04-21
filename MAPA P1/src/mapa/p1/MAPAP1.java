/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapa.p1;


/**
 *
 * @author phbs1
 */
public class MAPAP1 {

    /**
     * @param args
     */
    
    
    public static void main(String[] args) {
         
        
        
       // Exame exame = new Exame();
        //exame.cadastrarExame();
        //exame.mostrarExame();
     
         ExameGlicemia exaG = new ExameGlicemia();
         exaG.cadastrarExame();
         exaG.mostrarExame();
        
         ExameColesterol exaC = new ExameColesterol();
         exaC.cadastrarExame();
         exaC.mostrarExame();
       
         ExameTriglicerideos exaT = new ExameTriglicerideos();
         exaT.cadastrarExame();
         exaT.mostrarExame();
    }
}

