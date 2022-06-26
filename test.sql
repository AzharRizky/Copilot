/* Build some test data */
CREATE TABLE test (id INTEGER PRIMARY KEY, name TEXT, value REAL);
INSERT INTO test (name, value) VALUES ('sample', 123.45);
INSERT INTO test (name, value) VALUES ('another', 678.90);
INSERT INTO test (name, value) VALUES ('last', 1234.56);
INSERT INTO test (name, value) VALUES ('last', 5678.90);

/* Select all rows from the test table */
SELECT * FROM test;