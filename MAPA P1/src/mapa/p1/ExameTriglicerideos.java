/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa.p1;

import javax.swing.JOptionPane;

/**
 *
 * @author phbs1
 */
class ExameTriglicerideos extends Exame {
    
    private int resultadoTriglicerideos;
    private double nivelTriglicerideos;
    private boolean emJejum;
    private int idade = 2023 - this.getAnoNascimento();
    
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        resultadoTriglicerideos = Integer.parseInt(JOptionPane.showInputDialog("Qual o nível de Triglicerídeos do paciente por mg/dL?"));
        emJejum = JOptionPane.showConfirmDialog(null, "O paciente está em jejum?", "Jejum", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        
    }

    public String calculoexame(){
         String faixaIdade = (idade < 10) ? "0 a 9 anos" : (idade < 20) ? "10 a 19 anos" : "Acima de 20 anos";
   
        if (emJejum && ((idade < 10 && nivelTriglicerideos < 75) ||
            (idade < 20 && nivelTriglicerideos < 90) ||
            (idade >= 20 && nivelTriglicerideos < 150))) {
            return "Níveis de Triglicerídeos bons.";
        } else {
            return "Níveis de Triglicerídeos acima do normal.";
        }
    }

    @Override
    public void mostrarExame() {
        super.mostrarExame(); 
           String msg = "Nome: " + this.getNome() + "\n";
        msg += "Tipo Sanguineo: " + this.getTipoSanguineo() + "\n";
        msg += "Idade: " + (idade = 2023 - this.getAnoNascimento()) + "anos\n";
        msg += "Resultado do Exame é: " + this.calculoexame()+ "\n";
        JOptionPane.showMessageDialog(null, msg);       
    }

    public int getResultadoTriglicerideos() {
        return resultadoTriglicerideos;
    }

    public void setResultadoTriglicerideos(int resultadoTriglicerideos) {
        this.resultadoTriglicerideos = resultadoTriglicerideos;
    }

    public double getNivelTriglicerideos() {
        return nivelTriglicerideos;
    }

    public void setNivelTriglicerideos(double nivelTriglicerideos) {
        this.nivelTriglicerideos = nivelTriglicerideos;
    }

    public boolean isEmJejum() {
        return emJejum;
    }

    public void setEmJejum(boolean emJejum) {
        this.emJejum = emJejum;
    }

    
    
}
    
  