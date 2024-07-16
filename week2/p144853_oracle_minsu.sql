SELECT BOOK_ID,to_char(PUBLISHED_DATE,'yyyy-mm-dd')
from book
where category = '인문'
  and to_char(published_date,'yyyy') = '2021'
order by PUBLISHED_DATE asc