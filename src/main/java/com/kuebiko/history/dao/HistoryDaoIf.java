package com.kuebiko.history.dao;

import com.kuebiko.history.models.History;

public interface HistoryDaoIf {

    public History saveToDatabase(History history);
    public History getFromDatabase(String id);
}
