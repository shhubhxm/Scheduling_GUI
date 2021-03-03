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
public class lrtf extends javax.swing.JFrame {

    /**
     * Creates new form lrtf
     */
    public lrtf() {
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

        jButton1 = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        iobt = new javax.swing.JTextField();
        Execute = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        Remove = new javax.swing.JButton();
        bt1 = new javax.swing.JTextField();
        bt2 = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        AT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Add.setBackground(new java.awt.Color(0, 0, 0));
        Add.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("ADD ROW");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(299, 494, 112, 23);

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
        getContentPane().add(iobt);
        iobt.setBounds(293, 26, 61, 22);

        Execute.setBackground(new java.awt.Color(0, 0, 0));
        Execute.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Execute.setForeground(new java.awt.Color(255, 255, 255));
        Execute.setText("RUN");
        Execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteActionPerformed(evt);
            }
        });
        getContentPane().add(Execute);
        Execute.setBounds(31, 494, 108, 23);

        jTable.setBackground(new java.awt.Color(102, 102, 102));
        jTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable.setForeground(new java.awt.Color(255, 255, 255));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P. No.", "A.T.", "B.T.", "I/O B.T.", "B.T.", "C.T.", "T.A.T.", "W.T."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(31, 186, 536, 289);

        Remove.setBackground(new java.awt.Color(0, 0, 0));
        Remove.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Remove.setForeground(new java.awt.Color(255, 255, 255));
        Remove.setText("CLEAR ALL");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        getContentPane().add(Remove);
        Remove.setBounds(461, 494, 106, 23);

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
        getContentPane().add(bt1);
        bt1.setBounds(293, 146, 61, 22);

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
        getContentPane().add(bt2);
        bt2.setBounds(293, 66, 61, 22);

        Clear.setBackground(new java.awt.Color(0, 0, 0));
        Clear.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("HOME");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear);
        Clear.setBounds(164, 494, 71, 23);

        AT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ATFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ATFocusLost(evt);
            }
        });
        getContentPane().add(AT);
        AT.setBounds(293, 106, 61, 22);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("I/O BURST TIME:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(31, 32, 160, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BURST TIME:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(31, 69, 140, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ARRIVAL TIME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(31, 112, 150, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BURST TIME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(31, 152, 140, 22);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgroundgui3.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 580, 550);

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(640, 50, 300, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        int pid=1;
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main jfrm2= new Main();
        jfrm2.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int r = jTable.getModel().getRowCount();
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
            atn[i]= at[i] = Integer.valueOf((String) model.getValueAt(i,1));
            btan[i] = bta[i] = Integer.valueOf((String) model.getValueAt(i,2));
            iobt[i] = Integer.valueOf((String) model.getValueAt(i,3));
            btbn[i] = btb[i] = Integer.valueOf((String) model.getValueAt(i,4));
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
                int i = 0;
                //                System.out.print("list");
                //                                for(int e:q){
                    //                                        System.out.print(e+",");
                    //                                    }
                //                                System.out.println("");
                int max = bta[q.get(0)]+btb[q.get(0)];
                while(x<q.size()){
                    if(max<bta[q.get(x)]+btb[q.get(x)]){
                        max = bta[q.get(x)]+btb[q.get(x)];
                        //                                System.out.println("in min "+ min +"  x "+x);
                        i = x;
                    }
                    x++;
                    //                    System.out.println("in");
                }
                int index = i;
                //                System.out.println("time - " + time +"  min. - "+min+"  pid - "+(index));
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
            row[2] = Integer.toString(btan[i]);
            row[3] = Integer.toString(iobt[i]);
            row[4] = Integer.toString(btbn[i]);
            row[5] = Integer.toString(ct[i]);
            tat[i] = ct[i]-atn[i];
            row[6] = Integer.toString(ct[i]-atn[i]);
            row[7] = Integer.toString(Integer.parseInt(row[6]) - btan[i] - btbn[i]);
            model.addRow(row);
        }
          drawGraph(tat);
    }//GEN-LAST:event_ExecuteActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int r = jTable.getModel().getRowCount();
        model.removeRow(r-1);
        pid--;
    }//GEN-LAST:event_RemoveActionPerformed

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

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
         Main jfrm2= new Main();
        jfrm2.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ClearActionPerformed

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
private void drawGraph(int[] in){
//        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int i=0;
        while(i<in.length){
            dataset.setValue(in[i], "", Integer.toString(i+1));
//            System.out.println(in[i]);
            i++;
        }
        JFreeChart chart = ChartFactory.createBarChart("LRTF", "Process number", "Turn Around Time", dataset);
        CategoryPlot catPlot = chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.RED);
        
        ChartPanel chartPanel = new ChartPanel(chart);
        jPanel1.removeAll();
        jPanel1.add(chartPanel , BorderLayout.CENTER);
        jPanel1.validate();
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
            java.util.logging.Logger.getLogger(lrtf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lrtf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lrtf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lrtf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lrtf().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}