----SCHEMEMANIPULATION.SQL

--sql not case sensitive except in quotes but all caps it convention
SELECT * FROM album;
SELECT * FROM ALBUM;

/*
DATATYPES IN ORACLE SQL:
    NUMBER, VARCHAR, VARCHAR2, DATE, TIMESTAMP, BLOB, CLOB, and more...
    
CONSTRAINTS: RESTRICTIONS ON DATA THAT CAN BE ENTERED INTO A COLUMN
    NOT NULL - ensures that the record has a value in this column
    UNIQUE - ensures that there are no duplicates in this column
    PRIMARY KEY - represents the official identifier for the record
                -combination of UNIQUE and NOT NULL
    FOREIGN KEY - reference pointer to another table's record
    CHECK - creates an additional custom condition for the column

    --example syntax for PK: PRIMARY KEY (refKey from THIS table)
    --example syntax for FK: FOREIGN KEY (reference_attribute_from_this_table)
                                REFERENCES other_table (PK_from_other_table)
    --example syntax for CHECK: CONSTRAINT constraint_name CHECK (column_name > 15);
        (some datables have DEFAULT constraint)
*/

--DDL: CREATE a table
CREATE TABLE pokemon(
    pokemon_id NUMBER(15) PRIMARY KEY
    , pokemon_name VARCHAR2(100) --100 is size
    , pokemon_type VARCHAR2(25) -- 25 is size
);

SELECT *FROM pokemon;
--looking at a table's records
DESC pokemon;
--look at a table's structure and datatypes (can also use describe)

--DDL: DROP a table
DROP TABLE pokemon;

--DDL: ALTER a table
ALTER TABLE pokemon ADD pokemon_secondtype VARCHAR2(25);

--DDL: TRUNCATE
/*
truncate empties table with no rollback
while drop gets rid of table and contents but can rollback
*/

--NOW TIME FOR DATA MANIPULATION
--DML: SELECT
SELECT * FROM pokemon;

--DML: INSERT
INSERT INTO pokemon VALUES(1, 'bulbasaur,', 'grass', 'ice');
INSERT INTO pokemon VALUES(7, 'squirtle,', 'water', 'null');
INSERT INTO pokemon VALUES(121, 'starmie,', 'water', 'psychic');
INSERT INTO pokemon VALUES(129, 'magikarp,', 'water', 'null');
INSERT INTO pokemon(pokemon_name, pokemon_id, pokemon_type)
    VALUES ('mewtwo', 150, 'psychic');

--DML: UPDATE
UPDATE pokemon SET pokemon_secondtype = 'poison' WHERE pokemon_id = 1;

--DML: DELETE
--DELETE FROM pokemon; --STAY AWAY FROM THIS
DELETE FROM pokemon WHERE pokemon_id = 129;


COMMIT;
ROLLBACK; -- CANNOT ROLLBACK AFTER COMMIT
