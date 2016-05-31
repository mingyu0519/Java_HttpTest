import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by wangmy on 16/5/27.
 */
public class TestGet {
    public static void main(String[] args) {
        new ReadByGet().start();
    }


    static class ReadByGet extends Thread {
        @Override
        public void run() {
            try {
                URL url = new URL("http://fanyi.youdao.com/openapi.do?keyfrom=jihakexueyuan111&key=1747687026&type=data&doctype=xml&version=1.1&q=hello");
                URLConnection urlConnection = url.openConnection();
                InputStream input = urlConnection.getInputStream();
                InputStreamReader inputRead = new InputStreamReader(input);
                BufferedReader buffere = new BufferedReader(inputRead);

                String line;
                StringBuilder builder = new StringBuilder();
                while ((line = buffere.readLine()) != null) {
                    builder.append(line);
                }
                buffere.close();
                inputRead.close();
                input.close();

                System.out.println(builder.toString());

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
