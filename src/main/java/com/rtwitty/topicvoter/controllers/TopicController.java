package com.rtwitty.topicvoter.controllers;

import com.rtwitty.topicvoter.models.Topic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@Controller
public class TopicController {

    @RequestMapping("/")
    public String index(Model model){
        Topic first = new Topic(1, "Java Spring", "Not sure how spring works");
        Topic second = new Topic(2, "Backend Fundamentals","NODE ON THE BACKEND, WHAT1");
        Topic third = new Topic(3, "React & Redux", "What is a single page app anyway?");
        ArrayList<Topic> topics = new ArrayList<>();
        topics.add(first);
        topics.add(second);
        topics.add(third);
        model.addAttribute("topic", topics);
        return "index";
    }
}
