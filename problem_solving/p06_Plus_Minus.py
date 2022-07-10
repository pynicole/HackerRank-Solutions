#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    # Write your code here
    pos = 0
    neg = 0
    zero = 0
    for item in arr:
        if item>0:
            pos += 1
        elif item==0:
            zero += 1
        elif item<0:
            neg += 1
    size = len(arr)        
    print("{:.6f}".format(pos/size))
    print("{:.6f}".format(neg/size))
    print("{:.6f}".format(zero/size))
if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
