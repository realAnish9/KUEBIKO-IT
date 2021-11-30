package com.kuebiko.history.service;

import com.kuebiko.history.dao.HistoryDao;
import com.kuebiko.history.models.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HistoryService implements HistoryServiceIn{


    @Autowired
    HistoryDao historyDao;

    @Override
    public History getHistory(String id) {
        return null;
    }

    @Override
    public History saveHistory(String id) {
        return null;
    }
}
