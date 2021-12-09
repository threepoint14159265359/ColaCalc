/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;



/**
 *
 * @author izhussai
 */
public final class MainWindow extends JFrame implements ActionListener{ 
    
    //window general attribs 
    private JFrame frame; 
    private final int winWidth = 600, winHeight = 500; 
    
    //buttons
    private final JButton prime_btn; 
    private final JButton fibonacci_btn; 
    private final JButton basic_geometry_btn;    
    
    
    //background image attribs
    private Image bgImage; 
    private ImageIcon bgImageIcon; 
    private JLabel bgImageLabel; 
    private JLabel windowNote, endNote;
    
    public MainWindow(){
        
        this.frame = new JFrame("Main Window");
        
        //create buttons for the main window
        this.prime_btn = MainWindow.createButton("Prime Number Check", 40, 180, 200, 40);
        this.fibonacci_btn = MainWindow.createButton("Nth Fibonacci Number", 330, 180, 200, 40);
        this.basic_geometry_btn = MainWindow.createButton("Basic Geometry", 195, 280, 200, 40); 
        
        
        //add action listeners to the button 
        this.prime_btn.addActionListener(this);
        this.fibonacci_btn.addActionListener(this);
        this.basic_geometry_btn.addActionListener(this);
        
        //create window notes
        this.endNote = new JLabel("<html> <font color='#249ADE'> Tools of Software Projects Final Assignment - Fall </html>");
        this.endNote.setBounds(115, 350, 480, 160);
        this.endNote.setFont(new Font("Serif", Font.ITALIC, 15));
        this.windowNote = new JLabel("<html> <font color='#249ADE' style='font-size:32px'> Welcome to Cola Calc </html>");
        this.windowNote.setBounds(this.winWidth/2 - 200, 20, this.winWidth, 120);
        this.windowNote.setFont(new Font("Serif", Font.BOLD, 30));
        
        //create background image
        ImageIcon temp = new ImageIcon("Images/bg2.jpg");
        this.bgImage = temp.getImage();
        this.bgImageIcon = new ImageIcon(bgImage.getScaledInstance(600, 500, Image.SCALE_SMOOTH));
        this.bgImageLabel = new JLabel(this.bgImageIcon);
        this.bgImageLabel.setBounds(0, 0, this.winWidth , this.winHeight);
        
        
        //add components to the frame 
        this.add(this.windowNote);
        this.add(this.endNote);
        this.add(this.prime_btn);
        this.add(this.basic_geometry_btn);
        this.add(this.fibonacci_btn);
        this.add(this.bgImageLabel); //adds background image to the frame
        
        
        
        
        
        //set defaults for the window
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(winWidth, winHeight);
        this.setResizable(false);
        this.setVisible(true);
        
    }
    
    
    
    public static JButton createButton(String message, int x, int y, int width, int height){
        JButton button = new JButton();
        button.setBounds(x, y, width, height);
        button.setText(message);
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", Font.BOLD, 16));
        button.setForeground(Color.BLACK);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());      
        return button;
    }
    
    public static JLabel draw(String message, int x, int y, int width, int height){
        JLabel label = new JLabel(message);
        label.setBounds(x, y, width, height);
        label.setBorder(BorderFactory.createDashedBorder(Color.red));
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        return label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == prime_btn){
            this.dispose();
            new PrimeWindow();
        }else if (e.getSource() == fibonacci_btn){
            this.dispose();
            new FibonacciWindow();
        }else if ( e.getSource() == basic_geometry_btn){ 
            this.dispose();
            new BasicGeometry();
        }
    }
    
    
    
}




