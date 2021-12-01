package com.kuebiko.tictactoe4.dao;

import com.kuebiko.tictactoe4.models.Player;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PlayerDao {

    String str= "apple";
    Map<String, Player> dataSource = new HashMap<>();

    public Player saveplayer(Player player) {
        dataSource.put(player.getId(), player);
        return dataSource.get(player.getId());
    }
    public Player getPlayerById(String id){
        return dataSource.get(id);
    }
}
