package com.FirstPackage;

import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ErrorLogService {
    public void insertMessage(ErrorLog errorLog);
    public ErrorLog getMessage(int id);
    public List<ErrorLog> getMessages();
}
