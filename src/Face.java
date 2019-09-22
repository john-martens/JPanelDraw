
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Face {
    
    private int xPos, yPos, diameter;
    private Color color;
    boolean isHappy;
    
    private Graphics g;
    
    public Face(Graphics g, int x, int y){
        xPos=x;
        yPos=y;
        diameter=100;
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
        g.fillOval(xPos, yPos, diameter, diameter);
        g.setColor(Color.black);
        g.drawOval(xPos, yPos, diameter, diameter);
    }
    
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xPos-10, yPos-10, diameter + 20, diameter + 20);
    }
    
    private void drawEyes(){
        g.setColor(Color.yellow);
        g.fillOval(xPos + diameter/5, yPos + diameter/5, diameter/4, diameter/4);
        g.fillOval(xPos + (int)(2.75 * diameter/5), yPos + diameter/5, diameter/4, diameter/4);
        
        g.setColor(Color.black);
        g.drawOval(xPos + diameter/5, yPos + diameter/5, diameter/4, diameter/4);
        g.drawOval(xPos + (int)(2.75 * diameter/5), yPos + diameter/5, diameter/4, diameter/4);
    }
    
    private void drawMouth(){
        g.setColor(Color.black);
        //flat mouth
        g.drawLine(xPos + (int)(.3*diameter), yPos + (int)(.75*diameter), 
                   xPos + (int)(.7*diameter), yPos + (int)(.75*diameter));
        if(isHappy){
        //happy up left
        g.drawLine(xPos + (int)(.3*diameter), yPos + (int)(.75*diameter), 
                   xPos + (int)(.25*diameter), yPos + (int)(.65*diameter));
        //happy up right
        g.drawLine(xPos + (int)(.7*diameter), yPos + (int)(.75*diameter), 
                   xPos + (int)(.75*diameter), yPos + (int)(.65*diameter));
        }
        else{
            //sad down left
        g.drawLine(xPos + (int)(.3*diameter), yPos + (int)(.75*diameter), 
                   xPos + (int)(.25*diameter), yPos + (int)(.85*diameter));
        //sad down right
        g.drawLine(xPos + (int)(.7*diameter), yPos + (int)(.75*diameter), 
                   xPos + (int)(.75*diameter), yPos + (int)(.85*diameter));
        }
    }
    
    public void move(int newx, int newy){
        xPos = newx;
        yPos = newy;
    }
    
    public void setSize(int newSize){
        diameter = newSize;
    }
    
    public void setColor(Color newColor){
        color = newColor;
    }
    
}
