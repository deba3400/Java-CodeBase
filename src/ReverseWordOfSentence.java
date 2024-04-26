public class ReverseWordOfSentence {
    public static void main(String[] args) {
        System.out.println(reverseWord("my name is khan"));
        System.out.println(reverseWord("I am sonoo jaiswal"));
    }

    public static String reverseWord(String str) {
        String words[] = str.split("\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
//            sb.reverse();
            reverseWord = " "+sb.toString() + reverseWord;
        }
        return reverseWord;
    }


    }

