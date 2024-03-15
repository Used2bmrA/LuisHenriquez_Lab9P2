
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;


class HiloFecha implements Runnable{
    private JLabel fecha;
    
    public HiloFecha(JLabel fecha) {
        this.fecha = fecha;
    }        

    @Override
    public void run() {
        while(true){
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("dd/MM/yyyy");
            fecha.setText( f.format(h) );
            try {
                Thread.sleep(60);
            } catch (InterruptedException ex) {
                
            }
        }        
    }
}
