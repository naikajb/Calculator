import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/*


 */
public class Calculator {

    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel text = new JLabel();
    JButton[] numbers = new JButton[10];

    public Calculator(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,450);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        //header that will be the calculator's little display window
        text.setBackground(Color.BLACK);
        text.setForeground(new Color(1,58,58));
        text.setFont(new Font("Sherif", Font.PLAIN, 12));
        text.setHorizontalAlignment(JLabel.RIGHT);
        text.setText("Click on any button to start");

        title_panel.add(text);
        title_panel.setBounds(0,0,350,450);
        frame.add(title_panel, BorderLayout.NORTH);
    }


}
