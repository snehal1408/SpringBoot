package com.example.springBoot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics =  new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring framework", "Spring Framework Description"),
                new Topic("Java", "Java framework", "Java Framework Description"),
                new Topic("Javascript", "Javascript framework", "Javascript Framework Description")
    ));

    //Using JPA
        public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
            //topic.setId(id);
       topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }

    //without JPA
//    public List<Topic> getAllTopics(){
//        return topics;
//    }
//
//    public Topic getTopic(String id){
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//    }
//
//    public void addTopic(Topic topic) {
//        topics.add(topic);
//    }
//
//    public void updateTopic(String id, Topic topic) {
//        for(int i=0; i<topics.size();i++){
//            Topic t = topics.get(i);
//            if ((t.getId().equals(id))){
//                topics.set(i,topic);
//                return;
//            }
//        }
//    }
//
//    public void deleteTopic(String id) {
//        topics.removeIf(t->t.getId().equals(id));
//    }
}
