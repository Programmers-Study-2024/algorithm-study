select c.user_id, b.nickname,c.TOTAL_SALES
from (
    select distinct(user_id), sum(PRICE) as TOTAL_SALES
    from (
        select * 
        from USED_GOODS_BOARD 
        where STATUS = 'DONE'
        ) a, USED_GOODS_USER b
    where a.WRITER_ID = b.USER_ID
    group by USER_ID ) c, USED_GOODS_USER b
where c.USER_ID = b.USER_ID
  and total_sales >= '700000'
order by TOTAL_SALES asc