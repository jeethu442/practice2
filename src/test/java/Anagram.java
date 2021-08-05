public class Anagram {

    public static void main(String[] args){
        String a = "peek";
        String b = "keep";
        int al = a.length();
        int bl = b.length();
        int[] n = new int[0];
        int k=0;
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();

        if(al!=bl){
         System.out.println("Not an anagram");
        }
        else{

            for(int i=0;i<al;i++){
                for(int j=0;j<bl;j++){
                    if(ac[i]==bc[j]){
                        n[k]=bc[j];
                        k++;

                    }
                }
            }
            String nw=n.toString();
            if(nw==a){
                System.out.println("The strings are Anagram");
            }
            else{
                System.out.println("Not an anagram");
            }

        }
    }

}
