use mysql;
create schema if not exists activitytracker default character set utf8 collate utf8_hungarian_ci;

create user 'activitytracker'@'localhost' identified by 'activitytracker';
grant all on *.* to 'activitytracker'@'localhost';