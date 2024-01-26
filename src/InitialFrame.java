import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InitialFrame extends JFrame implements ActionListener {
    JFrame iframe;
    InitialFrame(){
        this.iframe=new JFrame("FarmVille");
        iframe.setSize(1480,986);
        iframe.setContentPane(new JLabel(new ImageIcon("Sources/skybg.jpg")));
        JButton playbutton=new JButton("Play");
        playbutton.setBounds(590,530, 300,100);
        playbutton.setFont(new Font("Cooper Black", Font.PLAIN, 55));
        playbutton.setForeground(Color.WHITE);
        playbutton.setBorder(null);
        playbutton.setBorderPainted(false);
        playbutton.setContentAreaFilled(false);
        playbutton.setOpaque(false);
        JLabel fv=new JLabel("FarmVille");
        fv.setBounds(440,270,600,200);
        fv.setFont(new Font("Cooper Black", Font.PLAIN, 110));
        fv.setForeground(Color.WHITE);
        fv.setHorizontalAlignment(SwingConstants.CENTER);
       // fv.setBorder(BorderFactory.createLineBorder(Color.black));
        playbutton.addActionListener(this);
        iframe.add(fv);
        iframe.add(playbutton);
        iframe.setLayout(null);
        iframe.setVisible(true);
        iframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        UsernameFrame usernameFrame=new UsernameFrame();
       iframe.dispose();

    }
}
