import com.github.kevinsawicki.http.HttpRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangmy on 16/6/4.
 */
public class TestRequestPost {
    public static void main(String[] args) {
        new PostYoudao().start();
    }
}

class PostYoudao extends Thread {
    @Override
    public void run() {
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("keyfrom", "jihakexueyuan111");
        parameters.put("key", "1747687026");
        parameters.put("type", "data");
        parameters.put("doctype", "xml");
        parameters.put("version", "1.1");
        parameters.put("q", "hello");
        HttpRequest request = HttpRequest.post("http://fanyi.youdao.com/openapi.do").form(parameters);

        System.out.println(request.body());
        System.out.println(request.headers());
        System.out.println(request.code());

    }
}