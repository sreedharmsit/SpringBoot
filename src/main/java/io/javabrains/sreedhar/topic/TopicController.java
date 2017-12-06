package io.javabrains.sreedhar.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService ts;

	@RequestMapping("/Topics")
	public List<Topic> getAllTopics()
	{
		return ts.getAllTopics();
	}

	@RequestMapping("/Topics/{id}")
	public Topic getTopicsByID(@PathVariable String id)
	{
		return ts.getTopicByID(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/Topics")
	public void addtopic(@RequestBody Topic Topic)
	{
		ts.addTopic(Topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/Topics/{id}")
	public void updatetopic(@RequestBody Topic Topic,@PathVariable String id )
	{
		ts.updateTopic(id,Topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/Topics/{id}")
	public void deletetopic(@PathVariable String id )
	{
		ts.deleteTopic(id);
	}


}
