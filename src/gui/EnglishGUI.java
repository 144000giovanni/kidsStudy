/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.Random;
import javax.swing.SwingConstants; 

/**
 *
 * @author giovanni
 */
public class EnglishGUI extends javax.swing.JFrame {

    int fontSize = 40;
    int vowelPosition = 0;
    int consonantPosition = 0;
    String fontType = "Dialog";
    /**
     * Creates new form English
     */
    public EnglishGUI() {
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

        jFrame2 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        vowel_display1 = new javax.swing.JLabel();
        consonant_display1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        big_font1 = new javax.swing.JButton();
        small_font1 = new javax.swing.JButton();
        lowercase_display1 = new javax.swing.JButton();
        uppercase_display1 = new javax.swing.JButton();
        font_size_display1 = new javax.swing.JTextField();
        scramble1 = new javax.swing.JButton();
        change_consonant1 = new javax.swing.JButton();
        change_vowel1 = new javax.swing.JButton();
        vowel_display2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        vowel_display = new javax.swing.JLabel();
        consonant_display = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        big_font = new javax.swing.JButton();
        small_font = new javax.swing.JButton();
        lowercase_display = new javax.swing.JButton();
        uppercase_display = new javax.swing.JButton();
        font_size_display = new javax.swing.JTextField();
        scramble = new javax.swing.JButton();
        change_consonant = new javax.swing.JButton();
        change_vowel = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        vowel_display1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        vowel_display1.setText("vowel");

        consonant_display1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        consonant_display1.setText("consonant");

        jButton2.setText("ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        big_font1.setText("BIG");
        big_font1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                big_font1ActionPerformed(evt);
            }
        });

        small_font1.setText("small");
        small_font1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                small_font1ActionPerformed(evt);
            }
        });

        lowercase_display1.setText("lower");
        lowercase_display1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowercase_display1ActionPerformed(evt);
            }
        });

        uppercase_display1.setText("UPPER");
        uppercase_display1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppercase_display1ActionPerformed(evt);
            }
        });

        font_size_display1.setText("jTextField1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(small_font1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uppercase_display1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lowercase_display1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(font_size_display1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(big_font1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(big_font1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(font_size_display1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(small_font1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(uppercase_display1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lowercase_display1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        scramble1.setText("Scramble");
        scramble1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scramble1ActionPerformed(evt);
            }
        });

        change_consonant1.setText("Change Consonant");
        change_consonant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_consonant1ActionPerformed(evt);
            }
        });

        change_vowel1.setText("Change Vowel");
        change_vowel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_vowel1ActionPerformed(evt);
            }
        });

        vowel_display2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        vowel_display2.setText("vowel");
        vowel_display2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vowel_display2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(scramble1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(change_consonant1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(change_vowel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(consonant_display1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(vowel_display1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vowel_display2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(consonant_display1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vowel_display1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vowel_display2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(316, 316, 316)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(change_consonant1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(change_vowel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(scramble1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jFrame2.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        vowel_display.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        vowel_display.setText("vowel");

        consonant_display.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        consonant_display.setText("consonant");

        jButton1.setText("ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        big_font.setText("BIG");
        big_font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                big_fontActionPerformed(evt);
            }
        });

        small_font.setText("small");
        small_font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                small_fontActionPerformed(evt);
            }
        });

        lowercase_display.setText("lower");
        lowercase_display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowercase_displayActionPerformed(evt);
            }
        });

        uppercase_display.setText("UPPER");
        uppercase_display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppercase_displayActionPerformed(evt);
            }
        });

        font_size_display.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(small_font, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uppercase_display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lowercase_display, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(font_size_display, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(big_font, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(big_font, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(font_size_display))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(small_font, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(uppercase_display, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(lowercase_display, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        scramble.setText("Scramble");
        scramble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrambleActionPerformed(evt);
            }
        });

        change_consonant.setText("Change Consonant");
        change_consonant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_consonantActionPerformed(evt);
            }
        });

        change_vowel.setText("Change Vowel");
        change_vowel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_vowelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(consonant_display, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(vowel_display, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(scramble, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(change_consonant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(change_vowel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(consonant_display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vowel_display, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(change_consonant, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(change_vowel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(scramble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );

        jMenu3.setText("File");

        jMenu5.setText("jMenu5");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu5);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void big_fontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_big_fontActionPerformed
        // TODO add your handling code here:
        fontSize = fontSize + 20;
        vowel_display.setFont(new java.awt.Font(fontType, 0, fontSize));
        consonant_display.setFont(new java.awt.Font(fontType, 0, fontSize));
        font_size_display.setText(Integer.toString(fontSize));
    }//GEN-LAST:event_big_fontActionPerformed

    private void small_fontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_small_fontActionPerformed
        // TODO add your handling code here:
        fontSize = fontSize - 20;
        vowel_display.setFont(new java.awt.Font(fontType, 0, fontSize));
        consonant_display.setFont(new java.awt.Font(fontType, 0, fontSize));
    }//GEN-LAST:event_small_fontActionPerformed

    private void lowercase_displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowercase_displayActionPerformed
        // TODO add your handling code here:
                consonant_display.setHorizontalAlignment(SwingConstants.RIGHT);
        if (consonantPosition==21)
        {
            consonantPosition = 0;
        }
        String cons = "bcdfghjklmnpqrstvwxyz";
        char[] consonants =  cons.toCharArray();
        String aConsonant = Character.toString(consonants[consonantPosition]);
        consonant_display.setText(aConsonant);
        consonantPosition++;
        
         String vow = "aeiou";
        char[] vowels = vow.toCharArray();
        String aVowel = Character.toString(vowels[vowelPosition]);
        vowel_display.setText(aVowel);
        vowelPosition++;
        if (vowelPosition==5)
        {
            vowelPosition = 0;
        }
        vowel_display.setText(vowel_display.getText().toLowerCase());
        consonant_display.setText(consonant_display.getText().toLowerCase());
                
    }//GEN-LAST:event_lowercase_displayActionPerformed

    private void uppercase_displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppercase_displayActionPerformed
        // TODO add your handling code here:
        consonant_display.setHorizontalAlignment(SwingConstants.RIGHT);
        if (consonantPosition==21)
        {
            consonantPosition = 0;
        }
        String cons = "bcdfghjklmnpqrstvwxyz";
        char[] consonants =  cons.toCharArray();
        String aConsonant = Character.toString(consonants[consonantPosition]);
        consonant_display.setText(aConsonant);
        consonantPosition++;
        
         String vow = "aeiou";
        char[] vowels = vow.toCharArray();
        String aVowel = Character.toString(vowels[vowelPosition]);
        vowel_display.setText(aVowel);
        vowelPosition++;
        if (vowelPosition==5)
        {
            vowelPosition = 0;
        }
        vowel_display.setText(vowel_display.getText().toUpperCase());
        consonant_display.setText(consonant_display.getText().toUpperCase());
        
    }//GEN-LAST:event_uppercase_displayActionPerformed

    private void scrambleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrambleActionPerformed
        // TODO add your handling code here:
        Random randomCons = new Random();
        Random randomVow = new Random();
        String cons = "bcdfghjklmnpqrstvwxyz";
        String vow = "aeiou";
        char[] consonants =  cons.toCharArray();
        char[] vowels = vow.toCharArray();
        char randomConsonant = cons.charAt(randomCons.nextInt(cons.length()));
        String aConsonant = Character.toString(randomConsonant);
        consonant_display.setText(aConsonant);
        consonant_display.setHorizontalAlignment(SwingConstants.RIGHT);
        char randomVowel = vow.charAt(randomVow.nextInt(vow.length()));
        String aVowel = Character.toString(randomVowel);


    }//GEN-LAST:event_scrambleActionPerformed

    private void change_consonantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_consonantActionPerformed
        // TODO add your handling code here:
        consonant_display.setHorizontalAlignment(SwingConstants.RIGHT);
        if (consonantPosition==21)
        {
            consonantPosition = 0;
        }
        String cons = "bcdfghjklmnpqrstvwxyz";
        char[] consonants =  cons.toCharArray();
        String aConsonant = Character.toString(consonants[consonantPosition]);
        consonant_display.setText(aConsonant);
        consonantPosition++;
 
    }//GEN-LAST:event_change_consonantActionPerformed

    private void change_vowelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_vowelActionPerformed
        // TODO add your handling code here:
        String vow = "aeiou";
        char[] vowels = vow.toCharArray();
        String aVowel = Character.toString(vowels[vowelPosition]);
        vowel_display.setText(aVowel);
        vowelPosition++;
        if (vowelPosition==5)
        {
            vowelPosition = 0;
        }
        
    }//GEN-LAST:event_change_vowelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void big_font1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_big_font1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_big_font1ActionPerformed

    private void small_font1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_small_font1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_small_font1ActionPerformed

    private void lowercase_display1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowercase_display1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowercase_display1ActionPerformed

    private void uppercase_display1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppercase_display1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uppercase_display1ActionPerformed

    private void scramble1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scramble1ActionPerformed
        // TODO add your handling code here:
        Random randomCons = new Random();
        Random randomVow = new Random();
        String cons = "bcdfghjklmnpqrstvwxyz";
        String vow = "aeiou";
        char[] consonants =  cons.toCharArray();
        char[] vowels = vow.toCharArray();
        char randomConsonant = cons.charAt(randomCons.nextInt(cons.length()));
        String aConsonant = Character.toString(randomConsonant);
        consonant_display1.setText(aConsonant);
        consonant_display1.setHorizontalAlignment(SwingConstants.RIGHT);
        char randomVowel = vow.charAt(randomVow.nextInt(vow.length()));
        char randomVowel2 = vow.charAt(randomVow.nextInt(vow.length()));
        String aVowel = Character.toString(randomVowel);
        String aVowel2 = Character.toString(randomVowel2);
        vowel_display1.setText(aVowel);
        vowel_display2.setText(aVowel2);
    }//GEN-LAST:event_scramble1ActionPerformed

    private void change_consonant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_consonant1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_change_consonant1ActionPerformed

    private void change_vowel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_vowel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_change_vowel1ActionPerformed

    private void vowel_display2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vowel_display2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_vowel_display2MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        jFrame2.setVisible(true);
        
    }//GEN-LAST:event_jMenu5MouseClicked

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
            java.util.logging.Logger.getLogger(EnglishGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnglishGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnglishGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnglishGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnglishGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton big_font;
    private javax.swing.JButton big_font1;
    private javax.swing.JButton change_consonant;
    private javax.swing.JButton change_consonant1;
    private javax.swing.JButton change_vowel;
    private javax.swing.JButton change_vowel1;
    private javax.swing.JLabel consonant_display;
    private javax.swing.JLabel consonant_display1;
    private javax.swing.JTextField font_size_display;
    private javax.swing.JTextField font_size_display1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton lowercase_display;
    private javax.swing.JButton lowercase_display1;
    private javax.swing.JButton scramble;
    private javax.swing.JButton scramble1;
    private javax.swing.JButton small_font;
    private javax.swing.JButton small_font1;
    private javax.swing.JButton uppercase_display;
    private javax.swing.JButton uppercase_display1;
    private javax.swing.JLabel vowel_display;
    private javax.swing.JLabel vowel_display1;
    private javax.swing.JLabel vowel_display2;
    // End of variables declaration//GEN-END:variables
}
