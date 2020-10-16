package com.talentpath.views;

import com.talentpath.models.Noun;

import java.util.List;

public interface NounView {
    int mainMenu();

    void printErrorMessage(String message);
    void printSuccessMessage();

    void printGoodbye();

    void displayAllNouns(List<Noun> allNouns);

    void displayNoun( Noun toDisplay );

    String getUserNoun();
}
