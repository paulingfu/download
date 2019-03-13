package com.baizhi.service;

import com.baizhi.dao.LoadDao;
import com.baizhi.entity.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class LoadServiceImpl implements LoadService{
    @Autowired
    private LoadDao loadDao;
    @Override
    public void add(Load load) {
        String uuid = UUID.randomUUID().toString();
        uuid.replace("-","");
        load.setId(uuid);
        loadDao.insert(load);
    }
}
