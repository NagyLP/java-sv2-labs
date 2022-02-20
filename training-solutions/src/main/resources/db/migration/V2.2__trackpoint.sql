create TABLE track_point(
id BIGINT,
tp_time DATE,
lat DOUBLE,
lon DOUBLE,
FOREIGN KEY (id) REFERENCES activities(id)
);