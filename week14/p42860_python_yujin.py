# 조이스틱

def solution(name):
    answer = 0
    
    # 알파벳 최소값
    for i in name:
        answer += min(ord(i)-ord('A'), ord('Z')-ord(i)+1)
        
    # 이동 최솟값
    min_move = len(name) - 1
    for i in range(len(name)):
        # 연속된 A 문자열
        next = i 
        while next < len(name) and name[next] == 'A':
            next += 1
          
        left=(0 if i==0 else i-1)
        right=len(name)-next
        min_move=min(min_move,left+right+min(left,right))
        
    return answer+min_move
