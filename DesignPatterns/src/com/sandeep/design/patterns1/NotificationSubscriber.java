package com.sandeep.design.patterns1;

//Observer Pattern:
interface NotificationSubscriber {
	void receiveNotification(String userId, String subject, String message);
}
