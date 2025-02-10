import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Objects;

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

//Create the window
static JFrame frame = new JFrame("Calculator");

//create the screen
static JLabel label = new JLabel("");
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
    label.setOpaque(true);
    label.setBackground(new Color(100, 200, 255));

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

    //add operators
    addopbutton("+", 1, 4);
    addopbutton("-", 2, 4);
    addopbutton("=", 0, 5);
    addopbutton("/", 1, 5);
    addopbutton("*", 2, 5);


    //update the window
    frame.setVisible(true);
    frame.add(label, gbc);
    }

    public static void addop(String buttoninput) {
        frame.requestFocusInWindow();
        Integer operator = Integer.parseInt(buttoninput);
    }
    
    public static void addnum(String buttonInput) {
        frame.requestFocusInWindow();
        Integer number = Integer.parseInt(buttonInput);
    }

    public static void setOperator() {
        frame.requestFocusInWindow();
        if (a == 0) {
            a = b;
            b = 0;
        }
        if (b != 0) {
            calculate();
        }
    }

    public static void calculate() {
        frame.requestFocusInWindow();
        if (Objects.equals(operator, "+")) {
            a = a + b;
        } else if (Objects.equals(operator, "-")) {
            a = a - b;
        } else if (Objects.equals(operator, "*")) {
            a = a * b;
        } else if (Objects.equals(operator, "/")) {
            a = a / b;
        }
    }

    public static void addopbutton(String operator, Integer gridx, Integer gridy) {
        ActionListener buttonListener = e -> addop(((JButton) e.getSource()). getText());
        createopbutton(buttonListener, String.valueOf(operator), gridx, gridy);
    }

    public static void addnumbutton(Integer number, Integer gridx, Integer gridy) {
        ActionListener buttonListener = e -> addnum(((JButton) e.getSource()). getText());
        createnumbutton(buttonListener, String.valueOf(number), gridx, gridy);
    }

    //create operator button
    public static void createopbutton(ActionListener buttonListener, String displaytext, Integer gridx, Integer gridy) {
        GridBagConstraints gbc = new GridBagConstraints();
        JButton num = new JButton(displaytext);
        num.setPreferredSize(buttonsize);
        num.setFont(buttonfont);
        num.addActionListener(buttonListener);
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        frame.add(num, gbc);
    }

    //create num button
    public static void createnumbutton(ActionListener buttonListener, String displaytext, Integer gridx, Integer gridy) {
        GridBagConstraints gbc = new GridBagConstraints();
        JButton num = new JButton(displaytext);
        num.setPreferredSize(buttonsize);
        num.setFont(buttonfont);
        num.addActionListener(buttonListener);
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        frame.add(num, gbc);
    }
}