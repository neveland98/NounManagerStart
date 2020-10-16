package com.talentpath.daos;

import com.talentpath.models.Noun;

import java.util.List;

public interface NounDao {
    List<Noun> getAllNouns();
    int isInList(Noun n);

    int isInList(String n);

    void addNoun(Noun nounToAdd);

    boolean removeNoun(String userNoun);
}
