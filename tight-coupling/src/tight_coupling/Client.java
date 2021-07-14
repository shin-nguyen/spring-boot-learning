package tight_coupling;

public class Client {
    private Notify notify = new Notify();

    public Client() {
    }

    public void change(){
        notify.notifyByEmail();
    }
}
