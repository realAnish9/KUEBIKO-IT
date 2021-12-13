package com.kuebiko.history.service;

import com.kuebiko.history.dao.HistoryDao;
import com.kuebiko.history.entities.HistoryEntity;
import com.kuebiko.history.models.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class HistoryService implements HistoryServiceIn{


    @Autowired
    HistoryDao historyDao;

    @Override
    public History getHistory(String id) {

        return historyDao.getFromDatabase(id);

    }

    @Override
    public History saveHistory(History history) {

        //history.setId(UUID.randomUUID().toString());
        return historyDao.saveToDatabase(history);
    }
}
