import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons= new JButton[10];
    JButton[] FuncButtons= new JButton[8];
    JButton add,sub,mul,div;
    JButton decimal, equal, del, clr;
    JPanel panel;

    Font myFont= new Font("Ink free", Font.BOLD,30);

    double num1=0, num2=0, result=0;
    char operator;



    Calculator(){

        frame= new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,500);
        frame.getContentPane().setBackground(Color.pink);
        frame.setLayout(null);

        textField= new JTextField();
        textField.setBounds(50, 25, 300, 40);
        textField.setFont(myFont);
        textField.setEditable(false);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        decimal = new JButton(".");
        equal = new JButton("=");
        del = new JButton("Delete");
        clr = new JButton("Clear");

        FuncButtons[0]= add;
        FuncButtons[1]= sub;
        FuncButtons[2]= mul;
        FuncButtons[3]= div;
        FuncButtons[4]= decimal;
        FuncButtons[5]= equal;
        FuncButtons[6]= del;
        FuncButtons[7]= clr;


        for(int i=0; i<8; i++){
            FuncButtons[i].addActionListener(this);
            FuncButtons[i].setFont(myFont);
            FuncButtons[i].setFocusable(false);
        }

        for(int i=0; i<10; i++){
            numberButtons[i]=new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        del.setBounds(50,390,145,50);
        clr.setBounds(205, 390, 145, 50);

        panel= new JPanel();
        panel.setBounds(50, 75, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.black);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(add);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(sub);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mul);
        panel.add(decimal);
        panel.add(numberButtons[0]);
        panel.add(equal);
        panel.add(div);

        frame.add(panel);
        frame.add(del);
        frame.add(clr);
        frame.add(textField);
        frame.setVisible(true);

    }
    public static void main(String[] args){
        Calculator calculator= new Calculator();

    }
    public void actionPerformed(ActionEvent e){
        for(int i = 0; i<10; i++){
            if (e.getSource()==numberButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));

            }
        }
        if(e.getSource()==decimal){
            textField.setText(textField.getText().concat("."));
        }

        if(e.getSource()==add){
            num1=Double.parseDouble(textField.getText());
            operator='+';
            textField.setText("");
        }
        if(e.getSource()==sub){
            num1=Double.parseDouble(textField.getText());
            operator='-';
            textField.setText("");
        }
        if(e.getSource()==mul){
            num1=Double.parseDouble(textField.getText());
            operator='*';
            textField.setText("");
        }
        if(e.getSource()==div){
            num1=Double.parseDouble(textField.getText());
            operator='/';
            textField.setText("");
        }
        if (e.getSource()==equal){
            num2=Double.parseDouble(textField.getText());
            switch (operator){
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case '*':
                    result=num1-num2;
                    break;
                case '/':
                    result=num1/num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==clr){
            textField.setText("");
        }
        if(e.getSource()==del){
            String string= textField.getText();
            textField.setText("");
            for(int i=0; i<string.length()-1; i++){
                textField.setText(textField.getText()+string.charAt(i));
            }
        }

    }

}


