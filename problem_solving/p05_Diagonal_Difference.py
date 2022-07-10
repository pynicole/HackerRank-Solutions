#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'diagonalDifference' function below.
#
# The function is expected to return an INTEGER.
# The function accepts 2D_INTEGER_ARRAY arr as parameter.
#

def diagonalDifference(arr):
    # Write your code here
    print(arr)
    i = 0
    sum1 = 0
    while i < len(arr):
        num1 = arr[i][i]
        sum1 += num1
        i+=1
    print(sum1)
    
    i = 0
    j = len(arr) - 1
    sum2 = 0
    while i < len(arr):
        num2 = arr[i][j]
        sum2 += num2
        i+=1
        j-=1
    print(sum2)
    
    return abs(sum1-sum2)
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
