
import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;

public class MyFrame extends JFrame {
    public MyFrame  ()
    {
      
        
           setVisible(true);// включаем видимость окна
           setSize(1000, 600);//устанавливаем ширину и высоту
           setTitle("My faceit");
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setResizable(false);//выключаем возможность изменять размер окна.
            
    
            ImageIcon icon = new ImageIcon("faceit.png");
            setIconImage(icon.getImage());
    

            MyPanel blackPanel = new MyPanel(Color.black, 0, 300, 540, 300);
            MyPanel greenPanel = new MyPanel(Color.green, 270, 0, 270, 300);
            MyPanel grayPanel = new MyPanel(Color.gray, 0, 0, 270, 300);
            blackPanel.setLayout(null);
            blackPanel.add(new MyLabel());


            add(grayPanel);
            add(greenPanel);
            add(blackPanel);

           // add(new MyLabel());
            setLayout(null); //откл стандартный менеджер расположений
            revalidate();
            repaint();

            
            

            
            
            
    }
}
    


