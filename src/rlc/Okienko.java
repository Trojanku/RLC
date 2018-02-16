
package RLC;

import java.awt.BorderLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Kuba
 */
public  class Okienko extends javax.swing.JFrame {

   XYSeries wPobudzenie;
   XYSeries nKondensator; 
   XYSeries nCewka;
   XYSeries nRezystor;
   
   int numer = 0;
   
    public Okienko() {
        initComponents();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Wykres = new javax.swing.JPanel();
        Symulacja = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rodzaj = new javax.swing.JComboBox<>();
        amplituda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        czas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        okres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        r0 = new javax.swing.JTextField();
        L = new javax.swing.JTextField();
        C = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        r1 = new javax.swing.JTextField();
        KROK = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cewka = new javax.swing.JRadioButton();
        rezystor = new javax.swing.JRadioButton();
        kondensator = new javax.swing.JRadioButton();
        pobudzenie = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Wykres.setBackground(new java.awt.Color(140, 153, 120));
        Wykres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Wykres.setLayout(new java.awt.BorderLayout());

        Symulacja.setText("symulacja");
        Symulacja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SymulacjaActionPerformed(evt);
            }
        });

        rodzaj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "prostokątny", "trojkatny", "sinusoida" }));
        rodzaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rodzajActionPerformed(evt);
            }
        });

        amplituda.setText("1");
        amplituda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amplitudaActionPerformed(evt);
            }
        });

        jLabel1.setText("amplituda");

        czas.setText("200");
        czas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                czasActionPerformed(evt);
            }
        });

        jLabel2.setText("czas");

        okres.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        okres.setText("20");

        jLabel3.setText("okres");

        r0.setText("10");
        r0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r0ActionPerformed(evt);
            }
        });

        L.setText("100");

        C.setText("0.1");
        C.setToolTipText("");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        A.setText("0.1");

        jLabel4.setText("R0:");

        jLabel5.setText("L:");

        jLabel6.setText("C:");

        jLabel7.setText("a:");

        jLabel8.setText("R1:");

        r1.setText("2000");

        KROK.setText("0.001");

        jLabel9.setText("krok");

        jLabel10.setText("pobudzenie");

        jLabel11.setText("wyświetlenie :");

        cewka.setSelected(true);
        cewka.setText("cewka");
        cewka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cewkaActionPerformed(evt);
            }
        });

        rezystor.setSelected(true);
        rezystor.setText("rezystor");

        kondensator.setSelected(true);
        kondensator.setText("kondensator");

        pobudzenie.setSelected(true);
        pobudzenie.setText("pobudzenie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rodzaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(czas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(okres, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KROK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amplituda, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Symulacja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rezystor)
                            .addComponent(cewka)
                            .addComponent(kondensator)
                            .addComponent(pobudzenie))
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(r0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Wykres, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Wykres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rodzaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(amplituda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(czas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KROK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cewka))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rezystor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kondensator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pobudzenie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(Symulacja)
                .addGap(41, 41, 41))
        );

        Symulacja.getAccessibleContext().setAccessibleName("Symulacja");
        Symulacja.getAccessibleContext().setAccessibleParent(Symulacja);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SymulacjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SymulacjaActionPerformed

        wPobudzenie = new XYSeries("Pobudzenie");
        nKondensator = new XYSeries("Napięcie kondensatora");
        nCewka = new XYSeries("Napięcie cewki");
        nRezystor = new XYSeries("Napięcie rezystora");
        
        XYSeriesCollection dataSet = new XYSeriesCollection();

        double krok = Double.parseDouble(KROK.getText());
         
        double czas_symulacji = Double.parseDouble(czas.getText());
        
         Obliczenia licz = new Obliczenia();
         
         licz.amplituda = Double.parseDouble(amplituda.getText());
         licz.okres = Double.parseDouble(okres.getText());
         licz.C = Double.parseDouble(C.getText());
         licz.L = Double.parseDouble(L.getText());
         
         double R0 = Double.parseDouble(r0.getText());
         double R1 = Double.parseDouble(r1.getText());
         double a = Double.parseDouble(A.getText());
         
         
        double pobudz;
        double y_poch_R;
        double y_poch_K;
        double u_l;
        double u_r = 0;
        double u_c = 0;
        
        numer = rodzaj.getSelectedIndex() + 1;
        
        for(double i=0; i<= czas_symulacji; i+=krok){
            
            pobudz = licz.Pobudzenie(numer,i,krok);
            wPobudzenie.add(i,pobudz);
            
            licz.R = R0 + (R1*Math.exp(-a*i));
            
            if (i != 0){
                    
                    y_poch_R = licz.funkcja_R(u_r, u_c, pobudz);
                    y_poch_K = licz.funkcja_K(u_r);
         
                    u_r = licz.Euler_y(u_r, y_poch_R, krok);
                    u_c = licz.Euler_y(u_c, y_poch_K, krok);
                    u_l = pobudz - u_r - u_c;
                    
                    nKondensator.add(i, u_c);
                    nCewka.add(i, u_l);
                    nRezystor.add(i, u_r);
                }
            
        }
        
        if (pobudzenie.isSelected())dataSet.addSeries(wPobudzenie);
        if (kondensator.isSelected()) dataSet.addSeries(nKondensator);
        if (cewka.isSelected())dataSet.addSeries(nCewka);
        if (rezystor.isSelected())dataSet.addSeries(nRezystor);

        JFreeChart chart = ChartFactory.createXYLineChart(
            "Odpowiedź układu",//Tytuł
            "Czas [s]", // x-axis Opis
            "Wartość [V]", // y-axis Opis
            dataSet, // Dane
            PlotOrientation.VERTICAL, // Orjentacja wykresu /HORIZONTAL
            true, // pozkaż legende
            true, // podpowiedzi tooltips
            false
        );

        ChartPanel chart1 = new ChartPanel(chart);
        Wykres.removeAll();
        Wykres.add(chart1, BorderLayout.CENTER);
        Wykres.validate();

        // TODO add your handling code here:
    }//GEN-LAST:event_SymulacjaActionPerformed

    private void rodzajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rodzajActionPerformed
      
        // TODO add your handling code here:
    }//GEN-LAST:event_rodzajActionPerformed

    private void czasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_czasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_czasActionPerformed

    private void amplitudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amplitudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amplitudaActionPerformed

    private void r0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r0ActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void cewkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cewkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cewkaActionPerformed

     
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
            java.util.logging.Logger.getLogger(Okienko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Okienko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Okienko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Okienko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Okienko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField C;
    private javax.swing.JTextField KROK;
    private javax.swing.JTextField L;
    private javax.swing.JButton Symulacja;
    private javax.swing.JPanel Wykres;
    private javax.swing.JTextField amplituda;
    private javax.swing.JRadioButton cewka;
    private javax.swing.JTextField czas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton kondensator;
    private javax.swing.JTextField okres;
    private javax.swing.JRadioButton pobudzenie;
    private javax.swing.JTextField r0;
    private javax.swing.JTextField r1;
    private javax.swing.JRadioButton rezystor;
    private javax.swing.JComboBox<String> rodzaj;
    // End of variables declaration//GEN-END:variables
}

