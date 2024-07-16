# 정수 제곱근 방법

import numpy as np

def solution(n):
    m = np.sqrt(n)
    if m > 0 and int(m) == m:
        answer = (m+1)**2
    else:
        answer = -1

    return answer
