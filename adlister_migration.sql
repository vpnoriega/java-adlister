USE adlister_db;
DROP TABLE IF EXISTS users;
CREATE TABLE users (
                        id int UNSIGNED NOT NULL AUTO_INCREMENT,
                        username VARCHAR(100) NOT NULL,
                        email VARCHAR(100) NOT NULL,
                        password VARCHAR(100)NOT NULL,
                        PRIMARY KEY (id)
);

DROP TABLE IF EXISTS ads;
CREATE TABLE ads (
                        id int UNSIGNED NOT NULL AUTO_INCREMENT,
                        user_id VARCHAR(100) NOT NULL,
                        title VARCHAR(100) NOT NULL,
                        description VARCHAR(100)NOT NULL,
                        PRIMARY KEY (id),
                        FOREIGN KEY(user_id) references users (id)
);