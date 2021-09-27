package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int userGuesses = 0;
        Scanner input = new Scanner(System.in);
        Random RandNum = new Random();
        int myRandNum = RandNum.nextInt(100);

        System.out.println(myRandNum);

        while(true){
            System.out.println("enter a Number:");
            int userNum = input.nextInt();
            userGuesses ++;
            if(userNum == myRandNum){
                break;
            }else{
                if( userNum < myRandNum){
                    System.out.println("higher");
                }else{
                    System.out.println("lower");
                }
            }
        }
        System.out.println("you win !");
        System.out.println("total guesses : "+ userGuesses);
        System.out.println("the random number was : "+myRandNum);
    }
}
