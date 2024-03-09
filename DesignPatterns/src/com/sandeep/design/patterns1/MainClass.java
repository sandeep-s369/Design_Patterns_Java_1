package com.sandeep.design.patterns1;

import java.util.Scanner;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Channel");
		String channel = sc.next();
		System.out.println("Enter the subject");
		String subject = sc.next();
		System.out.println("Enter the message");
		String message = sc.next();

		NotificationAdapterFactory factory = new NotificationAdapterFactory();
		NotificationAdapter adapter = factory.createNotificationAdapter(channel);

		NotificationStrategy strategy;
		if (channel.equalsIgnoreCase("email")) {
			strategy = new EmailNotificationStrategy();
		} else if (channel.equalsIgnoreCase("sms")) {
			strategy = new SMSNotificationStrategy();
		} else {
			System.out.println("Invalid channel type");
			return;
		}

		NotificationFacade facade = new NotificationFacade(strategy);

		// Adding subscribers
		facade.addSubscriber((userId, sub, msg) -> {
			System.out.println("Subscriber " + userId + " received notification:");
			System.out.println("Subject: " + sub);
			System.out.println("Message: " + msg);
		});

		// Simulate sending notification
		facade.sendNotification(channel, subject, message);
	}
}
