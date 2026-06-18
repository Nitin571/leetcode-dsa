class Solution {
    public double angleClock(int hour, int minutes) {
        double mintangle = 6 * minutes;
        double hourangle = 30 * hour + 0.5 * minutes;

        double angle = Math.abs(hourangle - mintangle);

        return Math.min(angle,360-angle);
    }
}