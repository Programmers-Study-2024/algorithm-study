# 카펫

import math
def solution(brown, yellow):
    answer = []
    by= brown + yellow
    
    for h in range (3, int(math.sqrt(by))+1) : 
        w= int(by/h);
        if((w-2)*(h-2)==yellow):
            return [w,h]
    
