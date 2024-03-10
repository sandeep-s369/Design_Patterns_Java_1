# Design_Patterns_Java_1
Java Application where I have used different Design Patterns in Java


I have implemented a notification system where Notification system supports Email & SMS. The implementation is done keeping in mind that new channels can be easily integrated with the code. Principles of open to extension but closed for modifications should be applied.
System was taken following arguments:
Channel of notification (Email/SMS)
Subject
Message Body
No UI is used, arguments can be taken from command line.
The notifications will be sent only to users who have subscribed for the notifications. No database is added, the database layer is mocked and hardcoded users list are returned from layer. 
Following design patterns have been used in the solution:
Factory
Singleton
Adapter
Façade
Strategy
Observer / PubSub

Spring was not been used. Code was implemented in plain Java.
Actual implementation of sending emails or messages is not implemented but use of design patterns is implemented 

