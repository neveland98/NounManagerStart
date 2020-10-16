package com.talentpath.views;

import com.talentpath.models.Noun;

import java.util.List;

public class EnglishNounView implements NounView {

    ConsoleIO io = new ConsoleIO();

    //we're going to show the user
    //1. Add noun
    //2. Remove noun
    //3. Look up noun by id
    //4. Look up all nouns
    //5. Edit noun
    //6. Exit

    @Override
    public int mainMenu() {

        io.print( "1. Add noun\n");
        io.print( "2. Remove noun\n");
        io.print( "3. Retrieve by ID\n");
        io.print( "4. Retrieve all\n");
        io.print( "5. Edit noun\n");
        io.print( "6. Exit\n");

        int choice = io.getInt( "Enter selection: ", 1, 6 );

        return choice;
    }

    @Override
    public void printErrorMessage(String message) {
        io.print( "ERROR: " + message + "\n");
    }

    @Override
    public void printGoodbye() {
        io.print("Goodbye!\n");
    }

    @Override
    public void displayAllNouns(List<Noun> allNouns) {

        for( Noun toDisplay : allNouns ){
            displayNoun(toDisplay);
        }
        io.print("\n");
    }

    @Override
    public void displayNoun(Noun toDisplay) {
        io.print( toDisplay.getId() + ": " + toDisplay.getName() + " ["+toDisplay.getQuantity()+"]\n"  );
    }

    @Override
    public String addNoun() {
        return io.getString("Enter the name of a noun: ");
    }
}
