import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Cow extends FarmElement{
    @Override
    public JLabel draw(int x, int y) {
        JLabel cow=new JLabel();
        cow.setIcon(new ImageIcon("Sources/cow.png"));
        cow.setBounds(x-100,y-63,200,127);
        return cow;
    }


}
