package com.kuebiko.history.controller;

import com.kuebiko.history.models.History;
import com.kuebiko.history.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController("/history")
public class HistoryController {

    @Autowired
    HistoryService historyService;

    @GetMapping("/get")
    public History getHistory(@RequestParam String id){
        return null;
    }
}
