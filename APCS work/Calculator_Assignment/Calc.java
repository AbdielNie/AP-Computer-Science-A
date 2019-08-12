import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Calc extends JFrame 
{
 
    private static final Font BIGGER_FONT = new Font("monspaced", Font.PLAIN, 20);
    private JTextField displayField;       // display result / input.
    
    private boolean   startNumber = true;      
    private String    previousOp  = "=";      
    private CalcLogic logic = new CalcLogic();

    public static void main(String[] args) 
    {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception unused) 
        {
            ; 
        }
        

        Calc window = new Calc();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    

    public Calc() 
    {

        displayField = new JTextField("0", 12);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(BIGGER_FONT);
        

        JButton clearButton = new JButton("Clear");
        clearButton.setFont(BIGGER_FONT);
        clearButton.addActionListener(new ClearListener());
        

        ActionListener numListener = new NumListener();
        

        String buttonOrder = "789456123 0 ";
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 3, 2, 2));
        for (int i = 0; i < buttonOrder.length(); i++) 
        {
            String keyTop = buttonOrder.substring(i, i+1);
            JButton b = new JButton(keyTop);
            if (keyTop.equals(" ")) {

                b.setEnabled(false);
            } else {

                b.addActionListener(numListener);
                b.setFont(BIGGER_FONT);
            }
            buttonPanel.add(b);
        }
        

        ActionListener opListener = new OpListener();
        
        JPanel opPanel = new JPanel();
        opPanel.setLayout(new GridLayout(5, 1, 2, 2));
        String[] opOrder = {"+", "-", "*", "/", "=","sin","cos","tan","x^2","1/x"};
        for (int i = 0; i < opOrder.length; i++) {
            JButton b = new JButton(opOrder[i]);
            b.addActionListener(opListener);
            b.setFont(BIGGER_FONT);
            opPanel.add(b);
        }

        JPanel clearPanel = new JPanel();
        clearPanel.setLayout(new FlowLayout());
        clearPanel.add(clearButton);

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout(5, 5));
        content.add(displayField, BorderLayout.NORTH );
        content.add(buttonPanel   , BorderLayout.CENTER);
        content.add(opPanel       , BorderLayout.EAST  );
        content.add(clearPanel    , BorderLayout.SOUTH );
        
        content.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        

        this.setContentPane(content);
        this.pack();
        this.setTitle("Simple Calc");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void actionClear() {
        startNumber = true;         
        displayField.setText("0");
        previousOp  = "=";
        logic.setTotal("0");
    }
    
    class OpListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (startNumber) {
                actionClear();
                displayField.setText("ERROR - No operator");
            } else {
               
                startNumber = true;  
                try {
                   
                    String displayText = displayField.getText();
                    
                    if (previousOp.equals("=")) {
                        logic.setTotal(displayText);
                    } else if (previousOp.equals("+")) {
                        logic.add(displayText);
                    } else if (previousOp.equals("-")) {
                        logic.subtract(displayText);
                    } else if (previousOp.equals("*")) {
                        logic.multiply(displayText);
                    } else if (previousOp.equals("/")) {
                        logic.divide(displayText);
                    }else if(previousOp.equals("x^2")){
                        logic.pow2(displayText);
                    }
                    
                    displayField.setText("" + logic.getTotalString());
                    
                } catch (NumberFormatException ex) {
                    actionClear();
                    displayField.setText("Error");
                }

                previousOp = e.getActionCommand();
            }
        }
    }

    class NumListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String digit = e.getActionCommand();
            if (startNumber) {

                displayField.setText(digit);
                startNumber = false;
            } else {
                displayField.setText(displayField.getText() + digit);
            }
        }
    }
    
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            actionClear();
        }
    }
}
