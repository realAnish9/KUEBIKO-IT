package com.kuebiko.tictactoe4.util;

import java.util.UUID;

public class IdGenerator {
    public static String  generateId(){
        String id = UUID.randomUUID().toString();
        return id;
    }
}
