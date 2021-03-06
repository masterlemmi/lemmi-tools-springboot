package com.lemzki.tools.people.db.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FamilyPersistenceException extends RuntimeException {
    private String message;

    public FamilyPersistenceException(){
        super("An error occurred while persisting family data");
    }
}
