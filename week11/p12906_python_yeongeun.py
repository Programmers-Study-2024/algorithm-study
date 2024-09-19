# 같은 숫자는 싫어

def solution(arr):
    answer = []
    for i in arr:
        # 마지막 값이 현재값과 같으면 무시
        if answer and answer[-1] == i: continue
        answer.append(i)
    return answer
