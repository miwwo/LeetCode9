public class Main {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int n = Integer.toString(x).length();
        for (int i = 1; i <= n/2+1; i++) {
            if (Math.floor((x/Math.pow(10,n-i))%Math.pow(10,1)) !=
                    Math.floor((x%(Math.pow(10,i)))/(Math.pow(10,i-1)))) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome_(12321));
        //lmAO
    }
}