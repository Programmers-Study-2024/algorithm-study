select p.PRODUCT_CODE, p.PRICE * SUM(o.SALES_AMOUNT) as 'SALES'
from PRODUCT p
         join OFFLINE_SALE o on p.PRODUCT_ID = o.PRODUCT_ID
group by o.PRODUCT_ID
order by SALES desc, p.PRODUCT_CODE;