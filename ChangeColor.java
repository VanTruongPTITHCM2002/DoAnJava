/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5LTHDT;
import java.awt.Color;
import java.util.Scanner;
/**
 *
 * @author pc
 */
import static java.awt.Color.blue;
import static java.awt.Color.red;
import static java.awt.Color.white;
import static java.awt.Color.yellow;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 import java.awt.Dialog;
public class ChangeColor  {
    public TextArea textArea;
    public TextArea textField;
    Dialog dialog;
    Frame myFrame = new Frame();
    public ChangeColor() {
        myFrame.setLayout(new GridLayout(2,0));
        textArea = new TextArea();
        textArea.addKeyListener(new KeyList());
        myFrame.add(textArea);
        
        //myFrame.setLayout(null);
         myFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
          myFrame.setSize(400, 400);
          myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
    }
 
    public Color CategoryLoai(String str){
            switch(str.toUpperCase()){
                case "RED":
                    return Color.RED;
                case "CYAN":
                    return Color.CYAN;
                case "GRAY":
                    return Color.CYAN;
                case "GREEN":
                    return Color.GREEN;
                case "MAGNETA":
                    return Color.MAGENTA;
                case "ORANGE":
                    return Color.ORANGE;
                case "PINK":
                    return Color.PINK;
                case "WHITE":
                    return Color.WHITE;
                case "YELLOW":
                    return Color.YELLOW;
                default:
                    return null;
            }
    }
  class KeyList implements KeyListener{
    
     @Override
     public void keyPressed(KeyEvent e){
     if(e.getKeyCode() == KeyEvent.VK_ENTER)
       {
           Color color = CategoryLoai(textArea.getText());
           if(color != null){
               myFrame.setBackground(color);
           }
          else {
         textField = new TextArea("Bạn đã nhập sai màu rồi chỉ được nhập màu:White,Orange,Blue,Red,Green,Gray,Magenta,Pink,Yellow,Cyan");
         dialog = new Dialog(myFrame,"Lỗi màu",true);
         dialog.setSize(300,300);
         dialog.addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent windowevent){
                 System.exit(0);
             }
         });
         dialog.add(textField);
         dialog.setLocationRelativeTo(null);
         dialog.setVisible(true);
     }
       
       }
     }
     @Override
    public void keyTyped(KeyEvent e) {
       
    }
     @Override
    public void keyReleased(KeyEvent e) {
       
        }
    
    
     
  }
    public static void main(String[] args) {
        new ChangeColor();
    }

   
}

