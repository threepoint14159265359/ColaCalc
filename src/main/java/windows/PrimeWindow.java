/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import javax.swing.JFrame;

/**
 *
 * @author izhussai
 */
public class PrimeWindow extends MainWindow {
    public PrimeWindow(){ 
        super("Check whether a number ");
        //set text bounds 
        text.setBounds(30,50,330,35);
        //set button bounds 
        enter_btn.setBounds(290,100,70,40);
        
        //add button and text feild to the given frame 
        frame.add(text);
        frame.add(enter_btn);
        
        //set everything for the frame 
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setResizable(false);
        
        
        //display the frame
        frame.setVisible(true);
    }
}
