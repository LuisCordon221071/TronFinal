import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cola1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cola1 extends Cola
{
    /**
     * Act - do whatever the Cola1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b, jugador;
    int countLength = 1;
    static int azulLength = 75;
    public Cola1(int jugador, int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }
    public void act()
    {
        countLength++;
        if(countLength>25 && isTouching(Cabeza1.class))
        {
            getWorld().addObject(new Ganorojoo(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        if(jugador == 0 && countLength % azulLength == 0){
            getWorld().removeObject(this);
        }// Add your action code here.
    }
}
