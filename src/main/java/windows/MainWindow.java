/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author izhussai
 */
public class MainWindow {
    protected JFrame frame; 
    protected JTextField text;
    protected JButton enter_btn; 
    
    //constructor
    public MainWindow(String WindowsTitle){
        frame = new JFrame(WindowsTitle);
        text = new JTextField();
        enter_btn = new JButton("Enter");
    }
    
    public void setFrame(){
    
    
    }
    
    //getters
    public JFrame getFrame(){return this.frame;}
    public JTextField getTextField(){return this.text;}
    public JButton getEnterButton(){return this.enter_btn;}
}
