package com.kuebiko.history.dao;

import com.kuebiko.history.entities.HistoryEntity;
import com.kuebiko.history.models.History;
import com.kuebiko.history.repo.HistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HistoryDao implements HistoryDaoIf {

    Map<String,History> datastore = new HashMap<>();

    @Autowired
    HistoryRepo historyRepo;

    @Override
    public History saveToDatabase(History history) {

        HistoryEntity historyEntity=new HistoryEntity();

        historyEntity.setPlayerId(history.getPlayerId());
        historyEntity.setId(history.getId());
        historyEntity = historyRepo.save(historyEntity);

        History newHistory=new History();
        newHistory.setId(historyEntity.getId());
        newHistory.setPlayerId(historyEntity.getPlayerId());
        newHistory.setWinner(historyEntity.isWinner());

        return newHistory;
    }

    @Override
    public History getFromDatabase(String id) {

        return datastore.get(id);
    }
}
