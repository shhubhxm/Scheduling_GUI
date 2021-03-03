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
public class ljf extends javax.swing.JFrame {

    /**
     * Creates new form ljf
     */
    public ljf() {
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
                "P. No.", "A.T.", "B.T.", "I/O B.T.", "B.T.", "C.T.", "T.A.T.", "W.T."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false, false, false, false
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AT)
                                .addGap(49, 49, 49)
                                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(iobt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Execute, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iobt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Execute)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Add)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Clear)
                    .addComponent(Remove))
                .addContainerGap(40, Short.MAX_VALUE))
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
    int pid=1;
    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int r = jTable.getModel().getRowCount();
        model.removeRow(r-1);
        pid--;
    }//GEN-LAST:event_RemoveActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int r = jTable.getModel().getRowCount();
        model.setRowCount(0);
        pid = 1;
    }//GEN-LAST:event_ClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main jfrm2= new Main();
        jfrm2.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bt1FocusGained
        // TODO add your handling code here:
        bt1.setText("");
    }//GEN-LAST:event_bt1FocusGained

    private void bt1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bt1FocusLost
        // TODO add your handling code here:
        if(bt1.getText().equals("")){
            bt1.setText("BT");
        }
    }//GEN-LAST:event_bt1FocusLost

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt1ActionPerformed

    private void iobtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iobtFocusGained
        // TODO add your handling code here:
        iobt.setText("");
    }//GEN-LAST:event_iobtFocusGained

    private void iobtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iobtFocusLost
        // TODO add your handling code here:
        if(iobt.getText().equals("")){
            iobt.setText("I/O BT");
        }
    }//GEN-LAST:event_iobtFocusLost

    private void iobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iobtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iobtActionPerformed

    private void bt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bt2FocusGained
        // TODO add your handling code here:
        bt2.setText("");
    }//GEN-LAST:event_bt2FocusGained

    private void bt2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bt2FocusLost
        // TODO add your handling code here:
        if(bt2.getText().equals("")){
            bt2.setText("BT");
        }
    }//GEN-LAST:event_bt2FocusLost

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt2ActionPerformed

    private void ATFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ATFocusGained
        // TODO add your handling code here:
        AT.setText("");
    }//GEN-LAST:event_ATFocusGained

    private void ATFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ATFocusLost
        // TODO add your handling code here:
        if(AT.getText().equals("")){
            AT.setText("AT");
        }
    }//GEN-LAST:event_ATFocusLost

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String at = AT.getText();
        String bta = bt1.getText();
        String iobta = iobt.getText();
        String btb = bt2.getText();
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
        String[] row = new String[5];
        row[0] = Integer.toString(pid);
        row[1] = at;
        row[2] = bta;
        row[3] = iobta;
        row[4] = btb;
        pid++;
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.addRow(row);
        bt1.setText("BT");
        iobt.setText("I/O BT");
        bt2.setText("BT");
        AT.setText("AT");
        //        System.out.println(jTable.getModel().getValueAt(0, 0));
    }//GEN-LAST:event_AddActionPerformed

    private void ExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int r = jTable.getModel().getRowCount();
        int[] at = new int[r];
        int[] atn = new int[r];
        int[] bta = new int[r];
        int[] iobt = new int[r];
        int[] btb = new int[r];
        int[] ct = new int[r];
        boolean[] flag = new boolean[r];
        boolean[] flag1 = new boolean[r];
        boolean[] flag2 = new boolean[r];
        List<Integer> q = new LinkedList<>();
        for(int i=0;i<r;i++){
            atn[i]=at[i]= Integer.valueOf((String) model.getValueAt(i,1));
            bta[i] = Integer.valueOf((String) model.getValueAt(i,2));
            iobt[i] = Integer.valueOf((String) model.getValueAt(i,3));
            btb[i] = Integer.valueOf((String) model.getValueAt(i,4));
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
                int x = 1;
                int i = 0;
                int  max = bta[q.get(0)]+btb[q.get(0)];
                while(x<q.size()){
                    if((bta[q.get(x)]+btb[q.get(x)])!=0){
                        if(max<bta[q.get(x)]+btb[q.get(x)]){
                            max = bta[q.get(x)]+btb[q.get(x)];
                            i = x;
                        }
                    }
                    x++;
                }
                //                    System.out.println("time - " + time +"  min. - "+min);
                if(time>=cb){
                    i = q.remove(i);
                    if(flag[i]){
                        //                    System.out.println("in1");
                        if(btb[i]==0){
                            ct[i] = time + iobt[i]+bta[i];
                            flag2[i] = false;
                            flag1[i] = false;
                        }
                        else{
                            at[i] = time + iobt[i] + bta[i];
                        }
                        flag[i] = false;
                        cb = time + bta[i];
                    }
                    else{
                        if(flag2[i]){
                            //                          System.out.println("in2");
                            ct[i] = time + btb[i];
                            flag1[i] = false;
                            cb = time + btb[i];
                        }
                    }
                }
                //                System.out.println("PID  = "+i);
            }
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
            String[] row = new String[8];
            row[0] = Integer.toString(i+1);
            row[1] = Integer.toString(atn[i]);
            row[2] = Integer.toString(bta[i]);
            row[3] = Integer.toString(iobt[i]);
            row[4] = Integer.toString(btb[i]);
            row[5] = Integer.toString(ct[i]);
            tat[i] = ct[i]-atn[i];
            row[6] = Integer.toString(ct[i]-atn[i]);
            row[7] = Integer.toString(Integer.parseInt(row[6]) - bta[i] - btb[i]);
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
        JFreeChart chart = ChartFactory.createBarChart("LJF", "Process number", "Turn Around Time", dataset);
        CategoryPlot catPlot = chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.RED);
        
        ChartPanel chartPanel = new ChartPanel(chart);
        //jPanel3.removeAll();
        //jPanel3.add(chartPanel , BorderLayout.CENTER);
        //jPanel3.validate();
    }
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
            java.util.logging.Logger.getLogger(ljf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ljf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ljf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ljf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ljf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AT;
    private javax.swing.JButton Add;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Execute;
    private javax.swing.JButton Remove;
    private javax.swing.JTextField bt1;
    private javax.swing.JTextField bt2;
    private javax.swing.JTextField iobt;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
