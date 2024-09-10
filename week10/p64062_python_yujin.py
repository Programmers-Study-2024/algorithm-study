# 징검다리 건너기

def solution(stones, k):
    start,end = 1, max(stones)
    while start <= end:
        cnt=0
        mid=(start+end)//2
      
        for stone in stones :
            # 0이하라 건널 수 없는 경우
            if(stone-mid) <= 0:
                cnt+=1
              
                # cnt >= k : mid 만큼 건널 수 없음. 
                if cnt >= k :
                    # end = mid -1 갱신하고 다시
                    end=mid-1
                    break
            # 건널 수 있는 경우 나오면 초기화
            else : 
                cnt=0  
              
        # mid명이 모두 건널 수 있는 경우
        else : 
            # start = mid + 1 로 갱신
            start=mid+1
          
    return start
