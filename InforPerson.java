/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5LTHDT;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
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
public class InforPerson implements ActionListener{
    Label name,address,birth,sex,result,empty,empty1,empty2;
    TextField txt1,txt2,txt3,txt4;
    Checkbox cbnam,cbnu;
    Button bt1,bt2,bt3;
    String str;
    Panel pn;
    public InforPerson(){
       Frame myFrame = new Frame("Employee Info");
        myFrame.setLayout(new GridLayout(10,2));
        name = new Label("Name:");
        myFrame.add(name);
        txt1 = new TextField();
        myFrame.add(txt1);
        birth = new Label("Birth:");
        myFrame.add(birth);
        txt2 = new TextField();
        myFrame.add(txt2);
        address = new Label("Address:");
        myFrame.add(address);
        txt3 = new TextField();
        myFrame.add(txt3);
        myFrame.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent windowEvent){
                    System.exit(0);
                }
        });
        sex = new Label("Sex:");
        CheckboxGroup cb = new CheckboxGroup();
        myFrame.add(sex);
        empty = new Label();
        myFrame.add(empty);
        cbnu = new Checkbox("Female",cb,true);
        
        myFrame.add(cbnu);
        cbnam = new Checkbox("Male",cb,false);
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
        cbnam.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == 1)
                {
                    str = cbnam.getLabel();
                }
            }
        });
        cbnu.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == 1){
                    str = cbnu.getLabel();
                }
            }
        });
        myFrame.setSize(500,300);
        myFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == bt1){
           txt4.setText(txt1.getText()+"," + txt2.getText()+"," + txt3.getText()+","+str);
           txt4.getText();
       } 
       if(ae.getSource() == bt2)
       {
           txt4.setText(null);
           txt4.getText();
       }
       if(ae.getSource() == bt3)
       {
           System.exit(0);
       }
    }
    
   public static void main (String[] args)
   {
       new InforPerson();
   }
}
