package com.kuebiko.tictactoe4.controller;

import com.kuebiko.tictactoe4.models.Player;
import com.kuebiko.tictactoe4.service.TicTacToeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/tictactoe")

public class TicTacToeController {
    @Autowired
    TicTacToeService tts;

    @PostMapping
    @RequestMapping ("/create")
    public Player createNewPlayer(@RequestBody Player paylood){


       Player createdPlayer = tts.updatePlayer(paylood);
        return createdPlayer;

    }

}
