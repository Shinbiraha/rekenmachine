import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Main {

//define window size
static short width = 600;
static short height = 900;

//Set default Calculator data
static String a = "";
static String operator = "";
static String b = "";

//Create the window
static JFrame frame = new JFrame("Calculator");
    public static void main(String[] args) {

    //make the grid layout
    frame.setLayout(new GridBagLayout());

    //window position    
    frame.setSize(width, height);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    JLabel label = new JLabel("Testing");
    label.setBounds(100, 0, 150, 20);

    frame.setVisible(true);
    }
    //create new button
    public static void createbutton(ActionListener buttonlListener, String displaytext, Integer gridx, Integer gridy) {

    }
}