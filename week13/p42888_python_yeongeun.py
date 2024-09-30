# 오픈채팅방

def solution(record):
    answer = []
    
    # 가장 마지막 값으로 업데이트
    dic = {}
    for r in record:
        a = r.split()
        if a[0] == "Enter" or a[0] == "Change":
            dic[a[1]] = a[2]
            
    # enter, leave 명령어 처리
    for r in record:
        a = r.split()
        if a[0] == "Enter":
            answer.append(dic[a[1]] + "님이 들어왔습니다.")
        elif a[0] == "Leave":
            answer.append(dic[a[1]]+"님이 나갔습니다.")

    return answer
