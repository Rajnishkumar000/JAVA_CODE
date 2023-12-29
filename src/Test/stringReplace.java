package Test;

public class stringReplace
{
//    static String swap(String str, int i, int j)
//    {
//        if (j == str.length() - 1)
//            return str.substring(0, i) + str.charAt(j)
//                    + str.substring(i + 1, j) + str.charAt(i);
//
//        return str.substring(0, i) + str.charAt(j)
//                + str.substring(i + 1, j) + str.charAt(i)
//                + str.substring(j + 1, str.length());
//    }
 static String swapChars(String str, int lIdx, int rIdx) {
    StringBuilder sb = new StringBuilder(str);
    char l = sb.charAt(lIdx), r = sb.charAt(rIdx);
    sb.setCharAt(lIdx, r);
    sb.setCharAt(rIdx, l);
    return sb.toString();
}











    public static void main(String[] args) {
        String s="ABCDE";
//        s=swap(s,0,4);
//     s=s.substring(s.length()-1,s.length())+s.substring(1,s.length()-1)+s.substring(0,1);
        s=swapChars(s,4,0);



        System.out.println(s);

    }
}
