
package mapa.p1;

import javax.swing.JOptionPane;

/**
 *
 * @author phbs1
 */
class ExameColesterol extends Exame{
    
    private int resultadoColesterol;
    private double LDL;
    private double HDL;
    private int idade;
    private String risco;
    
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
     resultadoColesterol = Integer.parseInt(JOptionPane.showInputDialog("Qual seu nivel de colesterol LDL por mg/dL do paciente? "));
     HDL = Double.parseDouble(JOptionPane.showInputDialog("Qual seu nivel de colesterol HDL por mg/dL do paciente? "));
    risco = JOptionPane.showInputDialog("Qual é  risco do paciente (baixo, médio, alto)? "); 
    calcularIdade();
    }
    
    private void calcularIdade() {
        int anoAtual = 2023;
        idade = anoAtual - this.getAnoNascimento();
    }
    
  public String ApresentarResultadoHDL() {
        String resultado = "";

        if (this.idade <= 19) {
            if (this.HDL > 45) {
                resultado += "Colesterol HDL - BOM \n";
            } else {
                resultado += "Colesterol HDL - BAIXO \n";
            }
        } else {
            if (this.HDL > 40) {
                resultado += "Colesterol HDL - BOM \n";
            } else {
                resultado += "Colesterol HDL - BAIXO \n";
            }
      }
      return resultado;
   }
    
   public String ApresentarResultadoLDL() {
        String resultado = "";
        if (risco.equals("baixo") && LDL <= 100) {
            resultado += "Colesterol LDL - Normal (Dentro do limite)\n";
        } else if (risco.equals("médio") && LDL <= 70) {
            resultado += "Colesterol LDL - Normal (Dentro do limite)\n";
        } else if (risco.equals("alto") && LDL <= 50) {
            resultado += "Colesterol LDL - Normal (Dentro do limite)\n";
        } else {
            resultado += "Colesterol LDL - ALTO (Acima do limite)\n";
        }
        return resultado;
    }
    
    @Override
    public void mostrarExame() {
        super.mostrarExame(); 
         String msg = "Nome: " + this.getNome() + "\n";
        msg += "Tipo Sanguineo: " + this.getTipoSanguineo() + "\n";
        msg += "Ano de Nascimento: " + this.getAnoNascimento() + "\n";
        msg += "Resultado do Exame de LDL é: " + this.ApresentarResultadoLDL()+ "\n";
        msg += "Resultado do Exame de HDL é: " + this.ApresentarResultadoHDL()+ "\n";
        JOptionPane.showMessageDialog(null, msg);
    }

    public double getLDL() {
        return LDL;
    }

    public void setLDL(double LDL) {
        this.LDL = LDL;
    }

    public double getHDL() {
        return HDL;
    }

    public void setHDL(double HDL) {
        this.HDL = HDL;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRisco() {
        return risco;
    }
    
    public void setRisco(String risco) {
        this.risco = risco;
    }
    
    public int getResultadoColesterol() {
        return resultadoColesterol;
    }
    
    public void setResultadoColesterol(int resultadoColesterol) {
        this.resultadoColesterol = resultadoColesterol;
    }
}