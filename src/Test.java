/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEMO
 */
public class Test {
    public static void main(String args[])
    {
       String capitalString ="ABCDEFGHIJKLMNOPUVWXYZ";
        char [] capital = capitalString.toCharArray();
         String smallString ="abcdefghijklmnopqrstuvwxyz";
        char [] small = smallString.toCharArray();
        
        for(int i = 0;i<capital.length;i++)
        {
            System.out.println((int)capital[i]+"   "+(int)small[i]);
        }
    }
}
