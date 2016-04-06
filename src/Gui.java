import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    JFrame mainframe;
    JPanel mainPanel;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String[] condition = new String[9];

    String[] comb1 = {"x", "x", "x", " ", " ", " ", " ", " ", " "};
    String[] comb2 = {"", "", "", "x", "x", "x", " ", " ", " "};
    String[] comb3 = {" ", " ", " ", " ", " ", " ", "x", "x", "x"};
    String[] comb4 = {"x", " ", " ", "x", " ", " ", "x", " ", " "};
    String[] comb5 = {" ", "x", " ", " ", "x", " ", " ", "x", " "};
    String[] comb6 = {" ", " ", "x", " ", " ", "x", " ", " ", "x"};
    String[] comb7 = {"x", " ", " ", " ", "x", " ", " ", " ", "x"};
    String[] comb8 = {" ", " ", "x", " ", "x", " ", "x", " ", " "};

    public void goGui() {
        mainframe = new JFrame("ELITA");
        mainframe.setSize(175, 150);
        mainframe.setResizable(false);
        mainframe.setLocationRelativeTo(null);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        mainPanel = new JPanel(null);
        mainPanel.setSize(175, 150);
        mainPanel.setBackground(Color.red);

        b1 = new JButton(" ");
        b1.setBounds(10, 5, 42, 30);
        b1.addActionListener(new B1Listener());

        b2 = new JButton(" ");
        b2.setBounds(57, 5, 42, 30);
        b2.addActionListener(new B2Listener());

        b3 = new JButton(" ");
        b3.setBounds(105, 5, 42, 30);
        b3.addActionListener(new B3Listener());

        b4 = new JButton(" ");
        b4.setBounds(10, 40, 42, 30);
        b4.addActionListener(new B4Listener());

        b5 = new JButton(" ");
        b5.setBounds(57, 40, 42, 30);
        b5.addActionListener(new B5Listener());

        b6 = new JButton(" ");
        b6.setBounds(105, 40, 42, 30);
        b6.addActionListener(new B6Listener());

        b7 = new JButton(" ");
        b7.setBounds(10, 75, 42, 30);
        b7.addActionListener(new B7Listener());

        b8 = new JButton(" ");
        b8.setBounds(57, 75, 42, 30);
        b8.addActionListener(new B8Listener());

        b9 = new JButton(" ");
        b9.setBounds(105, 75, 42, 30);
        b9.addActionListener(new B9Listener());


        mainPanel.add(b1);
        mainPanel.add(b2);
        mainPanel.add(b3);
        mainPanel.add(b4);
        mainPanel.add(b5);
        mainPanel.add(b6);
        mainPanel.add(b7);
        mainPanel.add(b8);
        mainPanel.add(b9);

        mainframe.add(mainPanel);
        mainframe.setVisible(true);
    }

    public class B1Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            actionButton(b1);

        }

    }

    public class B2Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            actionButton(b2);

        }

    }

    public class B3Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            actionButton(b3);
        }

    }

    public class B4Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            actionButton(b4);
            ;
        }

    }

    public class B5Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            actionButton(b5);
        }

    }

    public class B6Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            actionButton(b6);
        }

    }

    public class B7Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            actionButton(b7);
        }

    }

    public class B8Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            actionButton(b8);
        }

    }

    public class B9Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            actionButton(b9);
        }

    }

    private void actionButton(JButton b) {
        if (checkOnFail(b)) {

            b.setText("x");
            checkOnWin(getCondition());

        }
    }

    private void checkOnWin(String[] strings) {

        if ((comb1[0].equals(strings[0])) && (comb1[1].equals(strings[1])) && (comb1[2].equals(strings[2])))
        {
            System.out.println("Pobeda po 1 Comb");
        }
        if ((comb2[3].equals(strings[3])) && (comb2[4].equals(strings[4])) && (comb2[5].equals(strings[5])))
        {
            System.out.println("Pobeda po 2 Comb");
        }
        if ((comb3[6].equals(strings[6])) && (comb3[7].equals(strings[7])) && (comb3[8].equals(strings[8])))
        {
            System.out.println("Pobeda po 3 Comb");
        }
        if ((comb4[0].equals(strings[0])) && (comb1[1].equals(strings[1])) && (comb1[2].equals(strings[2])))
        {
            System.out.println("Pobeda po 1 Comb");
        }
        if ((comb5[0].equals(strings[0])) && (comb1[1].equals(strings[1])) && (comb1[2].equals(strings[2])))
        {
            System.out.println("Pobeda po 1 Comb");
        }
        if ((comb6[0].equals(strings[0])) && (comb1[1].equals(strings[1])) && (comb1[2].equals(strings[2])))
        {
            System.out.println("Pobeda po 1 Comb");
        }
        if ((comb7[0].equals(strings[0])) && (comb1[1].equals(strings[1])) && (comb1[2].equals(strings[2])))
        {
            System.out.println("Pobeda po 1 Comb");
        }

    }

    private boolean checkOnFail(JButton b) {
        if (b.getText().equals(" ")) {
            return true;
        }
        return false;


    }


    private String[] getCondition() {
        condition[0] = b1.getText();
        condition[1] = b2.getText();
        condition[2] = b3.getText();
        condition[3] = b4.getText();
        condition[4] = b5.getText();
        condition[5] = b6.getText();
        condition[6] = b7.getText();
        condition[7] = b8.getText();
        condition[8] = b9.getText();
        return condition;
    }
}


