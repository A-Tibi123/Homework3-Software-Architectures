package org.example.notification;

public class EmailNotification implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Email notification sent with message: " + message);
    }
}