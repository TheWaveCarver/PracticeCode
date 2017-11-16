#!/bin/python3

import sys

def solve(year):
    # Complete this function
    day = 13
    if (year < 1918 and year%4 == 0):
        day-=1
    elif (year > 1918 and (year%400 ==0 or (year%4 == 0 and year%100 != 0))):
        day-=1
    elif (year == 1918):
        day+=13
    return'{}.{:0>2}.{}'.format(day, 9 ,year)

year = int(input().strip())
result = solve(year)
print(result)
