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
    int time = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        prepare();
    }
    public void act(){
        time++;
        if (time % 480 == 0){
            addObject(new Enemy(),Greenfoot.getRandomNumber(399),Greenfoot.getRandomNumber(399));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Enemy enemy = new Enemy();
        addObject(enemy,Greenfoot.getRandomNumber(399),Greenfoot.getRandomNumber(399));

        Enemy enemy1 = new Enemy();
        addObject(enemy1,Greenfoot.getRandomNumber(399),Greenfoot.getRandomNumber(399));

        Wallbase wallbase = new Wallbase();
        addObject(wallbase,282,155);
        wallbase.setLocation(275,150);
        Wallbase wallbase2 = new Wallbase();
        addObject(wallbase2,320,300);
        wallbase2.setLocation(322,294);
        Wallbase wallbase3 = new Wallbase();
        addObject(wallbase3,218,345);
        wallbase3.setLocation(228,342);
        WallSmal wallSmal = new WallSmal();
        addObject(wallSmal,334,346);
        wallSmal.setLocation(344,343);
        WallSmal wallSmal2 = new WallSmal();
        addObject(wallSmal2,44,348);
        wallSmal2.setLocation(52,346);
        WallTall wallTall = new WallTall();
        addObject(wallTall,152,315);
        wallTall.setLocation(150,314);
        wallbase3.setLocation(201,344);
        WallTallBig wallTallBig = new WallTallBig();
        addObject(wallTallBig,201,344);
        wallbase3.setLocation(203,356);
        WallTallBig wallTallBig2 = new WallTallBig();
        addObject(wallTallBig2,200,261);
        wallTallBig2.setLocation(200,291);
        wallTallBig2.setLocation(201,249);
        WallSmal wallSmal3 = new WallSmal();
        addObject(wallSmal3,201,249);
        wallTallBig2.setLocation(196,247);
        wallSmal3.setLocation(237,244);
        WallTallBig wallTallBig3 = new WallTallBig();
        addObject(wallTallBig3,237,244);
        wallSmal3.setLocation(252,251);
        wallTallBig3.setLocation(246,275);
        WallSmal wallSmal4 = new WallSmal();
        addObject(wallSmal4,209,203);
        wallSmal4.setLocation(188,199);
        wallTallBig3.setLocation(246,211);
        wallTallBig3.setLocation(245,238);
        wallTallBig3.setLocation(248,248);
        wallSmal3.setLocation(248,248);
        WallSmal wallSmal5 = new WallSmal();
        addObject(wallSmal5,106,202);
        wallSmal5.setLocation(120,198);
        WallTall wallTall2 = new WallTall();
        addObject(wallTall2,100,219);
        wallTall2.setLocation(102,231);
        WallTall wallTall3 = new WallTall();
        addObject(wallTall3,55,268);
        wallTall3.setLocation(52,276);
        Wallbase wallbase4 = new Wallbase();
        addObject(wallbase4,32,248);
        wallbase4.setLocation(32,248);
        wallbase4.setLocation(35,248);
        wallbase4.setLocation(37,246);
        WallTallBig wallTallBig4 = new WallTallBig();
        addObject(wallTallBig4,4,288);
        wallTallBig4.setLocation(4,290);
        WallTall wallTall4 = new WallTall();
        addObject(wallTall4,6,361);
        wallTall4.setLocation(4,357);
        WallSmal wallSmal6 = new WallSmal();
        addObject(wallSmal6,61,394);
        wallSmal6.setLocation(58,394);
        WallSmal wallSmal7 = new WallSmal();
        addObject(wallSmal7,178,395);
        WallSmal wallSmal8 = new WallSmal();
        addObject(wallSmal8,307,397);
        wallSmal8.setLocation(296,396);
        Wallbase wallbase5 = new Wallbase();
        addObject(wallbase5,379,394);
        WallTallBig wallTallBig5 = new WallTallBig();
        addObject(wallTallBig5,397,328);
        wallTallBig5.setLocation(392,345);
        WallTallBig wallTallBig6 = new WallTallBig();
        addObject(wallTallBig6,394,255);
        wallTallBig6.setLocation(395,242);
        WallSmal wallSmal9 = new WallSmal();
        addObject(wallSmal9,349,249);
        WallTall wallTall5 = new WallTall();
        addObject(wallTall5,296,271);
        Wallbase wallbase6 = new Wallbase();
        addObject(wallbase6,320,199);
        WallTall wallTall6 = new WallTall();
        addObject(wallTall6,340,169);
        wallTall6.setLocation(347,169);
        WallTallBig wallTallBig7 = new WallTallBig();
        addObject(wallTallBig7,296,138);
        wallTallBig7.setLocation(297,148);
        Wallbase wallbase7 = new Wallbase();
        addObject(wallbase7,328,107);
        WallSmal wallSmal10 = new WallSmal();
        addObject(wallSmal10,95,297);
        wallSmal10.setLocation(102,294);
        Wallbase wallbase8 = new Wallbase();
        addObject(wallbase8,368,153);
        WallTallBig wallTallBig8 = new WallTallBig();
        addObject(wallTallBig8,390,78);
        wallTallBig8.setLocation(395,104);
        WallTall wallTall7 = new WallTall();
        addObject(wallTall7,394,38);
        WallSmal wallSmal11 = new WallSmal();
        addObject(wallSmal11,341,7);
        wallSmal11.setLocation(348,8);
        WallSmal wallSmal12 = new WallSmal();
        addObject(wallSmal12,205,3);
        wallSmal12.setLocation(232,6);
        WallSmal wallSmal13 = new WallSmal();
        addObject(wallSmal13,130,9);
        wallSmal13.setLocation(116,0);
        WallSmal wallSmal14 = new WallSmal();
        addObject(wallSmal14,52,4);
        WallTallBig wallTallBig9 = new WallTallBig();
        addObject(wallTallBig9,9,52);
        wallTallBig9.setLocation(2,56);
        WallTallBig wallTallBig10 = new WallTallBig();
        addObject(wallTallBig10,8,123);
        wallTallBig10.setLocation(4,151);
        Wallbase wallbase9 = new Wallbase();
        addObject(wallbase9,20,105);
        wallbase9.setLocation(35,103);
        WallTall wallTall8 = new WallTall();
        addObject(wallTall8,57,130);
        wallTall8.setLocation(51,132);
        WallSmal wallSmal15 = new WallSmal();
        addObject(wallSmal15,102,151);
        wallSmal15.setLocation(106,151);
        wallSmal5.setLocation(50,199);
        WallTallBig wallTallBig11 = new WallTallBig();
        addObject(wallTallBig11,196,139);
        wallTallBig11.setLocation(202,147);
        WallSmal wallSmal16 = new WallSmal();
        addObject(wallSmal16,198,100);
        wallSmal16.setLocation(200,101);
        WallTall wallTall9 = new WallTall();
        addObject(wallTall9,246,68);
        wallTall9.setLocation(246,75);
        WallTall wallTall10 = new WallTall();
        addObject(wallTall10,151,78);
        WallTall wallTall11 = new WallTall();
        addObject(wallTall11,194,26);
        wallTall11.setLocation(202,39);
        WallTall wallTall12 = new WallTall();
        addObject(wallTall12,104,83);
        wallTall12.setLocation(100,87);
        WallSmal wallSmal17 = new WallSmal();
        addObject(wallSmal17,110,55);
        WallSmal wallSmal18 = new WallSmal();
        addObject(wallSmal18,288,52);
        wallSmal18.setLocation(304,54);
        wallbase3.setLocation(248,342);
        wallSmal3.setLocation(171,246);
        wallTallBig2.setLocation(203,239);
        wallSmal3.setLocation(196,245);
        wallTallBig2.setLocation(195,283);
        wallTallBig2.setLocation(204,260);
        wallTallBig2.setLocation(200,256);
        wallSmal4.setLocation(142,198);
        wallSmal5.setLocation(129,203);
        wallSmal4.setLocation(252,196);
        wallSmal5.setLocation(133,194);
        wallSmal4.setLocation(180,199);
        wallSmal4.setLocation(119,200);
        wallSmal4.setLocation(208,200);
        Player player = new Player();
        addObject(player,31,212);
        player.setLocation(28,219);
        Food food = new Food();
        addObject(food,368,79);
        food.setLocation(319,172);
        food.setLocation(318,152);
        Food food2 = new Food();
        addObject(food2,25,280);
        Food food3 = new Food();
        addObject(food3,276,314);
        Food food4 = new Food();
        addObject(food4,27,66);
        wallbase3.setLocation(301,344);
        food3.setLocation(332,372);
        wallTall2.setLocation(101,221);
        Teleporter teleporter = new Teleporter();
        addObject(teleporter,306,83);
        teleporter.setLocation(344,85);
        teleporter.setLocation(130,83);
        Teleporter teleporter2 = new Teleporter();
        addObject(teleporter2,323,275);
        teleporter2.setLocation(321,269);
        Teleporter teleporter3 = new Teleporter();
        addObject(teleporter3,42,370);
        Teleporter teleporter4 = new Teleporter();
        addObject(teleporter4,218,264);
        teleporter4.setLocation(226,277);
        wallTallBig7.setLocation(292,107);
        EnemyTwo enemyTwo = new EnemyTwo();
        addObject(enemyTwo,227,123);
        EnemyTwo enemyTwo2 = new EnemyTwo();
        addObject(enemyTwo2,178,267);
        Goal goal = new Goal();
        addObject(goal,386,171);
        goal.setLocation(393,182);
        goal.setLocation(392,177);
    }
}
