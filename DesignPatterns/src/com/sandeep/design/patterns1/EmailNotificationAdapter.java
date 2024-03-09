package com.sandeep.design.patterns1;

//Adapter Pattern: 
class EmailNotificationAdapter implements NotificationAdapter {
	public void sendNotification(String userId, String subject, String message) {
		System.out.println("Sending email to: " + userId);
		System.out.println("Subject: " + subject);
		System.out.println("Message: " + message);
	}
}
