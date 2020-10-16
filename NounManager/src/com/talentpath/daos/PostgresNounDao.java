package com.talentpath.daos;

import com.talentpath.models.Noun;

import java.util.List;

public class PostgresNounDao implements NounDao{
    @Override
    public List<Noun> getAllNouns() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addNoun(Noun nounToAdd) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int isInList(Noun n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeNoun(String userNoun) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int isInList(String n) {
        throw new UnsupportedOperationException();
    }
}
