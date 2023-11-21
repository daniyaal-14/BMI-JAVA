import java.awt.*;
public class BMI1 extends javax.swing.JFrame {
    CardLayout cl;
    /**
     * Creates new form BMI1
     */
    public BMI1() {
        initComponents();
        cl= (CardLayout)getContentPane().getLayout();
    }

    //this method takes height and weight of a person calculate and return the bmi.
    float findBMI(float h,float w)
    {
        float hg = h*(31);
        float bmi = w/(hg*hg);
        return bmi;
    }
    String classifyBMI(float b)
    {
        if(b <20)
            return "Under Weight";
        else if(b <= 25)
            return "Normal";
        else if(b <= 30)
            return "Over Weight";
        else if(b<= 40)
            return "Obese";
        else
            return "Modibly Obese";
    }
   float convertCmToMet(float c) 
   {
       float m=c/100;
       return m;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartPanel = new javax.swing.JPanel();
        calculate = new javax.swing.JButton();
        knowmore = new javax.swing.JButton();
        IntroPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        CalculatingCard = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        result = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        BMIPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBMI = new javax.swing.JTextField();
        txtBMIClassification = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NetworkPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        StartPanel.setForeground(new java.awt.Color(102, 102, 0));
        StartPanel.setLayout(null);

        calculate.setFont(new java.awt.Font("Bookman Old Style", 1, 35)); // NOI18N
        calculate.setText("Calculate my BMI");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        StartPanel.add(calculate);
        calculate.setBounds(590, 380, 360, 60);

        knowmore.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        knowmore.setText("Know More?");
        knowmore.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                knowmoreHierarchyChanged(evt);
            }
        });
        knowmore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knowmoreActionPerformed(evt);
            }
        });
        StartPanel.add(knowmore);
        knowmore.setBounds(20, 380, 262, 60);

        getContentPane().add(StartPanel, "CardStart");

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); // NOI18N
        jLabel1.setText("{ Body  Mass  Index }");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("BMI is defined as the individual body mass divided by the square of his     weight.The formulae universally used in  medicine. The Body Mass Index isa vistic proxy for human body fat based on an individual wieght and hieghtBMI does not actually  measure the percantage of body fat.\n\nThus is checks your overall fitness.\n");
        jScrollPane1.setViewportView(jTextArea1);

        back.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IntroPanelLayout = new javax.swing.GroupLayout(IntroPanel);
        IntroPanel.setLayout(IntroPanelLayout);
        IntroPanelLayout.setHorizontalGroup(
            IntroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntroPanelLayout.createSequentialGroup()
                .addGroup(IntroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IntroPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE))
                    .addGroup(IntroPanelLayout.createSequentialGroup()
                        .addGroup(IntroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IntroPanelLayout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(jLabel1))
                            .addGroup(IntroPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        IntroPanelLayout.setVerticalGroup(
            IntroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntroPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(IntroPanel, "CardIntro");

        CalculatingCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel3.setText("              How To Calculate Your BMI?");
        CalculatingCard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 720, 100));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel4.setText("Enter your Weight ");
        CalculatingCard.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 460, 52));

        txtNm.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        txtNm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNmActionPerformed(evt);
            }
        });
        CalculatingCard.add(txtNm, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 340, 50));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel8.setText("Enter your Hieght");
        CalculatingCard.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 470, 40));

        txtHeight.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });
        CalculatingCard.add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 210, 40));

        result.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        result.setText("CALCULATE");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });
        CalculatingCard.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 290, 70));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel5.setText("Enter Name ");
        CalculatingCard.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 290, 50));

        txtWeight.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });
        CalculatingCard.add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 210, 40));

        getContentPane().add(CalculatingCard, "CalculatingCard");

        BMIPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel6.setText("BMI Classifications:-");
        BMIPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 470, 36));

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel7.setText("BMI Readings :-");
        BMIPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 380, 50));

        txtBMI.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        BMIPanel.add(txtBMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 230, 50));

        txtBMIClassification.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        BMIPanel.add(txtBMIClassification, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 330, 50));

        print.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        print.setText("Print Certificate");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        BMIPanel.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 350, 40));

        exit.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        BMIPanel.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 170, 40));
        BMIPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 370, 410));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel2.setText("Report:");
        BMIPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 240, -1));

        getContentPane().add(BMIPanel, "CardBMI");

        NetworkPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jButton1.setText("Back!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        NetworkPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        jLabel10.setText("Seems there is no printer connected to your device");
        NetworkPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 900, 200));

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        jLabel11.setText("Go back and try connecting printer");
        NetworkPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        getContentPane().add(NetworkPanel, "card6");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        cl.show(getContentPane(),"CardStart");
    }//GEN-LAST:event_backActionPerformed

    private void txtNmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNmActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
    cl.show(getContentPane(),"CalculatingCard");
    }//GEN-LAST:event_calculateActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed

        float w = Float.parseFloat(txtWeight.getText());
        float h = Float.parseFloat(txtHeight.getText());
        h=convertCmToMet(h);
        float bmi = findBMI(h,w);
        String bmi_class = classifyBMI(bmi);
        txtBMI.setText(bmi +"");
        txtBMIClassification.setText(bmi_class);
        cl.show(getContentPane(),"CardBMI");
        
        
    }//GEN-LAST:event_resultActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
      cl.show(getContentPane(),"card6");        
    }//GEN-LAST:event_printActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void knowmoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knowmoreActionPerformed
        cl.show(getContentPane(),"CardIntro");
    }//GEN-LAST:event_knowmoreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       cl.show(getContentPane(),"CardBMI");        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void knowmoreHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_knowmoreHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_knowmoreHierarchyChanged

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
            java.util.logging.Logger.getLogger(BMI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMI1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BMIPanel;
    private javax.swing.JPanel CalculatingCard;
    private javax.swing.JPanel IntroPanel;
    private javax.swing.JPanel NetworkPanel;
    private javax.swing.JPanel StartPanel;
    private javax.swing.JButton back;
    private javax.swing.JButton calculate;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton knowmore;
    private javax.swing.JButton print;
    private javax.swing.JButton result;
    private javax.swing.JTextField txtBMI;
    private javax.swing.JTextField txtBMIClassification;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtNm;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
