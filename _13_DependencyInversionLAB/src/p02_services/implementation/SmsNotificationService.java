package _13_DependencyInversionLAB.src.p02_services.implementation;

import _13_DependencyInversionLAB.src.p02_services.interfaces.NotificationService;

public class SmsNotificationService implements NotificationService{
    private boolean isActive;

    public SmsNotificationService(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS Send");
    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }
}
