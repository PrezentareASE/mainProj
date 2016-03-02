package com.FirstPackage;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.List;

public interface ErrorLogService {
    public void insertMessage(ErrorLog errorLog);
    public ErrorLog getMessage(int id);
    public List<ErrorLog> getMessages();
}
