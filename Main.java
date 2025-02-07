import java.awt.event.*;
import javax.swing.*;

public class Main {

//*define window size */
static short width = 600;
static short height = 900;

//*Set default Calculator data */
static String a = "";
static String operator = "";
static String b = "";

//*Create the window */
static JFrame frame = new JFrame("Calculator");
    public static void main(String[] args) {

    frame.setSize(width, height);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    JLabel label = new JLabel("Testing");
    label.setBounds(100, 0, 150, 20);

    JButton een = new JButton("1");
    een.setBounds(250, 100, 100, 30);

    JButton twee = new JButton("2");
    twee.setBounds(350, 100, 100, 30);

    JButton drie = new JButton("3");
    drie.setBounds(450, 100, 100, 30);

    JButton vier = new JButton("4");
    vier.setBounds(250, 130, 100, 30);

    JButton vijf = new JButton("5");
    vijf.setBounds(350, 130, 100, 30);

    JButton zes = new JButton("6");
    zes.setBounds(450, 130, 100, 30);

    JButton zeven = new JButton("7");
    zeven.setBounds(250, 160, 100, 30);

    JButton acht = new JButton("8");
    acht.setBounds(350, 160, 100, 30);

    JButton negen = new JButton("9");
    negen.setBounds(450, 160, 100, 30);

    JButton nul = new JButton("0");
    nul.setBounds(250, 190, 100, 30);

    een.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            a = a + "1";
            label.setText(a);
        }
    });

    frame.add(een);
    frame.add(twee);
    frame.add(drie);

    frame.add(vier);
    frame.add(vijf);
    frame.add(zes);

    frame.add(zeven);
    frame.add(acht);
    frame.add(negen);

    frame.add(nul);   

    frame.add(label);
    }
}