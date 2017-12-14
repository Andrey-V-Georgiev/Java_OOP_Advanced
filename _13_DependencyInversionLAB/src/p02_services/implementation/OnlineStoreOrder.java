package _13_DependencyInversionLAB.src.p02_services.implementation;

import _13_DependencyInversionLAB.src.p02_services.interfaces.NotificationService;

public class OnlineStoreOrder {

    private NotificationService emailNotification;
    private  NotificationService smsNotification;

    public OnlineStoreOrder(NotificationService email, NotificationService sms) {
        this.emailNotification = email;
        this.smsNotification = sms;
    }

    public void process() {
        if (this.smsNotification.isActive())
            this.smsNotification.sendNotification();

        if (this.emailNotification.isActive())
            this.emailNotification.sendNotification();
    }

    public static void main(String[] args) {
        NotificationService ens = new EmailNotificationService(true);
        NotificationService sns = new SmsNotificationService(true);
        OnlineStoreOrder onlineStoreOrder = new OnlineStoreOrder(ens, sns);
        onlineStoreOrder.process();
    }
}
