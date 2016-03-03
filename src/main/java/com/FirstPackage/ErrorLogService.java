package com.FirstPackage;

import java.util.List;

public interface ErrorLogService {
    public void insertMessage(ErrorLog errorLog);
    public ErrorLog getMessage(int id);
    public List<ErrorLog> getMessages();
}
