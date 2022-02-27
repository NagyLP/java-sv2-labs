CREATE TABLE track_points(
id BIGINT,
tp_time DATE,
lat DOUBLE,
lon DOUBLE,
activity_id BIGINT,
FOREIGN KEY (activity_id) REFERENCES activities(id)
);