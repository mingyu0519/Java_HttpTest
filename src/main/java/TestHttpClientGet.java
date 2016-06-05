import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by wangmy on 16/6/1.
 */
public class TestHttpClientGet {
    public static void main(String[] args) {
        Get get = new Get();
        get.start();
    }
}

class Get extends Thread{
    CloseableHttpClient httpclient = HttpClients.createDefault();
    @Override
    public void run(){
        HttpGet get = new HttpGet("http://www.baidu.com");
        try {


            HttpResponse hResponse = httpclient.execute(get);
            HttpEntity entity = hResponse.getEntity();
            String result = EntityUtils.toString(entity,"utf-8");
            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}