import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyLabel extends JLabel {
    public MyLabel(){
        setText("Скоро сдесь будет игра");
        setForeground(new Color(245,78,40)); //цвет
        setFont(new Font("Arial", Font.BOLD, 20));
        setBackground(new Color(231,41,45));//фон
        setOpaque(true); //делаем фон непрозрачным
        ImageIcon img = new ImageIcon("faceit.png");
        setIcon(img);
        setHorizontalTextPosition(JLabel.CENTER); // устанавливаем текст по горизонтали относ каринке lEFt/CENTER/RIGHT
        setVerticalTextPosition(JLabel.TOP); // устанавливаем текст по вертикали относ каринке TOP/CENTER/BOTTOM
        setIconTextGap(15);

        Border border = BorderFactory.createLineBorder(Color.black, 3);
        setBorder(border);
        setVerticalAlignment(CENTER);
        setHorizontalAlignment(CENTER);
        
        setBounds(100,10,200,200);

}
}
