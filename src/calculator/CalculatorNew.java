/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

/**
 *
 * @author Dell_
 */


import EmailSender.EmailSender; 
import javax.swing.*; 
import java.io.*; 
import java.nio.file.*; 
import java.security.*; 
import javax.crypto.*; 
import javax.crypto.spec.SecretKeySpec; 
import java.util.Base64; 
import java.awt.event.*;
public class CalculatorNew extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorNew
     */
    public CalculatorNew() {
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

        jButton11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnViewCalculations = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnSendFile = new javax.swing.JButton();

        jButton11.setText("0");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));

        txtResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calci-Mitra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn2.setText("2");
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, -1));

        btn1.setText("1");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        btn3.setText("3");
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 60, -1));

        btn4.setText("4");
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, -1));

        btn5.setText("5");
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 60, -1));

        btn6.setText("6");
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 60, -1));

        btn7.setText("7");
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, -1));

        btn8.setText("8");
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 60, -1));

        btn9.setText("9");
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 60, -1));

        btn0.setText("0");
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn0MouseClicked(evt);
            }
        });
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, -1));

        btnClear.setText("CE");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 60, -1));

        btnViewCalculations.setText("View");
        btnViewCalculations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewCalculationsMouseClicked(evt);
            }
        });
        btnViewCalculations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCalculationsActionPerformed(evt);
            }
        });
        jPanel2.add(btnViewCalculations, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, 30));

        btnPlus.setText("+");
        btnPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlusMouseClicked(evt);
            }
        });
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        jPanel2.add(btnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 60, -1));

        jButton33.setText("=");
        jButton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton33MouseClicked(evt);
            }
        });
        jPanel2.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 60, -1));

        btnMinus.setText("-");
        btnMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinusMouseClicked(evt);
            }
        });
        jPanel2.add(btnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 60, -1));

        btnMultiplication.setText("*");
        btnMultiplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultiplicationMouseClicked(evt);
            }
        });
        jPanel2.add(btnMultiplication, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 60, -1));

        btnDivision.setText("/");
        btnDivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDivisionMouseClicked(evt);
            }
        });
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 60, -1));

        btnSendFile.setText("Send File");
        btnSendFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSendFileMouseClicked(evt);
            }
        });
        btnSendFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendFileActionPerformed(evt);
            }
        });
        jPanel2.add(btnSendFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    

    private String encrypt(String data, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

 
    private String decrypt(String data, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decodedBytes = Base64.getDecoder().decode(data);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }

    
    private void writeCalculationToFile(String calculation) {
        try {
            String encryptedCalculation = encrypt(calculation, encryptionKey);
            Files.write(Paths.get(calculationsFilePath), 
                (encryptedCalculation + System.lineSeparator()).getBytes(), 
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("File saved at: " + new File(calculationsFilePath).getAbsolutePath());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error writing to file: " + e.getMessage());
        }
    }

    // Read and decrypt calculations from the file
    private void readCalculationsFromFile() {
        try {
            if (!Files.exists(Paths.get(calculationsFilePath))) {
                JOptionPane.showMessageDialog(this, "No calculations file found!");
                return;
            }
          
            String keyInput = JOptionPane.showInputDialog("Enter the decryption key:");
            if (keyInput == null || !keyInput.equals(encryptionKey)) {
                JOptionPane.showMessageDialog(this, "Invalid key!");
                return;
            }
           
            String fileContent = new String(Files.readAllBytes(Paths.get(calculationsFilePath)));
            String[] encryptedCalculations = fileContent.split(System.lineSeparator());
            StringBuilder decryptedContent = new StringBuilder();
            for (String encryptedCalc : encryptedCalculations) {
                decryptedContent.append(decrypt(encryptedCalc, encryptionKey)).append("\n");
            }
        
            JOptionPane.showMessageDialog(this, "Calculations:\n" + decryptedContent.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
        }
    }
    
        private void handleNumberClick(String digit) {
            
    // Append digit to the current input
    String currentText = txtResult.getText();
    txtResult.setText(currentText + digit);
}

   
private void handleOperatorClick(String op) {
    if (!txtResult.getText().isEmpty()) {
        if (!operator.isEmpty()) {
            performOperation(); // Perform the previous operation for chaining
        } else {
            currentResult = Double.parseDouble(txtResult.getText()); 
            expression.append(txtResult.getText()); 
        }
        operator = op; // Store the selected operator
        expression.append(" ").append(getOperatorSymbol(op)).append(" "); 
        txtResult.setText(""); 
    }
}

    
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn0ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnViewCalculationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCalculationsActionPerformed
        // TODO add your handling code here:
        readCalculationsFromFile();
    }//GEN-LAST:event_btnViewCalculationsActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
        handleNumberClick("1");
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        // TODO add your handling code here:
        handleNumberClick("2");
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        // TODO add your handling code here:
        handleNumberClick("3");
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        // TODO add your handling code here:
        handleNumberClick("4");
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        // TODO add your handling code here:
        handleNumberClick("5");
    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        // TODO add your handling code here:
        handleNumberClick("6");
    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        // TODO add your handling code here:
        handleNumberClick("7");
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
        // TODO add your handling code here:
        handleNumberClick("8");
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
        // TODO add your handling code here:
        handleNumberClick("9");
    }//GEN-LAST:event_btn9MouseClicked

    private void btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseClicked
        // TODO add your handling code here:
        handleNumberClick("0");
    }//GEN-LAST:event_btn0MouseClicked

    
     // Clear button handler
private void handleClearClick() {
    txtResult.setText("");
    currentResult = 0.0;
    operator = "";
    expression.setLength(0); // Clear the expression
}

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        handleClearClick();
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnViewCalculationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewCalculationsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCalculationsMouseClicked

    private void btnPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlusMouseClicked
        // TODO add your handling code here:
         handleOperatorClick("plus");
    }//GEN-LAST:event_btnPlusMouseClicked

    private void btnMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinusMouseClicked
        // TODO add your handling code here:
        handleOperatorClick("minus");
    }//GEN-LAST:event_btnMinusMouseClicked

    private void btnMultiplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicationMouseClicked
        // TODO add your handling code here:
        handleOperatorClick("multiplication");
    }//GEN-LAST:event_btnMultiplicationMouseClicked

    private void btnDivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivisionMouseClicked
        // TODO add your handling code here:
        handleOperatorClick("division");
    }//GEN-LAST:event_btnDivisionMouseClicked

        // Perform the selected operation
