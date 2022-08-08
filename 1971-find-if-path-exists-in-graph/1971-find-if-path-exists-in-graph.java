class Solution {
    static int[] unf;
    
    public static int find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = find(unf[v]);
	}
	
	public static void union(int a, int b) {
		int fa = find(a);
		int fb = find(b);
		if(fa != fb) unf[fa] = fb;
	}
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        unf = new int[n];
        for(int i = 0; i < n; i++) unf[i] = i;
        for(int i = 0; i < edges.length; i++){
            union(edges[i][0], edges[i][1]);
        }
        
        int scr = find(source);
		int dest = find(destination);
        if(scr == dest) return true;
        return false;
    }
    
    
    
}