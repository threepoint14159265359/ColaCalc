/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import colacalc.exceptions.*;
import colacalc.shape.Rectangle;
import colacalc.shape.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;



/**
 *
 * @author izhussai
 */
public class BasicGeometry extends JFrame implements ActionListener{

    private JFrame frame; 
    
    //window general attribs 
    private final int winWidth = 600, winHeight = 500;
    private String area = "", parimeter="";
    private Rectangle rect; 
    
    //buttons
    private final JButton rectangle_btn; 
    private final JButton triangle_btn; 
    private final JButton square_btn; 
    private final JButton circle_btn; 
    private final JButton rhombus_btn; 
    private final JButton back_btn;
        
    //background image attribs 
    private Image bgImage; 
    private ImageIcon bgImageIcon; 
    private JLabel bgImageLabel;
    
    //result displayer 
    private JLabel resultLabel, startNote, endNote; 
    
    public BasicGeometry(){
        this.frame = new JFrame("Basic Geometry");
        
        //create buttons
        this.rectangle_btn = MainWindow.createButton("Rectangle", 30, 100, 150, 50);
        this.circle_btn = MainWindow.createButton("Circle", 210, 100, 150, 50);
        this.square_btn = MainWindow.createButton("Square", 390, 100, 150, 50);
        this.rhombus_btn = MainWindow.createButton("Rhombus", 210, 200, 150, 50);
        this.triangle_btn = MainWindow.createButton("Triangle", 390, 200, 150, 50);
        this.back_btn = MainWindow.createButton("Main Window", 30, 200, 150, 50);
        this.resultLabel = MainWindow.draw("<html> <font color='#249ADE' style='font-size:20px'>Area: " + this.area + "<br/><br/>"+ "Parimeter: " + this.parimeter + "</html>", 10, this.winHeight/2 + 20, this.winWidth - 40, 180);
        this.resultLabel.setBorder(BorderFactory.createDashedBorder(Color.CYAN));

        this.startNote = new JLabel("<html> <font color='#249ADE'> " + "Basic Geometry"  + " </html>");
        this.startNote.setBounds(this.winWidth/2 - 100, 10, 300, 80);
        this.startNote.setFont(new Font("Serif", Font.BOLD, 30));
        
        
        //add background image
        ImageIcon temp = new ImageIcon(getImage("Images/bg2.jpg"));
        this.bgImage = temp.getImage();
        this.bgImageIcon = new ImageIcon(bgImage.getScaledInstance(600, 500, Image.SCALE_SMOOTH));
        this.bgImageLabel = new JLabel(this.bgImageIcon);
        this.bgImageLabel.setLayout(null);
        this.bgImageLabel.setBounds(0, 0, winWidth, winHeight);
        
        
        this.add(this.startNote);
        this.add(this.resultLabel);
        //add buttons to the frame
        this.add(this.rectangle_btn);
        this.add(this.triangle_btn);
        this.add(this.square_btn);
        this.add(this.circle_btn);
        this.add(this.rhombus_btn); 
        this.add(this.back_btn);
        this.add(this.bgImageLabel); //adds background image to the frame
        
        
                
        
        //add event listner to the buttons
        this.rectangle_btn.addActionListener(this);
        this.triangle_btn.addActionListener(this);
        this.square_btn.addActionListener(this);
        this.circle_btn.addActionListener(this);
        this.rhombus_btn.addActionListener(this);
        this.back_btn.addActionListener(this);
        
        //set defaults for the window
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(winWidth, winHeight);
        this.setResizable(false);
        this.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.area = this.parimeter = "";
        this.resultLabel.setText("<html> <font color='#249ADE' style='font-size:20px'>Area: " + this.area + "<br/><br/>"+ "Parimeter: " + this.parimeter + "</html>");
        if(e.getSource() == this.back_btn){
            this.dispose();
            new MainWindow();
        }
        
        if(e.getSource() == this.rectangle_btn){
            //TODO: add the error handling for string inputs
            //generate rectangle gui
            String w = JOptionPane.showInputDialog(null, "Enter Width of the Rectangle:");
            double width = Double.parseDouble(w); 
            w = JOptionPane.showInputDialog(null, "Enter Height of the Rectangel:");
            double height = Double.parseDouble(w);
            try {
                this.rect = new Rectangle(width, height);
                this.area = Double.toString(this.rect.area());
                this.parimeter = Double.toString(this.rect.perimeter());
                this.resultLabel.setText("<html> <font color='#249ADE' style='font-size:20px'>Area: " + this.area + "<br/><br/>"+ "Parimeter: " + this.parimeter + "</html>");
            }catch (WidthOutOfRangeException | LengthOutOfRangeException widthRange){
                //Do something here. 
            }
        }
        
        
        if(e.getSource() == this.triangle_btn){
            //generate triangle gui
            String len; 
            double a,b,c = 0;
            len = JOptionPane.showInputDialog(null, "Enter Side 1 of the Triangle:");
            a = Double.parseDouble(len); 
            len = JOptionPane.showInputDialog(null, "Enter Side 2 of the Triangle:");
            b = Double.parseDouble(len);
            len = JOptionPane.showInputDialog(null, "Enter Side 3 of the Triangle:");
            c = Double.parseDouble(len);
            
            try{
                Triangle tri = new Triangle(a, b, c);
                this.area = Double.toString(tri.area());
                this.parimeter = Double.toString(tri.perimeter());
                this.resultLabel.setText("<html> <font color='#249ADE' style='font-size:20px'>Area: " + this.area + "<br/><br/>"+ "Parimeter: " + this.parimeter + "</html>");
            } catch (LengthOutOfRangeException ex) {
                //Do something here
            }
        }
        
        if(e.getSource() == this.square_btn){
            //generate triangle gui
            String len; 
            double a,b,c = 0;            
            len = JOptionPane.showInputDialog(null, "Enter side-length of the square:");
            a = Double.parseDouble(len); 

            try{
                Square sqr = new Square(a);
                this.area = Double.toString(sqr.area());
                this.parimeter = Double.toString(sqr.perimeter());
                this.resultLabel.setText("<html> <font color='#249ADE' style='font-size:20px'>Area: " + this.area + "<br/><br/>"+ "Parimeter: " + this.parimeter + "</html>");
            } catch (LengthOutOfRangeException ex) {
                //Do something here
            }
        }
        
        if(e.getSource() == this.rhombus_btn){
            //generate rhombus gui
            String w = JOptionPane.showInputDialog(null, "Enter P diagonal of the Rhombus:");
            double width = Double.parseDouble(w); 
            w = JOptionPane.showInputDialog(null, "Enter Q diagonal of the Rhombus:");
            double height = Double.parseDouble(w);
            try {
                Rhombus rhm = new Rhombus(width, height);
                this.area = Double.toString(rhm.area());
                this.parimeter = Double.toString(rhm.perimeter());
                this.resultLabel.setText("<html> <font color='#249ADE' style='font-size:20px'>Area: " + this.area + "<br/><br/>"+ "Parimeter: " + this.parimeter + "</html>");
            }catch (PDiagonalOutOfRangeException | QDiagonalOutOfRangeException ex) {
                //Do something here. 
            }
        }
        
        if(e.getSource() == this.circle_btn){
            //generate triangle gui
            String len; 
            double a,b,c = 0;            
            len = JOptionPane.showInputDialog(null, "Enter Radius of the Circle: ");
            a = Double.parseDouble(len); 

            try{
                Circle circle = new Circle(a);
                this.area = Double.toString(circle.area());
                this.parimeter = Double.toString(circle.perimeter());
                this.resultLabel.setText("<html> <font color='#249ADE' style='font-size:20px'>Area: " + this.area + "<br/><br/>"+ "Parimeter: " + this.parimeter + "</html>");
            } catch (RadiusOutOfRangeException ex) {
                //Do something here
            }
        }
        
    }

    public static Image getImage(final String pathAndFileName) {
        final URL url = Thread.currentThread().getContextClassLoader().getResource(pathAndFileName);
        return Toolkit.getDefaultToolkit().getImage(url);
    }
}
