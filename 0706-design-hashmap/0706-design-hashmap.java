class MyHashMap {

    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; 
        private int N; 

        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        HashMap() {

            N = 4;
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {

            int hc = key.hashCode();

            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi) {

            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {

                Node node = ll.get(i);

                if (node.key.equals(key)) {
                    return i;
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {

            LinkedList<Node>[] oldBucket = buckets;

            N = N * 2;

            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;

            for (int i = 0; i < oldBucket.length; i++) {

                LinkedList<Node> ll = oldBucket[i];

                for (int j = 0; j < ll.size(); j++) {

                    Node node = ll.get(j);

                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di != -1) {

                Node node = buckets[bi].get(di);

                node.value = value;

            } else {

                buckets[bi].add(new Node(key, value));

                n++;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                rehash();
            }
        }

        public V get(K key) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di != -1) {

                Node node = buckets[bi].get(di);

                return node.value;
            }

            return null;
        }

        public void remove(K key) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di != -1) {

                buckets[bi].remove(di);

                n--;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public int size() {
            return n;
        }
    }

    HashMap<Integer, Integer> map;

    public MyHashMap() {

        map = new HashMap<>();
    }

    public void put(int key, int value) {

        map.put(key, value);
    }

    public int get(int key) {

        Integer val = map.get(key);

        return val == null ? -1 : val;
    }

    public void remove(int key) {

        map.remove(key);
    }
}