import java.awt.Color;

public class question10 extends javax.swing.JFrame {
    question10(String para,String tot) {
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
        setTitle("Question 10");

        q1.setBackground(new java.awt.Color(255, 255, 255));
        q1.setName("q10");
        q1.setPreferredSize(new java.awt.Dimension(650, 650));

        l1.setFont(new java.awt.Font("TimesRoman", 1, 24));
        l1.setText("Question 10");

        l2.setIcon(new javax.swing.ImageIcon("file:/C:/Users/Anthony Jalad/Downloads/project.jpg"));

        l3.setFont(new java.awt.Font("TimesRoman", 0, 24));
        l3.setText("which european team participated for the first time in their history ?");

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
        cb1.setText("Denmark");

        cb2.setFont(new java.awt.Font("TimesRoman", 0, 18));
        cb2.setText("Iceland");

        cb3.setFont(new java.awt.Font("TimesRoman", 0, 18));
        cb3.setText("norway");

        cb4.setFont(new java.awt.Font("TimesRoman", 0, 18));
        cb4.setText("swedden");

        t2.setEditable(false);
        t2.setBackground(new java.awt.Color(255, 255, 255));
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
		                  .addGap(663, 663, 663))
		              .addGroup(q1Layout.createSequentialGroup()
		                  .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                      .addGroup(q1Layout.createSequentialGroup()
		                          .addGap(819, 819, 819)
		                          .addComponent(l1))
		                      .addGroup(q1Layout.createSequentialGroup()
		                          .addGap(610, 610, 610)
		                          .addComponent(l2))
		                      .addGroup(q1Layout.createSequentialGroup()
		                          .addGap(681, 681, 681)
		                          .addComponent(l3)))
		                  .addGap(0, 0, Short.MAX_VALUE))
		              .addGroup(q1Layout.createSequentialGroup()
		                  .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                      .addGroup(q1Layout.createSequentialGroup()
		                          .addGap(600, 600, 600)
		                          .addComponent(cb1)
		                          .addGap(66, 66, 66)
		                          .addComponent(cb2)
		                          .addGap(69, 69, 69)
		                          .addComponent(cb3)
		                          .addGap(68, 68, 68)
		                          .addComponent(cb4))
		                      .addGroup(q1Layout.createSequentialGroup()
		                          .addGap(728, 728, 728)
		                          .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                              .addComponent(b2)
		                              .addGroup(q1Layout.createSequentialGroup()
		                                  .addComponent(l4)
		                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                  .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                          .addGap(97, 97, 97)
		                          .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                              .addComponent(b3)
		                              .addComponent(b1))))
		                  .addContainerGap(685, Short.MAX_VALUE))
		          );
		          q1Layout.setVerticalGroup(
		              q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		              .addGroup(q1Layout.createSequentialGroup()
		                  .addGap(70, 70, 70)
		                  .addComponent(l1)
		                  .addGap(28, 28, 28)
		                  .addComponent(l2)
		                  .addGap(34, 34, 34)
		                  .addComponent(l3)
		                  .addGap(77, 77, 77)
		                  .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                      .addComponent(cb1)
		                      .addComponent(cb2)
		                      .addComponent(cb3)
		                      .addComponent(cb4))
		                  .addGap(121, 121, 121)
		                  .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                      .addComponent(l4)
		                      .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                          .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                          .addComponent(b1)))
		                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
		                  .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                      .addComponent(b2)
		                      .addComponent(b3))
		                  .addGap(72, 72, 72)
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
		              .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
		          );



        pack();
    }
    private void b2MouseClicked(java.awt.event.MouseEvent evt) {
        String msg = t1.getText();
        String tot = t2.getText();
        new question11(msg,tot).setVisible(true);
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
        if(cb2.isSelected() && cb4.isSelected())
        {
            int score = Integer.parseInt(t1.getText());
            t1.setText(String.valueOf(score+1));
        }
        b1.setVisible(false);
        b2.setVisible(true);
        b3.setVisible(true);
        cb4.setVisible(true);
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
