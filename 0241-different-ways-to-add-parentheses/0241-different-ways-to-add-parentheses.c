int* diffWaysToCompute(char* expression, int* returnSize);

int isOperator(char c) {
    return c == '+' || c == '-' || c == '*';
}

int calculate(int a, int b, char op) {

    if (op == '+')
        return a + b;

    if (op == '-')
        return a - b;

    return a * b;
}

int* diffWaysToCompute(char* expression, int* returnSize) {

    int* result = (int*)malloc(10000 * sizeof(int));

    *returnSize = 0;

    int len = strlen(expression);

    for (int i = 0; i < len; i++) {

        if (isOperator(expression[i])) {

            char leftStr[25];
            char rightStr[25];

            strncpy(leftStr, expression, i);
            leftStr[i] = '\0';

            strcpy(rightStr, expression + i + 1);

            int leftSize, rightSize;

            int* left =
                diffWaysToCompute(leftStr, &leftSize);

            int* right =
                diffWaysToCompute(rightStr, &rightSize);

            for (int l = 0; l < leftSize; l++) {

                for (int r = 0; r < rightSize; r++) {

                    result[*returnSize] =
                        calculate(left[l],
                                  right[r],
                                  expression[i]);

                    (*returnSize)++;
                }
            }
        }
    }

    if (*returnSize == 0) {

        result[0] = atoi(expression);

        *returnSize = 1;
    }

    return result;
}