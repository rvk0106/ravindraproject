/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ravindhra_project;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author fmalik24
 */
public class myCalculatorForm extends javax.swing.JFrame {

    /**
     * Creates new form myCalculatorForm
     */
    RiskController obj;
    public int firstButton;
    public int secondButton;
   
     ArrayList <JLabel> labelArray = new ArrayList<>();
    
    
    private Component frame;
    public myCalculatorForm() {
        initComponents();
        firstButton = 0;
        secondButton = 0;
      
        obj = new RiskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        continentsList = new java.awt.List();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        stateList = new java.awt.List();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        CapitalList = new java.awt.List();
        SaveButton = new javax.swing.JButton();
        LoadButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        countriesList = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel6ComponentHidden(evt);
            }
        });
        jPanel6.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel6ComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("CONTINENTS");

        continentsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continentsListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButton1)
                                .addGap(21, 21, 21)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(continentsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(continentsList, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setText("State ");

        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        stateList.setName("stateList"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stateList, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setText("Capital");

        jButton7.setText("+");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(CapitalList, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CapitalList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        SaveButton.setText("SAVE");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        LoadButton.setText("Load");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(610, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("COUNTRIES");

        countriesList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(countriesList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countriesList, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(227, 227, 227)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(298, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            Graphics g = jPanel6.getGraphics(); 
                   
           g.setColor(Color.red);
           g.drawLine(10, 10, 100, 100);   
           jPanel6.updateUI();
          
        
 int repeatCheck = 0; 
 if(continentsList.getItemCount() < 3)
 {
    String s = (String)JOptionPane.showInputDialog("Name your Continent");
    
    
    if(s != null && s.length() > 0 )
    {
     
    String[] check = continentsList.getItems();
    
    for(int i = 0; i < check.length ; i++)
    {
        if(s.equalsIgnoreCase(check[i]))
        {
            JOptionPane.showMessageDialog(frame, "Cannot Repeat Enteries");
            repeatCheck = 1;
            break;
        }
        else
        {
            repeatCheck = 0;
        }
    }
        if(repeatCheck == 0)
        {
        continentsList.add(s);
        InfoSingelton te = InfoSingelton.getInstance();
        te.singleCountries = continentsList.getItems();
        te.singleContinentName = s;
        obj.ContinentCreated();
        }
    
    }
    else
    {
        JOptionPane.showMessageDialog(frame, "Invalid Input");
    }
 }
 else
 {
     JOptionPane.showMessageDialog(frame, "Cant add more than 3");
 }
        
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if(continentsList.getSelectedIndex() >= 0)
        {
        
            if(continentsList.getItemCount() > 0)
            {
                JOptionPane.showMessageDialog(frame,"This would remove a continent");
                continentsList.remove(continentsList.getSelectedItem());  
            }
            else
            {
                JOptionPane.showMessageDialog(frame, "There are no contients that can be removed");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(frame, "Select a Continent from the list first!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void continentsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continentsListActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_continentsListActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        int repeatCheck = 0; 
 if(continentsList.getItemCount() > 0 )
 {
    String s = (String)JOptionPane.showInputDialog("Name your Country");

    
            Font Abc = new Font("Helvetica", Font.PLAIN, 20);  
            
   //    jPanel2.setBackground(Color.red);       
    
    if(s != null && s.length() > 0 )
    {
     
    String[] check = countriesList.getItems();
    
    String[] continentsArray = continentsList.getItems();
    
    for(int i = 0; i < check.length ; i++)
    {
        if(s.equalsIgnoreCase(check[i]))
        {
            JOptionPane.showMessageDialog(frame, "Cannot Repeat Enteries");
            repeatCheck = 1;
            break;
        }
        else
        {
            repeatCheck = 0;
        }
    }
        if(repeatCheck == 0)
        {
            Object showInputDialog = JOptionPane.showInputDialog(frame, "Pick a Continent", "Input", JOptionPane.QUESTION_MESSAGE,
                                    null, continentsArray, "Titan");
            
            String contiName = showInputDialog.toString();
         
            
            
         countriesList.add(s);
         
         
         InfoSingelton te = InfoSingelton.getInstance();
       
        te.singleContinentName = contiName;
        te.singleCountryName = s;
        obj.CountryCreated();
        
         if(countriesList.getItemCount() > 3)
         {
         
         
         countriesList.setForeground(Color.red);
         }
        }
    
    }
    else
    {
        JOptionPane.showMessageDialog(frame, "Invalid Input");
    }
 }
 else
 {
     JOptionPane.showMessageDialog(frame, "Add a continet first");
 }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         if(countriesList.getItemCount() > 0)
        {
            JOptionPane.showMessageDialog(frame,
            "This would remove a country");
            countriesList.remove(countriesList.getItemCount() - 1);  
        }
        else
        {
            JOptionPane.showMessageDialog(frame, "There are no countries that can be removed");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            ArrayList <String> neighbours = new ArrayList<>();
            
        int repeatCheck = 0; 
 if(countriesList.getItemCount() > 0 )
 {
    String s = (String)JOptionPane.showInputDialog("Name your State");

    
            Font Abc = new Font("Helvetica", Font.PLAIN, 20);  
            
              
    
    if(s != null && s.length() > 0 )
    {
     
    String[] check = stateList.getItems();
    
    String[] countryArray = countriesList.getItems();
    
    for(int i = 0; i < check.length ; i++)
    {
        if(s.equalsIgnoreCase(check[i]))
        {
            JOptionPane.showMessageDialog(frame, "Cannot Repeat Enteries");
            repeatCheck = 1;
            break;
        }
        else
        {
            repeatCheck = 0;
        }
    }
        if(repeatCheck == 0)
        {
        
        
       Object countryItBelongsTo =  JOptionPane.showInputDialog(frame, "Pick a country", "Input", JOptionPane.QUESTION_MESSAGE,
        null, countryArray, "Titan");
         
         if(check.length > 0)
         {
             
         int getInfo = 0;
         
          
            while(getInfo == 0)
            {   
            Object showInputDialog = JOptionPane.showInputDialog(frame, "Pick a neighbour", "Input", JOptionPane.QUESTION_MESSAGE,
                                    null, check, "Titan");
            neighbours.add(showInputDialog.toString());
            Object info = "Do you want to add another neighbour";
                //JOptionPane.showInternalConfirmDialog(frame, info, "Help", 1);
            getInfo = JOptionPane.showConfirmDialog(frame, info);
         
                if(getInfo != 0)
                {
                break;
                }
            }  
         } 
          stateList.add(s);
          
         InfoSingelton te;
         te = InfoSingelton.getInstance();
        
         te.singleStateName = s;
         te.singleCountryName = countryItBelongsTo.toString();
         te.singleNeighbours = neighbours;
         
          obj.StateCreated();
        
        
        
    
    }
    else
    {
        JOptionPane.showMessageDialog(frame, "Invalid Input");
    }
 }
 else
 {
     JOptionPane.showMessageDialog(frame, "Add a country first");
 }   
 }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
          Graphics g = jPanel6.getGraphics(); 
                   
           g.setColor(Color.red);
           g.drawLine(150, 150, 300, 300);   
           
            
        int repeatCheck = 0; 
 if(stateList.getItemCount() > 0 )
 {
    String s = (String)JOptionPane.showInputDialog("Name your capital");

    
            Font Abc = new Font("Helvetica", Font.PLAIN, 20);  
            
              
    
    if(s != null && s.length() > 0 )
    {
     
    String[] check = CapitalList.getItems();
    
    String[] stateArray = stateList.getItems();
    
    for(int i = 0; i < check.length ; i++)
    {
        if(s.equalsIgnoreCase(check[i]))
        {
            JOptionPane.showMessageDialog(frame, "Cannot Repeat Enteries");
            repeatCheck = 1;
            break;
        }
        else
        {
            repeatCheck = 0;
        }
    }
        if(repeatCheck == 0)
        {
        
        
        Object stateChosen =   JOptionPane.showInputDialog(frame, "Pick a State", "Input", JOptionPane.QUESTION_MESSAGE,
        null, stateArray, "Titan");
         
         Point ppp = new Point();
           
           
           ppp.x = Integer.parseInt(JOptionPane.showInputDialog("give X").trim().toString());
            
           
          // s = (String)JOptionPane.showInputDialog("give Y").trim();
           
           ppp.y = Integer.parseInt(JOptionPane.showInputDialog("give Y").trim().toString());
           
            InfoSingelton te;
            te = InfoSingelton.getInstance(); 
       
       //  JOptionPane.showinp
          CapitalList.add(s);
          
          te.singleCapitalName = s;
          te.singleStateName = stateChosen.toString();
          te.singlePosition = ppp;
          obj.CapitalCreated();
          
          
          BufferedImage myPicture;
        try {
            
            ImageIcon icon = new ImageIcon("d:\\HelloWorld.jpg"); 
            JLabel label = new JLabel(); 
            
                     
            //JLabel 
                JLabel    picLabel = new JLabel(); 
            //test = new Label("What the fuck",Label.CENTER );
           
            label.setIcon(icon); 
            myPicture = ImageIO.read(new File("d:\\hi.png"));
            
            // picLabel = new JLabel();
           //  jPanel6.setLayout(new FlowLayout()); 
             Point p = new Point();
            // jPanel6.add(test);
             
           
             jPanel6.add(picLabel = new JLabel(new ImageIcon( myPicture )));
            picLabel.setSize(100, 100);
            Dimension ss = new Dimension();
            ss.setSize(1, 1);
           picLabel.setMaximumSize(ss);
           
            
          //  jPanel6.getComponent(0).setLocation(p);
             picLabel.setLocation(ppp);
            picLabel.setVisible(true);
           
         //    jPanel6.setBackground(Color.red);
            
            
            
            labelArray.add(picLabel);
           
           
            
        
         
            
            jPanel6.repaint();
          //  jPanel6.revalidate();
           // jPanel6.repaint();
           
            
            
          //  obj.repaint();
             //jPanel6.setVisible(true);
            // jPanel6.get
             //add(picLabel);
        
         
        } catch (IOException ex) {
            Logger.getLogger(myCalculatorForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
    
    }
    else
    {
        JOptionPane.showMessageDialog(frame, "Invalid Input");
    }
 }
 else
 {
     JOptionPane.showMessageDialog(frame, "Add a state first");
 }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(stateList.getItemCount() > 0)
        {
            JOptionPane.showMessageDialog(frame,
            "This would remove a state");
            stateList.remove(stateList.getItemCount() - 1);  
        }
        else
        {
            JOptionPane.showMessageDialog(frame, "There are no states that can be removed");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
          if(CapitalList.getItemCount() > 0)
        {
            JOptionPane.showMessageDialog(frame,
            "This would remove a capital");
            CapitalList.remove(CapitalList.getItemCount() - 1);  
        }
        else
        {
            JOptionPane.showMessageDialog(frame, "There are no capitals that can be removed");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jPanel6ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel6ComponentAdded
        // TODO add your handling code here:
        
          
        
    ///   test.setVisible(true);
    //   test.setForeground(Color.red);
   //    jPanel6.repaint();
    }//GEN-LAST:event_jPanel6ComponentAdded

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        
       Point xy = evt.getPoint();
       for(int i = 0; i < labelArray.size(); i++)
       if(labelArray.get(i).getBounds().contains(xy))
       {
           
           InfoSingelton te;
           te = InfoSingelton.getInstance();
           
           te.singleCapitalName = CapitalList.getItem(i);
           
           
           JOptionPane.showMessageDialog(frame, obj.getInfoTabData());
           
           
           
           
           
       }

        
     /*   JLabel please = new JLabel("PLEASE",JLabel.LEFT);
        please.setVisible(true);
        please.setSize(100, 100);
        jPanel6.add(please);
        jPanel6.revalidate();
        jPanel6.repaint();
        */
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel6ComponentHidden
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_jPanel6ComponentHidden

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        
        obj.SaveIntoXML();
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        // TODO add your handling code here:
        obj.LoadFromXML();
    }//GEN-LAST:event_LoadButtonActionPerformed

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
            java.util.logging.Logger.getLogger(myCalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myCalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myCalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myCalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myCalculatorForm().setVisible(true);
            }
        });
    }
    
    private java.awt.Label test;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.List CapitalList;
    private javax.swing.JButton LoadButton;
    private javax.swing.JButton SaveButton;
    private java.awt.List continentsList;
    private java.awt.List countriesList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private java.awt.List stateList;
    // End of variables declaration//GEN-END:variables
}
