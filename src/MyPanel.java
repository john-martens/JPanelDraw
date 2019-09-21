
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(10, 10, 50, 50);
    }
    
    
    public void addSquare(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(100, 100, 50, 50);
    }
}
