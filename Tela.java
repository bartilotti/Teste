
import java.awt.Color;
import java.awt.Font;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        
        lblFrase.setText("<html>Vou pensar em um número <strong>entre 1 e 10</strong>. "
                         + "Tente adivinhar</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtVal = new javax.swing.JSpinner();
        lblFrase = new javax.swing.JLabel();
        lblBalao = new javax.swing.JLabel();
        lblGenio = new javax.swing.JLabel();
        btnPalpite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel3.setText("Valor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        txtVal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(txtVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        lblFrase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 46, 140, 80));

        lblBalao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/balao2.png"))); // NOI18N
        getContentPane().add(lblBalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 190, 190));

        lblGenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/genio3.jpg"))); // NOI18N
        lblGenio.setText("teste");
        getContentPane().add(lblGenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, -1));

        btnPalpite.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPalpite.setText("Palpite");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        //sorteia o número
        double n = 1 + Math.random() * (10-1);
        int valor = (int) n;
        
        //pega o o número inserido pelo usuário
        int numDigitado = Integer.parseInt(txtVal.getValue().toString());
        
        //frases configuradas
        String f1 = ("<html>Acertou!</html>");
        String f2 = ("<html>Errou! pensei no " + valor + "</html>");
         
        String res = (valor == numDigitado)? f1:f2; 
        
        lblFrase.setFont(new Font ("Arial Black", Font.PLAIN, 15));
        lblFrase.setText(res);
        
        
    }//GEN-LAST:event_btnPalpiteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBalao;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JLabel lblGenio;
    private javax.swing.JSpinner txtVal;
    // End of variables declaration//GEN-END:variables
}
