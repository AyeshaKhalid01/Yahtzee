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
