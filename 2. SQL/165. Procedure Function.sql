-- Procedure -> return void
-- Function -> return data

-- when will we create fuction/procedure

-- Procedure exam 
-- 1. Viết chương trình liệt kê các mặt hàng
DELIMITER $$
CREATE PROCEDURE P_GET_ITEMS()
BEGIN
	SELECT * FROM MatHang;
END $$
DELIMITER ;

CALL P_GET_ITEMS();

-- 2. Viết chương trình liệt kê các mặt hàng theo loại hàng
DELIMITER $$
CREATE PROCEDURE P_GET_ITEMS_BY_ITEM_GROUP(p_itemGroupId INT)
BEGIN
	SELECT * FROM MatHang
    WHERE MaLH = p_itemGroupId;
END $$
DELIMITER ;

CALL P_GET_ITEMS_BY_ITEM_GROUP(1);

-- 3. Viết phương thức thêm N dòng dữ liệu cho bảng loại hàng

DELIMITER $$
CREATE PROCEDURE P_INSERT_ITEM_GROUP(N_ROWS INT)
	BEGIN
        -- Tìm mã loại hàng lớn nhất (mới nhất)
        DECLARE MAX_IG_ID INT DEFAULT (SELECT MAX(MaLH) FROM LoaiHang);
        DECLARE RUNNING INT DEFAULT 1;
        
        WHILE RUNNING <= N_ROWS DO
			SET MAX_IG_ID = MAX_IG_ID + 1;
			INSERT INTO LoaiHang(MaLH, TenLH)
				VALUES(MAX_IG_ID, CONCAT('Loại Hàng ', MAX_IG_ID));
                SET RUNNING = RUNNING + 1;
		END WHILE;
    END $$
DELIMITER ;
CALL P_INSERT_ITEM_GROUP(3);
SELECT * FROM LoaiHang ORDER BY MaLH DESC;
-- 4. Viết phương thức liệt kê các phần tử chẵn nhỏ hơn N
DROP PROCEDURE P_LIST_EVEN_NUMBERS;
DELIMITER $$
	CREATE PROCEDURE P_LIST_EVEN_NUMBERS(N INT)
		BEGIN
			DECLARE RESULT TEXT DEFAULT '';
			Loop_label: LOOP 
				IF N <= 0 THEN
					LEAVE Loop_label;
                END IF;
                
                IF N MOD 2 = 0 THEN
					SET RESULT = CONCAT(RESULT, N ,' ');
                    SET N = N -2;
                ELSE 
					SET N = N -1;
                END IF;
            END LOOP;
            SELECT RESULT;
		END $$
DELIMITER ;

CALL P_LIST_EVEN_NUMBERS(15);
-- Function exam 
-- 1. Tính tổng các phần tử chẵn nhỏ hơn N