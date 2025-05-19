package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hashmap<K, V> {
    ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float lf = 0.5f;

    public Hashmap() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }

        if ((float) (size + 1) / list.size() > lf) {
            reHash();
            // Recalculate after rehash
            hash = Math.abs(key.hashCode() % list.size());
            entities = list.get(hash);
        }

        entities.add(new Entity(key, value));
        size++;
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return entity.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for (int i = 0; i < entities.size(); i++) {
            if (entities.get(i).key.equals(key)) {
                entities.remove(i);
                size--;
                return;
            }
        }
    }

    private void reHash() {
        System.out.println("We are now rehashing");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size = 0;

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> bucket : old) {
            for (Entity entity : bucket) {
                put(entity.key, entity.value);
            }
        }
    }

    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
