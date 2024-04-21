package mapa.p1;

import javax.swing.JOptionPane;


/**
 *
 * @author phbs1
 */
public class ExameGlicemia extends Exame {
    private int resultadoGlicemia;
    private double glicose;
    
    @Override
    public void cadastrarExame() {
        super.cadastrarExame(); 
      glicose = Integer.parseInt(JOptionPane.showInputDialog("Qual o nivel de glicemia do paciente?"));
    }
  
      public String classificarResultado() {
  if (this.glicose < 100) {
    return "Normoglicemia";
  } else if (this.glicose < 126) {
    return "Pré-diabetes";
  } else {
    return "Diabetes";
  }
}

    @Override
    public void mostrarExame() {
        super.mostrarExame();
        String msg = "Nome: " + this.getNome() + "\n";
        msg += "Tipo Sanguineo: " + this.getTipoSanguineo() + "\n";
        msg += "Ano de Nascimento: " + this.getAnoNascimento() + "\n";
        msg += "Resultado do Exame é: " + this.classificarResultado() + "\n";
        JOptionPane.showMessageDialog(null, msg);    
    }

    public int getResultadoGlicemia() {
        return resultadoGlicemia;
    }

    public void setResultadoGlicemia(int resultadoGlicemia) {
        this.resultadoGlicemia = resultadoGlicemia;
    }

   public double getGlicose(){
   return glicose;
   }

   public void setGlicose(double glicose){
   this.glicose = glicose;
   }
}