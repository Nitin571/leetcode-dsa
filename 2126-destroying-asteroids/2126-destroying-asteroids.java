class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long mass1 = mass;
        for(int i=0;i<asteroids.length;i++){
            if(mass1 < asteroids[i]){
                return false;
            }
            mass1 += asteroids[i];
        }
        return true;
    }
}