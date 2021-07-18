package loosely_coupling;

public class Client_fix {
    private Notification notification;

    public Client_fix(Notification notification) {
        this.notification = notification;
    }

    public void change(){
        notification.Notify();
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
