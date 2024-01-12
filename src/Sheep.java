import javax.swing.*;

public class Sheep extends FarmElement{
    @Override
    public JLabel draw(int x, int y) {

        JLabel sheep=new JLabel();
        sheep.setIcon(new ImageIcon("Sources/sheep.png"));
        sheep.setBounds(x-90,y-91,180,183);
        return sheep;
    }
}
