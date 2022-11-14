package kjellgren.linus.cleancodeprojekt;

public class ButtonPress {

    double getText, answer;
    int calculatorOperator;
    boolean clear = true;
    ComponentsForJFrame componentsForJFrame;

    public ButtonPress(ComponentsForJFrame componentsForJFrame) {
        this.componentsForJFrame = componentsForJFrame;
        disableOperatorButtons();
    }

    public void connectButtons() {
        componentsForJFrame.getRadioButton2().addActionListener(this::offButton);
        componentsForJFrame.getRadioButton1().addActionListener(this::onButton);
        componentsForJFrame.getDot().addActionListener(this::dotButton);
        componentsForJFrame.getZero().addActionListener(this::button0);
        componentsForJFrame.getOne().addActionListener(this::button1);
        componentsForJFrame.getTwo().addActionListener(this::button2);
        componentsForJFrame.getThree().addActionListener(this::button3);
        componentsForJFrame.getFour().addActionListener(this::button4);
        componentsForJFrame.getFive().addActionListener(this::button5);
        componentsForJFrame.getSix().addActionListener(this::button6);
        componentsForJFrame.getSeven().addActionListener(this::button7);
        componentsForJFrame.getEight().addActionListener(this::button8);
        componentsForJFrame.getNine().addActionListener(this::button9);
        componentsForJFrame.getEqual().addActionListener(this::EqualsButton);
        componentsForJFrame.getBack().addActionListener(this::backButton);
        componentsForJFrame.getClear().addActionListener(this::clearButton);
        componentsForJFrame.getPlus().addActionListener(this::plusButton);
        componentsForJFrame.getMinus().addActionListener(this::minusButton);
        componentsForJFrame.getMultiply().addActionListener(this::buttonMultiply);
        componentsForJFrame.getDivision().addActionListener(this::divisionButton);

    }

    public void math() {
        System.out.println(componentsForJFrame.getTextField().getText());
        switch (calculatorOperator) {
            case 1 -> answer = CalculatorFormulas.addition(getText, componentsForJFrame);
            case 2 -> answer = CalculatorFormulas.subtraction(getText, componentsForJFrame);
            case 3 -> answer = CalculatorFormulas.multiplication(getText, componentsForJFrame);
            case 4 -> answer = CalculatorFormulas.division(getText, componentsForJFrame);
        }
        System.out.println("=");
        System.out.println(answer);
    }

    protected void numberTextField(javax.swing.JButton button) {
        componentsForJFrame.getTextField().setText(componentsForJFrame.getTextField().getText() + button.getText());
        enableOperatorButtons();
    }

    public void onButton() {
        componentsForJFrame.getTextField().setEnabled(true);
        componentsForJFrame.getBack().setEnabled(true);
        componentsForJFrame.getClear().setEnabled(true);
        componentsForJFrame.getPlus().setEnabled(true);
        componentsForJFrame.getSeven().setEnabled(true);
        componentsForJFrame.getEight().setEnabled(true);
        componentsForJFrame.getNine().setEnabled(true);
        componentsForJFrame.getFour().setEnabled(true);
        componentsForJFrame.getFive().setEnabled(true);
        componentsForJFrame.getSix().setEnabled(true);
        componentsForJFrame.getOne().setEnabled(true);
        componentsForJFrame.getTwo().setEnabled(true);
        componentsForJFrame.getThree().setEnabled(true);
        componentsForJFrame.getMinus().setEnabled(true);
        componentsForJFrame.getMultiply().setEnabled(true);
        componentsForJFrame.getDivision().setEnabled(true);
        componentsForJFrame.getDot().setEnabled(true);
        componentsForJFrame.getZero().setEnabled(true);
        componentsForJFrame.getEqual().setEnabled(true);
        componentsForJFrame.getRadioButton1().setEnabled(false);
        componentsForJFrame.getRadioButton2().setEnabled(true);
    }

    public void offButton() {
        componentsForJFrame.getTextField().setEnabled(false);
        componentsForJFrame.getBack().setEnabled(false);
        componentsForJFrame.getClear().setEnabled(false);
        componentsForJFrame.getPlus().setEnabled(false);
        componentsForJFrame.getSeven().setEnabled(false);
        componentsForJFrame.getEight().setEnabled(false);
        componentsForJFrame.getNine().setEnabled(false);
        componentsForJFrame.getFour().setEnabled(false);
        componentsForJFrame.getFive().setEnabled(false);
        componentsForJFrame.getSix().setEnabled(false);
        componentsForJFrame.getOne().setEnabled(false);
        componentsForJFrame.getTwo().setEnabled(false);
        componentsForJFrame.getThree().setEnabled(false);
        componentsForJFrame.getMinus().setEnabled(false);
        componentsForJFrame.getMultiply().setEnabled(false);
        componentsForJFrame.getDivision().setEnabled(false);
        componentsForJFrame.getDot().setEnabled(false);
        componentsForJFrame.getZero().setEnabled(false);
        componentsForJFrame.getEqual().setEnabled(false);
        componentsForJFrame.getRadioButton1().setEnabled(true);
        componentsForJFrame.getRadioButton2().setEnabled(false);
    }

    public void disableOperatorButtons() {
        componentsForJFrame.getBack().setEnabled(false);
        componentsForJFrame.getPlus().setEnabled(false);
        componentsForJFrame.getMinus().setEnabled(false);
        componentsForJFrame.getMultiply().setEnabled(false);
        componentsForJFrame.getDivision().setEnabled(false);
        componentsForJFrame.getDot().setEnabled(false);
        componentsForJFrame.getEqual().setEnabled(false);
    }