private void performOperation(){
     if (operator.isEmpty() || txtResult.getText().isEmpty()) {
            txtResult.setText("Error: Invalid Operation");
            return;
        }

        double value2 = Double.parseDouble(txtResult.getText()); // Parse the second operand
        expression.append(txtResult.getText()); // Add operand to expression

        switch (operator) {
            case "plus":
                currentResult += value2;
                break;
            case "minus":
                currentResult -= value2;
                break;
            case "multiplication":
                currentResult *= value2;
                break;
            case "division":
                if (value2 == 0) {
                    txtResult.setText("Error: Division by Zero");
                    operator = ""; 
                    expression.setLength(0); 
                    return;
                }
                currentResult /= value2;
                break;
            default:
                txtResult.setText("Error: Unknown Operator");
                operator = ""; 
                expression.setLength(0);
                return;
        }

        // Log calculation to file
        String calculation = expression.append(" = ").append(currentResult).toString();
        writeCalculationToFile(calculation);

        // Display result and update the expression
        txtResult.setText(Double.toString(currentResult));
        expression = new StringBuilder(); // Reset the expression for next calculations
        operator = ""; // Reset operator for the next calculation
}

// Get operator symbol for display purposes
private String getOperatorSymbol(String op) {
    switch (op) {
        case "plus":
            return "+";
        case "minus":
            return "-";
        case "multiplication":
            return "*";
        case "division":
            return "/";
        default:
            return "";
    }
}
    
    
    private void jButton33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton33MouseClicked
        // TODO add your handling code here:
         performOperation();
    }//GEN-LAST:event_jButton33MouseClicked

    private void btnSendFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendFileActionPerformed

    private void btnSendFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendFileMouseClicked
        String recipientEmail = JOptionPane.showInputDialog(this, "Enter recipient's email address:");
    if (recipientEmail == null || recipientEmail.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Email address cannot be empty!");
        return;
    }

    // Send the email with the calculations file
boolean emailSent = EmailSender.sendEmailWithAttachment(recipientEmail, "Encrypted Calculations File", "Please find the attached file.", calculationsFilePath);
    // Show success message if email was sent
    if (emailSent) {
        JOptionPane.showMessageDialog(this, "Email sent successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to send email.");
    }
    }//GEN-LAST:event_btnSendFileMouseClicked

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
            java.util.logging.Logger.getLogger(CalculatorNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorNew().setVisible(true);
            }
        });
    }

    
    
    
    static int value1;
static int value2;

static private double currentResult = 0.0;

private String operator = "";
private StringBuilder expression = new StringBuilder();
    private final String encryptionKey = "MySecretKey12345"; 
    private final String calculationsFilePath = "calculations.enc";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSendFile;
    private javax.swing.JButton btnViewCalculations;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton33;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}