## C-I-M-S
 商品信息管理系统（JAVA+MYSQL）  
 Commodity Information Management System（JAVA+MYSQL） 
 
## 数据库设计 【DATADASE DESIGN】
### Ⅰ．全局E-R图的设计【Design Of Global E-R Graph】
<img src="https://github.com/JaneAY0518/C-I-M-S/blob/master/%E5%8F%AA%E8%83%BD%E7%BB%88%E7%AB%AF%E5%AE%9E%E7%8E%B0%E7%89%88(JAVA%2BMYSQL)/picture/Design%20Of%20Global%20E-R%20Graph.png" width="500" height="500">  

### Ⅱ．表设计【Design Of Table】  
#### 1.商品信息表【Goods Information Table】 
##### （一）商品信息表的逻辑结构设计【Logical Structure Design Of Commodity Information Table】 
<img src="https://github.com/JaneAY0518/C-I-M-S/blob/master/%E5%8F%AA%E8%83%BD%E7%BB%88%E7%AB%AF%E5%AE%9E%E7%8E%B0%E7%89%88(JAVA%2BMYSQL)/picture/Goods%20Information%20Table.png" width="500" height="300">   

##### （二）商品信息表的SQL语句【SQL Statement Of Commodity Information Table】
```SQL
CREATE TABLE Goods(
 Goods_id INT PRIMARY KEY auto_increment,
 Goods_barcode VARCHAR(20) NOT NULL ,
 Goods_name NVARCHAR(20) NOT NULL ,
 Production_place NVARCHAR(30) NOT NULL
);  
```
#### 2.客人信息表【Client Information Table】
##### （一）客人信息表的逻辑结构设计【Logical Structure Design Of Client Information Table】
<img src="https://github.com/JaneAY0518/C-I-M-S/blob/master/%E5%8F%AA%E8%83%BD%E7%BB%88%E7%AB%AF%E5%AE%9E%E7%8E%B0%E7%89%88(JAVA%2BMYSQL)/picture/Client%20Information%20Table.png" width="500" height="300">   

##### （二）客人信息表的SQL语句【SQL Statement Of Client Information Table】
```SQL
CREATE TABLE Client(
	Client_id INT PRIMARY KEY auto_increment,
	Client_name VARCHAR(20) NOT NULL ,
	Mobile CHAR(20) NOT NULL UNIQUE ,
	Address NVARCHAR(30) NOT NULL,
	Email VARCHAR(30) CHECK(Email='%@%.%')
);
```
#### 3.进货信息表【Purchase Information Table】
##### （一）进货信息表的逻辑结构设计【Logical Structure Design Of Purchase Information Table】
<img src="https://github.com/JaneAY0518/C-I-M-S/blob/master/%E5%8F%AA%E8%83%BD%E7%BB%88%E7%AB%AF%E5%AE%9E%E7%8E%B0%E7%89%88(JAVA%2BMYSQL)/picture/Purchase%20Information%20Table.png" width="500" height="600">  

##### （二）进货信息表的SQL语句【SQL Statement Of Purchase Information Table】
```SQL
CREATE TABLE Purchase(
	Purchase_id INT PRIMARY KEY auto_increment,
	Goods_id INT NOT NULL,
	Purchase_price DECIMAL(6,2) NOT NULL CHECK(Purchase_price>=0) ,
	Purchase_num INT NOT NULL CHECK(Purchase_num>=0),
	Purchase_money DECIMAL(8,2) CHECK(Purchase_money>=0),
	Purchase_date DATETIME NOT NULL,
	CONSTRAINT fk_purchase_goods FOREIGN KEY(Goods_id) REFERENCES Goods(Goods_id)
); 
```
#### 4.销售信息表【Sale Information Table】
##### （一）销售信息表的逻辑结构设计【Logical Structure Design Of Sale Information Table】
<img src="https://github.com/JaneAY0518/C-I-M-S/blob/master/%E5%8F%AA%E8%83%BD%E7%BB%88%E7%AB%AF%E5%AE%9E%E7%8E%B0%E7%89%88(JAVA%2BMYSQL)/picture/Sale%20Information%20Table.png" width="500" height="300">  

##### （二）销售信息表的SQL语句【SQL Statement Of Sale Information Table】
```SQL
CREATE TABLE Sale(
	Sale_id INT PRIMARY KEY auto_increment,
	Goods_id INT NOT NULL,
	Client_id INT NOT NULL,
	Sale_price DECIMAL(6,2) NOT NULL CHECK(Sale_price>=0) ,
	Sale_num INT NOT NULL CHECK(Sale_num>=0),
	Sale_sum DECIMAL(8,2) CHECK(Sale_sum>=0),
	Sale_date DATETIME NOT NULL,
	CONSTRAINT fk_sale_goods FOREIGN KEY(Goods_id) REFERENCES Goods(Goods_id),
	CONSTRAINT fk_sale_client FOREIGN KEY(Client_id) REFERENCES Client(Client_id)
); 
```
#### 4.库存信息表【Stock Information Table】
##### （一）库存信息表的逻辑结构设计【Logical Structure Design Of Stock Information Table】
<img src="https://github.com/JaneAY0518/C-I-M-S/blob/master/%E5%8F%AA%E8%83%BD%E7%BB%88%E7%AB%AF%E5%AE%9E%E7%8E%B0%E7%89%88(JAVA%2BMYSQL)/picture/Stock%20Information%20Table.png" width="500" height="100">  

##### （二）库存信息表的SQL语句【SQL Statement Of Stock Information Table】
```SQL
CREATE TABLE Stock(
	Goods_id INT NOT NULL,
	Stock_num INT NOT NULL CHECK(Stock_num >=0),
	CONSTRAINT fk_stock_goods FOREIGN KEY(Goods_id) REFERENCES Goods(Goods_id)
); 
```