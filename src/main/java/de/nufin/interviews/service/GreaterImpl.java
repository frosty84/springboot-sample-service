package de.nufin.interviews.service;

import org.springframework.stereotype.Service;

@Service
public class GreaterImpl implements Greater {
    @Override
    public String great(String name) {
        return "Hello " + name;
    }
}
