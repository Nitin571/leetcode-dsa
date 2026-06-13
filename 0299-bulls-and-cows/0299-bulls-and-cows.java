class Solution {
    public String getHint(String secret, String guess) {

        int bull = 0;
        int cow = 0;

        for (int i = 0; i < secret.length(); i++) {

            if (secret.charAt(i) == guess.charAt(i)) {

                bull++;

                secret = secret.substring(0, i) + secret.substring(i + 1);
                guess = guess.substring(0, i) + guess.substring(i + 1);

                i--; 
            }
        }
        for (int i = 0; i < guess.length(); i++) {

            int idx = secret.indexOf(guess.charAt(i));

            if (idx != -1) {

                cow++;

                secret = secret.substring(0, idx) + secret.substring(idx + 1);
            }
        }

        return bull + "A" + cow + "B";
    }
}