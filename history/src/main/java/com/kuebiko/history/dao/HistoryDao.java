package com.kuebiko.history.dao;

import com.kuebiko.history.models.History;
import org.springframework.stereotype.Component;

@Component
public class HistoryDao implements HistoryDaoIf {

    @Override
    public History save(History history) {
        return null;
    }

    @Override
    public History get(String id) {
        return null;
    }
}
