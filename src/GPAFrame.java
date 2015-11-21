

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GPAFrame extends JFrame implements ActionListener {
	JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, labelt;// Declare labels
// Declare jButton
JButton b1; // which calculate gpa on click
JLabel lblgpaCalculator; 
JComboBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9; // Declare combobox  to drop and select
// Variables hours and grades
JTextField txt1, txt2, txt3, txt4, txt5, txt6; // Declare texboxes 
JPanel master, junior1, junior; // panels used
float final_GPA = 0.0f;
float quality_points = 0.0f, total_credit_hrs = 0.0f, total_grades = 0.0f;

String no_course = "", cr_hr1 = "", cr_hr2 = "", cr_hr3 = "", cr_hr4 = "",
grade1 = "", grade2 = "", grade3 = "", grade4 = "";
static int check = 0;



//View design frame

@SuppressWarnings("unchecked")
GPAFrame() {
setTitle("GPA Calculator");
setSize(600, 500);
setResizable(false);
setDefaultCloseOperation(EXIT_ON_CLOSE);
lblgpaCalculator = new JLabel("GPA Calculator", SwingConstants.CENTER);
lblgpaCalculator.setFont(new Font("Times New Roman", Font.BOLD, 20));

label1 = new JLabel("Credit hours earned ");
txt1 = new JTextField(10);
txt1.setHorizontalAlignment(JTextField.CENTER);

label2 = new JLabel("Current GPA: ", SwingConstants.CENTER);
txt2 = new JTextField(10);
txt2.setHorizontalAlignment(JTextField.CENTER);
txt1.setText("0");
txt2.setText("0");

txt1.setEditable(false);
txt2.setEditable(false);

label12 = new JLabel("Number of Courses");
cb9 = new JComboBox();
cb9.addItem("1");
cb9.addItem("2");
cb9.addItem("3");
cb9.addItem("4");
cb9.addActionListener(this); // SETTING UP THE ACTION LISTENER ON NO. OF
// COURSES SELECTED COMBOBOX

label3 = new JLabel("SR No.");
label4 = new JLabel("Course Code");
label4.setFont(new Font("Times New Roman", Font.BOLD, 17));
label5 = new JLabel("Credit Hours");
label6 = new JLabel("Grade");
label3.setFont(new Font("Times New Roman", Font.BOLD, 17));
label5.setFont(new Font("Times New Roman", Font.BOLD, 16));
label6.setFont(new Font("Times New Roman", Font.BOLD, 17));

label7 = new JLabel("1.");
txt3 = new JTextField(10);
cb1 = new JComboBox();
cb1.addItem("1");
cb1.addItem("2");
cb1.addItem("3");
cb1.addItem("4");

cb2 = new JComboBox();
cb2.addItem("A+:90-100%");
cb2.addItem("A:80-89%");
cb2.addItem("B+:75-79%");
cb2.addItem("B:70-74%");
cb2.addItem("C+:65-69%");
cb2.addItem("C:60-64%");
cb2.addItem("D+:55-59%");
cb2.addItem("D:50-54%");
cb2.addItem("F:0-49%");

label8 = new JLabel("2.");
label8.setVisible(false);
txt4 = new JTextField(10);
txt4.setVisible(false);
cb3 = new JComboBox();
cb3.addItem("1");
cb3.addItem("2");
cb3.addItem("3");
cb3.addItem("4");
cb3.setVisible(false);
cb4 = new JComboBox();
cb4.addItem("A+:90-100%");
cb4.addItem("A:80-89%");
cb4.addItem("B+:75-79%");
cb4.addItem("B:70-74%");
cb4.addItem("C+:65-69%");
cb4.addItem("C:60-64%");
cb4.addItem("D+:55-59%");
cb4.addItem("D:50-54%");
cb4.addItem("F:0-49%");
cb4.setVisible(false);
label9 = new JLabel("3.");
label9.setVisible(false);
txt5 = new JTextField(10);
txt5.setVisible(false);
cb5 = new JComboBox();
cb5.addItem("1");
cb5.addItem("2");
cb5.addItem("3");
cb5.addItem("4");
cb5.setVisible(false);

cb6 = new JComboBox();
cb6.addItem("A+:90-100%");
cb6.addItem("A:80-89%");
cb6.addItem("B+:75-79%");
cb6.addItem("B:70-74%");
cb6.addItem("C+:65-69%");
cb6.addItem("C:60-64%");
cb6.addItem("D+:55-59%");
cb6.addItem("D:50-54%");
cb6.addItem("F:0-49%");
cb6.setVisible(false);
label10 = new JLabel("4.");
label10.setVisible(false);
txt6 = new JTextField(10);
txt6.setVisible(false);
cb7 = new JComboBox();
cb7.addItem("1");
cb7.addItem("2");
cb7.addItem("3");
cb7.addItem("4");

cb7.setVisible(false);
cb8 = new JComboBox();
cb8.addItem("A+:90-100%");
cb8.addItem("A:80-89%");
cb8.addItem("B+:75-79%");
cb8.addItem("B:70-74%");
cb8.addItem("C+:65-69%");
cb8.addItem("C:60-64%");
cb8.addItem("D+:55-59%");
cb8.addItem("D:50-54%");
cb8.addItem("F:0-49%");
cb8.setVisible(false);
b1 = new JButton("Calculate");
b1.addActionListener(this);// SETTING UP ACTIONLISTENER ON CALCULATOR
// BUTTON TO CALCULATE GPA

label11 = new JLabel("Your GPA is: ");

junior = new JPanel(new GridLayout(6, 4, 20, 10));
junior.setBackground(Color.CYAN);

junior.add(label3);
junior.add(label4);
junior.add(label5);
junior.add(label6);

junior.add(label7);
junior.add(txt3);
junior.add(cb1);
junior.add(cb2);

junior.add(label8);
junior.add(txt4);
junior.add(cb3);
junior.add(cb4);

junior.add(label9);
junior.add(txt5);
junior.add(cb5);
junior.add(cb6);

junior.add(label10);
junior.add(txt6);
junior.add(cb7);
junior.add(cb8);

master = new JPanel(null);
master.setBackground(Color.CYAN);
master.add(lblgpaCalculator);
lblgpaCalculator.setBounds(220, 0, 200, 50);
master.add(label1);

label1.setBounds(70, 70, 150, 20);
master.add(txt1);

txt1.setBounds(220, 70, 50, 20);
master.add(label2);
label2.setBounds(330, 70, 100, 20);
master.add(txt2);
txt2.setBounds(460, 70, 50, 20);

master.add(label12);
label12.setBounds(340, 110, 140, 20);
master.add(cb9);
cb9.setBounds(470, 110, 40, 20);
master.add(junior);// label12 cb9
junior.setBounds(70, 170, 440, 180);

master.add(b1);
b1.setBounds(410, 350, 100, 30);
master.add(label11);
label11.setBounds(260, 400, 100, 50);

add(master);

setDefaultCloseOperation(EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setVisible(true);
}

//Function

public float courseOne() {

grade1 = (String) cb2.getSelectedItem();

float grade = 0.0f;
if (grade1.equalsIgnoreCase("A+:90-100%")) {
grade = 4.5f;
}
if (grade1.equalsIgnoreCase("A:80-89%")) {
grade = 4.0f;
}
if (grade1.equalsIgnoreCase("B+:75-79%")) {
grade = 3.5f;
}
if (grade1.equalsIgnoreCase("B:70-74%")) {
grade = 3.0f;
}
if (grade1.equalsIgnoreCase("C+:65-69%")) {
grade = 2.5f;
}
if (grade1.equalsIgnoreCase("C:60-64%")) {
grade = 2.0f;
}
if (grade1.equalsIgnoreCase("D+:55-59%")) {
grade = 1.5f;
}
if (grade1.equalsIgnoreCase("D:50-54%")) {
grade = 1.0f;
}
if (grade1.equalsIgnoreCase("F:0-49%")) {
grade = 0.0f;
}

return grade;
}

float courseTwo() {
grade2 = (String) cb4.getSelectedItem();
float grade11 = 0.0f;
if (grade2.equalsIgnoreCase("A+:90-100%")) {
grade11 = 4.5f;
}
if (grade2.equalsIgnoreCase("A:80-89%")) {
grade11 = 4.0f;
}
if (grade2.equalsIgnoreCase("B+:75-79%")) {
grade11 = 3.5f;
}
if (grade2.equalsIgnoreCase("B:70-74%")) {
grade11 = 3.0f;
}
if (grade2.equalsIgnoreCase("C+:65-69%")) {
grade11 = 2.5f;
}
if (grade2.equalsIgnoreCase("C:60-64%")) {
grade11 = 2.0f;
}
if (grade2.equalsIgnoreCase("D+:55-59%")) {
grade11 = 1.5f;
}
if (grade2.equalsIgnoreCase("D:50-54%")) {
grade11 = 1.0f;
}
if (grade2.equalsIgnoreCase("F:0-49%")) {
grade11 = 0.0f;
}

return grade11;
}

float courseThree() {
grade3 = (String) cb6.getSelectedItem();
float grade12 = 0.0f;
if (grade3.equalsIgnoreCase("A+:90-100%")) {
grade12 = 4.5f;
}
if (grade3.equalsIgnoreCase("A:80-89%")) {
grade12 = 4.0f;
}
if (grade3.equalsIgnoreCase("B+:75-79%")) {
grade12 = 3.5f;
}
if (grade3.equalsIgnoreCase("B:70-74%")) {
grade12 = 3.0f;
}
if (grade3.equalsIgnoreCase("C+:65-69%")) {
grade12 = 2.5f;
}
if (grade3.equalsIgnoreCase("C:60-64%")) {
grade12 = 2.0f;
}
if (grade3.equalsIgnoreCase("D+:55-59%")) {
grade12 = 1.5f;
}
if (grade3.equalsIgnoreCase("D:50-54%")) {
grade12 = 1.0f;
}
if (grade3.equalsIgnoreCase("F:0-49%")) {
grade12 = 0.0f;
}

return grade12;
}

public float courseFour() {
grade4 = (String) cb4.getSelectedItem();
float grade13 = 0.0f;
if (grade4.equalsIgnoreCase("A+:90-100%")) {
grade13 = 4.5f;
}
if (grade4.equalsIgnoreCase("A:80-89%")) {
grade13 = 4.0f;
}
if (grade4.equalsIgnoreCase("B+:75-79%")) {
grade13 = 3.5f;
}
if (grade4.equalsIgnoreCase("B:70-74%")) {
grade13 = 3.0f;
}
if (grade4.equalsIgnoreCase("C+:65-69%")) {
grade13 = 2.5f;
}
if (grade4.equalsIgnoreCase("C:60-64%")) {
grade13 = 2.0f;
}
if (grade4.equalsIgnoreCase("D+:55-59%")) {
grade13 = 1.5f;
}
if (grade4.equalsIgnoreCase("D:50-54%")) {
grade13 = 1.0f;
}
if (grade4.equalsIgnoreCase("F:0-49%")) {
grade13 = 0.0f;
}

return grade13;
}

//Button event

public void actionPerformed(ActionEvent ae) {
if (ae.getSource() == cb9) {
String get = (String) cb9.getSelectedItem();
if (get.equalsIgnoreCase("1")) {
label8.setVisible(false);
txt4.setVisible(false);
cb3.setVisible(false);
cb4.setVisible(false);
label9.setVisible(false);
txt5.setVisible(false);
cb5.setVisible(false);
cb6.setVisible(false);
label10.setVisible(false);
txt6.setVisible(false);
cb7.setVisible(false);
cb8.setVisible(false);

}
if (get.equalsIgnoreCase("2")) {
label8.setVisible(true);
txt4.setVisible(true);
cb3.setVisible(true);
cb4.setVisible(true);
label9.setVisible(false);
txt5.setVisible(false);
cb5.setVisible(false);
cb6.setVisible(false);
label10.setVisible(false);
txt6.setVisible(false);
cb7.setVisible(false);
cb8.setVisible(false);

}
if (get.equalsIgnoreCase("3")) {
label8.setVisible(true);
txt4.setVisible(true);
cb3.setVisible(true);
cb4.setVisible(true);
label9.setVisible(true);
txt5.setVisible(true);
cb5.setVisible(true);
cb6.setVisible(true);
label10.setVisible(false);
txt6.setVisible(false);
cb7.setVisible(false);
cb8.setVisible(false);

}
if (get.equalsIgnoreCase("4")) {
label8.setVisible(true);
txt4.setVisible(true);
cb3.setVisible(true);
cb4.setVisible(true);
label9.setVisible(true);
txt5.setVisible(true);
cb5.setVisible(true);
cb6.setVisible(true);
label10.setVisible(true);
txt6.setVisible(true);
cb7.setVisible(true);
cb8.setVisible(true);

}

}
if (ae.getSource() == b1) {
txt1.setText(String.valueOf(total_credit_hrs));
txt2.setText(String.valueOf(final_GPA));

String get = (String) cb9.getSelectedItem();

if (get.equalsIgnoreCase("1")) {
String ab = "";
ab = txt3.getText().toString();
if (ab.equalsIgnoreCase("")) {

JOptionPane
.showMessageDialog(master,
"Course Name is required \nPlease Enter Course Name");
txt3.requestFocus(true);
} else {
cr_hr1 = (String) cb1.getSelectedItem();
Float cr_hr = Float.parseFloat(cr_hr1);
total_grades = courseOne() * cr_hr;

total_credit_hrs = cr_hr;

quality_points = total_grades;
calculateGpa(quality_points, total_credit_hrs);
}
}
if (get.equalsIgnoreCase("2")) {

String ab = "", bc = "";
ab = txt3.getText().toString();
bc = txt4.getText().toString();
if (ab.equalsIgnoreCase("")) {

JOptionPane
.showMessageDialog(master,
"Course Name is required \nPlease Enter Course Name");
txt3.requestFocus(true);
} else if (bc.equalsIgnoreCase("")) {
JOptionPane
.showMessageDialog(master,
"Course Name is required \nPlease Enter Course Name");
txt4.requestFocus(true);

} else {

cr_hr1 = (String) cb1.getSelectedItem();

float cr_hr = Float.parseFloat(cr_hr1);
float grade = 0.0f;

cr_hr2 = (String) cb3.getSelectedItem();
float cr_hr11 = Float.parseFloat(cr_hr2);

total_credit_hrs = cr_hr + cr_hr11;
total_grades = courseOne() * cr_hr + courseTwo() * cr_hr11;
quality_points = total_grades;
calculateGpa(quality_points, total_credit_hrs);

}

}
if (get.equalsIgnoreCase("3")) {
String ab = "", bc = "", cd = "";
ab = txt3.getText().toString();
bc = txt4.getText().toString();
cd = txt5.getText().toString();
if (ab.equalsIgnoreCase("")) {

JOptionPane
.showMessageDialog(master,
"Course Name is required \nPlease Enter Course Name");
txt3.requestFocus(true);
} else if (bc.equalsIgnoreCase("")) {
JOptionPane
.showMessageDialog(master,
"Course Name is required \nPlease Enter Course Name");
txt4.requestFocus(true);

} else if (cd.equalsIgnoreCase("")) {
JOptionPane
.showMessageDialog(master,
"Course Name is required \nPlease Enter Course Name");
txt5.requestFocus(true);

} else {

cr_hr1 = (String) cb1.getSelectedItem();
float cr_hr = Float.parseFloat(cr_hr1);
float grade = 0.0f;

cr_hr2 = (String) cb3.getSelectedItem();

Float cr_hr11 = Float.parseFloat(cr_hr2);

cr_hr3 = (String) cb5.getSelectedItem();

float cr_hr12 = Float.parseFloat(cr_hr3);

total_credit_hrs = cr_hr + cr_hr11 + cr_hr12;
total_grades = cr_hr * courseOne() + cr_hr11 * courseTwo()
+ cr_hr12 * courseThree();
quality_points = total_grades;
calculateGpa(quality_points, total_credit_hrs);

}

}
if (get.equalsIgnoreCase("4")) {
String ab = "", bc = "", cd = "", de;
ab = txt3.getText().toString();
bc = txt4.getText().toString();
cd = txt5.getText().toString();
de = txt6.getText().toString();
if (ab.equalsIgnoreCase("")) {

JOptionPane
.showMessageDialog(master,
"Course Name is required \nPlease Enter Course Name");
txt3.requestFocus(true);
} else if (bc.equalsIgnoreCase("")) {
JOptionPane
.showMessageDialog(master,
"Course Name is required \nPlease Enter Course Name");
txt4.requestFocus(true);

} else if (cd.equalsIgnoreCase("")) {
JOptionPane
.showMessageDialog(master,
"Course Name is required \nPlease Enter Course Name");
txt5.requestFocus(true);

} else if (de.equalsIgnoreCase("")) {
JOptionPane
.showMessageDialog(master,
"Course Name is required \nPlease Enter Course Name");
txt6.requestFocus(true);

} else {
cr_hr1 = (String) cb1.getSelectedItem();

float cr_hr = Float.parseFloat(cr_hr1);

cr_hr2 = (String) cb3.getSelectedItem();
float cr_hr11 = Float.parseFloat(cr_hr2);

cr_hr3 = (String) cb5.getSelectedItem();
float cr_hr12 = Float.parseFloat(cr_hr3);

cr_hr4 = (String) cb3.getSelectedItem();
float cr_hr13 = Float.parseFloat(cr_hr4);

total_credit_hrs = cr_hr + cr_hr11 + cr_hr12 + cr_hr13;
total_grades = cr_hr * courseOne() + cr_hr11 * courseTwo()
+ cr_hr12 * courseThree() + cr_hr13 * courseFour();
quality_points = total_grades;
calculateGpa(quality_points, total_credit_hrs);
}
}

}

}
//Main Method 

public static void main(String args[]) {
	GPAFrame t = new GPAFrame();

}
/*CALCULATE GPA-*/

public void calculateGpa(float qtyPts, float crdt_hrs) {

System.out.println("at " + qtyPts + "  ff  " + crdt_hrs);
final_GPA = (float) (qtyPts / crdt_hrs);

label11.setText(String.valueOf("Your GPA is: " + final_GPA));

}
}