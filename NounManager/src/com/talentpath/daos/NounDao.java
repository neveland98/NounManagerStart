package com.talentpath.daos;

import com.talentpath.models.Noun;

import java.util.List;

public interface NounDao {
    List<Noun> getAllNouns();
    int isInList(Noun n);

    void addNoun(Noun nounToAdd);
}
