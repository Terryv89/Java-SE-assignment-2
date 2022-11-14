package kjellgren.linus.cleancodeprojekt;


public class GraphicalInterface extends javax.swing.JFrame {

    private final ComponentsForJFrame ComponentsForJFrame;

    public GraphicalInterface() {
        ComponentsForJFrame = new ComponentsForJFrame();
        initComponents();
        ButtonPress buttonPress = new ButtonPress(ComponentsForJFrame);
        buttonPress.connectButtons();
        ComponentsForJFrame.getRadioButton1().setEnabled(false);
    }

//<editor-fold defaultstate="collapsed" desc="initComponents()">
    protected void initComponents() {

        ComponentsForJFrame.setButtonGroup(new javax.swing.ButtonGroup());
        ComponentsForJFrame.setTextField(new javax.swing.JTextField());
        ComponentsForJFrame.setRadioButton1(new javax.swing.JRadioButton());
        ComponentsForJFrame.setRadioButton2(new javax.swing.JRadioButton());
        ComponentsForJFrame.setBack(new javax.swing.JButton());
        ComponentsForJFrame.setClear(new javax.swing.JButton());
        ComponentsForJFrame.setPlus(new javax.swing.JButton());
        ComponentsForJFrame.setSeven(new javax.swing.JButton());
        ComponentsForJFrame.setEight(new javax.swing.JButton());
        ComponentsForJFrame.setNine(new javax.swing.JButton());
        ComponentsForJFrame.setFour(new javax.swing.JButton());
        ComponentsForJFrame.setFive(new javax.swing.JButton());
        ComponentsForJFrame.setSix(new javax.swing.JButton());
        ComponentsForJFrame.setOne(new javax.swing.JButton());
        ComponentsForJFrame.setTwo(new javax.swing.JButton());
        ComponentsForJFrame.setThree(new javax.swing.JButton());
        ComponentsForJFrame.setMinus(new javax.swing.JButton());
        ComponentsForJFrame.setMultiply(new javax.swing.JButton());
        ComponentsForJFrame.setDivision(new javax.swing.JButton());
        ComponentsForJFrame.setDot(new javax.swing.JButton());
        ComponentsForJFrame.setZero(new javax.swing.JButton());
        ComponentsForJFrame.setEqual(new javax.swing.JButton());
        ComponentsForJFrame.setLabel(new javax.swing.JLabel());
        
        //Set program to end on closing window
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //Sets iframe above everything
        setAlwaysOnTop(true);
        //Sets name on window
        setTitle("projektJframe");
        setLocation(new java.awt.Point(500, 250));
        //Sets window to not resizeable
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        
        //Sets numbers test frame to not editable
        ComponentsForJFrame.getTextField().setEditable(false);
        //Set Font
        ComponentsForJFrame.getTextField().setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        ComponentsForJFrame.getTextField().setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ComponentsForJFrame.getButtonGroup().add(ComponentsForJFrame.getRadioButton1());
        //Set Font
        ComponentsForJFrame.getRadioButton1().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ComponentsForJFrame.getRadioButton1().setText("On");

        ComponentsForJFrame.getButtonGroup().add(ComponentsForJFrame.getRadioButton2());
        //Set Font
        ComponentsForJFrame.getRadioButton2().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ComponentsForJFrame.getRadioButton2().setText("Off");

        //Set Font
        ComponentsForJFrame.getBack().setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ComponentsForJFrame.getBack().setText("<--");

        //Set Font
        ComponentsForJFrame.getClear().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getClear().setText("C");

        //Set Font
        ComponentsForJFrame.getPlus().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getPlus().setText("+");

        //Set Font
        ComponentsForJFrame.getSeven().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getSeven().setText("7");

        //Set Font
        ComponentsForJFrame.getEight().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getEight().setText("8");

        //Set Font
        ComponentsForJFrame.getNine().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getNine().setText("9");

        //Set Font
        ComponentsForJFrame.getFour().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getFour().setText("4");

        //Set Font
        ComponentsForJFrame.getFive().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getFive().setText("5");

        //Set Font
        ComponentsForJFrame.getSix().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getSix().setText("6");

        //Set Font
        ComponentsForJFrame.getOne().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getOne().setText("1");

        //Set Font
        ComponentsForJFrame.getTwo().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getTwo().setText("2");

        //Set Font
        ComponentsForJFrame.getThree().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getThree().setText("3");

        //Set Font
        ComponentsForJFrame.getMinus().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getMinus().setText("-");

        //Set Font
        ComponentsForJFrame.getMultiply().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getMultiply().setText("*");

        //Set Font
        ComponentsForJFrame.getDivision().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getDivision().setText("/");

        //Set Font
        ComponentsForJFrame.getDot().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getDot().setText(".");

        //Set Font
        ComponentsForJFrame.getZero().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getZero().setText("0");

        //Set Font
        ComponentsForJFrame.getEqual().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComponentsForJFrame.getEqual().setText("=");

        //Set Font
        ComponentsForJFrame.getLabel().setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        //Set Font Color
        ComponentsForJFrame.getLabel().setForeground(new java.awt.Color(255, 51, 51));
        ComponentsForJFrame.getLabel().setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        // Set Empty text
        ComponentsForJFrame.getLabel().setText(" ");

        
        //This sets upp the layout for the JFrame. Its autogenerated in the JFrame Form.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ComponentsForJFrame.getTextField())
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(ComponentsForJFrame.getRadioButton1())
                                                                .addComponent(ComponentsForJFrame.getRadioButton2()))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(ComponentsForJFrame.getBack(), javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(ComponentsForJFrame.getClear(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ComponentsForJFrame.getPlus(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(ComponentsForJFrame.getDot(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ComponentsForJFrame.getZero(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ComponentsForJFrame.getEqual(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(ComponentsForJFrame.getSeven(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ComponentsForJFrame.getEight(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ComponentsForJFrame.getNine(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(ComponentsForJFrame.getFour(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ComponentsForJFrame.getFive(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ComponentsForJFrame.getSix(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(ComponentsForJFrame.getOne(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ComponentsForJFrame.getTwo(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ComponentsForJFrame.getThree(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(ComponentsForJFrame.getMinus(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(ComponentsForJFrame.getMultiply(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(ComponentsForJFrame.getDivision(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComponentsForJFrame.getLabel(), javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComponentsForJFrame.getLabel())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComponentsForJFrame.getTextField(), javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(ComponentsForJFrame.getRadioButton1())
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ComponentsForJFrame.getRadioButton2()))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ComponentsForJFrame.getClear(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ComponentsForJFrame.getPlus(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ComponentsForJFrame.getBack(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ComponentsForJFrame.getSeven(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ComponentsForJFrame.getEight(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ComponentsForJFrame.getNine(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ComponentsForJFrame.getFour(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ComponentsForJFrame.getFive(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ComponentsForJFrame.getSix(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(ComponentsForJFrame.getMinus(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ComponentsForJFrame.getMultiply(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(ComponentsForJFrame.getOne(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ComponentsForJFrame.getTwo(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ComponentsForJFrame.getThree(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ComponentsForJFrame.getDivision(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ComponentsForJFrame.getDot(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComponentsForJFrame.getZero(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComponentsForJFrame.getEqual(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }
//</editor-fold>

}