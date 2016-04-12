package com.github.firecrafty.technicassemblergui;

import com.github.firecrafty.technicassembler.Side;
import com.github.firecrafty.technicassembler.TechnicAssembler;
import com.github.firecrafty.technicassembler.ZipFile;
import com.github.firecrafty.technicassembler.logging.SimpleLogger;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 *
 * @author firecrafty
 */
public class MainWindow extends javax.swing.JFrame {
    private File packDir = TechnicAssembler.getWorkingDirectory();
    protected static SimpleLogger logger = new SimpleLogger("TechnicAssembler", new File("TechnicAssembler.log"));
    private String modpackName;
    private String modpackVersion;
    private boolean buildClient;
    private boolean buildServer;
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        fileChooser = new javax.swing.JFileChooser();
        jOptionPane1 = new javax.swing.JOptionPane();
        modpackDataPanel = new javax.swing.JPanel();
        folderText = new javax.swing.JTextField();
        folderLabel = new javax.swing.JLabel();
        modpackVersionLabel = new javax.swing.JLabel();
        modpackVersionField = new javax.swing.JTextField();
        modpackNameField = new javax.swing.JTextField();
        modpackNameLabel = new javax.swing.JLabel();
        modpackFolderButton = new javax.swing.JButton();
        programControlsPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel("", SwingConstants.CENTER);
        submit = new javax.swing.JButton();
        sidesPanel = new javax.swing.JPanel();
        serverBox = new javax.swing.JCheckBox();
        clientBox = new javax.swing.JCheckBox();

        fileChooser.setCurrentDirectory(TechnicAssembler.getWorkingDirectory());
        fileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setName(""); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TechnicAssembler");
        setName("MainFrame"); // NOI18N
        setResizable(false);

        folderText.setEditable(false);
        folderText.setText(TechnicAssembler.getWorkingDirectory().toString());

        folderLabel.setText("Modpack Folder");
        folderLabel.setToolTipText("Defaults to current directory");

        modpackVersionLabel.setText("Modpack Version");

        modpackVersionField.setText("0.0.0");

        modpackNameField.setText("Modpack");
        modpackNameField.setToolTipText("");

        modpackNameLabel.setText("Modpack Name");

        modpackFolderButton.setText("Browse");
        modpackFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modpackFolderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modpackDataPanelLayout = new javax.swing.GroupLayout(modpackDataPanel);
        modpackDataPanel.setLayout(modpackDataPanelLayout);
        modpackDataPanelLayout.setHorizontalGroup(
            modpackDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modpackDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modpackDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modpackNameLabel)
                    .addComponent(modpackVersionLabel)
                    .addComponent(folderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(modpackDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modpackNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modpackVersionField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(modpackDataPanelLayout.createSequentialGroup()
                        .addComponent(folderText, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modpackFolderButton)))
                .addContainerGap())
        );
        modpackDataPanelLayout.setVerticalGroup(
            modpackDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modpackDataPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(modpackDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modpackNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modpackNameLabel))
                .addGap(18, 18, 18)
                .addGroup(modpackDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modpackVersionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modpackVersionLabel))
                .addGap(18, 18, 18)
                .addGroup(modpackDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(folderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(folderLabel)
                    .addComponent(modpackFolderButton))
                .addContainerGap())
        );

        statusLabel.setText("Ready");

        submit.setText("Zip Modpack");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        serverBox.setSelected(buildServer);
        serverBox.setText("Build Server");
        serverBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverBoxActionPerformed(evt);
            }
        });

        clientBox.setSelected(buildClient);
        clientBox.setText("Build Client");
        clientBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidesPanelLayout = new javax.swing.GroupLayout(sidesPanel);
        sidesPanel.setLayout(sidesPanelLayout);
        sidesPanelLayout.setHorizontalGroup(
            sidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serverBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidesPanelLayout.setVerticalGroup(
            sidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverBox)
                    .addComponent(clientBox)))
        );

        javax.swing.GroupLayout programControlsPanelLayout = new javax.swing.GroupLayout(programControlsPanel);
        programControlsPanel.setLayout(programControlsPanelLayout);
        programControlsPanelLayout.setHorizontalGroup(
            programControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(programControlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(programControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(programControlsPanelLayout.createSequentialGroup()
                        .addComponent(sidesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        programControlsPanelLayout.setVerticalGroup(
            programControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, programControlsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sidesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modpackDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(programControlsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modpackDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(programControlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       submit.setEnabled(false);
       parseData();
       TechnicAssembler.setModpackName(modpackName);
       TechnicAssembler.setModpackVersion(modpackVersion);
       TechnicAssembler.setPackDir(packDir);
       zipContents();
       statusLabel.setText("Modpack Build Successfully");
       submit.setEnabled(true);
    }//GEN-LAST:event_submitActionPerformed

    private void modpackFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modpackFolderButtonActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            folderText.setText(fileChooser.getSelectedFile().toString());
            packDir = fileChooser.getSelectedFile();
        }
    }//GEN-LAST:event_modpackFolderButtonActionPerformed

    private void serverBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverBoxActionPerformed
        buildServer = !buildServer;
    }//GEN-LAST:event_serverBoxActionPerformed

    private void clientBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientBoxActionPerformed
        buildClient = !buildClient;
    }//GEN-LAST:event_clientBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        logger.startLog();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() { logger.stopLog(); }
        });
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox clientBox;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel folderLabel;
    private javax.swing.JTextField folderText;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel modpackDataPanel;
    private javax.swing.JButton modpackFolderButton;
    private javax.swing.JTextField modpackNameField;
    private javax.swing.JLabel modpackNameLabel;
    private javax.swing.JTextField modpackVersionField;
    private javax.swing.JLabel modpackVersionLabel;
    private javax.swing.JPanel programControlsPanel;
    private javax.swing.JCheckBox serverBox;
    private javax.swing.JPanel sidesPanel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
    private void parseData() {
        modpackName = modpackNameField.getText();
        modpackVersion = modpackVersionField.getText();
    }
    private void zipContents() {
        ZipFile zipFile;
        if(buildClient) {
            logger.info("Zipping client...");
            zipFile = new ZipFile(Side.CLIENT);
            zipFile.generateFileList();
            zipFile.zipIt();
        }
        if(buildServer) {
            logger.info("Zipping server...");
            zipFile = new ZipFile(Side.SERVER);
            zipFile.generateFileList();
            zipFile.zipIt();
        }
    }
}
