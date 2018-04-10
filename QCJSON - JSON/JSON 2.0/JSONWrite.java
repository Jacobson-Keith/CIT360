package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JSONWrite {

    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name", "Keith");
        obj.put("age", new Integer(28));

        JSONArray list = new JSONArray();
        list.add("I");
        list.add("Like");
        list.add("Tacos");

        obj.put("messages", list);

        try (FileWriter file = new FileWriter("f:\\test.json")) {

            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }

}