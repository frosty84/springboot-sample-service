package de.nufin.interviews.models;

import lombok.Getter;

@Getter
public class IndexReturnObject {
    private final String message;

    public IndexReturnObject(String message) {
        this.message = message;
    }

}
