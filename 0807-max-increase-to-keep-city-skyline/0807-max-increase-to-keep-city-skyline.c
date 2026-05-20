int maxIncreaseKeepingSkyline(int** grid,
                              int gridSize,
                              int* gridColSize) {

    int rowMax[55] = {0};
    int colMax[55] = {0};

    for (int i = 0; i < gridSize; i++) {

        for (int j = 0; j < gridColSize[0]; j++) {

            if (grid[i][j] > rowMax[i])
                rowMax[i] = grid[i][j];

            if (grid[i][j] > colMax[j])
                colMax[j] = grid[i][j];
        }
    }

    int ans = 0;

    for (int i = 0; i < gridSize; i++) {

        for (int j = 0; j < gridColSize[0]; j++) {

            int allowed =
                rowMax[i] < colMax[j]
                ? rowMax[i]
                : colMax[j];

            ans += allowed - grid[i][j];
        }
    }

    return ans;
}