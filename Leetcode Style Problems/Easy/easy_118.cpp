// 118. Pascal's Triangle
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        if (numRows == 0) return {};
        if (numRows == 1) return {{1}};
        if (numRows == 2) return {{1}, {1, 1}};
        
        vector<vector<int>> pascalTriangle(numRows);
        
        for (int x = static_cast<int>(pascalTriangle.size()); x > 0; --x) {
            vector<int>& currentRow = pascalTriangle[x - 1];
            currentRow.resize(x);
        }

        pascalTriangle[0][0] = 1;
        pascalTriangle[1][0] = 1;
        pascalTriangle[1][1] = 1;
        
        for (int i = 2; i < static_cast<int>(pascalTriangle.size()); ++i) {
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][i] = 1;
            for (int j = 1; j < i; ++j) {
                int toAddUp = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
                pascalTriangle[i][j] = toAddUp;
            }
        }
        
        return pascalTriangle;
    }
};

