public class SpinWords {

    public static String reverse(String str) {
        String result = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String spinWords(String sentence) {
        String[] Split = sentence.split(" ");
        String result = "";
        for(int i=0; i < Split.length; i++) {
            if(Split[i].length() > 4) {
                result += reverse(Split[i]);
            }
            else {
                result += Split[i];
            }
            if(i != Split.length - 1) {
                result += ' ';
            }
        }
        return result;
    }
}