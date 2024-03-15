
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Lab9GUI extends javax.swing.JFrame {

    public Lab9GUI() {
        initComponents();
        hora = new HiloHora(lb_horaActual);
        fecha = new HiloFecha(lb_fechaActual);
        
        Thread ah = new Thread(hora);
        Thread af = new Thread(fecha);
        ah.start();
        af.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_panelBlanco = new javax.swing.JPanel();
        ulb_diceFechaDeHoy = new javax.swing.JLabel();
        lb_fechaActual = new javax.swing.JLabel();
        ulb_diceHoraActual = new javax.swing.JLabel();
        lb_horaActual = new javax.swing.JLabel();
        ulb_diceBienvenido = new javax.swing.JLabel();
        pn_panelLila = new javax.swing.JPanel();
        bt_subirArchivo = new javax.swing.JButton();
        ulb_diceSubiendoArchivo = new javax.swing.JLabel();
        bt_guardar = new javax.swing.JButton();
        ScrollPane_AquiVaLaTextArea = new javax.swing.JScrollPane();
        ta_areaTrabajo = new javax.swing.JTextArea();
        ulb_diceArchivo = new javax.swing.JLabel();
        pb_barra = new javax.swing.JProgressBar();
        bt_sorpresa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_panelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        pn_panelBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ulb_diceFechaDeHoy.setForeground(new java.awt.Color(0, 0, 0));
        ulb_diceFechaDeHoy.setText("Fecha de hoy:");
        pn_panelBlanco.add(ulb_diceFechaDeHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        lb_fechaActual.setForeground(new java.awt.Color(0, 0, 0));
        lb_fechaActual.setText("3/15/2020");
        pn_panelBlanco.add(lb_fechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 70, -1));

        ulb_diceHoraActual.setForeground(new java.awt.Color(0, 0, 0));
        ulb_diceHoraActual.setText("Hora actual:");
        pn_panelBlanco.add(ulb_diceHoraActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 70, -1));

        lb_horaActual.setForeground(new java.awt.Color(0, 0, 0));
        lb_horaActual.setText("1:44:37");
        pn_panelBlanco.add(lb_horaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 60, -1));

        ulb_diceBienvenido.setForeground(new java.awt.Color(0, 0, 0));
        ulb_diceBienvenido.setText("Bienvenido");
        pn_panelBlanco.add(ulb_diceBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        pn_panelLila.setBackground(new java.awt.Color(204, 204, 255));

        bt_subirArchivo.setText("Subir archivo");
        bt_subirArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_subirArchivoMouseClicked(evt);
            }
        });

        ulb_diceSubiendoArchivo.setForeground(new java.awt.Color(0, 0, 0));
        ulb_diceSubiendoArchivo.setText("Subiendo archivo:");

        bt_guardar.setText("Guardar");
        bt_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_guardarMouseClicked(evt);
            }
        });

        ta_areaTrabajo.setColumns(20);
        ta_areaTrabajo.setRows(5);
        ScrollPane_AquiVaLaTextArea.setViewportView(ta_areaTrabajo);

        ulb_diceArchivo.setForeground(new java.awt.Color(0, 0, 0));
        ulb_diceArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ulb_diceArchivo.setText("Archivo");

        pb_barra.setStringPainted(true);

        bt_sorpresa.setText("Botón sorpresa");
        bt_sorpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sorpresaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_panelLilaLayout = new javax.swing.GroupLayout(pn_panelLila);
        pn_panelLila.setLayout(pn_panelLilaLayout);
        pn_panelLilaLayout.setHorizontalGroup(
            pn_panelLilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_panelLilaLayout.createSequentialGroup()
                .addGroup(pn_panelLilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_panelLilaLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(bt_guardar))
                    .addGroup(pn_panelLilaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(pn_panelLilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ulb_diceSubiendoArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pb_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_panelLilaLayout.createSequentialGroup()
                                .addComponent(bt_subirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_sorpresa)
                                .addGap(71, 71, 71))))
                    .addGroup(pn_panelLilaLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(ScrollPane_AquiVaLaTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_panelLilaLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(ulb_diceArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        pn_panelLilaLayout.setVerticalGroup(
            pn_panelLilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_panelLilaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(pn_panelLilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_subirArchivo)
                    .addComponent(bt_sorpresa))
                .addGap(18, 18, 18)
                .addComponent(ulb_diceSubiendoArchivo)
                .addGap(18, 18, 18)
                .addComponent(pb_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(ulb_diceArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane_AquiVaLaTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_guardar)
                .addGap(49, 49, 49))
        );

        pn_panelBlanco.add(pn_panelLila, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 640, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_panelBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_panelBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 569, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sorpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sorpresaMouseClicked
        JOptionPane.showMessageDialog(this, "¿Recordás que dijeron que le iban a "
                + "dar un punto extra a la primera persona que lo subió porque fue super temprano? Fui yo :) \n\n"
                + "Al presionar \"ok\" estás expresando tu compromiso a darme ese punto :P");
    }//GEN-LAST:event_bt_sorpresaMouseClicked

    private void bt_subirArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_subirArchivoMouseClicked
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        String texto = "";


        try {
            JFileChooser chooser = new JFileChooser("../");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
            chooser.setFileFilter(filtro);
            int seleccion = chooser.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile();
                archivoActual = file;
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                String linea;
                ta_areaTrabajo.setText("");
                
                while ((linea = br.readLine()) != null) {
                    texto += linea;
                    texto += "\n";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {
        }
        HiloBarra barra = new HiloBarra(pb_barra, texto, ta_areaTrabajo);
        barra.start();
    }//GEN-LAST:event_bt_subirArchivoMouseClicked

    private void bt_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_guardarMouseClicked
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            File fichero = null;
            fw = new FileWriter(archivoActual);
            bw = new BufferedWriter(fw);
            bw.write(ta_areaTrabajo.getText());
            bw.flush();
            JOptionPane.showMessageDialog(this,"Archivo guardado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }

    }//GEN-LAST:event_bt_guardarMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lab9GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab9GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab9GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab9GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab9GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane_AquiVaLaTextArea;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JButton bt_sorpresa;
    private javax.swing.JButton bt_subirArchivo;
    private javax.swing.JLabel lb_fechaActual;
    private javax.swing.JLabel lb_horaActual;
    private javax.swing.JProgressBar pb_barra;
    private javax.swing.JPanel pn_panelBlanco;
    private javax.swing.JPanel pn_panelLila;
    private javax.swing.JTextArea ta_areaTrabajo;
    private javax.swing.JLabel ulb_diceArchivo;
    private javax.swing.JLabel ulb_diceBienvenido;
    private javax.swing.JLabel ulb_diceFechaDeHoy;
    private javax.swing.JLabel ulb_diceHoraActual;
    private javax.swing.JLabel ulb_diceSubiendoArchivo;
    // End of variables declaration//GEN-END:variables

    HiloHora hora;
    HiloFecha fecha;
    File archivoActual;
}
