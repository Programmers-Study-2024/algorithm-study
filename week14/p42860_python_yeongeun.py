# 조이스틱

def solution(name):
    answer = 0
    cursor_move = len(name) -1
    
    for i,spell in enumerate(name):
        answer += min(ord(spell)-ord('A'), ord('Z')-ord(spell)+1)
        next = i+1
        
        while next < len(name) and name[next] == 'A':
            next += 1
            
        # A가 나올때까지 이동했다가
        # 다시 반대방향으로 이동 / 연속된 A의 오른쪽부터 시작

        cursor_move = min([cursor_move, i*2+len(name)-next, i+2*(len(name)-next)])
    answer += cursor_move
    return answer