    public void enableOperatorButtons() {
        componentsForJFrame.getBack().setEnabled(true);
        componentsForJFrame.getPlus().setEnabled(true);
        componentsForJFrame.getMinus().setEnabled(true);
        componentsForJFrame.getMultiply().setEnabled(true);
        componentsForJFrame.getDivision().setEnabled(true);
        componentsForJFrame.getDot().setEnabled(true);
        componentsForJFrame.getEqual().setEnabled(true);
    }

    protected void button0(java.awt.event.ActionEvent evt) {
        numberTextField(componentsForJFrame.getZero());
    }
    protected void button1(java.awt.event.ActionEvent evt) {
        numberTextField(componentsForJFrame.getOne());
    }
    protected void button2(java.awt.event.ActionEvent evt) {
        numberTextField(componentsForJFrame.getTwo());
    }
    protected void button3(java.awt.event.ActionEvent evt) {
        numberTextField(componentsForJFrame.getThree());
    }
    protected void button4(java.awt.event.ActionEvent evt) {
        numberTextField(componentsForJFrame.getFour());
    }
    protected void button5(java.awt.event.ActionEvent evt) {
        numberTextField(componentsForJFrame.getFive());
    }
    protected void button6(java.awt.event.ActionEvent evt) {
        numberTextField(componentsForJFrame.getSix());
    }
    protected void button7(java.awt.event.ActionEvent evt) {
        numberTextField(componentsForJFrame.getSeven());
    }
    protected void button8(java.awt.event.ActionEvent evt) {
        numberTextField(componentsForJFrame.getEight());
    }
    protected void button9(java.awt.event.ActionEvent evt) {
        numberTextField(componentsForJFrame.getNine());
    }

    protected void plusButton(java.awt.event.ActionEvent evt) {
        if (!clear) {
            math();
        }
        System.out.println(componentsForJFrame.getTextField().getText());
        System.out.println("+");
        clear = false;
        getText = Double.parseDouble(componentsForJFrame.getTextField().getText());
        calculatorOperator = 1;
        componentsForJFrame.getTextField().setText("");
        componentsForJFrame.getLabel().setText(getText + "+");
    }
    protected void minusButton(java.awt.event.ActionEvent evt) {
        if (!clear) {
            math();
        }
        System.out.println(componentsForJFrame.getTextField().getText());
        System.out.println("-");
        clear = false;
        getText = Double.parseDouble(componentsForJFrame.getTextField().getText());
        calculatorOperator = 2;
        componentsForJFrame.getTextField().setText("");
        componentsForJFrame.getLabel().setText(getText + "-");
    }
    protected void divisionButton(java.awt.event.ActionEvent evt) {
        if (Double.parseDouble(componentsForJFrame.getTextField().getText()) == 0.0) {
            System.out.println("Division By Zero");
            componentsForJFrame.getTextField().setText("");
            componentsForJFrame.getLabel().setText("Division By Zero");
            disableOperatorButtons();
            clear = true;
        } else {
            if (!clear) {
                math();
            }
            System.out.println(componentsForJFrame.getTextField().getText());
            System.out.println("/");
            clear = false;
            getText = Double.parseDouble(componentsForJFrame.getTextField().getText());
            calculatorOperator = 4;
            componentsForJFrame.getTextField().setText("");
            componentsForJFrame.getLabel().setText(getText + "/");
        }
    }
    protected void buttonMultiply(java.awt.event.ActionEvent evt) {
        if (Double.parseDouble(componentsForJFrame.getTextField().getText()) == 0.0) {
            System.out.println("Multiplication By Zero");
            componentsForJFrame.getTextField().setText("");
            componentsForJFrame.getLabel().setText("Multiplication By Zero");
            disableOperatorButtons();
            clear = true;
        } else {
            if (!clear) {
                math();
            }
            System.out.println(componentsForJFrame.getTextField().getText());
            System.out.println("*");
            clear = false;
            getText = Double.parseDouble(componentsForJFrame.getTextField().getText());
            calculatorOperator = 3;
            componentsForJFrame.getTextField().setText("");
            componentsForJFrame.getLabel().setText(getText + "*");
        }
    }
    protected void dotButton(java.awt.event.ActionEvent evt) {
        numberTextField(componentsForJFrame.getDot());
    }
    protected void clearButton(java.awt.event.ActionEvent evt) {
        componentsForJFrame.getTextField().setText("");
        disableOperatorButtons();
    }
    protected void onButton(java.awt.event.ActionEvent evt) {
        onButton();
    }
    protected void offButton(java.awt.event.ActionEvent evt) {
        offButton();
    }
    protected void backButton(java.awt.event.ActionEvent evt) {
        int length = componentsForJFrame.getTextField().getText().length();
        int number = componentsForJFrame.getTextField().getText().length() - 1;
        String store;
        if (length > 0) {
            StringBuilder back = new StringBuilder(componentsForJFrame.getTextField().getText());
            back.deleteCharAt(number);
            store = back.toString();
            componentsForJFrame.getTextField().setText(store);
        }
        if (componentsForJFrame.getTextField().getText().length() == 0) {
            disableOperatorButtons();
        }
    }
    protected void EqualsButton(java.awt.event.ActionEvent evt) {
        math();
        clear = true;
        componentsForJFrame.getLabel().setText("");
    }
}
