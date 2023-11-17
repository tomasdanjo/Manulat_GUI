import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JPanel container;

    int food_Val(String name){
        switch(name){
            case "Pizza":
                return 100;
            case "Burger":
                return 80;
            case "Fries":
                return 65;
            case "Soft Drinks":
                return 55;
            case "Tea":
                return 50;
            case "Sundae":
                return 40;
        }
        return 0;
    }

    double discount_val(String name){
        switch (name){
            case "None":
                return 0;
            case "5% Off":
                return 0.05;
            case "10% Off":
                return 0.1;
            case "15% Off":
                return 0.15;
        }
        return 0;
    }
    public FoodOrderingSystem(){
        setContentPane(container);
        JCheckBox[] cbs = {cPizza, cBurger, cFries,cSoftDrinks,cTea,cSundae };
        JRadioButton[] rbs = {rbNone, rb5,rb10,rb15};

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sum = 0;
                for(JCheckBox b : cbs){
                    if(b.isSelected()){
                        sum+=food_Val(b.getText());
                    }
                }

                double discount = 0;
                for(JRadioButton r : rbs){
                    if(r.isSelected()){
                        discount = discount_val(r.getText());
                    }
                }

                JOptionPane.showMessageDialog(null,String.format("The total price is Php %.2f",sum*(1-discount)));

            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setSize(700, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}
