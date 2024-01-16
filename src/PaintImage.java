import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class PaintImage extends JPanel {
    public static BufferedImage image;
    JPanel repaintpanel;
    int x;
    int y;
    String elementType;


    public PaintImage (JPanel rp, int x,int y, String elementType)
    {
        super();
        this.repaintpanel=rp;
        this.x=x;
        this.y=y;
        this.elementType=elementType;
        //this.animalType=animalType;
        try
        {
            image = ImageIO.read(new File("Sources/"+this.elementType+".png"));
        }
        catch (IOException e)
        {
            //Not handled.
        }
    }

    public void paintComponent(Graphics g){
        if(Objects.equals(this.elementType, "cow")) {
            g.drawImage(image, this.x - 100, this.y - 63, null);
            this.repaintpanel.revalidate();
            this.repaintpanel.repaint();
        }
        if(Objects.equals(this.elementType, "pig")) {
            g.drawImage(image, this.x - 85, this.y - 63, null);
            this.repaintpanel.revalidate();
            this.repaintpanel.repaint();
        }
        if(Objects.equals(this.elementType, "hen")) {
            g.drawImage(image, this.x - 70, this.y - 100, null);
            this.repaintpanel.revalidate();
            this.repaintpanel.repaint();
        }
        if(Objects.equals(this.elementType, "sheep")) {
            g.drawImage(image, this.x - 90, this.y - 91, null);
            this.repaintpanel.revalidate();
            this.repaintpanel.repaint();
        }
        if(Objects.equals(this.elementType, "wheatstage1")) {
            g.drawImage(image, this.x - 100, this.y - 63, null);
            this.repaintpanel.revalidate();
            this.repaintpanel.repaint();
        }
        if(Objects.equals(this.elementType, "soybeanstage1")) {
            g.drawImage(image, this.x - 85, this.y - 63, null);
            this.repaintpanel.revalidate();
            this.repaintpanel.repaint();
        }
        if(Objects.equals(this.elementType, "carrotstage1")) {
            g.drawImage(image, this.x - 70, this.y - 100, null);
            this.repaintpanel.revalidate();
            this.repaintpanel.repaint();
        }
        if(Objects.equals(this.elementType, "cornstage1")) {
            g.drawImage(image, this.x - 90, this.y - 91, null);
            this.repaintpanel.revalidate();
            this.repaintpanel.repaint();
        }


    }
}

