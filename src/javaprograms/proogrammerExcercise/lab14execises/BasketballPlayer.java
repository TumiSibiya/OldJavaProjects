package javaprograms.proogrammerExcercise.lab14execises;
/**
 *
 * @author Khaya
 */
public class BasketballPlayer {
    
    protected String name;
    protected String position;
    protected String team;
    
    protected int height;
    protected int weight;
    protected int agility;
    protected int speed;
    protected int ballHandling;
  //no arg constructor
     BasketballPlayer(){
        this.name = "unknown";
        this.position = "unknown";
        this.team = "unknown";
        
        this.height = 0;
        this.weight = 0;
        this.agility = 0;
        this.speed = 0;
        this.ballHandling = 0;
    }
  //(String args,String args,String args)
    protected BasketballPlayer(String playerName, String playerPosition ,
            String playerTeam){
    
        this.name = playerName;
        this.position = playerPosition;
        this.team = playerTeam;
    }
    protected BasketballPlayer(int height, int weight, int agility, int speed,
            int ballHandling){
        
        this.height = height;
        this.weight = weight;
        this.agility = agility;
        this.speed = speed;
        this.ballHandling = ballHandling;
    }
    //accessors
    public String getPlayerName(){
        return this.name;
    }
    public String getPlayerPosition(){
        return this.position;
    }
    public String getPlayerTeam(){
        return this.team;
    }
    public int getPlayerHeight(){
        return this.height;
    }
    public int getPlayerWeight(){
        return this.weight;
    }
    
    public int getPlayerAgility(){
        return this.agility;
    }
    public int getPlayerSpeed(){
        return this.speed;
    }
    public int getPlayerBallHandling(){
        return this.ballHandling;
    }
    @Override
    public String toString(){
        return getPlayerName()+"\n"+getPlayerPosition()+"\n"+getPlayerTeam();
    }
    public int getValue(){
    
    String c = "Center", f ="Forward", g="Guard";
         
    if(getPlayerPosition().equalsIgnoreCase(c)) {  
        
     if(getPlayerHeight() >=82 && getPlayerWeight()> 220 && 
         getPlayerWeight() < 250 ? true:false && getPlayerBallHandling() >5){
      return 10;
        }else if(getPlayerHeight()>=80 && getPlayerWeight() > 210 & 
            getPlayerWeight() <260 ? true:false && getPlayerBallHandling()>5){
      return 8;
        }else if(getPlayerHeight()>=80 && getPlayerBallHandling() >4){
      return 6;
        }else if(getPlayerHeight() >= 78 && getPlayerAgility() > 7){
      return 5;
        }else if(getPlayerHeight() >=78){
      return 4;
        }else if(getPlayerPosition().equalsIgnoreCase(c) &&getPlayerHeight()>= 78 
                   && getPlayerAgility() >=5){
      return 2;
        }
  return 0;
       
    }else if(getPlayerPosition().equalsIgnoreCase("f")){
     
            if(getPlayerHeight() >=80 && getPlayerAgility() > 8 || getPlayerSpeed() >7){
          return 10;
            }else if(getPlayerHeight() >=78 && getPlayerAgility() >6 && getPlayerSpeed()>5){
          return 8;
            }else if(getPlayerHeight()>=77 & getPlayerAgility() >5){
          return 6;
            }else if(getPlayerHeight() >=76 & getPlayerSpeed() >4){
          return 5;
            }else if(getPlayerHeight() >=75 & getPlayerAgility() >3 || getPlayerSpeed() >3){
          return 3;
            }else if(getPlayerHeight() >=74){
          return 1;
            }
    return 0;
            }else if(getPlayerPosition().equalsIgnoreCase(g)){
         
                  if( getPlayerHeight() > 78 && getPlayerBallHandling() >7 &&
                          (getPlayerAgility() >7 || getPlayerSpeed() >7)){
                 return 10;   
                 }else if(getPlayerHeight()>=76 && getPlayerBallHandling()>7 &&
                         (getPlayerAgility() >7 || getPlayerSpeed() >6)){
                 return 8;
                 }else if(getPlayerHeight() >=74 && getPlayerBallHandling()>5 &&
                         (getPlayerAgility() >5 || getPlayerSpeed() >6)){
                  return 6;
                 }else if(getPlayerBallHandling() >6 && getPlayerAgility()>6 &&
                         getPlayerSpeed()>6){
                  return 4;
                 }else if(getPlayerBallHandling() >4 && getPlayerAgility() >4){
                  return 2;
                 }
            return 0;
            }
    return 0;
    }
}
