package com.kuebiko.tictactoe4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RemoteHistoryService {

    @Autowired
    private RestTemplate historyServiceTemplate;
    private String url = "localhost:8080/history/get";

    public String getRemoteHistory(String id){
        ResponseEntity<String> response
                = historyServiceTemplate.getForEntity( url+"?id="+id, String.class);
        return response.getBody();

    }

}
