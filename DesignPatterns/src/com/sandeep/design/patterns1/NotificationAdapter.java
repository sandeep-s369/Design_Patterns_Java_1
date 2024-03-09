package com.sandeep.design.patterns1;

//Adapter Pattern:
interface NotificationAdapter {
	void sendNotification(String userId, String subject, String message);
}