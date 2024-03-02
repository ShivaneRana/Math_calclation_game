//Random integer calculation game

import java.util.Random;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args){
        tut t1 = new tut();
        Random rand = new Random();

        t1.rules();
        int check = 0;
        while(tut.score <= 100 && tut.score >= 0) {
            int randomnum = rand.nextInt(1,4);
            switch (randomnum) {
                case 1:
                    t1.multiplication();
                    t1.showscore();
                    break;

                case 2:
                    t1.addition();
                    t1.showscore();
                    break;

                case 3:
                    t1.subtraction();
                    t1.showscore();
                    break;

                case 4:
                    t1.division();
                    t1.showscore();
                    break;
            }
            }
        if(tut.score<0){
            JOptionPane.showMessageDialog(null,"The game has ended as score is now in negative");
        }else {
            JOptionPane.showMessageDialog(null,"GAME OVER");
            }
        }
    }

