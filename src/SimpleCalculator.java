import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JLabel lblResult;
    private JComboBox cbOperations;
    private JButton computeResultButton;
    private JPanel container;


    public SimpleCalculator(){
        setContentPane(container);
        computeResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(tfNumber1.getText());
                float num2 = Float.parseFloat(tfNumber2.getText());
                String op = (String)cbOperations.getSelectedItem();

                switch(op){
                    case "+":
                        lblResult.setText(String.format("%.2f",num1+num2));
                        break;
                    case "-":
                        lblResult.setText(String.format("%.2f",num1-num2));
                        break;
                    case "*":
                        lblResult.setText(String.format("%.2f",num1*num2));
                        break;
                    case "/":
                        lblResult.setText(String.format("%.2f",num1/num2));
                        break;
                }
            }


        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setSize(700, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }


}
