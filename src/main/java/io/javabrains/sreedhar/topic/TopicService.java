package io.javabrains.sreedhar.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring1","spring boot","spring boot demo"),
			new Topic("spring2","spring MVC","spring MVC demo"),
			new Topic("spring3","spring IO","spring IO demo"),
			new Topic("spring4","spring WEB","spring WEB demo"),
			new Topic("spring5","spring Rest","spring Rest demo"),
			new Topic("spring1","spring boot1","spring boot demo"),
			new Topic("spring2","spring MVC1","spring MVC demo"),
			new Topic("spring3","spring IO1","spring IO demo"),
			new Topic("spring4","spring WEB1","spring WEB demo"),
			new Topic("spring5","spring Rest1","spring Rest demo"),
			new Topic("spring1","spring boot2","spring boot demo"),
			new Topic("spring2","spring MVC2","spring MVC demo"),
			new Topic("spring3","spring IO2","spring IO demo"),
			new Topic("spring4","spring WEB2","spring WEB demo"),
			new Topic("spring5","spring Rest2","spring Rest demo")

			));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopicByID(String id)
	{
		
		return topics.stream().filter(t->t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	public Topic getTopicByID1(String id)
	{
		
		return topics.stream().filter(t->t.getId().equalsIgnoreCase(id)).findAny().get();
	}
	
	public void addTopic(Topic Topic)
	{
		
		topics.add(Topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i=0;i<topics.size();i++)
		{
			if(topics.get(i).getId().equalsIgnoreCase(id))
			{
				topics.set(i, topic);
				//return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equalsIgnoreCase(id));
		
	}
}
