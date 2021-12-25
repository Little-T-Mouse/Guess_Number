import javax.swing.*;
public class guessnumber {
    public static void main(String[] args) {
        int Number = (int) (Math.random()*100 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be " + Number);
        int cnt = 1;
        while (userAnswer != Number) {
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ check(userAnswer, Number, cnt));
            cnt++;
        }  
    }
    public static String check(int userAnswer, int Number, int count){
        if (userAnswer <=0 || userAnswer >100)  return "Your guess is invalid";
        else if (userAnswer == Number ) return "Correct!\nTotal Guesses: " + count;
        else if (userAnswer > Number) return "Your guess is too high, try again.\nTotal Guesses: " + count;
        else if (userAnswer < Number) return "Your guess is too low, try again.\nTotal Guesses: " + count;
        else return "Your guess is incorrect\nTotal Guesses: " + count;
    }
}
