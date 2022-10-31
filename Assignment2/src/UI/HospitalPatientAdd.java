/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import Model.Admin;
import Model.Person;
import Model.Resident;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Sakshi Sasalate
 */
public class HospitalPatientAdd extends javax.swing.JPanel {
private JPanel lowerPanel;
    Admin admin;
    /**
     * Creates new form HospitalPatientAdd
     */
    public HospitalPatientAdd(JPanel lowerPanel, Admin admin) {
        initComponents();
        this.lowerPanel = lowerPanel;
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPersonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        genderTF = new javax.swing.JTextField();
        ageTF = new javax.swing.JTextField();
        hgTF = new javax.swing.JTextField();
        bpTF = new javax.swing.JTextField();
        pastIllnessTF = new javax.swing.JTextField();
        communityTF = new javax.swing.JTextField();
        cityTF = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        saveDetailsButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        illnessTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        houseTF = new javax.swing.JTextField();
        isPatientCB = new javax.swing.JCheckBox();
        patientStatusTF = new javax.swing.JTextField();
        nameVal = new javax.swing.JLabel();
        genderVal = new javax.swing.JLabel();
        ageVal = new javax.swing.JLabel();
        pulseVal = new javax.swing.JLabel();
        bpVal = new javax.swing.JLabel();

        addPersonPanel.setBackground(new java.awt.Color(204, 204, 204));
        addPersonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ADD NEW PATIENT H");
        addPersonPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("NAME :");
        addPersonPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 114, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("GENDER :");
        addPersonPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 168, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("AGE :");
        addPersonPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 221, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("PULSE :");
        addPersonPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 114, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("BP. :");
        addPersonPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 168, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("PAST ILLNESS :");
        addPersonPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 333, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("COMMUNITY :");
        addPersonPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 277, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("CITY :");
        addPersonPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 333, -1, -1));

        nameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 113, 154, -1));

        genderTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                genderTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(genderTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 167, 154, -1));

        ageTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(ageTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 220, 154, -1));

        hgTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hgTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(hgTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 112, 150, -1));

        bpTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bpTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(bpTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 166, 150, -1));
        addPersonPanel.add(pastIllnessTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 332, 118, -1));
        addPersonPanel.add(communityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 275, 140, -1));
        addPersonPanel.add(cityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 332, 140, -1));

        backButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        addPersonPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 107, 41));

        saveDetailsButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        saveDetailsButton.setText("SAVE ");
        saveDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDetailsButtonActionPerformed(evt);
            }
        });
        addPersonPanel.add(saveDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 90, 41));

        clearButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        addPersonPanel.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 110, 41));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("ILLNESS :");
        addPersonPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 277, -1, -1));
        addPersonPanel.add(illnessTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 276, 150, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("HOUSE :");
        addPersonPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 221, -1, -1));

        houseTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseTFActionPerformed(evt);
            }
        });
        addPersonPanel.add(houseTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 220, 150, -1));

        isPatientCB.setBackground(new java.awt.Color(255, 255, 255));
        isPatientCB.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        isPatientCB.setText("IS PATIENT ?");
        isPatientCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPatientCBActionPerformed(evt);
            }
        });
        addPersonPanel.add(isPatientCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        patientStatusTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientStatusTFActionPerformed(evt);
            }
        });
        addPersonPanel.add(patientStatusTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 390, 130, -1));
        addPersonPanel.add(nameVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 140, 20));
        addPersonPanel.add(genderVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 150, 20));
        addPersonPanel.add(ageVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 160, 20));
        addPersonPanel.add(pulseVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 134, 150, 20));
        addPersonPanel.add(bpVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(addPersonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(addPersonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTFKeyReleased
        // TODO add your handling code here:
        String Name ="^[a-zA-Z\\s]{0,30}$";
        Pattern p = Pattern.compile(Name);
        Matcher match= p.matcher(nameTF.getText());
        if(!match.matches()){
            nameVal.setText("Invalid input!");
        }
        else {
            nameVal.setText("");
        }
    }//GEN-LAST:event_nameTFKeyReleased

    private void genderTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genderTFKeyReleased
        // TODO add your handling code here:
        String Name ="^[a-zA-Z\\s]{0,30}$";
        Pattern p = Pattern.compile(Name);
        Matcher match= p.matcher(genderTF.getText());
        if(!match.matches()){
            genderVal.setText("Invalid input!");
        }
        else {
            genderVal.setText("");
        }
    }//GEN-LAST:event_genderTFKeyReleased

    private void ageTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTFKeyReleased
        // TODO add your handling code here:
        String age ="^[0-9]{0,10}$";
        Pattern p = Pattern.compile(age);
        Matcher match= p.matcher(ageTF.getText());
        if(!match.matches()){
            ageVal.setText("Invalid! Only numeric input");
        }
        else {
            ageVal.setText("");
        }
    }//GEN-LAST:event_ageTFKeyReleased

    private void hgTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hgTFKeyReleased
        // TODO add your handling code here:
        String str ="^[0-9]{0,10}$";
        Pattern p = Pattern.compile(str);
        Matcher match= p.matcher(hgTF.getText());
        if(!match.matches()){
            pulseVal.setText("Invalid! Only numeric input");
        }
        else {
            pulseVal.setText("");
        }
    }//GEN-LAST:event_hgTFKeyReleased

    private void bpTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bpTFKeyReleased
        // TODO add your handling code here:
        String str ="^[0-9]{0,10}$";
        Pattern p = Pattern.compile(str);
        Matcher match= p.matcher(bpTF.getText());
        if(!match.matches()){
            bpVal.setText("Invalid! Only numeric input");
        }
        else {
            bpVal.setText("");
        }
    }//GEN-LAST:event_bpTFKeyReleased

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        HospitalDirectory  HospitalDirectory = new  HospitalDirectory(lowerPanel, admin);
        lowerPanel.add("personWindow", HospitalDirectory);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDetailsButtonActionPerformed
        // TODO add your handling code here:
        String name;
        int age;
        String gender;
        String city;
        String community;
        String house;
        String illness;
        String pastIllness;
        double BP;
        double HB;
        boolean isPatient;

        try{
            name= nameTF.getText();
            gender = genderTF.getText();
            age = Integer.parseInt(ageTF.getText());
            city = cityTF.getText();
            community = communityTF.getText();
            house = houseTF.getText();
            illness = illnessTF.getText();
            pastIllness = pastIllnessTF.getText();

            if (isPatientCB.isSelected()) {
                patientStatusTF.setText("YES");
                isPatient = true;
            } else {
                patientStatusTF.setText("NO");
                isPatient = false;
            }
            BP = Double.parseDouble(bpTF.getText());
            HB = Double.parseDouble(hgTF.getText());

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please recheck info entered!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //adding person to directory
        Resident residence = new Resident(house, community, city);
        Person person  = new Person(name, age, gender, illness, pastIllness, residence, isPatient, BP, HB);
        this.admin.addPerson(person);
        JOptionPane.showMessageDialog(this, "Person added successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveDetailsButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        nameTF.setText("");
        genderTF.setText("");
        ageTF.setText("");
        illnessTF.setText("");
        pastIllnessTF.setText("");
        hgTF.setText("");
        bpTF.setText("");
        houseTF.setText("");
        communityTF.setText("");
        cityTF.setText("");
        //        isPatientCB.isSelected(false);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void houseTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseTFActionPerformed

    private void isPatientCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPatientCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isPatientCBActionPerformed

    private void patientStatusTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientStatusTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientStatusTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPersonPanel;
    private javax.swing.JTextField ageTF;
    private javax.swing.JLabel ageVal;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bpTF;
    private javax.swing.JLabel bpVal;
    private javax.swing.JTextField cityTF;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField communityTF;
    private javax.swing.JTextField genderTF;
    private javax.swing.JLabel genderVal;
    private javax.swing.JTextField hgTF;
    private javax.swing.JTextField houseTF;
    private javax.swing.JTextField illnessTF;
    private javax.swing.JCheckBox isPatientCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel nameVal;
    private javax.swing.JTextField pastIllnessTF;
    private javax.swing.JTextField patientStatusTF;
    private javax.swing.JLabel pulseVal;
    private javax.swing.JButton saveDetailsButton;
    // End of variables declaration//GEN-END:variables
}
