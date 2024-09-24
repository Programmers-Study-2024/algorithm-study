# 오픈채팅방

def solution(record):
    answer = []
    user_id={}
    
    # 마지막 user_id
    for i in record:
        i_split = i.split()
        if len(i_split) ==3 :
            user_id[i_split[1]]=i_split[2]
    
    for i in record:
        i_split = i.split()
        if i_split[0]=='Enter':
            answer.append(f'{user_id[i_split[1]]}님이 들어왔습니다.')
        elif i_split[0]=='Leave':
            answer.append(f'{user_id[i_split[1]]}님이 나갔습니다.')
    
    return answer
