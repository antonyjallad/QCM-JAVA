import java.awt.Color;

public class question14 extends javax.swing.JFrame {
    question14(String para,String tot) {
                initComponents();
        t1.setText(para);
        t2.setText(tot);
        b2.setVisible(false);
        b3.setVisible(false);
    }
    private void initComponents() {

        g1 = new javax.swing.ButtonGroup();
        q1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        t2 = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Question 1");

        q1.setBackground(new java.awt.Color(255, 255, 255));
        q1.setName("q1");
        q1.setPreferredSize(new java.awt.Dimension(650, 650));

        l1.setFont(new java.awt.Font("Comic Sans MS", 1, 24));
        l1.setText("Question # 14");


        l3.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        l3.setText("Which Ball was used in the final ?");

        l4.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        l4.setText("Correct Answers :");

        t1.setEditable(false);
        t1.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        t1.setText("0");

        b1.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        b1.setText("Submit Answer");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });

        b2.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        b2.setText("Next Question");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        g1.add(r1);
        r1.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        r1.setIcon(new javax.swing.ImageIcon("file:/C:/Users/Anthony Jalad/Downloads/wcc.jpg"));
        r1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1MouseClicked(evt);
            }
        });

        g1.add(r2);
        r2.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        r2.setIcon(new javax.swing.ImageIcon("file:/C:/Users/Anthony Jalad/Downloads/wc.jpg"));
        r2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r2MouseClicked(evt);
            }
        });

        g1.add(r3);
        r3.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        r3.setIcon(new javax.swing.ImageIcon("file:/C:/Users/Anthony Jalad/Downloads/wccc.jpg"));
        r3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r3MouseClicked(evt);
            }
        });

        g1.add(r4);
        r4.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        r4.setIcon(new javax.swing.ImageIcon("file:/C:/Users/Anthony Jalad/Downloads/wcccc.jpg"));
        r4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r4MouseClicked(evt);
            }
        });
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        t2.setEditable(false);
        t2.setBackground(new java.awt.Color(255, 255, 255));
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setBorder(null);
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
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
		                  .addContainerGap(758, Short.MAX_VALUE)
		                  .addComponent(l3)
		                  .addGap(776, 776, 776))
		              .addGroup(q1Layout.createSequentialGroup()
		                  .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                      .addGroup(q1Layout.createSequentialGroup()
		                          .addGap(845, 845, 845)
		                          .addComponent(l1))
		                      .addGroup(q1Layout.createSequentialGroup()
		                          .addGap(784, 784, 784)
		                          .addComponent(l2)))
		                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		              .addGroup(q1Layout.createSequentialGroup()
		                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                  .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q1Layout.createSequentialGroup()
		                          .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                              .addGroup(q1Layout.createSequentialGroup()
		                                  .addComponent(r1)
		                                  .addGap(59, 59, 59)
		                                  .addComponent(r2))
		                              .addGroup(q1Layout.createSequentialGroup()
		                                  .addComponent(l4)
		                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                  .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                          .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                              .addGroup(q1Layout.createSequentialGroup()
		                                  .addGap(90, 90, 90)
		                                  .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                      .addComponent(b3)
		                                      .addComponent(b1)))
		                              .addGroup(q1Layout.createSequentialGroup()
		                                  .addGap(74, 74, 74)
		                                  .addComponent(r3)
		                                  .addGap(50, 50, 50)
		                                  .addComponent(r4)
		                                  .addGap(18, 18, 18)
		                                  .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
		                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q1Layout.createSequentialGroup()
		                          .addComponent(b2)
		                          .addGap(400, 400, 400)))
		                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		          );
		          q1Layout.setVerticalGroup(
		              q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		              .addGroup(q1Layout.createSequentialGroup()
		                  .addGap(56, 56, 56)
		                  .addComponent(l1)
		                  .addGap(95, 95, 95)
		                  .addComponent(l2)
		                  .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                      .addGroup(q1Layout.createSequentialGroup()
		                          .addGap(44, 44, 44)
		                          .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                              .addGroup(q1Layout.createSequentialGroup()
		                                  .addGap(197, 197, 197)
		                                  .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                              .addGroup(q1Layout.createSequentialGroup()
		                                  .addComponent(l3)
		                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                                  .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                      .addComponent(r2, javax.swing.GroupLayout.Alignment.TRAILING)
		                                      .addComponent(r3, javax.swing.GroupLayout.Alignment.TRAILING)
		                                      .addComponent(r1, javax.swing.GroupLayout.Alignment.TRAILING)))))
		                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q1Layout.createSequentialGroup()
		                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                          .addComponent(r4)))
		                  .addGap(76, 76, 76)
		                  .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                      .addComponent(l4)
		                      .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                      .addComponent(b1))
		                  .addGap(40, 40, 40)
		                  .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                      .addComponent(b2)
		                      .addComponent(b3))
		                  .addGap(147, 147, 147))
        );

        pack();
    }
    private void b2MouseClicked(java.awt.event.MouseEvent evt) {
        String msg = t1.getText();
        String tot = t2.getText();
        new question15(msg,tot).setVisible(true);
        this.setVisible(false);
    }
    private void b1MouseClicked(java.awt.event.MouseEvent evt) {
            r1.setEnabled(false);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);
            if(r1.isSelected() || r2.isSelected() || r3.isSelected() || r4.isSelected()){
                int t = Integer.parseInt(t2.getText());
                t2.setText(String.valueOf(t+1));
            }
        if(r1.isSelected())
        {
            int score = Integer.parseInt(t1.getText());
            t1.setText(String.valueOf(score+1));
        }
        b1.setVisible(false);
        b2.setVisible(true);
        b3.setVisible(true);
        r1.setBackground(Color.green);
    }
    private void r1MouseClicked(java.awt.event.MouseEvent evt) {
        r1.setEnabled(false);
        r2.setEnabled(true);
        r3.setEnabled(true);
        r4.setEnabled(true);
    }
    private void r2MouseClicked(java.awt.event.MouseEvent evt) {
        r1.setEnabled(true);
        r2.setEnabled(false);
        r3.setEnabled(true);
        r4.setEnabled(true);
    }
    private void r3MouseClicked(java.awt.event.MouseEvent evt) {
        r1.setEnabled(true);
        r2.setEnabled(true);
        r3.setEnabled(false);
        r4.setEnabled(true);
    }
    private void r4MouseClicked(java.awt.event.MouseEvent evt) {
        r1.setEnabled(true);
        r2.setEnabled(true);
        r3.setEnabled(true);
        r4.setEnabled(false);
    }

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {
        String msg = t1.getText();
        String tot=t2.getText();
        new Finish(msg,tot).setVisible(true);
        this.setVisible(false);
    }

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {
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
    private javax.swing.ButtonGroup g1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JPanel q1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
}
