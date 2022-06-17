import java.awt.Color;

public class question15 extends javax.swing.JFrame {
    question15(String para,String tot) {
                project();
        t1.setText(para);
        t2.setText(tot);
        b2.setVisible(false);
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
        t2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Question 12");

        q1.setBackground(new java.awt.Color(255, 255, 255));
        q1.setName("q12");
        q1.setPreferredSize(new java.awt.Dimension(650, 650));

        l1.setFont(new java.awt.Font("Tahoma", 1, 24));
        l1.setText("Question 12");


        l3.setFont(new java.awt.Font("Tahoma", 0, 24));
        l3.setText("Which goalkeeper had the most clean sheets ?");

        l4.setText("Correct Answers :");

        t1.setEditable(false);
        t1.setText("0");

        b1.setText("Submit Answer");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });

        b2.setText("Finish");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        g1.add(r1);
        r1.setText("Allison");

        g1.add(r2);
        r2.setText("Thibaut Courtois");

        g1.add(r3);
        r3.setText("David De Gea");

        g1.add(r4);
        r4.setText("Fernando Mulsera");

        t2.setEditable(false);
        t2.setBackground(new java.awt.Color(255, 255, 255));
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setBorder(null);

            javax.swing.GroupLayout q1Layout = new javax.swing.GroupLayout(q1);
			        q1.setLayout(q1Layout);
			        q1Layout.setHorizontalGroup(
			            q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			            .addGroup(q1Layout.createSequentialGroup()
			                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                    .addGroup(q1Layout.createSequentialGroup()
			                        .addGap(60, 60, 60)
			                        .addComponent(r1)
			                        .addGap(37, 37, 37)
			                        .addComponent(r2))
			                    .addGroup(q1Layout.createSequentialGroup()
			                        .addGap(77, 77, 77)
			                        .addComponent(l4)
			                        .addGap(74, 74, 74)
			                        .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
			                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                    .addGroup(q1Layout.createSequentialGroup()
			                        .addGap(58, 58, 58)
			                        .addComponent(b1)
			                        .addGap(67, 67, 67)
			                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
			                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			                    .addGroup(q1Layout.createSequentialGroup()
			                        .addGap(32, 32, 32)
			                        .addComponent(r3)
			                        .addGap(30, 30, 30)
			                        .addComponent(r4)
			                        .addGap(0, 1085, Short.MAX_VALUE))))
			            .addGroup(q1Layout.createSequentialGroup()
			                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                    .addGroup(q1Layout.createSequentialGroup()
			                        .addGap(210, 210, 210)
			                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
			                    .addGroup(q1Layout.createSequentialGroup()
			                        .addGap(294, 294, 294)
			                        .addComponent(l3))
			                    .addGroup(q1Layout.createSequentialGroup()
			                        .addGap(857, 857, 857)
			                        .addComponent(l1)))
			                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			        );
			        q1Layout.setVerticalGroup(
			            q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			            .addGroup(q1Layout.createSequentialGroup()
			                .addGap(74, 74, 74)
			                .addComponent(l1)
			                .addGap(30, 30, 30)
			                .addComponent(l2)
			                .addGap(70, 70, 70)
			                .addComponent(l3)
			                .addGap(56, 56, 56)
			                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			                    .addComponent(r1)
			                    .addComponent(r2)
			                    .addComponent(r3)
			                    .addComponent(r4))
			                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
			                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(l4)
			                    .addComponent(b1)
			                    .addComponent(b2))
			                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			                .addGap(60, 60, 60))
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
        new Finish(msg,tot).setVisible(true);
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
        if(r4.isSelected())
        {
            int score = Integer.parseInt(t1.getText());
            t1.setText(String.valueOf(score+1));
        }
        b1.setVisible(false);
        b2.setVisible(true);
        r4.setBackground(Color.green);
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
