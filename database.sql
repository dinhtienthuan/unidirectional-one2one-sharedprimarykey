DROP TABLE IF EXISTS person CASCADE;
CREATE TABLE person (
  id SERIAL NOT NULL PRIMARY KEY,
  name TEXT NOT NULL
);

DROP TABLE IF EXISTS address;
CREATE TABLE address (
  id INTEGER NOT NULL PRIMARY KEY REFERENCES person(id),
  city TEXT NOT NULL
);

INSERT INTO person(name) values('Thuan');
INSERT INTO person(name) values('Huy');
INSERT INTO person(name) values('Vu');
INSERT INTO person(name) values('Quyen');

INSERT INTO address(id, city) values(1, 'Da Nang');
INSERT INTO address(id, city) values(2, 'Tam Ky');
INSERT INTO address(id, city) values(3, 'Quang Binh');
INSERT INTO address(id, city) values(4, 'Quang Ngai');