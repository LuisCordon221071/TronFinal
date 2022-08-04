import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Jugador azulJugador = new Cabeza1(0,0,0,255);
    Jugador rojoJugador = new Cabeza2(4,255,0,0);
    Ganoazul azulGano = new Ganoazul();
    Ganorojoo rojoGano = new Ganorojoo();
    int count = 0;
    GreenfootSound backgroundMusic = new GreenfootSound("MCR.mp3");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(azulJugador,800, 300);
        addObject(rojoJugador, 0, 300);
    }
        public void act()
    {
        backgroundMusic.playLoop();
    }
}
