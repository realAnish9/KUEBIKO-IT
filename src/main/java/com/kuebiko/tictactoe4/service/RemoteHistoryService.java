package com.kuebiko.tictactoe4.service;

import com.kuebiko.tictactoe4.models.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RemoteHistoryService {

    @Autowired
    private RestTemplate historyServiceTemplate;
    private String url = "http://192.168.1.103:8080/history/save";

    public History saveRemoteHistory(History paylood){
        ResponseEntity<History> response
                = historyServiceTemplate.postForEntity( url,paylood, History.class);
        return response.getBody();

    }

}
