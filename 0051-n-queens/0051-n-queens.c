bool isSafe(int row,
            int col,
            char** board,
            int n) {

    int i, j;

    for (i = 0; i < row; i++) {

        if (board[i][col] == 'Q')
            return false;
    }

    for (i = row - 1, j = col - 1;
         i >= 0 && j >= 0;
         i--, j--) {

        if (board[i][j] == 'Q')
            return false;
    }

    for (i = row - 1, j = col + 1;
         i >= 0 && j < n;
         i--, j++) {

        if (board[i][j] == 'Q')
            return false;
    }

    return true;
}

void solve(int row,
           int n,
           char** board,
           char**** result,
           int* returnSize,
           int** returnColumnSizes) {

    if (row == n) {

        (*result)[*returnSize] =
            (char**)malloc(n * sizeof(char*));

        for (int i = 0; i < n; i++) {

            (*result)[*returnSize][i] =
                strdup(board[i]);
        }

        (*returnColumnSizes)[*returnSize] = n;

        (*returnSize)++;

        return;
    }

    for (int col = 0; col < n; col++) {

        if (isSafe(row, col, board, n)) {

            board[row][col] = 'Q';

            solve(row + 1,
                  n,
                  board,
                  result,
                  returnSize,
                  returnColumnSizes);

            board[row][col] = '.';
        }
    }
}

char*** solveNQueens(int n,
                     int* returnSize,
                     int** returnColumnSizes) {

    char**** result =
        (char****)malloc(sizeof(char***));

    *result =
        (char***)malloc(1000 * sizeof(char**));

    *returnColumnSizes =
        (int*)malloc(1000 * sizeof(int));

    char** board =
        (char**)malloc(n * sizeof(char*));

    for (int i = 0; i < n; i++) {

        board[i] =
            (char*)malloc((n + 1) * sizeof(char));

        for (int j = 0; j < n; j++) {
            board[i][j] = '.';
        }

        board[i][n] = '\0';
    }

    *returnSize = 0;

    solve(0,
          n,
          board,
          result,
          returnSize,
          returnColumnSizes);

    return *result;
}