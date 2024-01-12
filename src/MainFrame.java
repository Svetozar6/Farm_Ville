import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import javax.swing.text.Element;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainFrame extends JFrame implements ActionListener, MouseListener {
    JFrame frame;
    User user;
    //FarmElement currentEl;
    ArrayList<FarmElement> elements;
    ActionListener anL;
    ActionListener crL;
    MainFrame(User user1){
        this.elements=new ArrayList<>();
        this.user=user1;
        //this.currentEl=new FarmElement();
        ImageIcon cowicon=new ImageIcon("Sources/cow.png");
        ImageIcon sheepicon=new ImageIcon("Sources/sheep.png");
        ImageIcon pigicon=new ImageIcon("Sources/pig.png");
        ImageIcon henicon=new ImageIcon("Sources/hen.png");
        ImageIcon cornicon=new ImageIcon("Sources/corn.png");
        ImageIcon wheaticon=new ImageIcon("Sources/wheat.png");
        ImageIcon soybeanicon=new ImageIcon("Sources/soybean.png");
        ImageIcon carroticon=new ImageIcon("Sources/carrot.png");
        this.frame=new JFrame("FarmVille");
        JPanel panel1=new JPanel();
        panel1.setBounds(0,134,430,150);
        panel1.setLayout(new GridLayout(1,2));
        panel1.setBackground(Color.orange);
        JPanel menu=new JPanel();
        menu.setBounds(0,284,430,702);
        menu.setLayout(new GridLayout(2,2));
        menu.setBackground(Color.orange);
        JButton mb1=new JButton();mb1.setBackground(Color.orange);mb1.setBorder(null);
        JButton mb2=new JButton();mb2.setBackground(Color.orange);mb2.setBorder(null);
        JButton mb3=new JButton();mb3.setBackground(Color.orange);mb3.setBorder(null);
        JButton mb4=new JButton();mb4.setBackground(Color.orange);mb4.setBorder(null);
        menu.add(mb1);menu.add(mb2);menu.add(mb3);menu.add(mb4);
        Image grassIcon=new ImageIcon("Sources/grassbackground.jpg").getImage();
        JPanelWithBackground field=new JPanelWithBackground(grassIcon);
        field.setBounds(430,300,1050,686);
        Image skyIcon=new ImageIcon("Sources/skybackground.jpg").getImage();
        JPanelWithBackground sky=new JPanelWithBackground(skyIcon);
        sky.setBounds(430,0,1050,300);
        JButton animals=new JButton("Amimals");
        animals.setFont(new Font("Cooper Black", Font.PLAIN, 25));
        animals.setForeground(Color.WHITE);
        animals.setBorder(null);
        animals.setBorderPainted(false);
        animals.setContentAreaFilled(false);
        animals.setOpaque(false);
        JButton crops=new JButton("Crops");
        crops.setFont(new Font("Cooper Black", Font.PLAIN, 25));
        crops.setForeground(Color.WHITE);
        crops.setBorder(null);
        crops.setBorderPainted(false);
        crops.setContentAreaFilled(false);
        crops.setOpaque(false);
        panel1.add(animals);panel1.add(crops);
        JLabel ulabel=new JLabel(user1.getUsername()+"'s farm");
        ulabel.setFont(new Font("Cooper Black", Font.PLAIN, 28));
        ulabel.setForeground(Color.WHITE);
        ulabel.setBounds(0,0,420,134);
        ulabel.setHorizontalAlignment(SwingConstants.CENTER);
        Image imgIcon=new ImageIcon("Sources/woodenboard.png").getImage();
        JPanelWithBackground upanel=new JPanelWithBackground(imgIcon);
        upanel.setBounds(0,0,430,134);
        upanel.add(ulabel);

        animals.addActionListener(new ActionListener() {
            FarmElement currentEl;
            @Override
            public void actionPerformed(ActionEvent e) {
                mb1.removeActionListener(crL);
                mb2.removeActionListener(crL);
                mb3.removeActionListener(crL);
                mb4.removeActionListener(crL);
                mb1.setIcon(cowicon);
                mb2.setIcon(pigicon);
                mb3.setIcon(henicon);
                mb4.setIcon(sheepicon);

                MouseListener mb1l=new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        currentEl=new Cow();
                        for(int i=0;i<elements.size();i++){
                            if(currentEl!= elements.get(i)) {
                                field.add(currentEl.draw(e.getX(),e.getY()));
                                elements.add(currentEl);
                            }
                        }
                        System.out.println("Cow printed");
                    }
                };
                MouseListener mb2l=new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        currentEl=new Pig();
                        for(int i=0;i<elements.size();i++){
                            if(currentEl!= elements.get(i)) {
                                field.add(currentEl.draw(e.getX(),e.getY()));
                                elements.add(currentEl);
                            }
                        }
                        System.out.println("Pig printed");
                    }
                };
                MouseListener mb3l=new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        currentEl=new Hen();
                        for(int i=0;i<elements.size();i++){
                            if(currentEl!= elements.get(i)) {
                                field.add(currentEl.draw(e.getX(),e.getY()));
                                elements.add(currentEl);
                            }
                        }
                        //System.out.println("Hen printed");
                    }
                };
                MouseListener mb4l=new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        currentEl=new Sheep();
                        for(int i=0;i<elements.size();i++){
                            if(currentEl!= elements.get(i)) {
                                field.add(currentEl.draw(e.getX(),e.getY()));
                                elements.add(currentEl);
                            }
                        }

                        //System.out.println("Sheep printed");
                    }
                };
                 anL=new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        field.removeMouseListener(mb1l);
                        field.removeMouseListener(mb2l);
                        field.removeMouseListener(mb3l);
                        field.removeMouseListener(mb4l);
                        if(e.getSource()==mb1) {
                            field.removeMouseListener(mb2l);
                            field.removeMouseListener(mb3l);
                            field.removeMouseListener(mb4l);
                            field.addMouseListener(mb1l);

                        }
                        if(e.getSource()==mb2) {
                            field.removeMouseListener(mb1l);
                            field.removeMouseListener(mb3l);
                            field.removeMouseListener(mb4l);
                            field.addMouseListener(mb2l);
                        }
                        if(e.getSource()==mb3) {
                            field.removeMouseListener(mb2l);
                            field.removeMouseListener(mb1l);
                            field.removeMouseListener(mb4l);
                            field.addMouseListener(mb3l);
                        }
                        if(e.getSource()==mb4) {
                            field.removeMouseListener(mb2l);
                            field.removeMouseListener(mb3l);
                            field.removeMouseListener(mb1l);
                            field.addMouseListener(mb4l);

                        }
                    }
                };
                mb1.addActionListener(anL);
                mb2.addActionListener(anL);
                mb3.addActionListener(anL);
                mb4.addActionListener(anL);

        };



        });
        crops.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mb1.removeActionListener(anL);
                mb2.removeActionListener(anL);
                mb3.removeActionListener(anL);
                mb4.removeActionListener(anL);
                mb4.setIcon(cornicon);
                mb1.setIcon(wheaticon);
                mb2.setIcon(soybeanicon);
                mb3.setIcon(carroticon);
                MouseListener mb1l=new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        field.setBackground(Color.BLACK);
                    }
                };
                MouseListener mb2l=new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        field.setBackground(Color.CYAN);
                    }
                };
                MouseListener mb3l=new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        field.setBackground(Color.BLUE);
                    }
                };
                MouseListener mb4l=new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        field.setBackground(Color.DARK_GRAY);
                    }
                };
                crL=new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(e.getSource()==mb1) field.addMouseListener(mb1l);
                        if(e.getSource()==mb2) field.addMouseListener(mb2l);
                        if(e.getSource()==mb3) field.addMouseListener(mb3l);
                        if(e.getSource()==mb4) field.addMouseListener(mb4l);
                    }
                };
                mb1.addActionListener(crL);
                mb2.addActionListener(crL);
                mb3.addActionListener(crL);
                mb4.addActionListener(crL);

            }
        });
        frame.add(sky);
        frame.add(panel1);
        frame.add(field);
        frame.add(upanel);
        frame.add(menu);
        frame.setSize(1480, 986);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
