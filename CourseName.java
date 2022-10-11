/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5LTHDT;

/**
 *
 * @author pc
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author pc
 */
public class CourseName implements ActionListener, ItemListener {

    Label name, course, result, empty, empty1, empty2, n;
    TextField txt1, txt2, txt3, txt4;
    Checkbox cbnam, cbnu;
    Button bt1, bt2, bt3, b1, b2;
    String str, str1;
    Panel pn;
    Choice myChoice;
    Dialog dialog;
    Frame myFrame = new Frame("Registration");

    public CourseName() {

        myFrame.setLayout(new GridLayout(10, 2));
        name = new Label("FullName:");
        myFrame.add(name);
        txt1 = new TextField();
        myFrame.add(txt1);
        course = new Label("Course:");
        myFrame.add(course);
        myChoice = new Choice();
        myChoice.addItem("Lap trinh C++");
        myChoice.addItem("Lap trinh Java");
        myChoice.addItem("Co so du lieu");
        myChoice.addItem("Lap trinh Python");
        myChoice.addItem("Cau truc du lieu va giai thuat");
        myChoice.addItemListener(this);

        myFrame.add(myChoice);
        n = new Label();
        myFrame.add(n);
        myFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        CheckboxGroup cb = new CheckboxGroup();

        empty = new Label();
        myFrame.add(empty);
        cbnu = new Checkbox("2-4-6", cb, true);

        myFrame.add(cbnu);
        cbnam = new Checkbox("3-5-7", cb, false);
        myFrame.add(cbnam);
        result = new Label("Result:");
        myFrame.add(result);
        txt4 = new TextField();
        myFrame.add(txt4);
        empty1 = new Label();
        myFrame.add(empty1);
        empty2 = new Label();
        myFrame.add(empty2);
        pn = new Panel();
        bt1 = new Button("Display");
        bt1.addActionListener(this);
        pn.add(bt1);
        myFrame.add(pn);
        bt2 = new Button("Reset");
        bt2.addActionListener(this);
        pn.add(bt2);
        myFrame.add(pn);
        bt3 = new Button("Exit");
        bt3.addActionListener(this);
        pn.add(bt3);
        myFrame.add(pn);
        cbnam.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1) {
                    str = cbnam.getLabel();
                }
            }
        });
        cbnu.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1) {
                    str = cbnu.getLabel();
                }
            }
        });
        myFrame.setSize(500, 300);
        myFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == bt1) {
            txt4.setText(txt1.getText() + "," + str + "," + str1);
            txt4.getText();
        }
        if (ae.getSource() == bt2) {

            dialog = new Dialog(myFrame, "Do you want to reset the data?", true);

            Panel pt = new Panel();
            b1 = new Button("Yes");
            b1.addActionListener(this);
            pt.add(b1);
            dialog.add(pt);
            b2 = new Button("No");
            b2.addActionListener(this);
            pt.add(b2);
            dialog.add(pt);
            dialog.setSize(300, 100);
            dialog.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowevent) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        }
        if (ae.getSource() == bt3) {
            System.exit(0);
        }
        if(ae.getSource() == b1){
            txt4.setText(null);
            txt4.getText();
            dialog.setVisible(false);
          
        }
        if (ae.getSource()== b2){
            
            dialog.setVisible(false);
        }
    }

    public void itemStateChanged(ItemEvent ie) {
        if (ie.getStateChange() == ItemEvent.SELECTED) {
            String item = (String) ie.getItem();
            if (item.equals("Lap trinh C++")) {
                str1 = myChoice.getSelectedItem();
            }
            if (item.equals("Lap trinh Java")) {
                str1 = myChoice.getSelectedItem();
            }
            if (item.equals("Co so du lieu")) {
                str1 = myChoice.getSelectedItem();
            }
            if (item.equals("Lap trinh Python")) {
                str1 = myChoice.getSelectedItem();
            }
            if (item.equals("Cau truc du lieu va giai thuat")) {
                str1 = myChoice.getSelectedItem();
            }
        }
    }

    public static void main(String[] args) {
        new CourseName();
    }
}
