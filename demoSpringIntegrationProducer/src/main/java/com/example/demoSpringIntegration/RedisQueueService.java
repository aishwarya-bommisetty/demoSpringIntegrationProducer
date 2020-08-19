package com.example.demoSpringIntegration;

import org.springframework.beans.factory.annotation.Autowired;

public class RedisQueueService implements QueueService {

	@Autowired
	private RedisChannelGateway channelGateway;

	@Override
	public void enqueue(PostPublishedEvent event) {
		channelGateway.enqueue(event);
	}

}
