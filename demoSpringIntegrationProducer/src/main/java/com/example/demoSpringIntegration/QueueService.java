package com.example.demoSpringIntegration;

public interface QueueService {
	void enqueue(PostPublishedEvent event);
}
