
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Dice {
    private int num;
    private Color c;
    private int size, dotsize;
    private Graphics g;
    private JPanel p;
    
    public Dice(JPanel p){
        num = (int)Math.random() * 6 + 1;
        this.p = p;
        g = p.getGraphics();
        size = p.getWidth();
        dotsize = (int)(.167 * size);
    }
    
    public int getValue(){
        return num;
    }
    
    public void roll(){
       num = (int)(Math.random() * 6) + 1;
       draw();
    }
    
    private void draw(){
        g.setColor(Color.white);
        g.fillRoundRect((int)(.167 * size), (int)(.167 * size), (int)(.67 * size), (int)(.67 * size), 20, 20);
        drawDots();
    }
    
    
    private void drawDots(){
        g.setColor(Color.black);
        System.out.println("" + num);
        switch(num){
            case 1:
                dot4();
                break;
            case 2:
                dot1();
                dot7();
                break;
            case 3:
                dot1();
                dot4();
                dot7();
                break;
            case 4:
                dot1();
                dot2();
                dot6();
                dot7();
                break;
            case 5:
                dot1();
                dot2();
                dot4();
                dot6();
                dot7();
                break;
            default:
                dot1();
                dot2();
                dot3();
                dot5();
                dot6();
                dot7();
        }
        
    }
    
    private void dot1(){
        g.fillOval((int)(size * .2), (int)(size * .2), dotsize, dotsize);
    }
    
    private void dot2(){
         g.fillOval((int)(size * .6), (int)(size * .2), dotsize,dotsize);
    }
    
    private void dot3(){
         g.fillOval((int)(size * .2), (int)(size * .4), dotsize, dotsize);
    }
    
    private void dot4(){
        g.fillOval((int)(size * .4), (int)(size * .4), dotsize,dotsize);
    }
    
    private void dot5(){
         g.fillOval((int)(size * .6), (int)(size * .4), dotsize,dotsize);
    }
    
    private void dot6(){
       g.fillOval((int)(size * .2), (int)(size * .6), dotsize,dotsize);  
    }
    
    private void dot7(){
        g.fillOval((int)(size * .6), (int)(size * .6), dotsize,dotsize);
    }
    
}
