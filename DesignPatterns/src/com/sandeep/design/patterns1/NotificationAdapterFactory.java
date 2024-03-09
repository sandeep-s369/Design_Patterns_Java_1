package com.sandeep.design.patterns1;
//Factory Pattern: 
class NotificationAdapterFactory {
	public NotificationAdapter createNotificationAdapter(String channel) {
		if (channel.equalsIgnoreCase("email")) {
			return new EmailNotificationAdapter();
		} else if (channel.equalsIgnoreCase("sms")) {
			return new SMSNotificationAdapter();
		} else {
			throw new IllegalArgumentException("Invalid channel type");
		}
	}
}
