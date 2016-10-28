package easy;

import java.util.HashSet;
import java.util.Set;

public class BullsandCows {

    public String getHint(String secret, String guess) {
        int[] secretCows = new int[10];
        int[] guessCows = new int[10];
        int bulls = 0;
        for(int i = 0; i < secret.length(); i++){
            if(guess.charAt(i) == secret.charAt(i)) bulls++;
            else{
                secretCows[Character.getNumericValue(secret.charAt(i))] ++;
                guessCows[Character.getNumericValue(guess.charAt(i))] ++;
            }
        }
        int cows = 0;
        for(int i = 0; i < 11; i++){
            cows += Math.min(secretCows[i], guessCows[i]);
        }
        return bulls + "A" + cows + "B";
    }

}
