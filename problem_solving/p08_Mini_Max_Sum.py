#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'miniMaxSum' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def miniMaxSum(arr):
    # Write your code here
    min = 0
    max = 0
    
    sortedArr = sorted(arr)
    
    for i in range(0, len(sortedArr)-1):
        min = sortedArr[i]+min
    for j in range(1, len(sortedArr)):
        max = sortedArr[j]+max 
    print(min, max)
    
    
if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
