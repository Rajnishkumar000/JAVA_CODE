package CSW;

public class wordpermutation
{
    static void allPossibleCombination(String s,int l,int r){
        if(l==r) {
            System.out.println(s);
            return;
        }
        for(int i=l ;i<r;i++){
            s=swap(s,i,l);
            allPossibleCombination(s,l+1, r);
            s=swap(s,i,l);
        }

    }

    static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        char l = sb.charAt(i);
        char r = sb.charAt(j);
        sb.setCharAt(i, r);
        sb.setCharAt(j, l);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="ABC";
        allPossibleCombination(s,0,s.length());
    }
}
