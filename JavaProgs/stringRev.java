public class stringRev {
    public static void main(String[] args) {
        String name="vaibhav",rev=" ";
        int len=name.length();
        for(int i=len-1;i>=0;i--){
            rev= rev + name.charAt(i);
        }
        System.out.println(rev);
    }
    
}
