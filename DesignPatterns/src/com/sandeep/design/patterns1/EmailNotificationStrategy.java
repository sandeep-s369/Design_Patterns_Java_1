package com.sandeep.design.patterns1;

import java.util.Set;

//Strategy Pattern: 
class EmailNotificationStrategy implements NotificationStrategy {
	private NotificationAdapter adapter = new EmailNotificationAdapter();

	public void sendNotification(Set<String> subscribers, String subject, String message) {
		for (String subscriber : subscribers) {
			adapter.sendNotification(subscriber, subject, message);
		}
	}
}