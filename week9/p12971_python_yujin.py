# 스티커 모으기(2)

def solution(sticker):

    if len(sticker)==1 :
        return sticker.pop()
    
    dp1=[0]*len(sticker)
    dp2=[0]*len(sticker)
    
    # dp1 : 0번째 떼기
    dp1[0]=sticker[0]
    dp1[1]=dp1[0]
    
    for i in range(2,len(sticker)-1) :
        dp1[i]=max(dp1[i-1],dp1[i-2]+sticker[i])
    
    #print(dp1)
    
    # dp1 : 0번째 안떼기
    dp2[0]=0
    dp2[1]=sticker[1]
    
    for i in range(2,len(sticker)) :
        dp2[i]=max(dp2[i-1],dp2[i-2]+sticker[i])
        
    #print(dp2)
    
    return max(max(dp1),max(dp2))
