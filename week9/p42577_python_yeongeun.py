# 전화번호 목록

def solution(phone_book):
    
    phone = sorted(phone_book)
    for i in range(1,len(phone)):
        if phone[i-1] == phone[i][0:len(phone[i-1])]:
            return False
    
    return True
