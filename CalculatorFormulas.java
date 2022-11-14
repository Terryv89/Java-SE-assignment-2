package kjellgren.linus.cleancodeprojekt;

public class CalculatorFormulas {


    public static double addition(double number, ComponentsForJFrame componentsForJFrame){
        double answer = Double.sum(number, Double.parseDouble(componentsForJFrame.getTextField().getText()));
        componentsForJFrame.getTextField().setText(Double.toString(answer));
        return answer;
    }
    public static double subtraction(double number, ComponentsForJFrame componentsForJFrame){
        double answer = number - Double.parseDouble(componentsForJFrame.getTextField().getText());
        componentsForJFrame.getTextField().setText(Double.toString(answer));
        return answer;
    }
    public static double multiplication(double number, ComponentsForJFrame componentsForJFrame){
        double inDouble = Double.parseDouble(componentsForJFrame.getTextField().getText());
        if (inDouble==0){
            componentsForJFrame.getTextField().setText("");
            componentsForJFrame.getLabel().setText("Multiplication by Zero");
            return 0.0;
        }
        double answer = number * inDouble;
        componentsForJFrame.getTextField().setText(Double.toString(answer));
        return answer;
    }
    public static double division(double number, ComponentsForJFrame componentsForJFrame){
        double inDouble = Double.parseDouble(componentsForJFrame.getTextField().getText());
        if (inDouble==0){
            componentsForJFrame.getTextField().setText("");
            componentsForJFrame.getLabel().setText("Division by Zero");
            return 0.0;
        }
        double answer = number / inDouble;
        componentsForJFrame.getTextField().setText(Double.toString(answer));
        return answer;
    }

}