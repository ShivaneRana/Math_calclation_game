import java.util.Scanner;
import java.util.Random;

import pac1.stuff1;
import  pac1.stuff1.*;
import javax.swing.JOptionPane;
public class tut {
    public static int score = 0;

    stuff1 stuf = new stuff1();
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    private int input;

    public void addition(){
        int num1 = rand.nextInt(1,100);
        int num2 = rand.nextInt(1,100);
        input = Integer.parseInt(JOptionPane.showInputDialog("Add "+num1 +" + "+ num2+": "));
        if(input == num1+num2){
            stuf.correct();
            score+=10;

        }else {
            stuf.wrong();
            JOptionPane.showMessageDialog(null,"Correct Anwser was:"+(num1+num2));
            score-=10;
        }
    }
    public void subtraction(){
        int num1 = rand.nextInt(1,100);
        int num2 = rand.nextInt(1,100);
        input = Integer.parseInt(JOptionPane.showInputDialog("Subtract "+num1 +" - "+ num2+": "));
        if(input == num1-num2){
            stuf.correct();
            score+=10;
        }else {
            stuf.wrong();
            JOptionPane.showMessageDialog(null,"Correct Anwser was:"+ (num1-num2));
            score-=10;
        }
    }
    public void division(){
        int num1 = rand.nextInt(1,100);
        int num2 = rand.nextInt(1,100);
        input = Integer.parseInt(JOptionPane.showInputDialog("Divide "+num1 +" %% "+ num2+": "));
        if(input == num1%num2){
            stuf.correct();
            score+=10;
        }else {
            stuf.wrong();
            JOptionPane.showMessageDialog(null,"Correct Anwser was:"+num1%num2);
            score-=10;
        }
    }
    public void multiplication(){
        int num1 = rand.nextInt(1,100);
        int num2 = rand.nextInt(1,100);
        input = Integer.parseInt(JOptionPane.showInputDialog("Multiply "+num1 +" * "+ num2+": "));
        if(input == num1*num2){
            stuf.correct();
            score+=10;
        }else {
            stuf.wrong();
            JOptionPane.showMessageDialog(null,"Correct Anwser was:"+num1*num2);
            score-=10;
        }
    }

    public void rules(){
        javax.swing.JOptionPane.showMessageDialog(null,"In this Game user have to reach the Score of 100\nTo reach max score the user have to anwser 10 mathematical question correctly\nEach question award player with 10 points and forward them to next round\nEach question anwsered wrongly will also reduce the current point by 10\nThe game will keep repeation until the user has either reach the top of the tower or reached negative point value");
    }

    public void showscore(){
        System.out.println("Current Score is: "+score);
    }

}
