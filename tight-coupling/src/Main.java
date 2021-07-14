import loosely_coupling.Client_fix;
import loosely_coupling.Notification;
import loosely_coupling.NotifyByEmail;
import loosely_coupling.NotifyByPhone;
import tight_coupling.Client;

public class Main {
    public static void main(String args[]){

        Client client = new Client();
        client.change();

        System.out.println("----------------------");

        Notification byEmail = new NotifyByEmail();
        Notification byPhone = new NotifyByPhone();

        Client_fix client_fix = new Client_fix(byEmail);
        client_fix.change();

        client_fix.setNotification(byPhone);
        client_fix.change();

    }
}
