# Write your MySQL query statement below
select s.student_id, student_name, su.subject_name,ifnull(count(Examinations.subject_name),0) as attended_exams  from Students s
cross join Subjects su
left join Examinations on s.student_id=Examinations.student_id and su.subject_name=Examinations.subject_name
group by s.student_id, s.student_name, su.subject_name
order by s.student_id;