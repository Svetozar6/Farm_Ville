import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    JFrame frame;
    byte value=0;
    MainFrame(){
        ImageIcon cowicon=new ImageIcon("Sources/cow.png");
        ImageIcon sheepicon=new ImageIcon("Sources/sheep.png");
        ImageIcon pigicon=new ImageIcon("Sources/pig.png");
        ImageIcon henicon=new ImageIcon("Sources/hen.png");
        ImageIcon cornicon=new ImageIcon("Sources/corn.png");
        ImageIcon wheaticon=new ImageIcon("Sources/wheat.png");
        this.frame=new JFrame("FarmVille");
        JPanel panel1=new JPanel();
        panel1.setBounds(0,100,430,150);
        panel1.setLayout(new GridLayout(1,2));
        panel1.setBackground(Color.orange);
        JPanel menu=new JPanel();
        menu.setBounds(0,250,430,736);
        menu.setLayout(new GridLayout(2,2));
        menu.setBackground(Color.orange);
        JButton mb1=new JButton();mb1.setBackground(Color.orange);mb1.setBorder(null);
        JButton mb2=new JButton();mb2.setBackground(Color.orange);mb2.setBorder(null);
        JButton mb3=new JButton();mb3.setBackground(Color.orange);mb3.setBorder(null);
        JButton mb4=new JButton();mb4.setBackground(Color.orange);mb4.setBorder(null);
        menu.add(mb1);menu.add(mb2);menu.add(mb3);menu.add(mb4);
        JPanel field=new JPanel();
        field.setBounds(430,300,1050,686);
        field.setBackground(Color.green);
        field.setLayout(new GridLayout(2,2));
        JButton b1=new JButton();b1.setBackground(Color.green);b1.setBorder(null);
        JButton b2=new JButton();b2.setBackground(Color.green);b2.setBorder(null);
        JButton b3=new JButton();b3.setBackground(Color.green);b3.setBorder(null);
        JButton b4=new JButton();b4.setBackground(Color.green);b4.setBorder(null);
        field.add(b1);field.add(b2);field.add(b3);field.add(b4);
        JPanel sky=new JPanel();
        sky.setBounds(430,0,1050,300);
        Color skycolor=new Color(64, 196, 255);
        sky.setBackground(skycolor);
        JButton animals=new JButton("Amimals");
        animals.setFont(new Font("Cooper Black", Font.PLAIN, 18));
        animals.setForeground(Color.BLACK);
        animals.setBorder(null);
        animals.setBorderPainted(false);
        animals.setContentAreaFilled(false);
        animals.setOpaque(false);
        JButton crops=new JButton("Crops");
        crops.setFont(new Font("Cooper Black", Font.PLAIN, 18));
        crops.setForeground(Color.BLACK);
        crops.setBorder(null);
        crops.setBorderPainted(false);
        crops.setContentAreaFilled(false);
        crops.setOpaque(false);
        panel1.add(animals);panel1.add(crops);
        JLabel label=new JLabel();
        label.setBounds(0,0,430,100);
        //label.setBackground(Color.black);
        label.setIcon(new ImageIcon("Sources/woodbackground.png"));
        animals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mb1.setIcon(cowicon);
                mb2.setIcon(pigicon);
                mb3.setIcon(henicon);
                mb4.setIcon(sheepicon);
                mb1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        b1.setIcon(cowicon);
                    }
                });
                mb3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        b3.setIcon(henicon);
                    }
                });
                mb4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        b4.setIcon(sheepicon);
                    }
                });
                mb2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        b2.setIcon(pigicon);
                    }
                });
            }
        });
        crops.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mb4.setIcon(cornicon);
                mb1.setIcon(wheaticon);
            }
        });

        frame.add(sky);
        frame.add(panel1);
        frame.add(field);
        frame.add(label);
        frame.add(menu);
        frame.setSize(1480,986);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
