/**
 * Created by mangguo on 2016/5/21.
 */
public class Test {
    public static void main(String[] args) {
        Server server = new Server();
        Client client = new Client(server);

        client.sendMsg("hello server~");
    }
}
