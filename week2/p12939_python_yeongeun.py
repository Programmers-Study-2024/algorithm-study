# 최댓값과 최솟값

def solution(s):
    a = list(map(int,s.split(' ')))
    answer = str(min(a)) + " " + str(max(a))

    return answer
