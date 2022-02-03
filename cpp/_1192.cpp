// 1192. Critical Connections in a Network


class Solution {
public:
    vector<int> rank,lowest;
    vector<vector<int>> graph,res;

    int solve(int node,int depth,int parent){
        if(rank[node]>=0)
            return rank[node];
        rank[node]=depth;
        int ans = depth;
        for(auto neighbour:graph[node]){
            if(parent==neighbour)
                continue;
            int back_depth = solve(neighbour,depth+1,node);
            if(back_depth>depth){
                res.push_back({node,neighbour});
            }
            ans = min(ans,back_depth);
        }
        rank[node]=ans;
        return ans;
    }

    vector<vector<int>> criticalConnections(int n, vector<vector<int>>& connections) {
        rank = vector<int>(n,-2);
        lowest=vector<int>(n,INT_MAX);
        graph = vector<vector<int>>(n);

        for(auto i:connections){
            graph[i[0]].push_back(i[1]);
            graph[i[1]].push_back(i[0]);
        }

        solve(0,0,-1);
        return res;
    }
};
