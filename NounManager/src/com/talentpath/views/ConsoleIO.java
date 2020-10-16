package com.talentpath.views;

import java.util.Collection;
import java.util.Scanner;

//add methods for reading doubles (with min/max overload), longs (with min/max overload),
// Strings (with an overload that takes a collection of acceptable strings), and booleans
public class ConsoleIO {

    Scanner scn = new Scanner(System.in);

    public void print(String prompt) {
        System.out.print(prompt);
    }

    public int getInt( String prompt ){
        int userInput = Integer.MIN_VALUE;
        boolean valid = false;

        while( !valid ){
            print( prompt );
            String line = scn.nextLine();
            try{
                userInput = Integer.parseInt(line);
                valid = true;
            } catch (NumberFormatException ex){
                //bad user input
                //do nothing
            }

        }

        return userInput;
    }

    public int getInt(String prompt, int min, int max) {
        int userInput = Integer.MIN_VALUE;
        boolean valid = false;
        while( !valid ){
            userInput = getInt(prompt);
            valid = userInput >= min && userInput <= max;
        }

        return userInput;
    }

    public long getLong( String prompt ){
        long userInput = Long.MIN_VALUE;
        boolean valid = false;

        while( !valid ){
            print( prompt );
            String line = scn.nextLine();
            try{
                userInput = Long.parseLong(line);
                valid = true;
            } catch (NumberFormatException ex){
                //bad user input
                //do nothing
            }

        }

        return userInput;
    }

    public long getLong(String prompt, long min, long max) {
        long userInput = Long.MIN_VALUE;
        boolean valid = false;
        while( !valid ){
            userInput = getLong(prompt);
            valid = userInput >= min && userInput <= max;
        }

        return userInput;
    }

    public double getDouble( String prompt ){
        double userInput = Double.NaN;
        boolean valid = false;

        while( !valid ){
            print( prompt );
            String line = scn.nextLine();
            try{
                userInput = Double.parseDouble(line);
                valid = true;
            } catch (NumberFormatException ex){
                //bad user input
                //do nothing
            }

        }

        return userInput;
    }

    public double getDouble(String prompt, double min, double max) {
        double userInput = Double.NaN;
        boolean valid = false;
        while( !valid ){
            userInput = getDouble(prompt);
            valid = userInput >= min && userInput <= max;
        }

        return userInput;
    }

    public String getString( String prompt ){
        print( prompt );
        return scn.nextLine();
    }

    public String getString(String prompt, Collection<String> allowable, boolean caseSensitive){
        String userInput = null;
        boolean valid = false;
        while( !valid ){
            print(prompt);
            userInput = scn.nextLine();
            for( String toCheck : allowable ){
                if( (!caseSensitive && toCheck.equalsIgnoreCase(userInput)) ||
                        (caseSensitive && toCheck.equals(userInput))){
                    valid = true;
                }
            }
        }

        return userInput;
    }

    public boolean getBoolean( String prompt ){
        boolean userChoice = false;

        boolean valid = false;
        while( !valid ){
            print(prompt);
            String userInput = scn.nextLine();

            switch (userInput.toUpperCase()) {
                case "Y":
                case "YES":
                case "TRUE":
                    userChoice = true;
                    valid = true;
                    break;
                case "N":
                case "NO":
                case "FALSE":
                    valid = true;
                    break;
            }
        }

        return userChoice;
    }

}
