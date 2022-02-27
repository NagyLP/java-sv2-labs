alter table actor_to_movies
add CONSTRAINT UNIQUE (`actor`, `movies`);