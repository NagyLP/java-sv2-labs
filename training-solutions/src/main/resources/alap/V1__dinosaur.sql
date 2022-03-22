create table dinosaur (
breed VARCHAR(255) PRIMARY KEY,
expected INT,
actual INT
);
insert into dinosaur (breed, expected, actual) values ('Tyrannosaurus Rex', 2, 2);
insert into dinosaur (breed, expected, actual) values ('Stegosaurus', 4, 4);
insert into dinosaur (breed, expected, actual) values ('Maiasaurus', 21, 22);
insert into dinosaur (breed, expected, actual) values ('Hypsilophodontida', 33, 34);
insert into dinosaur (breed, expected, actual) values ('Velociraptor', 8, 37);