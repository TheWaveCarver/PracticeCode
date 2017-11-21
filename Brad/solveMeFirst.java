public class Solution {

    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return (a+b);
    }
   
    public static void main(String[] args) {
        Scanner numArray = new Scanner(System.in);
        
        // numArray = [4,6];
        int a   = numArray.nextInt();
        int b   = numArray.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}