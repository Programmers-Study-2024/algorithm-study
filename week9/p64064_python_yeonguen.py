# 불량 사용자

from itertools import permutations

# banned_id 조건과 같은 지 확인
def check(users,banned_id):
    for i in range(len(banned_id)):
        if len(users[i]) != len(banned_id[i]):
            return False
        for j in range(len(users[i])):
            if banned_id[i][j] == "*": # 무시
                continue
            if banned_id[i][j] != users[i][j]: # 다르면 바로 return
                return False
    return True

def solution(user_id,banned_id):
    # 가능한 모든 경우
    user_permutations = list(permutations(user_id, len(banned_id)))
    ban_set = []
    
    for users in user_permutations:
        if not check(users,banned_id):
            continue
        else: # 조건 만족시
            users = set(users) # 중복제거
            if users not in ban_set:
                ban_set.append(users)
    return len(ban_set)
