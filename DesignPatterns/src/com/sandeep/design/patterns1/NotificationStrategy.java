package com.sandeep.design.patterns1;

import java.util.Set;

//Strategy Pattern:
interface NotificationStrategy {
	void sendNotification(Set<String> subscribers, String subject, String message);
}
