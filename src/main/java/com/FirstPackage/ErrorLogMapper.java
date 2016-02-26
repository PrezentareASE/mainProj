package com.FirstPackage;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public interface ErrorLogMapper {

    @Insert("INSERT INTO _errorlog(text) VALUES(#{text})")
    @Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
    public void insertMessage(ErrorLog errorLog);

    @Select("SELECT id,text FROM _errorlog WHERE id = #{id}")
    public ErrorLog getMessage(int id);

    @Select("SELECT id,text FROM _errorlog")
    public List<ErrorLog> getMessages();
}
