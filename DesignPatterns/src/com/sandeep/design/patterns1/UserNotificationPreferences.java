package com.sandeep.design.patterns1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Singleton Pattern:
class UserNotificationPreferences {
	private static UserNotificationPreferences instance = new UserNotificationPreferences();
	private Map<String, String> userSubscriptions = new HashMap<>();

	private UserNotificationPreferences() {
		// Mock: Adding some hardcoded user subscriptions
		userSubscriptions.put("user1", "email");
		userSubscriptions.put("user2", "sms");
		userSubscriptions.put("user3", "email");
		userSubscriptions.put("user4", "sms");
	}

	public static UserNotificationPreferences getInstance() {
		return instance;
	}

	public Set<String> getSubscribersForChannel(String channel) {
		Set<String> subscribers = new HashSet<>();
		for (Map.Entry<String, String> entry : userSubscriptions.entrySet()) {
			if (entry.getValue().equalsIgnoreCase(channel)) {
				subscribers.add(entry.getKey());
			}
		}
		return subscribers;
	}
}