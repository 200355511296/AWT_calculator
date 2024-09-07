import java.awt.*;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

class close extends WindowAdapter {

    public void windowClosing(WindowEvent we) {

        System.exit(0);
        

    }

}

class Cal implements ActionListener {

    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
            b11, b12, b13, b14, b15, b16, b17, b18, b19, b20,
            b21, b22, b23, b24, b25, b26, b27, b28, b29;
    String fv, sv, op;
    Double fdv, sdv, tot, mf;

    Cal() {
        Frame f = new Frame();
        f.addWindowListener(new close());

        Color clr1 = new Color(199, 232, 202);//pannel
        Color clr2 = new Color(239, 245, 245);//text field
        Color clr3 = new Color(39, 55, 77);// textfield text
        Color clr4 = new Color(242, 245, 245);//button background
        Color clr5 = new Color(10, 104, 71);//special button text
        Color clr6 = new Color(223, 46, 56);// c button text        
        Color clr7 = new Color(238, 245, 240);// number button color

        f.setBackground(clr1);

        f.setTitle("My Calculator");
        f.setResizable(false);
        f.setSize(450, 600);
        f.setLocationRelativeTo(null);

        Font f1 = new Font("Poppins", Font.BOLD, 30);
        Font f2 = new Font("Quicksand", Font.BOLD, 30);
        Font f3 = new Font("Quicksand", Font.BOLD, 40);
        Font f4 = new Font("Quicksand", Font.PLAIN, 15);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        MenuItem mi0 = new MenuItem("Standard");
        MenuItem mi1 = new MenuItem("Scientific");

        m1.add(mi0);
        m1.add(mi1);

        Menu m2 = new Menu("Edit");
        MenuItem mi2 = new MenuItem("Copy");
        MenuItem mi3 = new MenuItem("Cut");
        m2.add(mi2);
        m2.add(mi3);

        Menu m3 = new Menu("Help");
        MenuItem mi4 = new MenuItem("View Help F1");
        MenuItem mi5 = new MenuItem("About Calculator");
        m3.add(mi4);
        m3.add(mi5);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        f.setMenuBar(mb);

        Panel p0 = new Panel();

        Panel p1 = new Panel();
        GridLayout g0 = new GridLayout(1, 5, 10, 10);
        p1.setLayout(g0);
        p1.setBackground(clr1);
        p1.setPreferredSize(new Dimension(450, 10)); // Set preferred size

        Panel p2 = new Panel();
        GridLayout g1 = new GridLayout(6, 4, 4, 4);
        p2.setLayout(g1);
        p2.setBackground(clr1);

        p0.setPreferredSize(new Dimension(450, 100));
        p1.setPreferredSize(new Dimension(450, 10));
        p2.setPreferredSize(new Dimension(450, 415));

        tf = new TextField(15);
        tf.setFont(f1);
        tf.setEditable(true);

        tf.setForeground(clr3);
        tf.setBackground(clr2);

        tf.setText("0");

        p0.add(tf);

        //button make
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button("+");
        b12 = new Button("-");
        b13 = new Button("=");
        b14 = new Button("\u00D7");//*
        b15 = new Button("\u00F7");// /
        b16 = new Button("1/x"); // 1/x
        b18 = new Button("CE");
        b19 = new Button("%");
        b20 = new Button(".");
        b21 = new Button("C");
        b22 = new Button("\u00B2\u221Ax");// Square Root
        b23 = new Button("x\u00B2"); // x^2
        b24 = new Button("+/-");

        b25 = new Button("MC");
        b26 = new Button("MR");
        b27 = new Button("MS");
        b28 = new Button("M+");
        b17 = new Button("M-");

        b29 = new Button("<<");

        //button background color
        b1.setBackground(clr7);
        b2.setBackground(clr7);
        b3.setBackground(clr7);
        b4.setBackground(clr7);
        b5.setBackground(clr7);
        b6.setBackground(clr7);
        b7.setBackground(clr7);
        b8.setBackground(clr7);
        b9.setBackground(clr7);
        b10.setBackground(clr7);

        b11.setBackground(clr4);
        b12.setBackground(clr4);
        b13.setBackground(clr5);
        b14.setBackground(clr4);
        b15.setBackground(clr4);
        b16.setBackground(clr4);
        b18.setBackground(clr4);
        b19.setBackground(clr4);
        b20.setBackground(clr4);
        b21.setBackground(clr4);
        b22.setBackground(clr4);
        b23.setBackground(clr4);
        b24.setBackground(clr4);

        b25.setBackground(clr1);
        b26.setBackground(clr1);
        b27.setBackground(clr1);
        b28.setBackground(clr1);
        b17.setBackground(clr1);

        //button text color
        b13.setForeground(clr4);//=

        b21.setForeground(clr6);//C

        b11.setForeground(clr5);
        b12.setForeground(clr5);
        b14.setForeground(clr5);
        b15.setForeground(clr5);
        b16.setForeground(clr5);
        b19.setForeground(clr5);
        b20.setForeground(clr5);
        b22.setForeground(clr5);
        b23.setForeground(clr5);
        b24.setForeground(clr5);

        //button fonts
        b1.setFont(f3);
        b2.setFont(f3);
        b3.setFont(f3);
        b4.setFont(f3);
        b5.setFont(f3);
        b6.setFont(f3);
        b7.setFont(f3);
        b8.setFont(f3);
        b9.setFont(f3);
        b10.setFont(f3);
        b11.setFont(f2);
        b12.setFont(f2);
        b13.setFont(f2);
        b14.setFont(f2);
        b15.setFont(f2);
        b16.setFont(f2);
        b19.setFont(f2);
        b20.setFont(f2);
        b23.setFont(f2);
        b22.setFont(f2);
        b24.setFont(f2);

        b21.setFont(f2);
        b29.setFont(f2);
        b18.setFont(f2);

        b25.setFont(f4);
        b26.setFont(f4);
        b27.setFont(f4);
        b28.setFont(f4);
        b17.setFont(f4);

        //button add
        p1.add(b25);
        p1.add(b26);
        p1.add(b27);
        p1.add(b28);
        p1.add(b17);

        p2.add(b21);
        p2.add(b18);
        p2.add(b29);
        p2.add(b19);
        p2.add(b23);
        p2.add(b22);
        p2.add(b16);
        p2.add(b15);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b14);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b12);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b11);
        p2.add(b24);
        p2.add(b10);
        p2.add(b20);
        p2.add(b13);

        //add action
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b20.addActionListener(this);
        b16.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b24.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b21.addActionListener(this);
        b29.addActionListener(this);

        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b17.addActionListener(this);

        f.add(p0, BorderLayout.NORTH);
        f.add(p1, BorderLayout.CENTER);
        f.add(p2, BorderLayout.SOUTH);

        f.setVisible(true);

    }

    public void error() {

        tf.setText("Error");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cal.class.getName()).log(Level.SEVERE, null, ex);
        }
        tf.setText("0");

    }

    public void actionPerformed(ActionEvent d) {

        if (tf.getText().equals("0")) {
            tf.setText("");
        }
        
        Object o = d.getSource();

        if (o.equals(b1)) {
            tf.setText(tf.getText() + b1.getLabel());
        } else if (o.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());
        } else if (o.equals(b3)) {
            tf.setText(tf.getText() + b3.getLabel());
        } else if (o.equals(b4)) {
            tf.setText(tf.getText() + b4.getLabel());
        } else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        } else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());

        } else if (o.equals(b18)) { //CE
            tf.setText("0");

        } else if (o.equals(b21)) { // C
            fdv = null;
            sdv = null;
            tot = null;
            op = null;
            fv = null;
            sv = null;

            tf.setText("0");

        } else if (o.equals(b29)) { // Backspace
            String text = tf.getText();
            if (text.length() > 1) {
                tf.setText(text.substring(0, text.length() - 1));
            } else {
                tf.setText("0");
            }

        } else if (o.equals(b20)
                && !tf.getText().contains(".")) { //.
            if (tf.getText().isBlank()) {
                tf.setText(0 + tf.getText() + b20.getLabel());
            } else {
                tf.setText(tf.getText() + b20.getLabel());
            }

        } else if (o.equals(b11)) {//+

            fv = tf.getText();
            op = b11.getLabel();
            tf.setText("");

        } else if (o.equals(b12)) {//-

            fv = tf.getText();
            op = b12.getLabel();
            tf.setText("");

        } else if (o.equals(b14)) {//*

            fv = tf.getText();
            op = b14.getLabel();
            tf.setText("");

        } else if (o.equals(b15)) {//  /

            fv = tf.getText();
            op = b15.getLabel();
            tf.setText("");

        } else if (o.equals(b19)) {//  %

            fv = tf.getText();
            op = b19.getLabel();
            tf.setText("");

        } else if (o.equals(b16)) { // 1/x

            if (fv != null) {

                if (fv.isBlank()) {
                    fdv = Double.parseDouble("0");
                } else {
                    fdv = Double.parseDouble(fv);
                }
                tot = 1 / fdv;
                tf.setText(tot + "");
                fv = null;
            } else {
                if (tf.getText().isBlank()) {
                    fdv = Double.parseDouble("0");
                } else {
                    fdv = Double.parseDouble(tf.getText());
                }
                tot = 1 / fdv;
                tf.setText(tot + "");
            }

        } else if (o.equals(b22)) {//  Square Root 

            if (tf.getText().equals("") && fv == null) {
                error();
            } else if (fv != null) {
                fdv = Double.parseDouble(fv);
                tot = Math.sqrt(fdv);
                tf.setText(tot + "");
                fv = null;
            } else {
                fdv = Double.parseDouble(tf.getText());
                tot = Math.sqrt(fdv);
                tf.setText(tot + "");
            }

        } else if (o.equals(b24)) { // +/- button

            try {
                tf.setText(Double.parseDouble(tf.getText()) * -1 + "");
            } catch (NumberFormatException e) {

                error();

            }

        } else if (o.equals(b23)) {//  x^2
            if (tf.getText().equals("") && fv == null) {
                error();
            } else if (fv != null) {
                fdv = Double.parseDouble(fv);
                tot = fdv * fdv;
                tf.setText(tot + "");
                fv = null;
            } else {
                fdv = Double.parseDouble(tf.getText());
                tot = fdv * fdv;
                tf.setText(tot + "");
            }

        } else if (o.equals(b13)) { //=

            sv = tf.getText();           

            if (tf.getText().isBlank() && fv == null) {
                
                tf.setText("0");

            } else if (op == null) {
                tf.getText();

            } else {

                if (fv.isBlank()) {
                    fdv = Double.parseDouble("0");
                } else {
                    fdv = Double.parseDouble(fv);
                }

                if (sv.isBlank()) {
                    sdv = Double.parseDouble("0");
                } else {
                    sdv = Double.parseDouble(sv);
                }

                tf.setText("");

                if (op.equals("+")) {
                    tot = fdv + sdv;
                    tf.setText(tot + "");
                } else if (op.equals("-")) {
                    tot = fdv - sdv;
                    tf.setText(tot + "");
                } else if (op.equals("\u00D7")) {
                    tot = fdv * sdv;
                    tf.setText(tot + "");
                } else if (op.equals("\u00F7")) {
                    tot = fdv / sdv;
                    tf.setText(tot + "");
                } else if (op.equals("%")) {
                    tot = (fdv / 100) * sdv;
                    tf.setText(tot + "");
                }

            }
            
        } else if (o.equals(b25)) { //MC

            mf = null;
            if (tf.getText().equals("")) {
                tf.setText("0");
            } else {
                tf.setText(tf.getText());
            }

        } else if (o.equals(b26)) { //MR

            if (mf == null) {
                if (tf.getText().equals("")) {
                    tf.setText("0");
                } else {
                    tf.setText(tf.getText());
                }
            } else {
                tf.setText(mf + "");
            }

        } else if (o.equals(b27)) { //Ms

            if (tf.getText().equals("")) {
                tf.setText("0");
                mf = 0.0;
            } else {
                tf.setText(tf.getText());
                mf = Double.parseDouble(tf.getText());
            }

        } else if (o.equals(b28)) { //M+

            if (tf.getText().equals("")) {
                tf.setText("0");
                mf = 0.0;

            } else {
                if (mf == null) {
                    mf = 0.0 + Double.parseDouble(tf.getText());
                } else {
                    mf = mf + Double.parseDouble(tf.getText());
                }
                tf.setText(tf.getText());

            }

        } else if (o.equals(b17)) { //M-

            if (tf.getText().equals("")) {
                mf = 0.0;

            } else {
                if (mf == null) {
                    mf = 0.0 - Double.parseDouble(tf.getText());
                } else {
                    mf = mf - Double.parseDouble(tf.getText());
                }
            }
            tf.setText(tf.getText());
        }
//        System.out.println(mf);

    }

}

public class Calculator {

    public static void main(String[] args) {
        new Cal();
    }

}
