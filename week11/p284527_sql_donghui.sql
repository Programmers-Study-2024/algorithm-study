select (select sum(score) from HR_GRADE group by EMP_NO order by sum(score) desc limit 1) as 'SCORE',em.EMP_NO,em.EMP_NAME,em.POSITION,em.EMAIL
from HR_EMPLOYEES em join HR_DEPARTMENT de
on em.DEPT_ID = de.DEPT_ID
where em.EMP_NO = (select emp_no from HR_GRADE group by EMP_NO
    order by sum (score) desc limit 1);