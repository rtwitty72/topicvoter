package com.rtwitty.topicvoter.Repositories;

import com.rtwitty.topicvoter.interfaces.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TopicRepositoryImpl implements TopicRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Topic> findAll() {
        return jdbcTemplate.query("SELECT * FROM topic", new TopicMapper());

    }

    @Override
    public void add(Sting title, String description){
        jdbcTemplate.update("INSERT INTO topic"(title, description)VALUES(?, ?)", title, description)

        return null;
    }
}
