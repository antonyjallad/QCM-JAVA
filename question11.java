import java.awt.Color;

public class question11 extends javax.swing.JFrame {
    question11(String para,String tot) {
                initComponents();
        t1.setText(para);
        t2.setText(tot);
        b2.setVisible(false);
        b3.setVisible(false);
    }

    private void initComponents() {

        q1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        t2 = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Question 11");

        q1.setBackground(new java.awt.Color(255, 255, 255));
        q1.setName("q11");
        q1.setPreferredSize(new java.awt.Dimension(650, 650));

        l1.setFont(new java.awt.Font("TimesRoman", 1, 24));
        l1.setText("Question 11");

        l2.setIcon(new javax.swing.ImageIcon("file:/C:/Users/Anthony Jalad/Downloads/project.jpg"));

        l3.setFont(new java.awt.Font("TimesRoman", 0, 24));
        l3.setText("who won the youngest best player ?");

        l4.setFont(new java.awt.Font("TimesRoman", 0, 18));
        l4.setText("Correct Answers :");

        t1.setEditable(false);
        t1.setFont(new java.awt.Font("TimesRoman", 0, 18));
        t1.setText("0");

        b1.setFont(new java.awt.Font("TimesRoman", 0, 18));
        b1.setText("Submit Answer");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });

        b2.setFont(new java.awt.Font("TimesRoman", 0, 18));
        b2.setText("Next Question");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        cb1.setFont(new java.awt.Font("TimesRoman", 0, 18));
        cb1.setText("Mbappe");

        cb2.setFont(new java.awt.Font("TimesRoman", 0, 18));
        cb2.setText("pavard");

        cb3.setFont(new java.awt.Font("TimesRoman", 0, 18));
        cb3.setText("Kante");

        cb4.setFont(new java.awt.Font("TimesRoman", 0, 18));
        cb4.setText("Dele Alli");

        t2.setEditable(false);
        t2.setBackground(new java.awt.Color(255, 255, 255));
        t2.setFont(new java.awt.Font("TimesRoman", 0, 18));
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setBorder(null);

        b3.setFont(new java.awt.Font("TimesRoman", 0, 18));
        b3.setText("Finish");
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout q1Layout = new javax.swing.GroupLayout(q1);
        q1.setLayout(q1Layout);
        q1Layout.setHorizontalGroup(
            q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(568, 568, 568))
            .addGroup(q1Layout.createSequentialGroup()
                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(q1Layout.createSequentialGroup()
                        .addGap(835, 835, 835)
                        .addComponent(l1))
                    .addGroup(q1Layout.createSequentialGroup()
                        .addGap(673, 673, 673)
                        .addComponent(l2))
                    .addGroup(q1Layout.createSequentialGroup()
                        .addGap(698, 698, 698)
                        .addComponent(l3))
                    .addGroup(q1Layout.createSequentialGroup()
                        .addGap(663, 663, 663)
                        .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b2)
                            .addGroup(q1Layout.createSequentialGroup()
                                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l4)
                                    .addGroup(q1Layout.createSequentialGroup()
                                        .addComponent(b1)
                                        .addGap(90, 90, 90)
                                        .addComponent(b2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79)
                        .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(q1Layout.createSequentialGroup()
                                .addComponent(cb3)
                                .addGap(76, 76, 76)
                                .addComponent(cb4))
                            .addComponent(b1)
                            .addComponent(b3))))
                .addGap(0, 688, Short.MAX_VALUE))
        );
        q1Layout.setVerticalGroup(
            q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(l1)
                .addGap(35, 35, 35)
                .addComponent(l2)
                .addGap(55, 55, 55)
                .addComponent(l3)
                .addGap(47, 47, 47)
                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1)
                    .addComponent(cb2)
                    .addComponent(cb3)
                    .addComponent(cb4))
                .addGap(68, 68, 68)
                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l4)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2)
                    .addComponent(b3))
                .addGap(74, 74, 74)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
    }
    private void b2MouseClicked(java.awt.event.MouseEvent evt) {
        String msg = t1.getText();
        String tot = t2.getText();
        new question12(msg,tot).setVisible(true);
        this.setVisible(false);
    }
    private void b1MouseClicked(java.awt.event.MouseEvent evt) {
            cb1.setEnabled(false);
            cb2.setEnabled(false);
            cb3.setEnabled(false);
            cb4.setEnabled(false);
            if(cb1.isSelected() || cb2.isSelected() || cb3.isSelected() || cb4.isSelected()){
                int t = Integer.parseInt(t2.getText());
                t2.setText(String.valueOf(t+1));
            }
        if(cb1.isSelected())
        {
            int score = Integer.parseInt(t1.getText());
            t1.setText(String.valueOf(score+1));
        }
        b1.setVisible(false);
        b2.setVisible(true);
        b3.setVisible(true);
        cb1.setBackground(Color.green);
        cb2.setBackground(Color.green);
    }

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {
        String msg = t1.getText();
        String tot=t2.getText();
        new Finish(msg,tot).setVisible(true);
        this.setVisible(false);
}
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new question1().setVisible(true);
            }
        });
    }
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JPanel q1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
}