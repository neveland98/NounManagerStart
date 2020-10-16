package com.talentpath.services;

import com.talentpath.daos.NounDao;
import com.talentpath.models.Noun;

import java.util.List;

public class NounService {

    NounDao dao;

    public NounService(NounDao dao){
        this.dao = dao;
    }

    public List<Noun> getAllNouns() {
        return dao.getAllNouns();
    }

    public void addNoun(String s) {
        Noun nounToAdd = new Noun(s.hashCode(),s,1L,false);
        dao.addNoun(nounToAdd);
    }

    public boolean removeNoun(String userNoun) {
        return dao.removeNoun(userNoun);
    }


}
