package com.FirstPackage;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class ErrorLogServiceImpl implements ErrorLogService {

    @Autowired
    ErrorLogMapper errorLogMapper;

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    String QUERY=ErrorLogMapper.class.getName()+"insertMessage";

    public void insertMessage(ErrorLog errorLog) {
        sqlSessionTemplate.insert(QUERY,errorLog);
        /*int i=1;
        errorLogMapper.insertMessage(errorLog);*/
    }

    public ErrorLog getMessage(int id) {
        return errorLogMapper.getMessage(id);
    }

    public List<ErrorLog> getMessages() {
        return errorLogMapper.getMessages();
    }
}
