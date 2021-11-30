package com.kuebiko.history.dao;

import com.kuebiko.history.models.History;

public interface HistoryDaoIf {

    public History save(History history);
    public History get(String id);
}
