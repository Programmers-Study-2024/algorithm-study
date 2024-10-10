# 조이스틱

def solution(name):
    spell_move = 0
    cursor_move = len(name) -1
    
    for i,spell in enumerate(name):
        spell_move += min(ord(spell)-ord('A'), ord('Z')-ord(spell)+1)
        next = i+1
        while next < len(name) and name[next] == 'A':
            next += 1
            
        # 왼쪽에서 오른쪽으로만 이동 / A가 나올때까지 이동했다가 다시 반대방향으로 이동

        cursor_move = min(cursor_move, i*2 + len(name)-next)
        
    return spell_move + cursor_move
