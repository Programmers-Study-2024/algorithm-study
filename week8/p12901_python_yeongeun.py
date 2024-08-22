# 2016년

def solution(a, b):
    # 월별 일수 (윤년이라 2월 29일)
    day = [31,29,31,30,31,30,31,31,30,31,30,31]
    idx = 0 # 총일수
    
    # 금토일월화수목
    # 1 2 3 4 5 6 7 # 7로 나눴을때 나머지값
    
    for i in range(a-1): # 5월이면 4월까지 모든일수 더하기
        idx += day[i]
    idx += b # 해당 월의 일자까지 더하기
    
    mon = ['FRI','SAT','SUN','MON','TUE','WED','THU']
    answer = mon[idx%7-1]
    
    return answer
