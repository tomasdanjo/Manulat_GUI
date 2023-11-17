import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.time.Year.isLeap;

public class Leap_Year_Checker extends JFrame {
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel container;


    public Leap_Year_Checker(){
        setContentPane(container);
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    long year = Long.parseLong(tfYear.getText());
                    if(isLeap(year))JOptionPane.showMessageDialog(null,"Leap Year");
                    else JOptionPane.showMessageDialog(null, "Not a leap year");
                }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(null, "Invalid Input");
                }

            }
        });
    }

    public static void main(String[] args) {
        Leap_Year_Checker app = new Leap_Year_Checker();
        app.setSize(300, 250);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
