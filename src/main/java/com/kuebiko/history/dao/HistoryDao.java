package com.kuebiko.history.dao;

import com.kuebiko.history.models.History;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HistoryDao implements HistoryDaoIf {

    Map<String,History> datastore = new HashMap<>();


    @Override
    public History saveToDatabase(History history) {
        datastore.put(history.getId(), history);

        return datastore.get(history.getId());
    }

    @Override
    public History getFromDatabase(String id) {

        return datastore.get(id);
    }
}
