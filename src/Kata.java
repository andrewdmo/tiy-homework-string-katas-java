/**
 * Created by andrewdmo on 8/15/16.
 */
public class Kata {

    //explode
    public String explode(String expl) {
        //Start SB:
        String[] split = expl.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            if (i != split.length - 1) {
                sb.append(" ");
            }
        }
        return (sb.toString());
    }
    //notString
    public String notString(String not) {
        if (not.startsWith("not")) {
            return (not.toString());
            } else {
            return ("not "+ not);
        }
    }

    //missingCharacter
    public String missingCharacter(String word, int letternum) {
        String front = word.substring(0, letternum);
        String back = word.substring(letternum + 1, word.length());
        return front + back;
    }
    //frontBack
    public String frontBack(String word) {
            if (word.length() <= 1) return word;
            String mid = word.substring(1, word.length()-1);
            return word.charAt(word.length()-1) + mid + word.charAt(0);
        }
    //frontThree
    public String frontThree(String word) {
            if (word.length() <= 2) return word;
            String lets = word.substring(0, 3);
            return (lets + lets +lets);
    }
    //backAround
    public String backAround(String word) {
            if (word.length() <1) return word;
            int length = word.length();
            String lastl = word.substring(length-1, length);
            return lastl + word + lastl;
    }
    //front22
    public String front22(String word) {
        String first2 = word.substring(0, 2);
        return first2 + word + first2;
    }
    //startOz
    //way wordy but works (except unfactored Zo or Oz combo, realize there's a better method)
    public String startOz(String word) {
        String first2 = word.substring(0, 2);
        String first1 = word.substring(0, 1);
        String second1 = word.substring(1, 2);

        if (first2.equals("oz")) return first2;
        if (first2.equals("OZ")) return first2;
        if (first1.equals("o")) return first1;
        if (first1.equals("O")) return first1;
        if (second1.equals("z")) return second1;
        if (second1.equals("Z")) return second1;
        return first2;
    }

    //endUp
    public String endUp(String word) {
        int length = word.length();
        if (length < 3) return word.toUpperCase();
        String tree = word.substring(0, length-3);
        String last3 = word.substring(length-3, length);
        last3 = last3.toUpperCase();
        return tree + (last3.toUpperCase());
    }











}

