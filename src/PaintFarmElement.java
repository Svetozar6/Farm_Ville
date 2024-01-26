
import javax.swing.*;
import java.util.Objects;

public class PaintFarmElement extends JLabel{
    JPanel repaintpanel;
    JLabel paintElement;
    int x;
    int y;
    String elementType;
    ImageIcon icon;


    public PaintFarmElement (JPanel rp, int x,int y, String elementType)
    {
        super();
        this.repaintpanel=rp;
        this.x=x;
        this.y=y;
        this.elementType=elementType;
        this.paintElement=new JLabel();
        this.icon=new ImageIcon("Sources/"+this.elementType+".png");

    }

   public JLabel drawImage() {
       if (Objects.equals(this.elementType, "cow")) {
           this.paintElement.setIcon(this.icon);
           this.paintElement.setBounds(this.x-100,this.y-63,200,127);
           return this.paintElement;
       }
       if (Objects.equals(this.elementType, "pig")) {
           this.paintElement.setIcon(this.icon);
           this.paintElement.setBounds(this.x-85,this.y-63,170,166);
           return this.paintElement;
       }
       if (Objects.equals(this.elementType, "hen")) {
           this.paintElement.setIcon(this.icon);
           this.paintElement.setBounds(this.x-70,this.y-100,141,200);
           return this.paintElement;
      }
       if (Objects.equals(this.elementType, "sheep")) {
           this.paintElement.setIcon(this.icon);
           this.paintElement.setBounds(this.x-90,this.y-91,180,183);
           return this.paintElement;
       }
       if (Objects.equals(this.elementType, "wheatstage1")) {
           this.paintElement.setIcon(this.icon);
           this.paintElement.setBounds(this.x-80,this.y-80,160,160);
           return this.paintElement;
       }
       if (Objects.equals(this.elementType, "soybeanstage1")) {
           this.paintElement.setIcon(this.icon);
           this.paintElement.setBounds(this.x-80,this.y-80,160,160);
           return this.paintElement;

       }
       if (Objects.equals(this.elementType, "carrotstage1")) {
           this.paintElement.setIcon(this.icon);
           this.paintElement.setBounds(this.x-80,this.y-80,160,160);
           return this.paintElement;

       }
       if (Objects.equals(this.elementType, "cornstage1")) {
           this.paintElement.setIcon(this.icon);
           this.paintElement.setBounds(this.x-80,this.y-80,160,160);
           return this.paintElement;

       }
       return this.paintElement;
   }



}

