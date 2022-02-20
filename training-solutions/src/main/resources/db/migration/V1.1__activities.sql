create TABLE activities(
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
start_time DATETIME,
description VARCHAR(250),
activity_type VARCHAR(10)
);