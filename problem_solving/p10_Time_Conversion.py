#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def timeConversion(s):
    # Write your code here
    timeSplit = s.split(":", 1)
    m = timeSplit[1][-2:]
    
    if m == "PM":
        if int(timeSplit[0])==12:
            hourConverted ="12"
        else:
            hourConverted = int(timeSplit[0]) + 12
    if m =="AM":
        if int(timeSplit[0])==12:
            hourConverted = "00"
        else:
            hourConverted = timeSplit[0]
    
    newTime = str(hourConverted) + ":" + timeSplit[1]
    
    return newTime[:-2]
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    fptr.write(result + '\n')

    fptr.close()
