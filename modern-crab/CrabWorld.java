// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 382, 160);
        Worm worm =  new  Worm();
        addObject(worm, 109, 249);
        Worm worm2 =  new  Worm();
        addObject(worm2, 293, 261);
        Worm worm3 =  new  Worm();
        addObject(worm3, 341, 253);
        Worm worm4 =  new  Worm();
        addObject(worm4, 235, 356);
        Worm worm5 =  new  Worm();
        addObject(worm5, 109, 52);
        Worm worm6 =  new  Worm();
        addObject(worm6, 512, 59);
        Worm worm7 =  new  Worm();
        addObject(worm7, 108, 489);
        Worm worm8 =  new  Worm();
        addObject(worm8, 404, 444);
        Worm worm9 =  new  Worm();
        addObject(worm9, 516, 286);
        Worm worm10 =  new  Worm();
        addObject(worm10, 266, 66);
        Lobster lobster =  new  Lobster();
        addObject(lobster, 191, 170);
    }
}
