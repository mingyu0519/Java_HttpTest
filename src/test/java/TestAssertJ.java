import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by wangmy on 16/5/31.
 */
public class TestAssertJ {
    @Test
    public void testA(){
        assertThat("").isEmpty();
        assertThat("234").contains("2");
    }

    @Test
    public void testB(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("name","wangmy");
        map.put("age","18");
        assertThat(map).containsKeys("name","age").containsValues("wangmy","18");
    }

    @Test
    public void testJson(){
        String a = "{\"name\": \"wangmy\"}";
        JsonObject json = new JsonParser().parse(a).getAsJsonObject();

        String b = "{\"name\": \"wangmy\"}";
        JsonObject json1 = new JsonParser().parse(b).getAsJsonObject();

        assertThat(json).isEqualTo(json1);
        assertThat(a).contains("name").isSameAs(b).startsWith("{");
//        assertThat(json).hasFieldOrPropertyWithValue("name","wangmy");
//        assertThat(json).isEqualToComparingFieldByField("name");
    }
}
