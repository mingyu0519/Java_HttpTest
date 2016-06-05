import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangmy on 16/6/1.
 */
public class TestHttpClientPost {
    public static void main(String[] args) {
        new Post().start();
    }
}

class Post extends Thread {
    CloseableHttpClient httpClient = HttpClients.createDefault();

    @Override
    public void run() {
        // keyfrom=jihakexueyuan111&key=1747687026&type=data&doctype=xml&version=1.1&q=hello
        HttpPost post = new HttpPost("http://fanyi.youdao.com/openapi.do");
        List<BasicNameValuePair> parameters = new ArrayList<BasicNameValuePair>();
        parameters.add(new BasicNameValuePair("keyfrom", "jihakexueyuan111"));
        parameters.add(new BasicNameValuePair("key", "1747687026"));
        parameters.add(new BasicNameValuePair("type", "data"));
        parameters.add(new BasicNameValuePair("doctype", "xml"));
        parameters.add(new BasicNameValuePair("version", "1.1"));
        parameters.add(new BasicNameValuePair("q", "hello"));
        try {

            post.setEntity(new UrlEncodedFormEntity(parameters, "utf-8"));
            HttpResponse httpResponse = httpClient.execute(post);
            String result = EntityUtils.toString(httpResponse.getEntity());
            System.out.println(result);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}