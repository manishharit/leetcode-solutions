package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class invalid_transaction_1169 {
    public static void main(String[] args) {
        invalidTransactions(new String[]{"alice,20,800,mtv","alice,50,100,beijing"});
    }

        static class Transaction{
        String name;
        int time;
        int amount;
        String city;

        public Transaction(String s){
            String[] split = s.split(",");
            name = split[0];
            time = Integer.parseInt(split[1]);
            amount = Integer.parseInt(split[2]);
            city = split[3];
        }

        }
        public static List<String> invalidTransactions(String[] transactions) {
        List<String> invalid = new ArrayList<>();
        Map<String,List<Transaction>> map = new HashMap<>();

        for (String transaction : transactions){
            Transaction t = new Transaction(transaction);
            map.putIfAbsent(t.name, new ArrayList<>());
            map.get(t.name).add(t);
        }

        for(String transaction : transactions){
            Transaction t = new Transaction(transaction);
            if(!isValid(t,map.getOrDefault(t.name,new ArrayList<>()))){
                invalid.add(transaction);
            }
        }
            return invalid;

        }
        public static boolean isValid(Transaction t, List<Transaction> list){
        if(t.amount > 1000){ return false;}
        for (Transaction trans: list){
            if(Math.abs(trans.time - t.time) <=60 && !trans.city.equals(t.city)){
                return false;
            }
        }
        return true;

        }

}
