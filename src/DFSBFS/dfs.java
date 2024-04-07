package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class dfs {

	static int N,E;
    static int[][] Graph;
    static boolean[] Visited;

    // 재귀함수로 구현한 DFS
    static void dfs(int node) {
        Visited[node] = true;
        System.out.println(node +  " ");

        // 인접 노드를 순회
        for(int next=0; next<N; ++next ) {
        	// 방문하지 않고, 간선으로 연결되어 있으면
            if(!Visited[next] && Graph[node][next] != 0 ) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        Graph = new int[N+1][N+1];
        Visited = new boolean[N+1];

        for(int i=0; i<E; ++i) {
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            Graph[u][v] = Graph[v][u] = 1;
        }

        dfs(1);
    }

}
