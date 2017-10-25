import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pikachu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pikachu extends Creature
{
    private Creature enemy;
    private String enemyType;
    
    public void attack( int idx )
    {
     CreatureWorld world = (CreatureWorld)getWorld();
     enemy = world.getPlayerOne();
     enemyType = enemy.getType();
     if ( idx == 0 )
     {
        enemy.getHealthBar().add(-25);
     }
     else
     {
        enemy.getHealthBar().add(-70); 
     }
     world.setTurnNumber(1);
    }
   
    public Pikachu( World w )
    {
       super(700, 2, "Electric");
       
       getImage().scale(150,100);
       
       w.addObject( getHealthBar(),100,25);
    }
    
    /**
     * Act - do whatever the Pikachu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        CreatureWorld playerWorld = (CreatureWorld)getWorld();
        
        if(getHealthBar().getCurrent() <=0)
        {
            getWorld().showText("Pikachu has fainted...",getWorld().getWidth()/2,getWorld().getHeight()/2+26);
        }
        
        Greenfoot.delay(30);
    } 
    
}
