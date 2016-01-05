import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        String input = reader.nextLine();

        TreeMap<String, LinkedHashMap<String,Integer>> usernamedData = new TreeMap<>();
        while(!input.equals("end")){
            String[] arrayInput = input.split("\\s");
            String ip = arrayInput[0].substring(3,arrayInput[0].length());
            String username = arrayInput[2].substring(5, arrayInput[2].length());
            if(!usernamedData.containsKey(username)){
                usernamedData.put(username,new LinkedHashMap<>());
                usernamedData.get(username).put(ip,1);
            }else{
                if(!usernamedData.get(username).containsKey(ip)){
                    usernamedData.get(username).put(ip,1);
                }else{
                    int ipCounts = usernamedData.get(username).get(ip);
                    usernamedData.get(username).put(ip,++ipCounts);
                }
            }
            input = reader.nextLine();
        }


        for (Map.Entry <String, LinkedHashMap<String,Integer>> entry : usernamedData.entrySet()){
            String user = entry.getKey();
            LinkedHashMap<String, Integer> ipMaps = entry.getValue();
            System.out.println(user + ":");

            for(Map.Entry<String, Integer> map : ipMaps.entrySet() ){
                String ip = map.getKey();
                int messageCount = map.getValue();
                System.out.print(ip + " => " + messageCount);

                String lastKey = getLastKey(ipMaps);

                if (ip.equals(lastKey)) {
                    System.out.print(".");
                }
                else {
                    System.out.print(", ");
                }
                System.out.println();
            }

        }
    }

    public static String getLastKey(LinkedHashMap<String, Integer> hashMap) {
        String out = "";
        for (String key : hashMap.keySet()) {
            out = key;
        }
        return out;
    }
}
