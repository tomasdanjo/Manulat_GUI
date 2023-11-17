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
                try{
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
                            if(num2==0)throw new NumberFormatException();
                            lblResult.setText(String.format("%.2f",num1/num2));
                            break;
                    }
                }catch(NumberFormatException b){
                    JOptionPane.showMessageDialog(null, "Invalid Input");
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
