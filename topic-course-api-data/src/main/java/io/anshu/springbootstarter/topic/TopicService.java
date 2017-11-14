package io.anshu.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepo;
	
	public List<Topic> getAllTopics() {
		return (List<Topic>) topicRepo.findAll();
	}
	
	
	public Topic getTopic(String id) {
		return topicRepo.findOne(id);
	}


	public void addTopic(Topic topic) {
		topicRepo.save(topic);		
	}


	public void updateTopic(Topic topic, String id) {
		topicRepo.save(topic);
		}
		


	public void deleteTopic(String id) {
		topicRepo.delete(id);
		
	}

}
