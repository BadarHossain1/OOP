import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    
        
    public static void main(String[] args) {
        
        int n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        String[] pair_left = new String[n];
        String[] pair_right = new String[n];
        for (int i = 0; i < n; i++) {
             pair_left[i] = sc.nextLine();
             pair_right[i] = sc.nextLine();
        }
        HashSet<String> pairsSet = new HashSet<>();
        for (int i= 0;i<n;i++) {
            String pair = pair_left[i] + " " + pair_right[i];
            pairsSet.add(pair);
            System.out.println(pairsSet.size());
}
    }
}
