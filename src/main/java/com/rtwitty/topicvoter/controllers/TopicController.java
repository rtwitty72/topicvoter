package com.rtwitty.topicvoter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.controller;

public class TopicController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
