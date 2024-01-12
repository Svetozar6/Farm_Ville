import javax.swing.*;

public class Hen extends FarmElement{

    @Override
    public JLabel draw(int x, int y) {
        JLabel hen=new JLabel();
        hen.setIcon(new ImageIcon("Sources/hen.png"));
        hen.setBounds(x-70, y-100, 141, 200);
        return hen;
    }
}
