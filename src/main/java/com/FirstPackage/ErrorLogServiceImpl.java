package com.FirstPackage;

import com.FirstPackage.mappers.ErrorLogMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErrorLogServiceImpl implements ErrorLogService {

    @Autowired
    ErrorLogMapper errorLogMapper;

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    String QUERY=ErrorLogMapper.class.getName()+"insertMessage";

    public void insertMessage(ErrorLog errorLog) {
       /* int i=1;

        SqlSession session = sqlSessionFactory.openSession();
        ErrorLogMapper mapper = session.getMapper(ErrorLogMapper.class);
        mapper.insertMessage(errorLog);
        session.commit();
        session.close();


        sqlSessionTemplate.insert(QUERY,errorLog);*/
        errorLogMapper.insertMessage(errorLog);
    }

    public ErrorLog getMessage(int id) {
        return errorLogMapper.getMessage(id);
    }

    public List<ErrorLog> getMessages() {
        return errorLogMapper.getMessages();
    }
}
