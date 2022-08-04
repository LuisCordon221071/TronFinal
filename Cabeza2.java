import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cabeza2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cabeza2 extends Jugador
{
    /**
     * Act - do whatever the Cabeza2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b, jugador;
    int velocidad = 4;
    int count = 0;
    private final int derecha = 0;
    private final int abajo = 90;
    private final int izquierda = 180;
    private final int arriba = 270;
    private int counter = 0;
    private int rot;
    public Cabeza2(int jugador, int r, int g,int b)
    {
        setRotation(0);
        this.r = r;
        this.g = g;
        this.b = b;
        this.jugador = jugador;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(4,0,40,40);
    }
    public void act()
    {
        count++;
        move(velocidad);
        moverse();
        muerte();
        // Add your action code here.
    }
    public void moverse()
    {
        if(getRotation()==derecha){
            rot=0;
        } else if(getRotation()==abajo){
            rot=1;
        } else if(getRotation()==izquierda){
            rot=2;
        } else {
            rot=3;
        }
        counter++;
        if(Jugador.parado()==0){
            getWorld().addObject(new Cola2(jugador, r, g, b), getX(), getY());
            counter=0;
        }
        if(Greenfoot.isKeyDown("d")&&rot!=2){
            setRotation(derecha);
        }
        if(Greenfoot.isKeyDown("s")&&rot!=3){
            setRotation(abajo);
        }
        if(Greenfoot.isKeyDown("a")&&rot!=0){
            setRotation(izquierda);
        }
        if(Greenfoot.isKeyDown("w")&&rot!=1){
            setRotation(arriba);
        }
        if(Greenfoot.isKeyDown("q")){
            velocidad = 6;
        }
        if(Greenfoot.isKeyDown("e")){
            velocidad = 2;
        }
    }
    private void muerte()
    {
        if(isTouching(Cola1.class)){
            getWorld().addObject(new Ganoazul(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        if(isTouching(Jugador.class)){
            getWorld().addObject(new Ganoazul(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
