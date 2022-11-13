import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Calculatrice implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JButton[] OPbuttons = new JButton[9];
    JButton[] NUMbuttons = new JButton[10];
    JButton add, times, div, minus;
    JButton del, clear, equal, neg, decimal;
    JPanel panel;

    double num1 = 0, num2 = 0, result = 0;
    char operator;
    Calculatrice(){
        frame = new JFrame("Calculatrice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);


        textfield = new JTextField();
        textfield.setBounds(50,25,300,70);
        textfield.setFont(new Font("SERIF", Font.BOLD,55));
        textfield.setBackground(new Color(52, 52, 54));
        textfield.setEditable(false);

        add = new JButton("+");
        times = new JButton("x");
        div = new JButton("/");
        minus = new JButton("-");
        del = new JButton("del");
        clear = new JButton("C");
        equal = new JButton("=");
        neg = new JButton("(-)");
        decimal = new JButton(".");

        OPbuttons[0] = add;
        OPbuttons[1] = times;
        OPbuttons[2] = div;
        OPbuttons[3] = minus;
        OPbuttons[4] = del;
        OPbuttons[5] = clear;
        OPbuttons[6] = equal;
        OPbuttons[7] = neg;
        OPbuttons[8] = decimal;

        for(int i = 0; i < OPbuttons.length; i++){
            OPbuttons[i].addActionListener(this);
            OPbuttons[i].setFont(new Font("SERIF", Font.BOLD, 40));
            OPbuttons[i].setFocusable(false);
        }

        for(int i = 0; i < NUMbuttons.length; i++){
            NUMbuttons[i] = new JButton(String.valueOf(i));
            NUMbuttons[i].addActionListener(this);
            NUMbuttons[i].setFont(new Font("SERIF", Font.BOLD, 40));
            NUMbuttons[i].setFocusable(false);
        }

        clear.setBounds(50,100,90,50);
        del.setBounds(150,100,90,50);
        neg.setBounds(250,100,100,50);

        panel = new JPanel();
        panel.setBounds(50,150,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));

        panel.add(NUMbuttons[1]);
        panel.add(NUMbuttons[2]);
        panel.add(NUMbuttons[3]);
        panel.add(add);
        panel.add(NUMbuttons[4]);
        panel.add(NUMbuttons[5]);
        panel.add(NUMbuttons[6]);
        panel.add(minus);
        panel.add(NUMbuttons[7]);
        panel.add(NUMbuttons[8]);
        panel.add(NUMbuttons[9]);
        panel.add(times);
        panel.add(decimal);
        panel.add(NUMbuttons[0]);
        panel.add(equal);
        panel.add(div);

        frame.add(panel);
        frame.add(neg);
        frame.add(del);
        frame.add(clear);
        frame.add(textfield);
        frame.setVisible(true);

    }

    public static void main(String[] args){
        Calculatrice calc = new Calculatrice();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
