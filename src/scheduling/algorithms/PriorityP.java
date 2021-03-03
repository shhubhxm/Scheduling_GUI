/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scheduling.algorithms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Param
 */
public class PriorityP extends javax.swing.JFrame {

    /**
     * Creates new form PriorityP
     */
    public PriorityP() {
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

        jPanel1 = new javax.swing.JPanel();
        Remove = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bt1 = new javax.swing.JTextField();
        iobt = new javax.swing.JTextField();
        bt2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        AT = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Execute = new javax.swing.JButton();
        P = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bt1.setText("BT");
        bt1.setToolTipText("");
        bt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bt1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bt1FocusLost(evt);
            }
        });
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        iobt.setText("I/O BT");
        iobt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                iobtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                iobtFocusLost(evt);
            }
        });
        iobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iobtActionPerformed(evt);
            }
        });

        bt2.setText("BT");
        bt2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bt2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bt2FocusLost(evt);
            }
        });
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P. No.", "Priority", "A.T.", "B.T.", "I/O B.T.", "B.T.", "C.T.", "T.A.T.", "W.T."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        AT.setText("AT");
        AT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ATFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ATFocusLost(evt);
            }
        });

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Execute.setText("RUN");
        Execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteActionPerformed(evt);
            }
        });

        P.setText("Priority");
        P.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PFocusLost(evt);
            }
        });
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });

        jLabel1.setText("0 - L, 1 - H");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(iobt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(Execute, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Add)
                        .addComponent(Execute))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iobt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Clear)
                    .addComponent(Remove))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PActionPerformed

    private void PFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PFocusLost
        // TODO add your handling code here:
        if(P.getText().equals("")){
            P.setText("Priority");
        }
    }//GEN-LAST:event_PFocusLost

    private void PFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PFocusGained
        // TODO add your handling code here:
        P.setText("");
    }//GEN-LAST:event_PFocusGained
    
    private void ExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int r = jTable.getModel().getRowCount();
        int[] p = new int[r];
        int[] at = new int[r];
        int[] atn = new int[r];
        int[] bta = new int[r];
        int[] btan = new int[r];
        int[] iobt = new int[r];
        int[] btb = new int[r];
        int[] btbn = new int[r];
        int[] ct = new int[r];
        boolean[] flag = new boolean[r];
        boolean[] flag1 = new boolean[r];
        boolean[] flag2 = new boolean[r];
        List<Integer> q = new LinkedList<>();
        //        int[] q = new int[r];
        for(int i=0;i<r;i++){
            p[i] = Integer.valueOf((String) model.getValueAt(i,1));
            atn[i]=at[i]= Integer.valueOf((String) model.getValueAt(i,2));
            btan[i] = bta[i] = Integer.valueOf((String) model.getValueAt(i,3));
            iobt[i] = Integer.valueOf((String) model.getValueAt(i,4));
            btbn[i] = btb[i] = Integer.valueOf((String) model.getValueAt(i,5));
        }
        for(int i=0;i<r;i++){
            flag[i] = true;
            flag1[i] = true;
            flag2[i] = true;
        }
        int time=0;
        int cb = 0;
        boolean wflag = true;
        while(wflag){
            int y=0;
            while(y<r){
                if(at[y]==time){
                    q.add(y);
                }
                y++;
            }
            if(!q.isEmpty()){
                int x = 0;
                int pr = 0;
                int i = 0;
                while(x<q.size()){
                    if(pr<p[q.get(x)]){
                        pr = p[q.get(x)];
                        i = x;
                    }
                    x++;
                }
                int index = i;
                //                int i = q.peek();
                //                System.out.println("timeqf = "+time);
                if(time>=cb){
                    //i = q.remove(i);
                    i = q.get(index);
                    if(flag[i]){
                        //                            System.out.println("in1");
                        if(bta[i]==0){
                                if(btb[i]==0){
                                    ct[i] = time +iobt[i];
                                    q.remove(index);
                                    flag1[i] = false;
                                }
                                else{
                                    at[i] = time + iobt[i];
                                    q.remove(index);
                                }
                                flag[i] = false;
                            }
                        else{
                            bta[i] = bta[i] - 1;
//                          System.out.println(bta[i]+" "+index);
                            cb = time + 1;
                            if(bta[i]==0){
                            //                                System.out.println("in1r");
                                if(btb[i]==0){
                                    ct[i] = time + +iobt[i]+1;
                                    q.remove(index);
                                    flag1[i] = false;
                                }
                                else{
                                    at[i] = time + 1 + iobt[i];
                                    q.remove(index);
                                }
                                flag[i] = false;
                            }
                        }
                    }
                    else{
                        //stem.out.println("in2");
                        btb[i]=btb[i]-1;
                        cb = time + 1;
                        if(btb[i]==0){
                            ct[i] = time + 1;
                            q.remove(index);
                            flag1[i] = false;
                        }
                    }
                }
                //                System.out.println("PID  = "+i);
            }
            //            else{
                //                System.out.println("timeqe = "+time);
                //            }
            //            System.out.println("cb = " +cb +"   ");
            time++;
            for(int j=0;j<r;j++){
                if(!flag[j]&&!flag1[j]&&q.isEmpty()){
                    wflag = false;
                }
                else{
                    wflag = true;
                    break;
                }
            }
        }
         model.setRowCount(0);
        int[] tat = new int[r];  
        for(int i=0;i<r;i++){
            String[] row = new String[9];
            row[0] = Integer.toString(i+1);
            row[1] = Integer.toString(p[i]);
            row[2] = Integer.toString(atn[i]);
            row[3] = Integer.toString(btan[i]);
            row[4] = Integer.toString(iobt[i]);
            row[5] = Integer.toString(btbn[i]);
            row[6] = Integer.toString(ct[i]);
            tat[i] = ct[i]-atn[i];
            row[7] = Integer.toString(tat[i]);
            row[8] = Integer.toString(Integer.parseInt(row[7]) - bta[i] - btb[i]);
            model.addRow(row);
        }
                drawGraph(tat);
    }//GEN-LAST:event_ExecuteActionPerformed
    private void drawGraph(int[] in){
//        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int i=0;
        while(i<in.length){
            dataset.setValue(in[i], "", Integer.toString(i+1));
//            System.out.println(in[i]);
            i++;
        }
        JFreeChart chart = ChartFactory.createBarChart("Priority (P)", "Process number", "Turn Around Time", dataset);
        CategoryPlot catPlot = chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.RED);
        
        ChartPanel chartPanel = new ChartPanel(chart);
        //jPanel2.removeAll();
        //jPanel2.add(chartPanel , BorderLayout.CENTER);
        //jPanel2.validate();
    }
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String p = P.getText();
        String at = AT.getText();
        String bta = bt1.getText();
        String iobta = iobt.getText();
        String btb = bt2.getText();
        if(p.equals("Priority")|p.equals("")){
            p = "0";
        }
        if(at.equals("AT")|at.equals("")){
            at = "0";
        }
        if(bta.equals("BT")|bta.equals("")){
            bta = "0";
        }
        if(btb.equals("BT")|btb.equals("")){
            btb = "0";
        }
        if(iobta.equals("I/O BT")|iobta.equals("")){
            iobta = "0";
        }
        //        System.out.println(bta+" "+iobta+" "+btb);
        String[] row = new String[6];
        row[0] = Integer.toString(pid);
        row[1] = p;
        row[2] = at;
        row[3] = bta;
        row[4] = iobta;
        row[5] = btb;
        pid++;
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.addRow(row);
        P.setText("Priority");
        bt1.setText("BT");
        iobt.setText("I/O BT");
        bt2.setText("BT");
        AT.setText("AT");
        //        System.out.println(jTable.getModel().getValueAt(0, 0));
    }//GEN-LAST:event_AddActionPerformed

    private void ATFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ATFocusLost
        // TODO add your handling code here:
        if(AT.getText().equals("")){
            AT.setText("AT");
        }
    }//GEN-LAST:event_ATFocusLost

    private void ATFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ATFocusGained
        // TODO add your handling code here:
        AT.setText("");
    }//GEN-LAST:event_ATFocusGained

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bt2FocusLost
        // TODO add your handling code here:
        if(bt2.getText().equals("")){
            bt2.setText("BT");
        }
    }//GEN-LAST:event_bt2FocusLost

    private void bt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bt2FocusGained
        // TODO add your handling code here:
        bt2.setText("");
    }//GEN-LAST:event_bt2FocusGained

    private void iobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iobtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iobtActionPerformed

    private void iobtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iobtFocusLost
        // TODO add your handling code here:
        if(iobt.getText().equals("")){
            iobt.setText("I/O BT");
        }
    }//GEN-LAST:event_iobtFocusLost

    private void iobtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iobtFocusGained
        // TODO add your handling code here:
        iobt.setText("");
    }//GEN-LAST:event_iobtFocusGained

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bt1FocusLost
        // TODO add your handling code here:
        if(bt1.getText().equals("")){
            bt1.setText("BT");
        }
    }//GEN-LAST:event_bt1FocusLost

    private void bt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bt1FocusGained
        // TODO add your handling code here:
        bt1.setText("");
    }//GEN-LAST:event_bt1FocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main jfrm2= new Main();
        jfrm2.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int r = jTable.getModel().getRowCount();
        model.setRowCount(0);
        pid = 1;
    }//GEN-LAST:event_ClearActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int r = jTable.getModel().getRowCount();
        model.removeRow(r-1);
        pid--;
    }//GEN-LAST:event_RemoveActionPerformed
int pid =1;
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
            java.util.logging.Logger.getLogger(PriorityP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PriorityP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PriorityP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PriorityP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PriorityP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AT;
    private javax.swing.JButton Add;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Execute;
    private javax.swing.JTextField P;
    private javax.swing.JButton Remove;
    private javax.swing.JTextField bt1;
    private javax.swing.JTextField bt2;
    private javax.swing.JTextField iobt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
