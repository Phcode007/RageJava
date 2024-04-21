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
public class Exame {
    
    private String nome;
    private String TipoSanguineo;
    private int anoNascimento;
    // Métodos Get e Set
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
    this.nome = nome.toUpperCase();
    }

    public String getTipoSanguineo() {
        return TipoSanguineo;
    }

    public void setTipoSanguineo(String TipoSanguineo) {
        this.TipoSanguineo = TipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public void cadastrarExame(){
        this.nome = JOptionPane.showInputDialog("Digite o nome do paciente");
        this.TipoSanguineo = JOptionPane.showInputDialog("Digite o tipo sanguineo do paciente");
        this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de nascimento?"));
        
    }
    
    public void mostrarExame(){
        String msg = "Nome: " + this.nome + "\n";
        msg += "Tipo Sanguineo: " + this.TipoSanguineo + "\n";
        msg += "Ano de Nascimento: " + this.anoNascimento + "\n";
        JOptionPane.showMessageDialog(null, msg);    
    }

}
