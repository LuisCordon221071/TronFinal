import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cola2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cola2 extends Cola
{
    /**
     * Act - do whatever the Cola2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b, jugador;
    int countLength = 1;
    static int rojoLength = 75;
    public Cola2(int jugador, int r, int g, int b)
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
        if(countLength>25 && isTouching(Cabeza2.class))
        {
            getWorld().addObject(new Ganoazul(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        if(jugador == 0 && countLength % rojoLength == 0){
            getWorld().removeObject(this);
        }// Add your action code here.
    }
}
