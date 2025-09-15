import java.util.*;
class Solution {

    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj,
                           ArrayList<Integer> ls) {

        //marking current node as visited
        vis[node] = true;
        ls.add(node);

        //getting neighbour nodes
        // getting neighbour nodes using a traditional for loop
        for (int i = 0; i < adj.get(node).size(); i++) {
            Integer it = adj.get(node).get(i);
            if (!vis[it]) {
                dfs(it, vis, adj, ls);
            }
        }

    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        //boolean array to keep track of visited vertices
        boolean[] vis = new boolean[V+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }

    public static void main(String[] args) {

        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        Solution sl = new Solution();
        ArrayList < Integer > ans = sl.dfsOfGraph(5, adj);
        int n = ans.size();
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }
}