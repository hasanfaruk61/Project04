
-- Category Table
CREATE TABLE IF NOT EXISTS Categories (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL UNIQUE
);

-- Product Table
CREATE TABLE IF NOT EXISTS Products (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255),
                         category VARCHAR(255),
                         photo_url VARCHAR(255),
                         description TEXT,
                         price DECIMAL(10, 2),
                         FOREIGN KEY (category) REFERENCES Categories(name)
);