   /*
 * Program name:PerceptionTest
 * Purpose of program:The program is the solution to a ESP test.
 * Date last modified :3/24/2023
 * Morgan Daigle and Damilola Osoba
 */
import javax.swing.*;
import java.util.*;
public class PerceptionTest {
    public static void main(String[] args){
     
   ImageIcon iconone=new ImageIcon("intro.jpg");
        String prompt = "Please Click on one of the following buttons corresponding to your choice of game.\n"+
                        "You have to guess what will be generated when choosing your play.\n"+
                         "Once chose your play, the game will run for five rounds.\n"+
                        "After every five rounds, you will be given the choice to continue or quit.\n"+
                        "May the Sandiest of Cheeks be in your favor!";
              
    JOptionPane.showMessageDialog(null,prompt, "Morgan Daigle,Damilola Osoba", JOptionPane.INFORMATION_MESSAGE,iconone);
        
    String[] choices = {"Character","Expression","Character&Expression","Quit"};
    ImageIcon secondScreen = new ImageIcon("secondScreen.png");
    ImageIcon iconTwo = new ImageIcon("GroupPic.png");
    int gameOption= JOptionPane.showOptionDialog(null,prompt,
                            "Play \"Let's the game begin\"             Morgan Daigle and Damiola Osoba",
                     0,0,iconTwo,choices, choices [0]);
    
    int rounds = 0;
    int score = 0;
    String playersGameChoice = "";
     
            
    switch (gameOption){
       case 0:
             playersGameChoice= "\"Character\"";
             break;
       case 1:
             playersGameChoice= "\"Expression\"";
             break;
       case 2:
            playersGameChoice= "\"Character&Expression\"";
             break;
       case 3:
            playersGameChoice = "\"Quit\"";
            break;
       }
    while (true){
        if (gameOption==3){
                    ImageIcon icon_nine =  new ImageIcon("gameover.jpg");
                     JOptionPane.showMessageDialog(null, "Terminating", "Morgan,Damilola", JOptionPane.INFORMATION_MESSAGE,icon_nine);
                     break;
                          }
                String character_score_board;
                int win=0;
                int counter;
                int round=0;
                if(gameOption==0){
                
                           for(counter=0;counter<5;counter++){
                                
                                      round+=1;
                                      String prompt1 = "Please guess which character the card will be!"
                                                     + "\nMay the Krabby Patties forever be in your favor";
           
                                      String[] character_choice = {"Patrick","Spongebob","Squidward","Mr.Krabs","Plankton"};
                                                    int choice_one = JOptionPane.showOptionDialog(null,prompt1,
                                                    "Play \"Make a guess\"             Morgan Daigle and Damiola Osoba",
                                                    0, 0,secondScreen, character_choice, character_choice [0]);
            
                                       String player_choice_one = " ";
                                       switch (choice_one){
                                                case 0:
                                                      player_choice_one = "\"Patrick\"";
                                                      break;
                                                case 1:
                                                      player_choice_one = "\"Spongebob\"";
                                                      break;
                                                case 2:
                                                      player_choice_one = "\"Squidward\"";
                                                      break;
                                                case 3:
                                                      player_choice_one = "\"Mr.Krabs\"";
                                                       break;
                                                case 4:
                                                       player_choice_one = "\"Plankton\"";
                                                       break;
                                                                          }
                                        Random rand = new Random();
                                        int random_number = rand.nextInt(0,5);
                                        int computer_play=random_number;
            
                                        String computer_choice = "";
                                        switch(computer_play){
                                                case 0:
                                                      computer_choice = "Patrick";
                                                       break;
                                                case 1:
                                                      computer_choice = "Spongebob";
                                                      break;
                                                case 2:
                                                      computer_choice = "Squidward";
                                                      break;
                                                case 3:
                                                      computer_choice = "Mr.Krabs";
                                                      break;
                                                case 4:
                                                      computer_choice = "Plankton";
                                                      break;
                                                            }  
                                        String fileName = (computer_choice+"AND"+"Confused.png");
                                                    
                                        if(choice_one==computer_play){
                                                        ImageIcon icon_two = new ImageIcon(fileName); 
                                                        JOptionPane.showMessageDialog(null,"Character Perception\n"+ "You Perceived"+player_choice_one+"\nThe Character was: "+computer_choice,
                                                       "Morgan Daigle,Damilola Osoba", JOptionPane.INFORMATION_MESSAGE, icon_two);
                                                        win++;
                                                                              }
                                        else if(choice_one!=computer_play){
                                                        ImageIcon icon_three = new ImageIcon(fileName); 
                                                        JOptionPane.showMessageDialog(null,"Character Perception\n"+"You Perceived: "+player_choice_one+"\nThe Character was: "+computer_choice, "Morgan Daigle,Damilola Osoba", JOptionPane.INFORMATION_MESSAGE, icon_three);
                                                                   }  
                           }
                score+=win;
                rounds+=round;
                character_score_board=("You played Character "+(rounds)+" times and scored  "+(score));
                
                String[] choices0= {"Play for 5 rounds","Quit"};
                
                ImageIcon icon_seven = new ImageIcon("QuestionSpongebob.png");
                int gameDisplay = JOptionPane.showOptionDialog(null,character_score_board,
               "Play \"Let's the game begin\"             Morgan Daigle and Damiola Osoba",
               0,0,icon_seven, choices0, choices0 [0]);
            
                String continueRounds= "";
                switch (gameDisplay){
                         case 0:
                               continueRounds = "\"Play for 5 rounds\"";
                               break;
                         case 1:
                               continueRounds = "\"Quit\"";
                               break;
                               }
                if (gameDisplay==1){  
                    ImageIcon icon_nine=  new ImageIcon("gameover.jpg");
                            JOptionPane.showMessageDialog(null, "Terminating", "Morgan,Damilola", JOptionPane.INFORMATION_MESSAGE,icon_nine);
                            break;
                               }   
                }               
                int counterTwo;
                if(gameOption==1){
                        for(counterTwo=0;counterTwo<5;counterTwo++){
                                round+=1;
                                String promptTwo = "Please guess which expression the card will be!"
                                               + "\nMay the Krabby Patties forever be in your favor";
           
                                String[] choicess = {"Happy","Sad","Confused","Stylish","Smart"};
                                
                                int choiceTwo = JOptionPane.showOptionDialog(null,promptTwo,
                               " \"Game time\"             Morgan Daigle and Damiola Osoba",
                               0, 0,secondScreen,choicess, choicess [0]);
            
                                String player_choice_two = "";
            
                                switch (choiceTwo){
                                        case 0:
                                                player_choice_two = "\"Happy\"";
                                                break;
                                        case 1:
                                               player_choice_two = "\"Sad\"";
                                               break;
                                        case 2:
                                                player_choice_two = "\"Confused\"";
                                                break;
                                        case 3:
                                                player_choice_two = "\"Stylish\"";
                                                break;
                                        case 4:
                                                player_choice_two = "\"Smart\"";
                                                break;
                                                      }
                                Random rand = new Random();
                                int random_number = rand.nextInt(0,5);
                                int computer_play_one=random_number;
            
                                String computer_choice_one = "";
           
                                switch(computer_play_one){
                                            case 0:
                                                computer_choice_one = "Happy";
                                                break;
                                            case 1:
                                                computer_choice_one = "Sad";
                                                break;
                                            case 2:
                                                computer_choice_one = "Confused";
                                                break;
                                            case 3:
                                                computer_choice_one = "Stylish";
                                                break;
                                            case 4:
                                                 computer_choice_one = "Smart";
                                                  }  
        
                                String fileName_one = ("Patrick"+"AND"+computer_choice_one+".png");
                     
                                if(choiceTwo==computer_play_one){
                                            ImageIcon icon_four = new ImageIcon(fileName_one); 
                                            JOptionPane.showMessageDialog(null,"Expression Perception\n"+ "You Perceived: "+player_choice_two+"\nThe Expression was: "+computer_choice_one,
                                           "Morgan Daigle,Damilola Osoba", JOptionPane.INFORMATION_MESSAGE, icon_four);
                                            score++;
                                                                                }
                                if(choiceTwo!=computer_play_one){
                                            ImageIcon icon_five = new ImageIcon(fileName_one); 
                                            JOptionPane.showMessageDialog(null,"Expression Perception\n"+"You Perceived: "+player_choice_two+"\nThe Expression was: "+computer_choice_one, "Morgan Daigle,Damilola Osoba", JOptionPane.INFORMATION_MESSAGE, icon_five);
                                                                                     }
                        }      
                score+=win;
                rounds+=round;
                character_score_board=("You played  Expression "+(rounds)+ " times and scored "+(score));
                
                String[] choicesZero= {"play for 5 rounds","Quit"};
                
                ImageIcon icon_seven = new ImageIcon("QuestionSpongebob.png");
                
                int gameDisplay = JOptionPane.showOptionDialog(null,character_score_board,
               "Play \"Let's the game begin\"             Morgan Daigle and Damiola Osoba",
               0,0,icon_seven, choicesZero, choicesZero[0]);
            
                String game_choice_one = "";
            
                switch (gameDisplay){
                         case 0:
                               game_choice_one = "\"play for 5 rounds\"";
                               break;
                         case 1:
                               game_choice_one = "\"Quit\"";
                               break;
                               }
                if (gameDisplay==1){      
                            ImageIcon icon_nine=  new ImageIcon("gameover.jpg");
                            JOptionPane.showMessageDialog(null, "Terminating", "Morgan,Damilola", JOptionPane.INFORMATION_MESSAGE,icon_nine);
                            break;
                               }   
                }
    
         
          int win_character=0;
          int win_expression=0;
          int win_both=0;
           if(gameOption==2){
                    for(counter=0;counter<5;counter++){
                               round+=1;
                               String prompt_three = "Please guess which character the card will be!"
                                              + "\nMay the Krabby Patties forever be in your favor";
           
                               String[] choicess = {"Patrick","Spongebob","Squidward","Mr Krabs","Plankton"};
            
                               int choice_three= JOptionPane.showOptionDialog(null,prompt_three,
                                            "Play \"Play game\"             Morgan Daigle and Damiola Osoba",
                                            0, 0,secondScreen,choicess, choicess [0]);
            
                                 String player_choice_three = "";
            
                                        switch (choice_three){
                                            case 0:
                                                 player_choice_three = "\"Patrick\"";
                                                 break;
                                            case 1:
                                                  player_choice_three = "\"Spongebob\"";
                                                  break;
                                            case 2:
                                                  player_choice_three = "\"Squidward\"";
                                                  break;
                                            case 3:
                                                   player_choice_three = "\"Mr Krabs\"";
                                                   break;
                                            case 4:
                                                   player_choice_three = "\"Plankton\"";
                                                   break;
                                                               }
                                Random rand = new Random();
                                int random_number = rand.nextInt(0,5);
                                int computer_play_three=random_number;
            
                                String computer_choice_three = "";
           
                                switch(computer_play_three){
                                        case 0:
                                            computer_choice_three = "Patrick";
                                            break;
                                        case 1:
                                              computer_choice_three = "Spongebob";
                                               break;
                                        case 2:
                                              computer_choice_three = "Squidward";
                                              break;
                                        case 3:
                                              computer_choice_three = "Mr.Krabs";
                                               break;
                                        case 4:
                                               computer_choice_three = "plankton";
                                                 break;
                                                             }  
                                String prompt_four = "Please guess which expression of the characters to determine what the card will be! "
                                                   + "\nMay the odds forever be in your favor";
                                
                                String[] choicess_four = {"Happy","Sad","Confused","Stylish","Smart"};
            
                                int choice_four = JOptionPane.showOptionDialog(null,prompt_four,
                                              "Play \"Play Game\"             Morgan Daigle and Damiola Osoba",
                                              0, 0,secondScreen,choicess_four, choicess_four [0]);
            
                                String player_choice_four = "";
               
                                switch (choice_four){
                                        case 0:
                                             player_choice_four= "\"Happy\"";
                                             break;
                                        case 1:
                                             player_choice_four = "\"Sad\"";
                                             break;
                                        case 2:
                                             player_choice_four  = "\"confused\"";
                                             break;
                                        case 3:
                                              player_choice_four = "\"Stylish\"";
                                              break;
                                        case 4:
                                               player_choice_four= "\"smart\"";
                                               break;
                                                                           }
                                Random rand_four = new Random();
                                int random_number_four = rand.nextInt(0,5);
                                int computer_play_four=random_number;
                                              
                                String computer_choice_four = "";
           
                                switch(computer_play_four){
                                        case 0:
                                            computer_choice_four = "Happy";
                                            break;
                                        case 1:
                                            computer_choice_four = "Sad";
                                            break;
                                        case 2:
                                            computer_choice_four = "confused";
                                            break;
                                        case 3:
                                             computer_choice_four= "Stylish";
                                              break;
                                        case 4:
                                              computer_choice_four= "Smart";
                                               break;
                                                                           }  
        
                                    String fileName_one= (computer_choice_three+"AND"+computer_choice_four+".png");
                     
                                    if(choice_four==computer_play_four && choice_three==computer_play_three){
                                                    ImageIcon icon6 = new ImageIcon(fileName_one); 
                                                    JOptionPane.showMessageDialog(null," Character&Expression Perception\n"+ "You Perceived: "+player_choice_four+"    \nThe Expression was: "+computer_choice_four+"\nYou perceived  "+player_choice_three+"\nThe Character was  "+computer_choice_three,
                                                    "Morgan Daigle,Damilola Osoba", JOptionPane.INFORMATION_MESSAGE, icon6);
                                                    win_both++;     
                                                            }
                                    else if(choice_four!=computer_play_four && choice_three!=computer_play_four){
                                                    ImageIcon icon7 = new ImageIcon(fileName_one); 
                                                    JOptionPane.showMessageDialog(null,"Character&Expression Perception\n"+"You Perceived:  "+player_choice_four+"\nThe Expression was: "+computer_choice_four+"\nYou perceived  "+player_choice_three+"\nThe Character was "+computer_choice_three, "Morgan Daigle,Damilola Osoba", JOptionPane.INFORMATION_MESSAGE, icon7);
                                                                          
                                    }
                                    else if(choice_four==computer_play_four){
                                                    win_expression++;
                                    }
                                    else if(choice_three==computer_play_three){
                                                    win_character++;
                                                                          }
                                      }
                   
                score+=win;
                rounds+=round;
               character_score_board=("You played : " +(rounds)+" times.\n" + "You chose correct Expression: "+(win_expression)+" times.\n"+ "You chose the right character: "+(win_character)+" times.\n"+"You chose both correctly: "+(win_both)+ " times.");
                
                String[] choicesZero= {"play for 5 rounds","Quit"};
                
                ImageIcon icon_seven = new ImageIcon("QuestionSpongebob.png");
                
                int gameDisplay = JOptionPane.showOptionDialog(null,character_score_board,
               "Play \"Let's the game begin\"             Morgan Daigle and Damiola Osoba",
               0,0,icon_seven, choicesZero, choicesZero[0]);
            
                String game_choice_one = "";
            
                switch (gameDisplay){
                         case 0:
                               game_choice_one = "\"play for 5 rounds\"";
                               break;
                         case 1:
                               game_choice_one = "\"Quit\"";
                               break;
                               }
                if (gameDisplay==1){ 
                            ImageIcon icon_nine=  new ImageIcon("gameover.jpg");
                            JOptionPane.showMessageDialog(null, "Terminating", "Morgan,Damilola", JOptionPane.INFORMATION_MESSAGE,icon_nine);
                            break;
                               }  
                                            }
    }
                

    } 
}


