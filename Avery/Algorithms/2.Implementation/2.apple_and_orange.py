#!/bin/python3

import sys


s,t = input().strip().split(' ')
s,t = [int(s),int(t)]
a,b = input().strip().split(' ')
a,b = [int(a),int(b)]
m,n = input().strip().split(' ')
m,n = [int(m),int(n)]
apples = [int(apple_temp) for apple_temp in input().strip().split(' ')]
oranges = [int(orange_temp) for orange_temp in input().strip().split(' ')]

apple_hits  = 0
orange_hits = 0
for apple in apples:
    if (apple+a >= s and apple+a <= t):
        apple_hits+=1
for orange in oranges:
    if (orange+b >= s and orange+b <= t):
        orange_hits+=1
print('{}\n{}'.format(apple_hits, orange_hits))
