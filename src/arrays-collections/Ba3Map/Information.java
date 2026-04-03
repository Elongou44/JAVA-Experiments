package Ba3Map;

import java.util.HashMap;
import java.util.Map;

public class Information {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("user1","password1");
        map.put("user2","password2");
        map.put("user3","password3");
        map.put("user4","password4");
        map.put("user5","password5");
        for (Map.Entry<String,String> e:map.entrySet()){
            System.out.println("用户名："+e.getKey()+"，密码："+e.getValue());
        }
    }
}
