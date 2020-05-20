import java.util.*;

public class Calculations
{

    //Attribute
    private int [] rollDice= new int [5];
    
    //Constructor for the calculations class, takes the parameter and assigns it to the attribute
    public Calculations (int [] diceValue)
    {
      for(int x=0;x<=4;x++)
      {
        rollDice[x]=diceValue[x];
      }
    }
   
   //Adds up all the dice that have a value of one
   public int ones(int [] rollDice)
    {
      int y=0;
      //loop checks if a specific dice has a value of one, if it does the counter(y) is increased by 1 
      for (int x=0;x<=4;x++)
      {
      if(rollDice[x]==1)
      {
        y=y+1;
      }
      }
      //returns the amount of points the user will get, since this is for ones, the counter(y) will be the same as the points 
      return y;
    }
   
    //Adds up all the dice that have a value of two  
    public int twos(int [] rollDice)
    {
      int y=0;
      //loop checks if a specific dice has a value of two, if it does the counter(y) is increased by 1 
      for (int x=0;x<=4;x++)
      {
      if(rollDice[x]==2)
      {
        y=y+1;
      }
      }
      //total score will be the total number of dice that have a value of 2 multiplyed by 2
      int totalScore = y*2;
      return totalScore;
    }
    
    //Adds up all the dice that have a value of three
    public int threes(int [] rollDice)
    {
      int y=0;
      //loop checks if a specific dice has a value of three, if it does the counter(y) is increased by 1
      for (int x=0;x<=4;x++)
      {
      if(rollDice[x]==3)
      {
        y=y+1;
      }
      }
      //total score will be the total number of dice that have a value of 3 multiplyed by 3
      int totalScore = y*3;
      return totalScore;
    }
    
    //Adds up all the dice that have a value of four
    public int fours(int [] rollDice)
    {
      int y=0;
      //loop checks if a specific dice has a value of four, if it does the counter(y) is increased by 1
      for (int x=0;x<=4;x++)
      {
      if(rollDice[x]==4)
      {
        y=y+1;
      }
      }
      //total score will be the total number of dice that have a value of 4 multiplyed by 4
      int totalScore = y*4;
      return totalScore;
    }
    
    //Adds up all the dice that have a value of five
    public int fives(int [] rollDice)
    {
      int y=0;
      //loop checks if a specific dice has a value of five, if it does the counter(y) is increased by 1
      for (int x=0;x<=4;x++)
      {
      if(rollDice[x]==5)
      {
        y=y+1;
      }
      }
      //total score will be the total number of dice that have a value of 5 multiplyed by 5
      int totalScore = y*5;
      return totalScore;
    }
    
    //Adds up all the dice that have a value of six
    public int sixes(int [] rollDice)
    {
      int y=0;
      //loop checks if a specific dice has a value of six, if it does the counter(y) is increased by 1
      for (int x=0;x<=4;x++)
      {
      if(rollDice[x]==6)
      {
        y=y+1;
      }
      }
      //total score will be the total number of dice that have a value of 6 multiplyed by 6
      int totalScore = y*6;
      return totalScore;
    }
    
    
    //Adds up all the dice values together
    public int chance(int [] rollDice)
    {
      int totalScore=rollDice[0]+rollDice[1]+rollDice[2]+rollDice[3]+rollDice[4];
      return totalScore;
    }
    
    //check to see if all the dice are equal to eachother
    public int yahtzee(int [] rollDice)
    {
      if (rollDice[0]==rollDice[1]&&rollDice[1]==rollDice[2]&&rollDice[2]==rollDice[3]&&rollDice[3]==rollDice[4])
      {
        //if the dice are all equal returns 40 points
        return 40;
      }
      else 
      {
        //if the dice are not equal returns 0 points
        return 0;
      }
    }
   
   //checks to see if they are 3 dice that have the same value
   public int threeKind(int [] rollDice)
    {
      int count;
      int value=0;
      //y is the dice value that is being checked, loops until all 6 dice values have been checked 
      for(int y=1;y<=6;y++)
      {
        count=0;
        //loops until all the dice have been checked to see if they are equal to y
        for(int x=0;x<=4;x++)
        {
          if(rollDice[x]==y)
          {
            //if a dice is equal to y the counter increases by one 
            count=count+1;
          }  
        }
        //if the counter equals 3 it means there is 3 of a kind 
        if (count==3)
        {
          //three of a kind has a value of 10 points, so it returns 10 points
          value=10; 
          break;
        }
        else
          //if it is not 3 of a kind the user gets 0 points 
          value=0;
       }
      return value; 
      }
   
   //checks to see if they are 4 dice that have the same value
   public int fourKind(int [] rollDice)
    {
      int count;
      int value=0;
      //y is the dice value that is being checked, loops until all 6 dice values have been checke
      for(int y=1;y<=6;y++)
      {
        count=0;
        //loops until all the dice have been checked to see if they are equal to y
        for(int x=0;x<=4;x++)
        {
          if(rollDice[x]==y)
          {
            //if a dice is equal to y the counter increases by one 
            count=count+1;
          }  
        }
        //if the counter equals 4 it means there is 4 of a kind
        if (count==4)
        {
          //4 of a kind has a value of 20 points, so it returns 20 points
          value=20; 
          break;
        }
        //if it is not 3 of a kind the user gets 0 points 
        else
          value=0;
       }
      
      return value; 
      }
   
   public int smallStraight(int [] rollDice)
    {
     Arrays.sort(rollDice);
     if (rollDice[0]+1==rollDice[1]&&rollDice[1]+1==rollDice[2])
     {
       return 15;
     }
     else if (rollDice[1]+1==rollDice[2]&&rollDice[3]+1==rollDice[4])
     {
       return 15;
     }
     else if (rollDice[2]+1==rollDice[3]&&rollDice[3]+1==rollDice[4]+1)
     {
       return 15;
     }
     else
     {
       return 0;
     }
   }

  public int largeStraight(int [] rollDice)
    {
     Arrays.sort(rollDice);
     if (rollDice[0]+1==rollDice[1]&&rollDice[1]+1==rollDice[2]&&rollDice[2]+1==rollDice[3])
     {
       return 20;
     }
     else if (rollDice[1]+1==rollDice[2]&&rollDice[2]+1==rollDice[3]&&rollDice[3]+1==rollDice[4])
     {
       return 20;
     }
     else
     {
       return 0;
     }
   }
  
  public int fullHouse(int [] rollDice)
  { 
    int yes;
    yes= threeKind(rollDice);
    if (yes==10)
    {
      Arrays.sort(rollDice);
      if((rollDice[0]==rollDice[1]&&rollDice[1]!=rollDice[2])^(rollDice[1]==rollDice[2]&&rollDice[2]!=rollDice[3])
         ^(rollDice[2]==rollDice[3]&&rollDice[3]!=rollDice[4])^(rollDice[3]==rollDice[4]&&rollDice[3]!=rollDice[2]))
      {
        return 40;
      }
      else
      {
        return 0;
    }
    }
    else
    {
      return 0;   
  }
    }
  
}
