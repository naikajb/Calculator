import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/*


 */
public class Calculator implements ActionListener{

    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel result_Panel = new JPanel();
    JPanel number_panel = new JPanel();
    JPanel operation_panel = new JPanel();
    JLabel text = new JLabel();
    JButton[] numbers = new JButton[10];
    JButton[] operations = new JButton[5];

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
        text.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,350,450);

        result_Panel.setLayout(new BorderLayout());
        number_panel.setLayout(new GridLayout(4,3));
        operation_panel.setLayout(new GridLayout(5,1));

        for (int i = 0; i < operations.length; i++){
            operations[i] = new JButton();
            operation_panel.add(operations[i]);
            operations[i].setFont(new Font("Sherif",Font.BOLD,20));
            operations[i].setFocusable(false);
            operations[i].addActionListener(this);
            switch(i){
                case 0:
                    operations[0].setText("*");
                    break;
                case 1:
                    operations[1].setText("/");
                    break;
                case 2:
                    operations[2].setText("+");
                    break;
                case 3:
                    operations[3].setText("-");
                    break;
                case 4:
                    operations[4].setText("Enter");
            }
        }

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = new JButton();
            number_panel.add(numbers[i]);
            numbers[i].setFont(new Font("Sherif",Font.BOLD,20));
            numbers[i].setFocusable(false);
            numbers[i].addActionListener(this);
            if (i == 9){
                numbers[i].setText("0");
            }else{
                numbers[i].setText(String.valueOf(i + 1));
            }
        }

        title_panel.add(text);

        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(result_Panel);
        frame.add(number_panel);
        frame.add(operation_panel, BorderLayout.EAST);


    }


    @Override
    public void actionPerformed(ActionEvent e) {


    }

    public int add(int a, int b){
        return 0;
    }
    public int multiply(int a, int b){
        return 0;
    }

    public int divide (int a, int b){
        return 0;
    }

    public int subtract(int a, int b){
        return 0;
    }

}
