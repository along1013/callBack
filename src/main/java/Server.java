/**
 * Created by mangguo on 2016/5/21.
 */
public class Server {
    public void getClientMsg(CallBack callBack,String msg){
        System.out.println("server get client msg:" + msg);
        try{
            Thread.sleep(5 * 1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("server is success 200");
        callBack.process("200");
    }
}
