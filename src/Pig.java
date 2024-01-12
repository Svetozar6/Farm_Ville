import javax.swing.*;

public class Pig extends FarmElement{
    @Override
    public JLabel draw(int x, int y) {
        JLabel pig=new JLabel();
        pig.setIcon(new ImageIcon("Sources/pig.png"));
        pig.setBounds(x-85,y-83,170,166);
        return pig;
    }
}
