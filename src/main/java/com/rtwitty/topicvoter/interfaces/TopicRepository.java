package com.rtwitty.topicvoter.interfaces;

import com.rtwitty.topicvoter.models.Topic;
import java.util.List;


public interface TopicRepository{
    List<Topic> findAll();
    void add(String title, String description);
    void delete(long id);
    }


