import javax.swing.JPanel;
import java.awt.Color;

public class MyPanel extends JPanel {
    public MyPanel(Color color, int x, int y, int width, int height){
        setBounds(x,y,width,height);
        setBackground(color);
    }
}
