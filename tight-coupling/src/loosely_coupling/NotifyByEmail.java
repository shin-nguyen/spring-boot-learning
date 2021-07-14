package loosely_coupling;

public class NotifyByEmail implements Notification {

    @Override
    public void Notify() {
        System.out.println("Notify by Email!");
    }
}
