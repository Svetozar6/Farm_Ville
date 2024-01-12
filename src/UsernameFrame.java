import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsernameFrame extends JFrame implements ActionListener {
    JFrame uframe;
    JTextField userfield;
UsernameFrame(){
    this.uframe=new JFrame("FarmVille");
    uframe.setSize(859,800);
    uframe.setContentPane(new JLabel(new ImageIcon("Sources/skybg1.jpg")));
    JLabel fv=new JLabel("FarmVille");
    fv.setBounds(220,185,400,100);
    fv.setFont(new Font("Cooper Black", Font.PLAIN, 70));
    fv.setForeground(Color.WHITE);
    fv.setHorizontalAlignment(SwingConstants.CENTER);
    JLabel username=new JLabel("Username:");
    username.setBounds(243,300,200,50);
    username.setFont(new Font("Cooper Black", Font.PLAIN, 26));
    username.setForeground(Color.WHITE);
    this.userfield=new JTextField();
    userfield.setBounds(400,305,200,40);
    userfield.setFont(new Font("Cooper Black", Font.PLAIN, 24));
    userfield.setForeground(Color.WHITE);
    userfield.setOpaque(false);
    userfield.setBorder(null);
    JButton playbutton=new JButton("Play");
    playbutton.setBounds(335,385, 150,50);
    playbutton.setFont(new Font("Cooper Black", Font.PLAIN, 30));
    playbutton.setForeground(Color.WHITE);
    playbutton.setBorder(null);
    playbutton.setBorderPainted(false);
    playbutton.setContentAreaFilled(false);
    playbutton.setOpaque(false);
    playbutton.addActionListener(this);
    uframe.add(playbutton);
    uframe.add(userfield);
    uframe.add(username);
    uframe.add(fv);
    uframe.setLayout(null);
    uframe.setVisible(true);
    uframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}


    @Override
    public void actionPerformed(ActionEvent e) {
        User user1=new User();
        user1.setUsername(userfield.getText());
        MainFrame mainframe=new MainFrame(user1);
        uframe.dispose();
    }
}
