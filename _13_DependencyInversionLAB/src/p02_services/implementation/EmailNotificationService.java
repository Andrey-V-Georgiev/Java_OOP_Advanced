package _13_DependencyInversionLAB.src.p02_services.implementation;

import _13_DependencyInversionLAB.src.p02_services.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService{

    private boolean isActive;

    public EmailNotificationService(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public void sendNotification() {
        System.out.println("Email Send");
    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }
}
