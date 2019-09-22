
import java.awt.Color;
import java.awt.Graphics;


public class Dice {
    private int num;
    private Color c;
    private int size;
    private Graphics g;
    
    public Dice(Graphics g){
        num = (int)Math.random() * 6 + 1;
        this.g = g;
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
        g.fillRoundRect(25, 25, 100, 100, 20, 20);
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
        g.fillOval(30, 30, 25, 25);
    }
    
    private void dot2(){
         g.fillOval(90, 30, 25, 25);
    }
    
    private void dot3(){
         g.fillOval(30, 60, 25, 25);
    }
    
    private void dot4(){
        g.fillOval(60, 60, 25, 25);
    }
    
    private void dot5(){
         g.fillOval(90, 60, 25, 25);
    }
    
    private void dot6(){
       g.fillOval(30, 90, 25, 25);  
    }
    
    private void dot7(){
        g.fillOval(90, 90, 25, 25);
    }
    
}
