package com.rtwitty.topicvoter.interfaces;

import com.rtwitty.topicvoter.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public List<Topic> findAll(){
        jdbcTemplate.query("SELECT * FROM topic");
    }
}
