package com.sandeep.design.patterns1;

//Adapter Pattern:
class SMSNotificationAdapter implements NotificationAdapter {
	public void sendNotification(String userId, String subject, String message) {
		System.out.println("Sending SMS to: " + userId);
		System.out.println("Message: " + message);
	}
}
