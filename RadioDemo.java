
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RadioDemo extends Frame implements ItemListener{
    Checkbox cbxRed,cbxBlue,cbxGreen,cbxBlack;
    Label cbxBlank;
    public RadioDemo(){
        super("Chon mau bieu thi!");
        this.setLayout(new GridLayout(5,1));
        CheckboxGroup cbxg = new CheckboxGroup();
        cbxRed = new Checkbox("Red",cbxg,true);
        cbxRed.addItemListener(this);
        this.add(cbxRed);
        cbxBlue = new Checkbox("Blue",cbxg,false);
        cbxBlue.addItemListener(this);
        this.add(cbxBlue);
        cbxGreen = new Checkbox("Green",cbxg,false);
        cbxGreen.addItemListener(this);
        this.add(cbxGreen);
        cbxBlack = new Checkbox("Black",cbxg,false);
        cbxBlack.addItemListener(this);
        this.add(cbxBlack);
        cbxBlank = new Label();
        this.add(cbxBlank);
        this.addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent e){
                 System.exit(0);
             }   
        });
    }
    public void itemStateChanged(ItemEvent ie){
        if(ie.getStateChange() == ItemEvent.SELECTED){
            String item = (String)ie.getItem();
            if(item.equals("Red")){
                cbxRed.setBackground(white);
                cbxBlue.setBackground(white);
                cbxGreen.setBackground(white);
                cbxBlack.setBackground(white);
                cbxBlank.setText("Red is selected");
                cbxBlank.setForeground(white);
                 cbxBlank.setAlignment(WIDTH);
                cbxBlank.setBackground(red);
                cbxBlank.getText();
                
            }
            if (item.equals("Blue"))
            {
                cbxRed.setBackground(white);
                cbxBlue.setBackground(white);
                cbxGreen.setBackground(white);
                cbxBlack.setBackground(white);
                cbxBlank.setText("Blue is selected");
              cbxBlank.setForeground(white);
                 cbxBlank.setAlignment(WIDTH);
                cbxBlank.setBackground(blue);
                cbxBlank.getText();
            }
            if(item.equals("Green")){
                cbxRed.setBackground(white);
                cbxBlue.setBackground(white);
                cbxGreen.setBackground(white);
                cbxBlack.setBackground(white);
                cbxBlank.setText("Green is selected");
                cbxBlank.setForeground(white);
                cbxBlank.setAlignment(WIDTH);
                cbxBlank.setBackground(green);
                cbxBlank.getText();
            }
             if(item.equals("Black")){
                cbxRed.setBackground(white);
                cbxBlue.setBackground(white);
                cbxGreen.setBackground(white);
                cbxBlack.setBackground(white);
                cbxBlank.setText("Black is selected");
                cbxBlank.setForeground(white);
                 cbxBlank.setAlignment(WIDTH);
                cbxBlank.setBackground(black);
                cbxBlank.getText();
            }
            this.repaint();
        }
    }
    public static void main (String[] args){
        RadioDemo myFrame = new RadioDemo();
        myFrame.setSize(200,200);
        myFrame.setVisible(true);
    }
}