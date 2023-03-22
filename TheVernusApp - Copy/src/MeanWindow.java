
import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class MeanWindow extends javax.swing.JFrame {

    /**
     * Creates new form MeanWindow
     */
    public MeanWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnheretostart = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("MEAN CALCULATOR ");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnheretostart.setBackground(new java.awt.Color(175, 27, 1));
        btnheretostart.setFont(new java.awt.Font("Arial Nova Light", 1, 14)); // NOI18N
        btnheretostart.setForeground(new java.awt.Color(255, 255, 255));
        btnheretostart.setText("CLICK HERE TO START");
        btnheretostart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnheretostart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnheretostartActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(0, 0, 51));
        btnback.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("BACK");
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(477, 477, 477)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(btnheretostart)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(439, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(416, 416, 416))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(btnheretostart)
                .addGap(44, 44, 44)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnheretostartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnheretostartActionPerformed
        // TODO add your handling code here:
        
        try {
            //Accepting size of array
            int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the Size of the Data Set: "));
            
            double[] Numbers = new double[size];
        
            double sum = 0;
            for (int i = 0; i < Numbers.length; i++) {          
                    
                    
                //Accepting user input
                Numbers[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter number " + (i + 1) + ": "));
                        
                sum = sum + Numbers[i]; //Suming up Numbers(user input)
    
            }
  
            
            jTextArea1.setText(null); //Clearing text area
            
        
            //Displaying result of mode,mean and median at text area
            jTextArea1.setText(jTextArea1.getText()+"\nThe Mean of the Data Set = "+getMean(Numbers));
           
            
        } catch (HeadlessException headlessException) {
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Input must be a number!","Error", JOptionPane.ERROR_MESSAGE);
        }
        //================================== END OF MEAN,MEDIAN,MODED ===================================================================
    }//GEN-LAST:event_btnheretostartActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
         setVisible(false);
        ChooseAnOption Object = new ChooseAnOption();
        Object.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    //====================== MODE =======================================================
    public static double getMode(double[] Numbers) {
        
        double maxNumber = -1;
        double maxAppearances = -1;
        double count = 0;
        
        for(int i = 0; i < Numbers.length; i++){
            
            count = 0;
            
            for(int j = 0; j < Numbers.length; j++){
                
                if(Numbers[i] == Numbers[j]){
                    
                    count++;
                }
            }
            if(count > maxAppearances){
                
                maxNumber = Numbers[i];
                maxAppearances = count;
            }    
        }
        return maxNumber;
        
    }//======================== END OF MODE ======================================================

    
    
    //=========================== MEDIAN ========================================================
    public static double getMedian(double[] Numbers) {
        
        Arrays.sort(Numbers);
        if(Numbers.length % 2 != 0){
            
            return (Numbers[Numbers.length / 2]);
            
        }else{
            return (((double)(Numbers[Numbers.length / 2] + Numbers[Numbers.length / 2-1]) / 2));
        }
    }//======================== END OF MEDIAN ==============================================

    
    
    //================================= MEAN ==================================================
    public static double getMean(double[] Numbers) {
        
        double sum = 0;
        
        for(int i = 0; i < Numbers.length; i++){
            sum += Numbers[i];
        }
        double mean = ((double) sum / Numbers.length);

        return mean;   
    }//===================== END OF MEAN ========================================
    
    
    
    //===================== MEAN OF GROUPED DATA =================================
    public static double getMeanOfGroupedData(double[] Numbers, double[] frequency) {
        
        double sumFX = 0;
        double sumF =0;
        for(int i = 0; i < Numbers.length; i++){
            sumFX += Numbers[i] * frequency[i];
            sumF = sumF + frequency[i];
        }
        double mean = ((double) sumFX / sumF);
        
        return mean;
    }//===================== END OF MEAN OF GROUPED DATA =================================
    
    
    
    
    //====================== MODE OF GROUPED DATA=======================================================
    public static double getModeOfGroupedData(double[] Numbers, double[] frequency) {
        
        double max = frequency[0];
        
        double mode = 0;

        for (int i = 1; i < frequency.length; i++) {
            
            if (frequency[i] > max){
                
                max = frequency[i];
                
                frequency[i] = Numbers[i];
                
                mode = Numbers[i];
            }
        }
   
        return mode;
    }//============== END OF MODE OF GROUPED DATA ======================================================
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
            java.util.logging.Logger.getLogger(MeanWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeanWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeanWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeanWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeanWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnheretostart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
