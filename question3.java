import java.awt.Color;

public class question3 extends javax.swing.JFrame {
    question3(String para,String tot) {
                project();
        t1.setText(para);
        t2.setText(tot);
        b2.setVisible(false);
        b3.setVisible(false);
    }
    private void project() {

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
        b3 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Question 3");

        q1.setBackground(new java.awt.Color(255, 255, 255));
        q1.setName("q3");
        q1.setPreferredSize(new java.awt.Dimension(650, 650));

        l1.setFont(new java.awt.Font("TimesRoman", 1, 24));
        l1.setText("Question 3");

        l2.setFont(new java.awt.Font("TimesRoman", 0, 18));

        l3.setFont(new java.awt.Font("TimesRoman", 0, 24));
        l3.setText("Which team knocked out the most title holder");

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

        b2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        b2.setText("Next Question");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        g1.add(r1);
        r1.setFont(new java.awt.Font("TimesRoman", 0, 18)); // NOI18N
        r1.setText("Argentina");

        g1.add(r2);
        r2.setFont(new java.awt.Font("TimesRoman", 0, 18)); // NOI18N
        r2.setText("Peru");

        g1.add(r3);
        r3.setFont(new java.awt.Font("TimesRoman", 0, 18)); // NOI18N
        r3.setText("Belgium");

        g1.add(r4);
        r4.setFont(new java.awt.Font("TimesRoman", 0, 18)); // NOI18N
        r4.setText("Mexico");

        b3.setFont(new java.awt.Font("TimesRoman", 0, 18)); // NOI18N
        b3.setText("Finish");
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });

        t2.setEditable(false);
        t2.setBackground(new java.awt.Color(255, 255, 255));
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setBorder(null);

          javax.swing.GroupLayout q1Layout = new javax.swing.GroupLayout(q1);
		        q1.setLayout(q1Layout);
		        q1Layout.setHorizontalGroup(
		            q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(q1Layout.createSequentialGroup()
		                .addContainerGap(715, Short.MAX_VALUE)
		                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q1Layout.createSequentialGroup()
		                        .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(l3)
		                            .addGroup(q1Layout.createSequentialGroup()
		                                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                    .addGroup(q1Layout.createSequentialGroup()
		                                        .addComponent(l4)
		                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                    .addGroup(q1Layout.createSequentialGroup()
		                                        .addComponent(b2)
		                                        .addGap(8, 8, 8)))
		                                .addGap(54, 54, 54)
		                                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addComponent(b1)
		                                    .addComponent(b3))
		                                .addGap(54, 54, 54)))
		                        .addGap(709, 709, 709))
		                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q1Layout.createSequentialGroup()
		                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(535, 535, 535))
		                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q1Layout.createSequentialGroup()
		                        .addComponent(l1)
		                        .addGap(878, 878, 878))
		                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q1Layout.createSequentialGroup()
		                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(610, 610, 610))
		                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q1Layout.createSequentialGroup()
		                        .addComponent(r1)
		                        .addGap(32, 32, 32)
		                        .addComponent(r2)
		                        .addGap(45, 45, 45)
		                        .addComponent(r3)
		                        .addGap(49, 49, 49)
		                        .addComponent(r4)
		                        .addGap(749, 749, 749))))
		        );
		        q1Layout.setVerticalGroup(
		            q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(q1Layout.createSequentialGroup()
		                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(q1Layout.createSequentialGroup()
		                        .addGap(106, 106, 106)
		                        .addComponent(l1)
		                        .addGap(68, 68, 68)
		                        .addComponent(l2)
		                        .addGap(94, 94, 94)
		                        .addComponent(l3)
		                        .addGap(32, 32, 32)
		                        .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(r1)
		                            .addComponent(r2)
		                            .addComponent(r3)
		                            .addComponent(r4))
		                        .addGap(84, 84, 84)
		                        .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(l4)
		                            .addComponent(b1))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE))
		                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q1Layout.createSequentialGroup()
		                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                        .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(b2)
		                            .addComponent(b3))
		                        .addGap(84, 84, 84)))
		                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(48, 48, 48))
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
        new question4(msg,tot).setVisible(true);
        this.setVisible(false);
    }
    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
            r1.setEnabled(false);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);

            if(r1.isSelected() || r2.isSelected() || r3.isSelected() || r4.isSelected()){
                int t = Integer.parseInt(t2.getText());
                t2.setText(String.valueOf(t+1));
            }
        if(r3.isSelected())
        {
            int score = Integer.parseInt(t1.getText());
            t1.setText(String.valueOf(score+1));
        }
        b1.setVisible(false);
        b2.setVisible(true);
        b3.setVisible(true);
        r3.setBackground(Color.green);
    }//GEN-LAST:event_b1MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {
        String msg = t1.getText();
        String tot= t2.getText();
        new Finish(msg,tot).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_b3MouseClicked
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
