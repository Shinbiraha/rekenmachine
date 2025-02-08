import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Main {

//define window size
static short width = 600;
static short height = 900;

//define button data
static Dimension buttonsize = new Dimension((width -60) / 3, (height - 60) /6);
static Font buttonfont = new Font("Aptos", Font.PLAIN, 40);

//Set default Calculator data
static double a = 0;
static String operator = "";
static double b = 0; 
static boolean usingdecimal = false;
static short decimals =0;

//Create the window
static JFrame frame = new JFrame("Calculator");

//create input screen
static JLabel label = new JLabel("Testing");
    public static void main(String[] args) {

    //make the grid layout
    frame.setLayout(new GridBagLayout());

    //window position    
    frame.setSize(width, height);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //screen position
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 3;
    gbc.gridheight = 1;
    label.setPreferredSize(new Dimension(width - 60, (height - 60) /6));

    //adding style to screen
    label.setFont(buttonfont);

    //add numbers
    addnumbutton(1, 0, 1);
    addnumbutton(2, 1, 1);
    addnumbutton(3, 2, 1);
    addnumbutton(4, 0, 2);
    addnumbutton(5, 1, 2);
    addnumbutton(6, 2, 2);
    addnumbutton(7, 0, 3);
    addnumbutton(8, 1, 3);
    addnumbutton(9, 2, 3);
    addnumbutton(0, 0, 4);

    //update the window
    frame.setVisible(true);
    }

    public static void addnum(String buttonInput) {
        frame.requestFocusInWindow();
        Integer number = Integer.parseInt(buttonInput);
        if (operator != "" || a == 0.0) {
            if (usingdecimal) {
                decimals++;
            } else {
                b *= 10;
            }
            b += number / Math.pow(10, decimals);
        }
    }

    public static void addnumbutton(Integer number, Integer gridx, Integer gridy) {
        ActionListener buttonListener = e -> addnum(((JButton) e.getSource()). getText());
        createbutton(buttonListener, String.valueOf(number), gridx, gridy);
    }
    //create new button
    public static void createbutton(ActionListener buttonlListener, String displaytext, Integer gridx, Integer gridy) {
        GridBagConstraints gbc = new GridBagConstraints();
        JButton num = new JButton(displaytext);
        num.setPreferredSize(buttonsize);
        num.setFont(buttonfont);
        num.addActionListener(buttonlListener);
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        frame.add(num, gbc);
    }
}