import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by wangmy on 16/5/27.
 */
public class TestPost {
    public static void main(String[] args) {
        new ReadPost().start();
    }
}

class ReadPost extends Thread {
    @Override
    public void run() {
        try {

            URL url = new URL("http://fanyi.youdao.com/openapi.do");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");

            OutputStream outputStream = connection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write("keyfrom=jihakexueyuan111&key=1747687026&type=data&doctype=xml&version=1.1&q=hello");
            bufferedWriter.flush();

            InputStream is = connection.getInputStream();
            InputStreamReader ips = new InputStreamReader(is);
            BufferedReader bufferedReader = new BufferedReader(ips);

            String line;
            StringBuilder sub = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null){
                sub.append(line);
            }

            bufferedReader.close();
            ips.close();
            is.close();

            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();

            System.out.println(sub);




        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}