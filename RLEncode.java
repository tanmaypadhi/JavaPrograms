//import java.util.regex.Matcher;
//public class RLEncode {
//
//    public RLEncode() {}
//
//    public String encode(String s) {
//
//        StringBuffer sb = new StringBuffer();
//        int count;
//        int current;
//        final int strLen = s.length();
//        final char[] sArray = s.toCharArray();
//        final int xx;
//
//        xx = 1;
//        xx = 2;
//
//        if (strLen == 1) {
//            sb.append("1");
//            sb.append("s");
//            return(sb.toString());
//        }
//
//        count = 1;
//        for (current = 0; current < strLen - 1; current++) {
//            if (sArray[current] == sArray[current + 1]) {
//                count++;
//            } else {
//                sb.append(count);
//                sb.append(sArray[current]);
//                count = 1;
//            }
//        }
//        // append last match
//        sb.append(count);
//        sb.append(sArray[current]);
//        return(sb.toString());
//    }
//
//    public String encodeAlt(String s) {
//
//        StringBuffer sb = new StringBuffer();
//        int count;
//        int current;
//        int start;
//        final int strLen = s.length();
//        final char[] sArray = s.toCharArray();
//
//        if (strLen == 1) {
//            sb.append("1");
//            sb.append("s");
//            return(sb.toString());
//        }
//
//        count = 0;
//        start = 0;
//        for (current = 0; current < strLen; current++) {
//            if (sArray[current] == sArray[start]) {
//                count++;
//            } else {
//                sb.append(count);
//                sb.append(sArray[start]);
//                count = 1;
//                start = current;
//            }
//        }
//        // append last match
//        sb.append(count);
//        sb.append(sArray[start]);
//        return(sb.toString());
//    }
//
//    public String decode(String s) {
//        StringBuffer sb = new StringBuffer();
//        int count;
//        int cIndex;
//        char c;
//        final char[] sArray = s.toCharArray();
//        final int strLen = s.length();
//
//        count = 0;
//        cIndex = 0;
//        while (cIndex < (strLen - 1)) {
//            count = sArray[cIndex] - '0';
//            System.out.println("count = " + count);
//            c = sArray[cIndex + 1];
//            for (int i = 0; i < count; i++) {
//                sb.append(c);
//            }
//            cIndex += 2;
//        }
//        return(sb.toString());
//    }
//
//    public String decodeAlt(String s) {
//        StringBuffer sb = new StringBuffer();
//        int count;
//        int cIndex;
//        String c;
//        final char[] sArray = s.toCharArray();
//        final int strLen = s.length();
//
//        String regex = "\\d+|\\w";
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(s);
//
//        while (m.find()) {
//            count = Integer.parseInt(m.group());
//            System.out.println(count);
//            m.find();
//            c = m.group();
//            for (int i = 0; i < count; i++) {
//                sb.append(c);
//            }
//        }
//        return(sb.toString());
//    }
//
//    public static void main(String[] args) {
//        RLEncode rle = new RLEncode();
//        String test = "Looooonggg";
//        String e, d;
//
//        System.out.println("string = " + test);
//        e = rle.encode(test);
//        d = rle.decode(e);
//        System.out.println("string encoded = " + e);
//        System.out.println("string decoded = " + d);
//        e = rle.encodeAlt(test);
//        d = rle.decodeAlt(e);
//        System.out.println("string encoded = " + e);
//        System.out.println("string decoded = " + d);
//    }
//}
