package org.alking.p600;

public class P677 {

    public static class MapSum {

        private static final int SIZE = 'z' - 'a' + 1;

        private MapSum[] map = new MapSum[SIZE];

        private int val = 0;

        public MapSum() {

        }

        public void insert(String key, int val) {
            if (key.isEmpty()) {
                return;
            }
            MapSum m = this;
            for (int i = 0; i < key.length(); i++) {

                char c = key.charAt(i);
                int idx = c - 'a';
                if (m.map[idx] == null) {
                    m.map[idx] = new MapSum();
                }
                m = m.map[idx];
            }
            m.val = val;
        }

        private int _sum = 0;

        public int sum(String prefix) {
            MapSum m = this;
            this._sum = 0;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                int idx = c - 'a';
                if (m.map[idx] == null) {
                    return 0;
                }
                m = m.map[idx];
            }
            this.sum2(m);
            return _sum;
        }

        private void sum2(MapSum ms) {
            _sum += ms.val;
            for (MapSum m : ms.map) {
                if (m != null) {
                    sum2(m);
                }
            }
        }
    }

}
