import com.github.kevinsawicki.http.HttpRequest;
/**
 * Created by wangmy on 16/6/4.
 */
public class TestRequestGet {
    public static void main(String[] args) {
        new GetBaidu().start();
    }
}

class GetBaidu extends Thread{
    @Override
    public void run() {
        HttpRequest request = HttpRequest.get("http://www.baidu.com");
        System.out.println(request.body());
        System.out.println(request.code());
        System.out.println(request.headers());
    }
}