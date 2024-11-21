/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

/**
 *
 * @author daytr
 */
public class ColorGeneratorForm extends javax.swing.JFrame {

    /**
     * Creates new form ColorGeneratorForm
     */
    public ColorGeneratorForm() {
        initComponents();
        Notifications.getInstance().setJFrame(this);
        generateButton.putClientProperty(FlatClientProperties.STYLE, "arc:23");
//        HexField.putClientProperty(FlatClientProperties.STYLE, "arc:23");
        copyButton.putClientProperty(FlatClientProperties.STYLE, "arc:23");
    }

    private Color getContrastingColor(Color backgroundColor) {
        // Calculate the brightness of the background color
        int brightness = (int) Math.sqrt(
                backgroundColor.getRed() * backgroundColor.getRed() * 0.241
                + backgroundColor.getGreen() * backgroundColor.getGreen() * 0.691
                + backgroundColor.getBlue() * backgroundColor.getBlue() * 0.068
        );
        // Return black or white text color based on brightness
        return brightness > 130 ? Color.BLACK : Color.WHITE;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorPanel = new javax.swing.JPanel();
        hexLabel = new javax.swing.JLabel();
        generateButton = new javax.swing.JButton();
        HexField = new javax.swing.JTextField();
        copyButton = new javax.swing.JButton();
        palettePanel = new javax.swing.JPanel();
        color1Panel = new javax.swing.JPanel();
        color2Panel = new javax.swing.JPanel();
        color3Panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        applyButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Random Color Generator");
        setResizable(false);

        hexLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        hexLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hexLabel.setText("Click 'Generate Color' to Start!");

        generateButton.setText("Generate Color");
        generateButton.setToolTipText("Click to generate Color");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        HexField.setEditable(false);
        HexField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        HexField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        copyButton.setText("Copy Hex Code");
        copyButton.setToolTipText("Click to copy the color's hex code to the clipboard");
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generateButton, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hexLabel, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(colorPanelLayout.createSequentialGroup()
                        .addComponent(HexField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(copyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hexLabel)
                .addGap(30, 30, 30)
                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HexField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        palettePanel.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout color1PanelLayout = new javax.swing.GroupLayout(color1Panel);
        color1Panel.setLayout(color1PanelLayout);
        color1PanelLayout.setHorizontalGroup(
            color1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );
        color1PanelLayout.setVerticalGroup(
            color1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        palettePanel.add(color1Panel);

        javax.swing.GroupLayout color2PanelLayout = new javax.swing.GroupLayout(color2Panel);
        color2Panel.setLayout(color2PanelLayout);
        color2PanelLayout.setHorizontalGroup(
            color2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );
        color2PanelLayout.setVerticalGroup(
            color2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        palettePanel.add(color2Panel);

        javax.swing.GroupLayout color3PanelLayout = new javax.swing.GroupLayout(color3Panel);
        color3Panel.setLayout(color3PanelLayout);
        color3PanelLayout.setHorizontalGroup(
            color3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );
        color3PanelLayout.setVerticalGroup(
            color3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        palettePanel.add(color3Panel);

        applyButton.setText("Apply Palette");
        applyButton.setToolTipText("Click to add colors to the components");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset Colors");
        resetButton.setToolTipText("Click here to set all default");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(applyButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyButton)
                    .addComponent(resetButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(palettePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(palettePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        Random random = new Random();

        // Base color
        int baseRed = random.nextInt(256);
        int baseGreen = random.nextInt(256);
        int baseBlue = random.nextInt(256);
        Color baseColor = new Color(baseRed, baseGreen, baseBlue);

        // Generate palette colors with slight variations
        Color color1 = new Color((baseRed + 30) % 256, (baseGreen + 60) % 256, (baseBlue + 90) % 256);
        Color color2 = new Color((baseRed + 60) % 256, (baseGreen + 30) % 256, (baseBlue + 45) % 256);
        Color color3 = new Color((baseRed + 90) % 256, (baseGreen + 45) % 256, (baseBlue + 60) % 256);

        // Apply the base color to the main panel
        colorPanel.setBackground(baseColor);

        // Apply palette colors to preview panels
        color1Panel.setBackground(color1);
        color2Panel.setBackground(color2);
        color3Panel.setBackground(color3);

        // Display the base color's hex code
        HexField.setText(String.format("#%02x%02x%02x", baseRed, baseGreen, baseBlue).toUpperCase());

    }//GEN-LAST:event_generateButtonActionPerformed

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        String hexCode = HexField.getText(); // Get the hex code from the label
        StringSelection stringSelection = new StringSelection(hexCode);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Hex code copied to clipboard: " + hexCode + " Copied");

    }//GEN-LAST:event_copyButtonActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        applyButton.setBackground(color1Panel.getBackground());
        applyButton.setForeground(getContrastingColor(applyButton.getBackground()));

        resetButton.setBackground(color2Panel.getBackground());
        resetButton.setForeground(getContrastingColor(resetButton.getBackground()));

        generateButton.setBackground(color3Panel.getBackground());
        generateButton.setForeground(getContrastingColor(generateButton.getBackground()));

        HexField.setForeground(colorPanel.getBackground()); // Contrast text with base color

        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Color palette applied to the UI!");

    }//GEN-LAST:event_applyButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // Reset colors to default
        generateButton.setBackground(null);
        generateButton.setForeground(null);

        applyButton.setBackground(null);
        applyButton.setForeground(null);

        resetButton.setBackground(null);
        resetButton.setForeground(null);

        colorPanel.setBackground(null);
        color1Panel.setBackground(null);
        color2Panel.setBackground(null);
        color3Panel.setBackground(null);

        HexField.setForeground(null);
        HexField.setText("");

        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Colors reset to default!");

    }//GEN-LAST:event_resetButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorGeneratorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HexField;
    private javax.swing.JButton applyButton;
    private javax.swing.JPanel color1Panel;
    private javax.swing.JPanel color2Panel;
    private javax.swing.JPanel color3Panel;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JButton copyButton;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel hexLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel palettePanel;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
