# 2016년

def solution(a, b):
    days = ['THU','FRI','SAT','SUN','MON','TUE','WED']
    months = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    day=0
    for i in range(a-1):
        day+=months[i]
    day+=b
    
    return days[day%7]
