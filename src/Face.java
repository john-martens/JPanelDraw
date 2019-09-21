
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Face {
    
    private int xPos, yPos, radius;
    private Color color;
    boolean isHappy;
    
    private Graphics g;
    
    public Face(Graphics g, int x, int y){
        xPos=x;
        yPos=y;
        radius=100;
        color=Color.red;
       this.g = g;
       isHappy=true;
    }
    
    public void draw(){
        drawHead();
        drawEyes();
        drawMouth();
    }
    
    public void toggleMood(){
        isHappy = !isHappy;
    }
    
    private void drawHead(){
        g.setColor(color);
        g.fillOval(xPos, yPos, radius, radius);
        g.setColor(Color.black);
        g.drawOval(xPos, yPos, radius, radius);
    }
    
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xPos-10, yPos-10, radius + 20, radius + 20);
    }
    
    private void drawEyes(){
        g.setColor(Color.yellow);
        g.fillOval(xPos + radius/5, yPos + radius/5, radius/4, radius/4);
        g.fillOval(xPos + (int)(2.75 * radius/5), yPos + radius/5, radius/4, radius/4);
        
        g.setColor(Color.black);
        g.drawOval(xPos + radius/5, yPos + radius/5, radius/4, radius/4);
        g.drawOval(xPos + (int)(2.75 * radius/5), yPos + radius/5, radius/4, radius/4);
    }
    
    private void drawMouth(){
        g.setColor(Color.black);
        //flat mouth
        g.drawLine(xPos + (int)(.3*radius), yPos + (int)(.75*radius), 
                   xPos + (int)(.7*radius), yPos + (int)(.75*radius));
        if(isHappy){
        //happy up left
        g.drawLine(xPos + (int)(.3*radius), yPos + (int)(.75*radius), 
                   xPos + (int)(.25*radius), yPos + (int)(.65*radius));
        //happy up right
        g.drawLine(xPos + (int)(.7*radius), yPos + (int)(.75*radius), 
                   xPos + (int)(.75*radius), yPos + (int)(.65*radius));
        }
        else{
            //sad down left
        g.drawLine(xPos + (int)(.3*radius), yPos + (int)(.75*radius), 
                   xPos + (int)(.25*radius), yPos + (int)(.85*radius));
        //sad down right
        g.drawLine(xPos + (int)(.7*radius), yPos + (int)(.75*radius), 
                   xPos + (int)(.75*radius), yPos + (int)(.85*radius));
        }
    }
    
    public void move(int newx, int newy){
        xPos = newx;
        yPos = newy;
    }
    
    public void setSize(int newSize){
        radius = newSize;
    }
    
    public void setColor(Color newColor){
        color = newColor;
    }
    
}
