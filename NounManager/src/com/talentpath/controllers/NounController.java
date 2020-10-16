package com.talentpath.controllers;

import com.talentpath.models.Noun;
import com.talentpath.services.NounService;
import com.talentpath.views.NounView;

import java.util.List;

public class NounController {

    NounView view;
    NounService service;

    public NounController( NounView view, NounService service ){
        this.view = view;
        this.service = service;
    }

    public void run() {
        boolean exit = false;
        //we're going to show the user
        //1. Add noun
        //2. Remove noun
        //3. Look up noun by id
        //4. Look up all nouns
        //5. Edit noun
        //6. Exit


        while( !exit ){
            try{
                int choice = view.mainMenu();
                switch (choice) {
                    case 1:
                        addNoun();
                        break;
                    case 2:
                        removeNoun();
                        break;
                    case 3:
                        getNounById();
                        break;
                    case 4:
                        getAllNouns();
                        break;
                    case 5:
                        editNoun();
                        break;
                    case 6:
                        exit = true;
                        break;
                    default:
                        throw new InvalidMenuOptionException("Got a menu choice that was not between 1 and 6.");

                }
            } catch (InvalidMenuOptionException ex){
                view.printErrorMessage( ex.getMessage() );
            }
        }

        view.printGoodbye();
    }

    private void addNoun() {
        throw new UnsupportedOperationException();

    }

    private void removeNoun(){
        throw new UnsupportedOperationException();

    }

    private void getNounById(){
        throw new UnsupportedOperationException();

    }

    private void getAllNouns(){

        List<Noun> allNouns = service.getAllNouns();

        view.displayAllNouns( allNouns );
    }

    private void editNoun(){
        throw new UnsupportedOperationException();

    }
}
