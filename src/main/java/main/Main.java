package main;

public class Main {

    public static void main (String [] args) throws Exception {

        if(args.length == 0)
            throw new Exception("Program should have one argument!");

        String word = args[0];
        int [] tab = new int[26];

        for(char x : word.toCharArray()){
            if(x <= 90 && x >= 65)
                tab[x-65]++;

            else if(x<= 122 && x>=97)
                tab[x-97]++;
        }

        System.out.println("Counted letters:");

        for(int i=0; i<tab.length; i++){
            if(tab[i] != 0){
                System.out.println( Character.toString( i+97) + " = " + tab[i]);
            }
        }

    }
}
