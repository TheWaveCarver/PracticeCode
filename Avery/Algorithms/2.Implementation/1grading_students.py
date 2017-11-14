#!/bin/python3

import sys

def solve(grades):
    for i in range(len(grades)):
        grade = grades[i]
        if(grade > 35 and grade%5 >= 3):
            grades[i] = int(grade/5)*5+5
    return grades
    

n = int(input().strip())
grades = []
grades_i = 0
for grades_i in range(n):
    grades_t = int(input().strip())
    grades.append(grades_t)
result = solve(grades)
print ("\n".join(map(str, result)))