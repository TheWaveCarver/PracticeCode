#!/bin/python3

import sys

def kangaroo(x1, v1, x2, v2):
    # Complete this function
    denom = v1-v2
    if(denom == 0):
        return 'NO'
    
    point_of_convergence = float((x2-x1)/(v1-v2))
    if( point_of_convergence>=0 and point_of_convergence%1 == 0):
        return 'YES'
    return 'NO'
        

x1, v1, x2, v2 = input().strip().split(' ')
x1, v1, x2, v2 = [int(x1), int(v1), int(x2), int(v2)]
result = kangaroo(x1, v1, x2, v2)
print(result)
