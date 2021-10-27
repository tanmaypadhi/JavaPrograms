import java.util.*;

// "hel,lo""","worl,d",you,all

/* states:

	xxxx
	"xx,xx"
	""xxx
	"xxx"",x"
*/

public class ExcelParse {

    public ExcelParse() {}

    public ArrayList<String> parseWords(String s) {
        ArrayList<String> words = new ArrayList<String>();
        char[] carray = s.toCharArray();
        StringBuffer word = new StringBuffer();
        char c;
        boolean inWord = false;
        boolean escaped = false;

        System.out.println("parseWords s = " + s);
        for (int i = 0; i < carray.length; i++) {
            c = carray[i];
            if (c == '"') {
                if (inWord) {
                    if (escaped) {
                        word.append(c);
                        escaped = false;
                    } else {
                        escaped = true;
                    }
                } else {
                    inWord = true;
                    escaped = false;
                }
            } else if (c == ',') {
                if (escaped) {
                    if (inWord) {
                        words.add(word.toString());
                        word.delete(0, word.length());
                        inWord = false;
                        escaped = false;
                    }
                } else {
                    if (!inWord) {
                        words.add(word.toString());
                        word.delete(0, word.length());
                        inWord = false;
                        escaped = false;
                    } else {
                        word.append(c);
                    }
                }
            } else {
                word.append(c);
            }
        }
        // add last word
        words.add(word.toString());
        return(words);
    }

    public ArrayList<String> parseWordsAlt(String s) {
        ArrayList<String> words = new ArrayList<String>();
        char[] carray = s.toCharArray();
        StringBuffer word = new StringBuffer();
        boolean endWord = false;
        int startIndex;
        char c1;
        char c2;
        String ns;


        endWord = false;
        startIndex = 0;
        while (startIndex < carray.length - 1) {
            c1 = carray[startIndex];
            if (c1 == '"') {
                startIndex++;
                while ((startIndex < carray.length - 1) && !endWord) {
                    c1 = carray[startIndex];
                    c2 = carray[startIndex + 1];
                    if (c1 == '"' && c2 == ',') {
                        ns = undoQuotes(word.toString());
                        words.add(ns);
                        System.out.println("add quoted word = " + word);
                        word.delete(0, word.length());
                        endWord = true;
                        startIndex++;
                    } else if (c1 == '"' && c2 == '"') {
                        word.append(c1);
                        word.append(c2);
                        startIndex++;
                    } else {
                        word.append(c1);
                    }
                    startIndex++;
                }
            } else {
                word.append(c1);
                startIndex++;
                while ((startIndex < carray.length) && !endWord) {
                    c1 = carray[startIndex];
                    if (c1 == ',') {
                        ns = undoQuotes(word.toString());
                        words.add(ns);
                        System.out.println("add plain word = " + word);
                        word.delete(0, word.length());
                        endWord = true;
//						startIndex++;
                    } else {
                        word.append(c1);
                    }
                    startIndex++;
                }
            }
            endWord = false;
        }
        // last word left over from loop
        ns = undoQuotes(word.toString());
        words.add(ns);
        System.out.println("add last word = " + word);
        return(words);
    }

    public String undoQuotes(String s) {
        char[] carray = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        int index;

        index = 0;
        while (index < s.length() - 1) {
            sb.append(carray[index]);
            if (carray[index] == '"' && carray[index + 1] == '"') {
                index += 2;
            } else {
                index++;
            }
        }
        if (index < s.length()) {
            sb.append(carray[index]);
        }
        return(sb.toString());
    }

    public static void main(String[] args) {
        String s = "\"hel,lo\",\"\"\"there\",\"you\"\"all\",hi,\"\"\"buddy,normal\"";
        ArrayList<String> words;

        ExcelParse ep = new ExcelParse();

        words = ep.parseWordsAlt(s);
        for (String str : words) {
            System.out.println("word = " + str);
        }
        System.out.println("");

        words = ep.parseWords(s);
        for (String str : words) {
            System.out.println("word = " + str);
        }
        System.out.println("");

        s = "he,llo,\"wo\"\"r,ld\"";
        words = ep.parseWordsAlt(s);
        for (String str : words) {
            System.out.println("word = " + str);
        }
        System.out.println("");

        words = ep.parseWords(s);
        for (String str : words) {
            System.out.println("word = " + str);
        }
        System.out.println("");

        s = "he,llo,\"wo\"\"r,,ld\"";
        words = ep.parseWordsAlt(s);
        for (String str : words) {
            System.out.println("word = " + str);
        }
        System.out.println("");

        words = ep.parseWords(s);
        for (String str : words) {
            System.out.println("word = " + str);
        }
        System.out.println("");

        s = "he,\"llo,\"\"wo\"\"r,,ld\"";
        words = ep.parseWordsAlt(s);
        for (String str : words) {
            System.out.println("word = " + str);
        }
        System.out.println("");

        words = ep.parseWords(s);
        for (String str : words) {
            System.out.println("word = " + str);
        }
        System.out.println("");

        s = "hi,\"hel,lo\"\"\"";
        words = ep.parseWordsAlt(s);
        for (String str : words) {
            System.out.println("word = " + str);
        }
        System.out.println("");

        words = ep.parseWords(s);
        for (String str : words) {
            System.out.println("word = " + str);
        }
        System.out.println("");

        s = "\"ho\"\",hello\"";
        words = ep.parseWordsAlt(s);
        for (String str : words) {
            System.out.println("word = " + str);
        }
        System.out.println("");

        words = ep.parseWords(s);
        for (String str : words) {
            System.out.println("word = " + str);
        }
    }
}
