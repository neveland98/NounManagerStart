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

    @Override
    public int isInList(Noun n) {
        for(Noun item: allNouns) {
            if(item.getName().equals(n.getName())) {
                return allNouns.indexOf(item);
            }
        }
        return -1;
    }
    @Override
    public int isInList(String n) {
        for(Noun item: allNouns) {
            if(item.getName().equals(n)) {
                return allNouns.indexOf(item);
            }
        }
        return -1;
    }

    @Override
    public void addNoun(Noun nounToAdd) {
        if(isInList(nounToAdd) == -1) {
            allNouns.add(nounToAdd);
        }
        else {
            allNouns.get(isInList(nounToAdd)).setQuantity(allNouns.get(isInList(nounToAdd)).getQuantity()+1);
        }
    }

    @Override
    public boolean removeNoun(String userNoun) {
        if(isInList(userNoun) != -1) {
            allNouns.remove(isInList(userNoun));
            return true;
        }
        return false;
    }
}
