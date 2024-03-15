
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

class HiloBarra extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private String texto;
    private JTextArea area;

    public HiloBarra(JProgressBar barra, String texto, JTextArea area) {
        this.vive = true;
        this.avanzar = true;
        this.barra = barra;
        this.texto = texto;
        this.area = area;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    
    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue() +1);
                if(barra.getValue() ==100){
                    area.append(texto);
                    vive =false;
                }                
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
