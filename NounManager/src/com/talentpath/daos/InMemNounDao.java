package com.talentpath.daos;

import com.talentpath.models.Noun;

import java.util.ArrayList;
import java.util.List;

//this is mostly a testing class
//for now we'll use this as our "real" dao
//but none of the data will survive after the program
//ends
public class InMemNounDao implements NounDao {
    List<Noun> allNouns = new ArrayList<>();

    //this constructor builds the starting data for the app
    public InMemNounDao(){
        Noun noun1 = new Noun(1, "chairs", 15, true);
        Noun noun2 = new Noun(2, "basketballs", 300, false);
        Noun noun3 = new Noun(3, "badgers", 2, true);

        allNouns.add(noun1);
        allNouns.add(noun2);
        allNouns.add(noun3);

    }

    @Override
    public List<Noun> getAllNouns() {
        List<Noun> toReturn = new ArrayList<>();
        for( Noun toCopy : allNouns ){
            Noun copy = new Noun( toCopy );
            toReturn.add(copy);
        }
        return toReturn;
    }
}
