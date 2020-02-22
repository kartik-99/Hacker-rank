#!/bin/python3

import math
import os
import random
import re
import sys
import numpy as np

#
# Complete the 'getWays' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts following parameters:
#  1. INTEGER n
#  2. LONG_INTEGER_ARRAY c
#

def zeros(n):
    listofzeros = [0] * n
    return listofzeros

def gw(a, c):
    n = len(a)
    if n < c[0]:
        return list(zeros(len(c)))
    ans = []

    cc = [i for i in c if i <=n]
    for i in range(len(cc)):
        temp = n - cc[i]
        if temp == 0:
            ans.append(1)
        else:
            ans.append(sum(a[temp][i:]))
    ans.extend(list(zeros(len(c) - len(cc))))
    return ans



def getWays(n, c):
    c.sort()
    a = []
    for i in range(n+1):
        a.append(gw(a, c))
    # print(sum(a[-1]))
    for i in a:
        print(i)
