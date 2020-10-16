package com.talentpath.models;


public class Noun {

    private int id;
    private String name;
    private long quantity;
    private boolean enabled;

    public Noun(int id, String name, long quantity, boolean enabled){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.enabled = enabled;
    }

    //copy constructor
    public Noun( Noun copyFrom ){
        id = copyFrom.id;
        name = copyFrom.name;
        quantity = copyFrom.quantity;
        enabled = copyFrom.enabled;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getQuantity() {
        return quantity;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
