package hashcheck.forms;

import hashcheck.AlgorithmToUse;
import hashcheck.handlers.DragDropHandler;
import hashcheck.handlers.TextDropHandler;
import java.awt.Color;

/**
 *
 * @author sakillin
 */
public class HashFrame extends javax.swing.JFrame {

   /**
    * Creates new form NewJFrame
    */
   public HashFrame() {
      this("File Hasher");
   }

   public HashFrame(String title) {
      initComponents();
      MD5Panel.setTransferHandler(new DragDropHandler(AlgorithmToUse.MD5, FileHashField));
      SHAPanel.setTransferHandler(new DragDropHandler(AlgorithmToUse.SHA1, FileHashField));
      ExpectedHashField.setTransferHandler(new TextDropHandler(ExpectedHashField));
      this.setTitle(title);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      WidgetPanel = new javax.swing.JPanel();
      HashPanel = new javax.swing.JPanel();
      SHAPanel = new javax.swing.JPanel();
      SHALabel = new javax.swing.JLabel();
      HashDropLabel = new javax.swing.JLabel();
      MD5Panel = new javax.swing.JPanel();
      MD5Label = new javax.swing.JLabel();
      HashTestPanel = new javax.swing.JPanel();
      ExpectedHashLabel = new javax.swing.JLabel();
      ExpectedHashField = new javax.swing.JTextField();
      FileHashLabel = new javax.swing.JLabel();
      FileHashField = new javax.swing.JTextField();
      HashResultPanel = new javax.swing.JPanel();
      CheckHashButton = new javax.swing.JButton();
      MatchText = new javax.swing.JLabel();
      StatusPanel = new javax.swing.JPanel();
      StatusLabel = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Binary Hasher");
      setResizable(false);

      HashPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      SHAPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      SHALabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      SHALabel.setText("SHA1");

      javax.swing.GroupLayout SHAPanelLayout = new javax.swing.GroupLayout(SHAPanel);
      SHAPanel.setLayout(SHAPanelLayout);
      SHAPanelLayout.setHorizontalGroup(
         SHAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SHAPanelLayout.createSequentialGroup()
            .addContainerGap(36, Short.MAX_VALUE)
            .addComponent(SHALabel)
            .addGap(32, 32, 32))
      );
      SHAPanelLayout.setVerticalGroup(
         SHAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(SHAPanelLayout.createSequentialGroup()
            .addGap(48, 48, 48)
            .addComponent(SHALabel)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      HashDropLabel.setLabelFor(HashPanel);
      HashDropLabel.setText("Drop File To Generate Hash");

      MD5Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      MD5Panel.setPreferredSize(new java.awt.Dimension(128, 128));

      MD5Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      MD5Label.setText("MD5");

      javax.swing.GroupLayout MD5PanelLayout = new javax.swing.GroupLayout(MD5Panel);
      MD5Panel.setLayout(MD5PanelLayout);
      MD5PanelLayout.setHorizontalGroup(
         MD5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(MD5PanelLayout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(MD5Label)
            .addContainerGap(41, Short.MAX_VALUE))
      );
      MD5PanelLayout.setVerticalGroup(
         MD5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(MD5PanelLayout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addComponent(MD5Label)
            .addContainerGap(49, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout HashPanelLayout = new javax.swing.GroupLayout(HashPanel);
      HashPanel.setLayout(HashPanelLayout);
      HashPanelLayout.setHorizontalGroup(
         HashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(HashPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(HashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(HashDropLabel)
               .addGroup(HashPanelLayout.createSequentialGroup()
                  .addComponent(MD5Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(SHAPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      HashPanelLayout.setVerticalGroup(
         HashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(HashPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(HashDropLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(HashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(SHAPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(MD5Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      HashTestPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      ExpectedHashLabel.setText("Expected Hash");

      FileHashLabel.setLabelFor(FileHashField);
      FileHashLabel.setText("File Hash");

      javax.swing.GroupLayout HashTestPanelLayout = new javax.swing.GroupLayout(HashTestPanel);
      HashTestPanel.setLayout(HashTestPanelLayout);
      HashTestPanelLayout.setHorizontalGroup(
         HashTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(HashTestPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(HashTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(ExpectedHashLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(ExpectedHashField)
               .addComponent(FileHashField)
               .addComponent(FileHashLabel))
            .addContainerGap())
      );
      HashTestPanelLayout.setVerticalGroup(
         HashTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HashTestPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(FileHashLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(FileHashField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ExpectedHashLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(ExpectedHashField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      HashResultPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      CheckHashButton.setText("Check Hash");
      CheckHashButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            CheckHash(evt);
         }
      });

      MatchText.setBackground(new java.awt.Color(204, 204, 255));
      MatchText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      MatchText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      MatchText.setText("Waiting");
      MatchText.setOpaque(true);

      javax.swing.GroupLayout HashResultPanelLayout = new javax.swing.GroupLayout(HashResultPanel);
      HashResultPanel.setLayout(HashResultPanelLayout);
      HashResultPanelLayout.setHorizontalGroup(
         HashResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(HashResultPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(HashResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(CheckHashButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(MatchText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      HashResultPanelLayout.setVerticalGroup(
         HashResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(HashResultPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(CheckHashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MatchText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      javax.swing.GroupLayout WidgetPanelLayout = new javax.swing.GroupLayout(WidgetPanel);
      WidgetPanel.setLayout(WidgetPanelLayout);
      WidgetPanelLayout.setHorizontalGroup(
         WidgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WidgetPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(WidgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(HashResultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(HashPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(HashTestPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      WidgetPanelLayout.setVerticalGroup(
         WidgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(WidgetPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(HashPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(HashTestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(HashResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      StatusPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

      StatusLabel.setText("Status");

      javax.swing.GroupLayout StatusPanelLayout = new javax.swing.GroupLayout(StatusPanel);
      StatusPanel.setLayout(StatusPanelLayout);
      StatusPanelLayout.setHorizontalGroup(
         StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(StatusPanelLayout.createSequentialGroup()
            .addComponent(StatusLabel)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      StatusPanelLayout.setVerticalGroup(
         StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StatusPanelLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(StatusLabel))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(StatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(WidgetPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(WidgetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addComponent(StatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void CheckHash(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckHash
      String fileHash = FileHashField.getText();
      String expectedHash = ExpectedHashField.getText();

      if (!(fileHash.equals("") || expectedHash.equals(""))) {
         if (fileHash.equals(expectedHash)) {
            MatchText.setBackground(Color.green);
            MatchText.setText("Match");
         } else {
            MatchText.setBackground(Color.red);
            MatchText.setText("No Match");
         }
      } else {
         MatchText.setBackground(Color.lightGray);
         MatchText.setText("Please give input");
      }
   }//GEN-LAST:event_CheckHash

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
      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(HashFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         @Override
         public void run() {
            new HashFrame().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton CheckHashButton;
   private javax.swing.JTextField ExpectedHashField;
   private javax.swing.JLabel ExpectedHashLabel;
   private javax.swing.JTextField FileHashField;
   private javax.swing.JLabel FileHashLabel;
   private javax.swing.JLabel HashDropLabel;
   private javax.swing.JPanel HashPanel;
   private javax.swing.JPanel HashResultPanel;
   private javax.swing.JPanel HashTestPanel;
   private javax.swing.JLabel MD5Label;
   private javax.swing.JPanel MD5Panel;
   private javax.swing.JLabel MatchText;
   private javax.swing.JLabel SHALabel;
   private javax.swing.JPanel SHAPanel;
   private javax.swing.JLabel StatusLabel;
   private javax.swing.JPanel StatusPanel;
   private javax.swing.JPanel WidgetPanel;
   // End of variables declaration//GEN-END:variables
}