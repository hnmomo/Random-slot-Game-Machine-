/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomgame;

import java.util.Scanner;

/**
 *
 * @author jihua5758
 * DO NOT WANNA USE ARRAYLIST
 */
public class RandomGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int[][]a=new int[3][3];
        int r=0;
        while(true){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    a[i][j]=(int)(Math.random()*6);
                }
            }
            for(int i=0;i<3;i++){
                if(a[1][i]==a[2][i]&&a[2][i]==a[0][i]){
                    r+=100;
                }
                if(a[i][1]==a[i][2]&&a[i][2]==a[i][0]){
                    r+=100;
                }
            }
            if(a[0][0]==a[1][1]&&a[1][1]==a[2][2]){
                r+=100;
            }
            if(a[2][0]==a[1][1]&&a[1][1]==a[0][2]){
                r+=100;
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("score:"+r);
            /**try{System.in.read();}catch(Exception e){}
            */
        }
    }
}
