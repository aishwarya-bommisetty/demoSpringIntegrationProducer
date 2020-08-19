package com.example.demoSpringIntegration;

public interface RedisChannelGateway {
	void enqueue(PostPublishedEvent event);
}