/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
    
/**
 *
 * @author user
 */
public class PayMoney extends javax.swing.JFrame {

    /**
     * Creates new form PayMoney
     */
    public static boolean bl ;
    
    public PayMoney() {
        initComponents();
    }

    PayMoney(Object object, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Select = new javax.swing.JLabel();
        card = new javax.swing.JRadioButton();
        Money = new javax.swing.JRadioButton();
        Register = new javax.swing.JButton();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        Select.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Select.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Select.setText("Money Or Card ");
        getContentPane().add(Select);
        Select.setBounds(71, 43, 256, 44);

        card.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        card.setText("Card");
        card.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardActionPerformed(evt);
            }
        });
        getContentPane().add(card);
        card.setBounds(205, 147, 122, 41);

        Money.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Money.setText("Money");
        Money.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyActionPerformed(evt);
            }
        });
        getContentPane().add(Money);
        Money.setBounds(71, 147, 116, 41);

        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(Register);
        Register.setBounds(310, 250, 90, 40);

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(10, 250, 90, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardActionPerformed
        bl = true ;
        Login lg = new Login(null,false);//create object
        lg.setVisible(true);
    }//GEN-LAST:event_cardActionPerformed

    private void MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyActionPerformed
        bl = false ;
        this.dispose(); //close PayMoney
        Station stt = new Station(); //create object
        stt.setVisible(true);
    }//GEN-LAST:event_MoneyActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        Register rg = new Register(null,false);
        rg.setVisible(true);
    }//GEN-LAST:event_RegisterActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(PayMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JRadioButton Money;
    private javax.swing.JButton Register;
    private javax.swing.JLabel Select;
    private javax.swing.JRadioButton card;
    // End of variables declaration//GEN-END:variables
}
