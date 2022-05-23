import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {

    private JButton btnUp  = new JButton("Ules nupp");
    private JButton btnDown = new JButton("Alam nupp");

    private JTextField txtA = new JTextField();
    private JTextField txtB = new JTextField();
    private JTextField txtC = new JTextField();

    private JLabel lblA = new JLabel("A input :");
    private JLabel lblB = new JLabel("B input :");
    private JLabel lblC = new JLabel("C input :");

    public MyFrame(){
        setTitle("Test rakendus");
        setSize(400,200);
        setLocation(new Point(300,200));
        setLayout(null);
        setResizable(false);

        initComponent();
        initEvent();
    }

    private void initComponent(){
        btnUp.setBounds(200,130, 200,25);
        btnDown.setBounds(200,100, 200,25);

        txtA.setBounds(200,10,100,20);
        txtB.setBounds(200,35,100,20);
        txtC.setBounds(200,65,100,20);

        lblA.setBounds(20,10,100,20);
        lblB.setBounds(20,35,100,20);
        lblC.setBounds(20,65,100,20);


        add(btnUp);
        add(btnDown);

        add(lblA);
        add(lblB);
        add(lblC);

        add(txtA);
        add(txtB);
        add(txtC);
    }

    private void initEvent(){

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(1);
            }
        });

        btnUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnUpClick(e);
            }
        });

        btnDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnDownClick(e);
            }
        });
    }

    private void btnUpClick(ActionEvent evt){
        System.exit(0);
    }

    private void btnDownClick(ActionEvent evt){
        System.exit(1);
    }
}