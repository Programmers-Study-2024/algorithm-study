# 전화번호 목록

def solution(phone_book):
    # 어떤 번호가 다른 번호의 접두어인 경우 있으면, False
    phone = sorted(phone_book)
    for i in range(1,len(phone)):
        if phone[i-1] == phone[i][:len(phone[i-1])]:
            return False
    
    return True
