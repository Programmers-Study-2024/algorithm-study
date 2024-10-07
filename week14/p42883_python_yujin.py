# 큰 수 만들기

def solution(number, k):
    # 스택
    answer = []
    
    for num in number:
        if not answer:
            answer.append(num)
            continue

        if k > 0:
            while answer[-1] < num:
                answer.pop()
                k -= 1
                if not answer or k <= 0:
                    break
        answer.append(num)
        
    answer = answer[:-k] if k > 0 else answer
    return ''.join(answer)
