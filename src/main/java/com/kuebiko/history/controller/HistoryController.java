package com.kuebiko.history.controller;

import com.kuebiko.history.models.History;
import com.kuebiko.history.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("/history")
public class HistoryController {

    @Autowired
    HistoryService historyService;


    @GetMapping
    @RequestMapping("/get")
    public History getHistory(@RequestParam String id) {
        return historyService.getHistory(id);

    }

    @PostMapping
    @RequestMapping("/save")
    public History saveHistory(@RequestBody History paylood){

        return historyService.saveHistory(paylood);
    }
}
