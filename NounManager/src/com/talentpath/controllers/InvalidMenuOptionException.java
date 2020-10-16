package com.talentpath.controllers;

public class InvalidMenuOptionException extends Exception {

    public InvalidMenuOptionException( String message ){
        super( message );
    }

    public InvalidMenuOptionException( String message, Throwable innerException ){
        super( message, innerException );
    }

}
