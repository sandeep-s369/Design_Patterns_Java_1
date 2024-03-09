package com.sandeep.design.patterns1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//Facade Pattern:
class NotificationFacade {
	private NotificationStrategy strategy;
	private List<NotificationSubscriber> subscribers = new ArrayList<>();

	public NotificationFacade(NotificationStrategy strategy) {
		this.strategy = strategy;
	}

	public void addSubscriber(NotificationSubscriber subscriber) {
		subscribers.add(subscriber);
	}

	public void removeSubscriber(NotificationSubscriber subscriber) {
		subscribers.remove(subscriber);
	}

	public void sendNotification(String channel, String subject, String message) {
		UserNotificationPreferences preferences = UserNotificationPreferences.getInstance();
		Set<String> subscribers = preferences.getSubscribersForChannel(channel);
		if (!subscribers.isEmpty()) {
			strategy.sendNotification(subscribers, subject, message);
			notifySubscribers(subscribers, subject, message);
		} else {
			System.out.println("No subscribers for channel " + channel);
		}
	}

	private void notifySubscribers(Set<String> subscribers, String subject, String message) {
		for (NotificationSubscriber subscriber : this.subscribers) {
			for (String userId : subscribers) {
				subscriber.receiveNotification(userId, subject, message);
			}
		}
		System.out.println("Sent notifications to subscribers.");
	}
}
