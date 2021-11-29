package com.kuebiko.tictactoe4.controller;

import com.kuebiko.tictactoe4.models.Player;
import com.kuebiko.tictactoe4.service.TicTacToeService;
import com.kuebiko.tictactoe4.util.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/tictactoe")

public class TicTacToeController {
    @Autowired
    TicTacToeService tts;

    @PostMapping
    @RequestMapping ("/create")
    public Player createNewPlayer(@RequestBody Player paylood){


       Player createdPlayer = tts.createNewPlayer(paylood);
        return createdPlayer;

    }
    @PutMapping
    @RequestMapping ("/update")
    public Player updatePlayer(@RequestBody Player player){
        Player updatedPlayer = tts.updatePlayer(player);
        return updatedPlayer;
    }

}
