class Solution {
    public boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < v; i++) {
            if (adj.get(i).size() % 2 != 0) {
                return false;
            }
        }
        return true;
    }

public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Solution s = new Solution();
        boolean res = s.isEularCircuitExist(v, adj);
        System.out.println("Eular Circuit Exists: " + res);
    }
}

// Code Written : Sushant Joshi
