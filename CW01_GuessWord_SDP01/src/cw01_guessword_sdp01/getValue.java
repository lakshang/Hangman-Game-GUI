/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw01_guessword_sdp01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author **Lakshan Gunarathne** **UoW : w1584534** **IIT : 2014286**
 */
public class getValue {

    static String arrWords[] = new String[6];//Creates a String array of 6

    int getrandomValue() {

        Random r = new Random();
        return r.nextInt(6);//Gets a random number in between 1 and 6.
    }

    String start(int select) {

        String randomWord = "";

        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lakshan\\Desktop\\CW01 - SDP - Hangman\\guess.txt"));
            //Reads the File(Absolute Path !)

            String s;
            int i = 0;
            while ((s = br.readLine()) != null) {

                arrWords[i++] = s;//The selected word is stored in the array
            }

            int a = getrandomValue(); //Calls random number
            randomWord = arrWords[a];//Gets the store word in which consist with the random number.

            if (select == 0) {

                randomWord = arrWords[0];

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File Not Found!", "Error", JOptionPane.ERROR_MESSAGE);
            //Exception handling
        }
        return randomWord;
        //Returns the selected random word.
    }
}
