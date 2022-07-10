#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'staircase' function below.
#
# The function accepts INTEGER n as parameter.
#
def space():
    print(" ", end="")
def hashtag():
    print("#", end="")

def staircase(n):
    # Write your code here
    x = n-1
    y = 1
    k = 0
    while k < n:
        for i in range(0, x):
            space()
        for j in range(0,y):
            hashtag()
    
        x-=1
        y+=1
        k+=1
        
        print("\t")    
        
        
        
if __name__ == '__main__':
    n = int(input().strip())

    staircase(n)
