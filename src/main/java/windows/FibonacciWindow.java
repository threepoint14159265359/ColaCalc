
package windows;

import colacalc.exceptions.LengthOutOfRangeException;
import colacalc.shape.NFibonacci;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


public class FibonacciWindow extends JFrame implements ActionListener{
    
    //general window attribs
    private final JFrame frame;
    private final int winWidth = 600, winHeight = 500;
    private String result = ""; 
    
    //buttons
    private final JButton back_btn, enter_number_btn; 
      
    //background image attribs
    private Image bgImage; 
    private ImageIcon bgImageIcon; 
    private JLabel bgImageLabel; 
    
    //text display attribs
    private final JLabel resultLabel,  startNote, number_boundry;
    
    
    public FibonacciWindow(){
        this.frame = new JFrame("Fibonacci Window");
        this.enter_number_btn = MainWindow.createButton("Find Fibonacci", 40, 100, 200, 40);
        this.back_btn = MainWindow.createButton("Main Window", 330, 100, 200, 40);
        this.startNote = new JLabel("<html> <font color='#249ADE'> " + "Nth Fibonacci Number"  + " </html>");
        this.startNote.setBounds(this.winWidth/2 - 150, 10, 300, 80);
        this.startNote.setFont(new Font("Serif", Font.BOLD, 30));
        this.number_boundry = MainWindow.draw("<html> <font color='#FF0000' style='font-size:20px'> NOTE: This application is restricted to find 1-255th fibonacci numbers. </html>", 10, this.winHeight/2  - 100, this.winWidth - 30, this.winHeight/2  - 150);
        this.resultLabel = MainWindow.draw("<html> <font color='#249ADE' style='font-size:20px'> Result: " + result + "<br/><br/> </html>", 10, this.winHeight/2 + 50, this.winWidth - 30, 150 );
        this.resultLabel.setBorder(BorderFactory.createDashedBorder(Color.CYAN));
        
        
        ImageIcon temp = new ImageIcon(getImage("Images/bg2.jpg"));
        this.bgImage = temp.getImage();
        this.bgImageIcon = new ImageIcon(bgImage.getScaledInstance(600, 500, Image.SCALE_SMOOTH));
        this.bgImageLabel = new JLabel(this.bgImageIcon);
        this.bgImageLabel.setLayout(null);
        this.bgImageLabel.setBounds(0, 0, winWidth, winHeight);
        
        
        this.add(this.startNote);
        this.add(this.number_boundry);
        this.add(this.resultLabel);
        this.add(this.enter_number_btn);
        this.add(this.back_btn);
        this.add(bgImageLabel);
        
        
        
        
        this.back_btn.addActionListener(this);
        this.enter_number_btn.addActionListener(this);
        
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(winWidth, winHeight);
        this.setResizable(false);
        this.setVisible(true);
    }
        
    

    @Override
    public void actionPerformed(ActionEvent e) {
        this.resultLabel.setText("<html> <font color='#249ADE' style='font-size:20px'>Result: <br/><br/> </html>");
        if (e.getSource() == this.back_btn){
            this.dispose();
            new MainWindow();
        }
        if(e.getSource() == this.enter_number_btn ){
            String nth = JOptionPane.showInputDialog(null, "Enter the nth number:");
            long number = Long.parseLong(nth); 
            try {
                NFibonacci fib = new NFibonacci(number);
                this.result = Long.toString(fib.getNthFibonacciNumber());
                this.resultLabel.setText("<html> <font color='#249ADE' style='font-size:20px'> Result: " + result + "<br/><br/> </html>");
            } catch (LengthOutOfRangeException ex) {
                //do something here
            }
            
        }
    }
    public static Image getImage(final String pathAndFileName) {
        final URL url = Thread.currentThread().getContextClassLoader().getResource(pathAndFileName);
        return Toolkit.getDefaultToolkit().getImage(url);
    }
    
    
}
