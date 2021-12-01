package com.kuebiko.history.service;

import com.kuebiko.history.models.History;

public interface HistoryServiceIn {

    public History getHistory(String id);
    public History saveHistory(History history);
}
