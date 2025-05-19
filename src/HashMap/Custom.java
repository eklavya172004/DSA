package HashMap;

import org.w3c.dom.Entity;

public class Custom {

    private Entity[] entity;

    public Custom(){
        entity = new Entity[100];
    }

    public void put(String key,String value){
        int hash = Math.abs(key.hashCode() % entity.length);
        entity[hash] = new Entity(key,value);
        //this is overridding it
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entity.length);

        if (entity[hash] != null && entity[hash].key.equals(key)){
            return entity[hash].value;
        }

        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entity.length);

        if (entity[hash] != null && entity[hash].key.equals(key)){
            entity[hash].value = null;
        }
    }

    private class Entity{
        String key;
        String value;

        public Entity(String key,String value){
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Custom map = new Custom();
        map.put("Maths","A");
        map.put("Physics","B");
        map.put("Chemistry","C");

        System.out.println(map.get("Chemistry"));
    }

}
