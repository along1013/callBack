/**
 * Created by mangguo on 2016/5/21.
 */
public class Client implements CallBack {

    private Server server;
    public Client(Server server){
        this.server = server;
    }
    public void sendMsg(final String msg){
        System.out.println("client send msg:" + msg);
        new Thread(new Runnable() {
            public void run() {
                server.getClientMsg(Client.this,msg);
            }
        }).start();
    }
    public void process(String status) {
        System.out.println("client callback status:" + status);
    }
}
