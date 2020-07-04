package Exception;

import Player.Person;

public class BustException extends Exception{
    public BustException(String name) {
        super(name + " has busted!!!");
    }
}
