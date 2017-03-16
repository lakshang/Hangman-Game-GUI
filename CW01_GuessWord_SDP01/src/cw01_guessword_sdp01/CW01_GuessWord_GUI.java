package cw01_guessword_sdp01;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author **Lakshan Gunarathne** **UoW : w1584534** **IIT : 2014286**
 */
public class CW01_GuessWord_GUI extends javax.swing.JFrame {

    static String hiddenWord; //Store the hidden word

    static ArrayList<JLabel> label_list = new ArrayList<>(); //Store the labels

    static String wrongLetters = "Letter Entered : "; //Store the letters entered

    int countIncorrect = 0; //Store the incorrect count

    public CW01_GuessWord_GUI() {

        initComponents();

        //add all labels to the list
        addLabels();

        //clear & hide all the labels
        setDefault();

        hiddenWord = new getValue().start(0);//Get the 0 index word

        for (int i = 0; i < hiddenWord.length(); i++) {

            label_list.get(i).setVisible(true);//Visible the label list
        }

        //Sets all the label visibilities to hidden.
        lblHead.setVisible(false);
        lblBody.setVisible(false);
        lblHandl.setVisible(false);
        lblHandr.setVisible(false);
        lblLegl.setVisible(false);
        lblLegr.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        char0 = new javax.swing.JLabel();
        char1 = new javax.swing.JLabel();
        char2 = new javax.swing.JLabel();
        char3 = new javax.swing.JLabel();
        char4 = new javax.swing.JLabel();
        txtLetter = new javax.swing.JTextField();
        lblCount = new javax.swing.JLabel();
        btnTry = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        char5 = new javax.swing.JLabel();
        char6 = new javax.swing.JLabel();
        char7 = new javax.swing.JLabel();
        char8 = new javax.swing.JLabel();
        char9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblWrongLetter = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        lblHead = new javax.swing.JLabel();
        lblBody = new javax.swing.JLabel();
        lblHandl = new javax.swing.JLabel();
        lblHandr = new javax.swing.JLabel();
        lblLegl = new javax.swing.JLabel();
        lblLegr = new javax.swing.JLabel();
        lblMainimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Hangman");

        char0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        char0.setText("X");

        char1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        char1.setText("X");

        char2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        char2.setText("X");

        char3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        char3.setText("X");

        char4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        char4.setText("X");

        txtLetter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLetter.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLetterActionPerformed(evt);
            }
        });
        txtLetter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLetterKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLetterKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLetterKeyTyped(evt);
            }
        });

        lblCount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCount.setForeground(new java.awt.Color(255, 0, 0));
        lblCount.setText("0");

        btnTry.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTry.setForeground(new java.awt.Color(0, 0, 204));
        btnTry.setText("Try Letter");
        btnTry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTryActionPerformed(evt);
            }
        });

        lblMessage.setBackground(new java.awt.Color(255, 255, 255));
        lblMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        char5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        char5.setText("X");

        char6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        char6.setText("X");

        char7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        char7.setText("X");

        char8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        char8.setText("X");

        char9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        char9.setText("X");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Incorrect Count :");

        lblWrongLetter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblWrongLetter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCount))
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(char0)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(char1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(char2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(char3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(char4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(char5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(char6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(char7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(char8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(char9)))
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(btnTry)
                        .addGap(41, 205, Short.MAX_VALUE))))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(char0)
                    .addComponent(char1)
                    .addComponent(char2)
                    .addComponent(char3)
                    .addComponent(char4)
                    .addComponent(char5)
                    .addComponent(char6)
                    .addComponent(char7)
                    .addComponent(char8)
                    .addComponent(char9))
                .addGap(35, 35, 35)
                .addComponent(txtLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnTry)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCount)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWrongLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        lblHead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cw01_guessword_sdp01/head.jpg"))); // NOI18N
        jPanel1.add(lblHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        lblBody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cw01_guessword_sdp01/body.png"))); // NOI18N
        jPanel1.add(lblBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 80));

        lblHandl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cw01_guessword_sdp01/handR.jpg"))); // NOI18N
        jPanel1.add(lblHandl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        lblHandr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cw01_guessword_sdp01/handL.png"))); // NOI18N
        jPanel1.add(lblHandr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        lblLegl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cw01_guessword_sdp01/legL.png"))); // NOI18N
        jPanel1.add(lblLegl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        lblLegr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cw01_guessword_sdp01/legR.png"))); // NOI18N
        jPanel1.add(lblLegr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        lblMainimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cw01_guessword_sdp01/Han.jpg"))); // NOI18N
        jPanel1.add(lblMainimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTryActionPerformed

        String letterGuess = txtLetter.getText().toLowerCase();//Gets the text and converts to lower case.

        if (!letterGuess.isEmpty()) {//Checks the text box is empty.

            if (letterGuess.charAt(0) < 'a' || letterGuess.charAt(0) > 'z') {

                lblMessage.setText("Invalid Input. Please enter a Letter");
                //Check whether the input is Alphabetical.

            } else {

                boolean isMatched = false; //Sets a boolean expression to deafult

                for (int j = 0; j < hiddenWord.length(); j++) {

                    if (hiddenWord.charAt(j) == letterGuess.charAt(0)) {
                        //guess letter match with typed letter

                        //update the labels and visible it
                        label_list.get(j).setText(letterGuess);
                        label_list.get(j).setVisible(true);

                        //get the match result
                        matchResult();

                        isMatched = true;

                    }
                }

                if (!isMatched) {

                    //typed letter is incorrect
                    countIncorrect++;
                    lblCount.setText(String.valueOf(countIncorrect));

                    wrongLetters += txtLetter.getText() + ",";
                    lblWrongLetter.setText(wrongLetters);

                    if (countIncorrect == 1) {
                        lblHead.setVisible(true);
                    } else if (countIncorrect == 2) {
                        lblBody.setVisible(true);
                    } else if (countIncorrect == 3) {
                        lblHandl.setVisible(true);
                    } else if (countIncorrect == 4) {
                        lblHandr.setVisible(true);
                    } else if (countIncorrect == 5) {
                        lblLegl.setVisible(true);
                    } else if (countIncorrect == 6) {
                        lblLegr.setVisible(true);
                        lblMessage.setText("Oops ! Bad Luck ! You didn't win.Game over :(");

                        //if game over,disable try button
                        btnTry.setEnabled(false);

                    }

                }
            }

        } else {
            lblMessage.setText("Input not provided");
        }

        txtLetter.setText("");
        txtLetter.grabFocus();

    }//GEN-LAST:event_btnTryActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtLetterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLetterKeyReleased

    private void txtLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLetterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLetterActionPerformed

    private void txtLetterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetterKeyPressed
        txtLetter.setText("");
    }//GEN-LAST:event_txtLetterKeyPressed

    private void txtLetterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetterKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLetterKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CW01_GuessWord_GUI().setVisible(true);
            }
        });
    }

    private void matchResult() {

        boolean isEnd = true;//Sets a boolean expression

        for (int i = 0; i < hiddenWord.length(); i++) {

            if (label_list.get(i).getText().equals("X")) {

                isEnd = false;

            }

        }

        if (isEnd) {

            //all the labels are filled.won the match
            lblMessage.setText("Congratulations ! You Won ! :) ");

            int i = JOptionPane.showConfirmDialog(this, "Do you want to continue?", "Continue", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

            if (i == JOptionPane.YES_OPTION) {
                //continue the game
                reset();

            } else {
                //end the game
                System.exit(0);

            }

        }

    }
    
    private void addLabels() {

        label_list.add(char0);
        label_list.add(char1);
        label_list.add(char2);
        label_list.add(char3);
        label_list.add(char4);
        label_list.add(char5);
        label_list.add(char6);
        label_list.add(char7);
        label_list.add(char8);
        label_list.add(char9);
        //Method to add up "X".
    }

    private void setDefault() {

        for (int i = 0; i < label_list.size(); i++) {

            label_list.get(i).setText("X");
            label_list.get(i).setVisible(false);

        }
    }

    public void reset() {

        btnTry.setEnabled(true);//enable the try button

        setDefault();//clear all the labels & hide;

        countIncorrect = 0; //reset the incorrect count

        hiddenWord = new getValue().start(1); //Get the random word

        for (int i = 0; i < hiddenWord.length(); i++) {

            label_list.get(i).setVisible(true);//visible the label

        }

        txtLetter.setText("");

        wrongLetters = "Letter Entered : ";
        lblWrongLetter.setText("");

        lblMessage.setText("");
        lblCount.setText(String.valueOf(countIncorrect));

        lblHead.setVisible(false);
        lblBody.setVisible(false);
        lblHandl.setVisible(false);
        lblHandr.setVisible(false);
        lblLegl.setVisible(false);
        lblLegr.setVisible(false);

        txtLetter.grabFocus();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTry;
    private javax.swing.JLabel char0;
    private javax.swing.JLabel char1;
    private javax.swing.JLabel char2;
    private javax.swing.JLabel char3;
    private javax.swing.JLabel char4;
    private javax.swing.JLabel char5;
    private javax.swing.JLabel char6;
    private javax.swing.JLabel char7;
    private javax.swing.JLabel char8;
    private javax.swing.JLabel char9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBody;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblHandl;
    private javax.swing.JLabel lblHandr;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblLegl;
    private javax.swing.JLabel lblLegr;
    private javax.swing.JLabel lblMainimage;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblWrongLetter;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField txtLetter;
    // End of variables declaration//GEN-END:variables
}
