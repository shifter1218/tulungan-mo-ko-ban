/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretphrase;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pao
 */
public class SecretPhrase {

    static public void guess(String word,int life){
        
        char[] filler = new char[word.length()];
        int i = 0;
        while(i < word.length()){
            filler[i]='-';
            if(word.charAt(i)==' '){
                filler[i]=' ';
            }
        i++;
        }
        System.out.println(filler);
        System.out.println("life remaining = " + life);
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Character> alph= new ArrayList<>();
        
        while(life>0){
            char x=sc.next().charAt(0);
            
            if(alph.contains(x)){
                System.out.println("Already entered");
                continue;
            }
            alph.add(x);
            
            if(word.contains(x+"")){
                for (int y=0;y<word.length();y++){
                    if(word.charAt(y)==x){
                        filler[y]=x;
                    }
                }
    
            }
            else{
                life--;
        }
        if(word.equals(String.valueOf(filler))){
            System.out.println(filler);
            System.out.println("you got it correctly!!");
            break;
            
        }
         
        System.out.println(filler);
        System.out.println("life remaining = " + life);
    }
    if(life==0){
        System.out.println("you lose!");
    }

    }
    public static void main(String[] args) {
        Random rand = new Random();
        
        String[] word = {"welcome to java","passing this semester","ue for the win","fast cars and beer","see you this summer"};
        
       
        
        
        int life= 5;
        guess(word[rand.nextInt(5)],life);
        
    }
    
}
