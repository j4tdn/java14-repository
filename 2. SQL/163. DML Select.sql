USE java15_shopping;
-- 1. Toàn bộ thông tin các loại hàng
SELECT * FROM LoaiHang;
-- Mặt hàng thuộc loại hàng là 'Thắt lưng'
SELECT mh.*
	FROM MatHang mh, LoaiHang lh
    WHERE mh.MaLH = lh.MaLH
    AND lh.TenLH LIKE '%Thắt lưng%';
-- Top 5 mặt hàng có giá bán cao nhất
SELECT mh.*, ctmh.GiaBan 
	FROM MatHang mh
    JOIN ChiTietMatHang ctmh
    ON mh.MaMH = ctmh.MaMH
    ORDER BY ctmh.GiaBan DESC
    LIMIT 0, 5;
-- 2. Đơn hàng
SELECT * FROM DonHang;

/*
note:
'y-m-d' || y/m/d --> DATE
str_to_date(value, format) --> varchar  --> date
date_format(value, format) --> date     --> varchar
cast(dateTime AS DATE)     --> dateTime --> date
*/

-- Được bán trong ngày 18/12/2020
SELECT * 
	FROM DonHang dh
    WHERE cast(dh.ThoiGianDatHang AS DATE) = str_to_date('18/12/2020', '%d/%m/%y');
-- Được bán từ ngày 18/12/2020 đến ngày 05/01/2021
SELECT *
	FROM DonHang
    WHERE DATE(ThoiGianDatHang)
    BETWEEN '2020-12-18' AND '2021-01-05';
-- Được bán trong tháng 12/2020
SELECT *
	FROM DonHang
    WHERE month(ThoiGianDatHang) = 12
    AND year(ThoiGianDatHang) = 2020;
-- Được giao hàng tại Hòa Khánh
SELECT * 
	FROM DonHang
	WHERE DiaChiGiaoHang LIKE '%Hòa Khánh%';
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT ctmh.*, mh.MaLH, mh.TenMH, mh.MauSac, round(ctmh.GiaBan*0.8, 2) KhuyenMai   
	FROM ChiTietMatHang ctmh
    JOIN MatHang mh
    ON ctmh.MaMH = mh.MaMH;
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
SELECT *, cast(GiaBan*0.8 AS DECIMAL(6,2)) GiaKhuyenMai
	FROM ChiTietMatHang
	WHERE curdate() = '2022-11-09';
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT MauSac
	FROM MatHang;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 18/12/2020
SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang
	FROM DonHang dh, ChiTietDonHang ctdh, ChiTietMatHang ctmh, MatHang mh
    WHERE dh.MaDH = ctdh.MaDH
    AND ctdh.MaMH = ctmh.MaMH
    AND ctmh.MaMH = mh.MaMH
    AND date(dh.ThoiGianDatHang) = '2020-12-18';
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT mh.*, ctmh.GiaBan  
	FROM MatHang mh
    JOIN ChiTietMatHang ctmh
    ON mh.MaMH = ctmh.MaMH
    WHERE ctmh.GiaBan
    BETWEEN 100 AND 300;
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT * FROM LoaiHang;
SELECT mh.* 
	FROM MatHang mh
    JOIN LoaiHang lh
    ON mh.MaLH = lh.MaLH
    WHERE lh.TenLH LIKE '%Mũ%'
	OR lh.TenLH LIKE '%Thắt lưng%';
-- 10. Liệt kê các đơn hàng được đặt trong ngày (17/12/2020, 18/12/2020)
SELECT * 
	FROM DonHang
    WHERE date(ThoiGianDatHang) IN ('2020-12-17', '2020-12-18');
-- ==============================================================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT mh.*, ctmh.GiaBan 
	FROM MatHang mh
    JOIN ChiTietMatHang ctmh
    ON mh.MaMH = ctmh.MaMH
    ORDER BY ctmh.GiaBan ASC;
    
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT mh.*, ctmh.GiaMua 
	FROM MatHang mh
    JOIN ChiTietMatHang ctmh
    ON mh.MaMH = ctmh.MaMH
    ORDER BY ctmh.GiaMua DESC;
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
-- 14. Đếm số lượng các mặt hàng trong hệ thống
-- case1
SELECT COUNT(*) SoLuongMatHang,
	GROUP_CONCAT(TenMH SEPARATOR ', ') ChiTietMatHang
	FROM MatHang;
-- case2
SELECT SUM(SoLuong) SoLuongMatHang
	FROM ChiTietMatHang;
-- 15. Số lượng 'Giày da Nam' được bán trong ngày 18/12/2020
SELECT mh.TenMH, SUM(ctmh.SoLuong) SoLuongGiayNamBan, dh.ThoiGianDatHang
	FROM DonHang dh JOIN ChiTietDonHang ctdh
    ON dh.MaDH = ctdh.MaDH
    JOIN ChiTietMatHang ctmh
    ON ctdh.MaMH = ctmh.MaMH
    JOIN MatHang mh
    ON ctmh.MaMH = mh.MaMH
    WHERE mh.TenMH LIKE '%Giày da Nam%'
    AND DATE(dh.ThoiGianDatHang) = '2020-12-18';

-- 16. Đếm tổng(SUM)số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
SELECT lh.MaLH MaLoai, lh.TenLH, SUM(ctmh.SoLuong) SoLuong, GROUP_CONCAT(mh.TenMH SEPARATOR', ') TenCacMatHang
	FROM LoaiHang lh
    JOIN MatHang mh
    ON lh.MaLH = mh.MaLH
    JOIN ChiTietMatHang ctmh
    ON mh.MaMH = ctmh.MaMH
    GROUP BY lh.MaLH;


-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT mh.TenMH, ctmh.GiaBan
	FROM LoaiHang lh
    JOIN MatHang mh
    ON lh.MaLH = mh.MaLH
    JOIN ChiTietMatHang ctmh
    ON mh.MaMH = ctmh.MaMH
    WHERE lh.TenLH LIKE '%Giày%'
    ORDER BY ctmh.GiaBan DESC
    LIMIT 1;
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng

-- CTE --> common table expression
WITH ThongTinMatHang AS (
	SELECT mh.*, lh.TenLH, ctmh.GiaBan
		FROM LoaiHang lh
        JOIN MatHang mh
        ON mh.MaLH = lh.MaLH
        JOIN ChiTietMatHang ctmh
        ON ctmh.MaMH = mh.MaMH
),
ChiTietGiaBan AS (
SELECT MaLH, max(GiaBan) GiaBanCaoNhat
	FROM ThongTinMatHang
    GROUP BY MaLH
)
SELECT *
	FROM ThongTinMatHang ttmh
    JOIN ChiTietGiaBan ctgb
    ON ttmh.MaLH = ctgb.MaLH
    AND ttmh.GiaBan = ctgb.GiaBanCaoNhat
    GROUP BY ttmh.GiaBan;
        
-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống > 160
SELECT lh.MaLH, lh.TenLH, GROUP_CONCAT(mh.TenMH SEPARATOR', ') TenCacMatHang, SUM(ctmh.SoLuong) TongSoLuong
	FROM LoaiHang lh
    JOIN MatHang mh
    ON mh.MaLH = lh.MaLH 
    JOIN ChiTietMatHang ctmh
    ON mh.MaMH = ctmh.MaMH
    GROUP BY lh.MaLH
    HAVING TongSoLuong > 160;
    
    
    
-- Tìm những mặt hàng có số lượng lớn hơn 30
SELECT mh.*, SUM(ctmh.SoLuong) SoLuong
	FROM MatHang mh
    JOIN ChiTietMatHang ctmh
    ON mh.MaMh = ctmh.MaMH
    GROUP BY mh.MaMH
    HAVING SoLuong > 30;
 
    
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--      Điều kiện tổng số lượng > 20 mặt hàng >> HAVING

SELECT lh.MaLH, lh.TenLH, GROUP_CONCAT(mh.TenMH SEPARATOR', ') TenCacMatHang, SUM(ctmh.SoLuong) TongSoLuong
	FROM LoaiHang lh
    JOIN MatHang mh
    ON mh.MaLH = lh.MaLH
    JOIN ChiTietMatHang ctmh
    ON mh.MaMH = ctmh.MaMH
    GROUP BY lh.MaLH
    HAVING TongSoLuong > 20;

-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
WITH ThongTinSoLuongMatHang AS (
	SELECT mh.MaMH, SUM(ctmh.SoLuong) SoLuong
		FROM MatHang mh
        JOIN ChiTietMatHang ctmh
        ON ctmh.MaMH = mh.MaMH
        GROUP BY mh.MaMH
),
ChiTietSoLuong AS (
	SELECT lh.MaLH, lh.TenLH, MAX(ttslmh.SoLuong) SoLuongLonNhat
		FROM LoaiHang lh
		JOIN MatHang mh
		ON mh.MaLH = lh.MaLH
		JOIN ThongTinSoLuongMatHang ttslmh
		ON ttslmh.MaMH = mh.MaMH
		GROUP BY lh.MaLH
		HAVING MAX(ttslmh.SoLuong)
)
SELECT ctsl.MaLH, ctsl.TenLH, mh.MaMH, mh.TenMH, mh.MauSac, ttslmh.SoLuong SoLuongLonNhat
    FROM ThongTinSoLuongMatHang ttslmh
    JOIN MatHang mh
    ON ttslmh.MaMH = mh.MaMH
    JOIN ChiTietSoLuong ctsl
    ON ctsl.MaLH = mh.MaLH
    AND ttslmh.SoLuong = ctsl.SoLuongLonNhat;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
WITH ThongTinMatHang AS (
	SELECT mh.*, lh.TenLH, ctmh.GiaBan
		FROM LoaiHang lh
        JOIN MatHang mh
        ON mh.MaLH = lh.MaLH
        JOIN ChiTietMatHang ctmh
        ON ctmh.MaMH = mh.MaMH
)
SELECT MaLH, TenLH, AVG(GiaBan) GiaBanTrungBinh
	FROM ThongTinMatHang
    GROUP BY MaLH;
    
    
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại

WITH ThongTinLoaiHang AS (
	SELECT lh.* , SUM(ctmh.SoLuong) TongSoLuong
	FROM LoaiHang lh
    JOIN MatHang mh
    ON mh.MaLH = lh.MaLH
    JOIN ChiTietMatHang ctmh
    ON mh.MaMH = ctmh.MaMH
    GROUP BY lh.MaLH
    ORDER BY TongSoLuong DESC 
),
TOP_2 AS(
	SELECT *
		FROM ThongTinLoaiHang
        LIMIT 2
)
SELECT * FROM TOP_2
UNION 
SELECT ThongTinLoaiHang
WHERE TongSoLuong = (SELECT MIN(TongSoLuong) FROM TOP_2);

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100



-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11


-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019


-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199

-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- b1 creata table
CREATE TABLE LoaiHang_SaoLuu(
	MaLH INT,
    TenLH VARCHAR(255) NOT NULL,
    CONSTRAINT PK_LHSL PRIMARY KEY (MaLH)
);
SELECT * FROM LoaiHang_SaoLuu;
-- b2 copy data
INSERT INTO LoaiHang_SaoLuu(MaLH, TenLH) 
SELECT MaLH, TenLH FROM LoaiHang;

-- case orther
CREATE TABLE LoaiHang_SaoLuu02 SELECT * FROM LoaiHang;
SELECT * FROM LoaiHang_SaoLuu02;

-- 30. Liệt kê 2 sản phẩm (mặt hàng) (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- -- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- -- B2: ORDER BY SoLuongTon DESC
-- -- B3: LIMIT 2
SELECT * FROM LoaiHang;
SELECT * FROM MatHang;
SELECT -- mh.MaMH, mh.TenMH, lh.*
	COUNT(*)
    FROM LoaiHang lh
    LEFT JOIN MatHang mh
    ON lh.MaLh = mh.MaLH
	-- AND lh.MaLH IN (1,2,3,4,5,6,7,8,9,10) -- also get ! list
    WHERE lh.MaLH IN (1,2,3,4,5,6,7,8,9,10) -- not get ! list
    ORDER BY lh.MaLH;
-- --------------------------
-- result
SELECT mh.MaMH, mh.TenMH, SUM(ctmh.SoLuong) SoLuong
	FROM LoaiHang lh 
    JOIN MatHang mh
    ON lh.MaLH = mh.MaLH
    JOIN ChiTietMatHang ctmh
    ON ctmh.MaMH = mh.MaMH
    WHERE lh.TenLH LIKE '%áo%' OR lh.TenLH LIKE '%quần%'
	GROUP BY mh.MaMH
    ORDER BY SoLuong DESC, mh.MaMH ASC
    LIMIT 2;
-- --------------------------
-- WITH ThongTinSoLuongMatHang AS (
-- 	SELECT lh.*, mh.MaMH, mh.TenMH, mh.MauSac, sum(ctmh.SoLuong) SoLuongMatHang
-- 		FROM LoaiHang lh
--         JOIN MatHang mh
--         ON mh.MaLH = lh.MaLH
--         JOIN ChiTietMatHang ctmh
--         ON ctmh.MaMH = mh.MaMH
--         GROUP BY mh.MaMH
-- ),
-- ChiTietSoLuongCuaLoaiHangAoVaQuan AS (
-- 	SELECT *
-- 		FROM ThongTinSoLuongMatHang ttslmh
--         WHERE ttslmh.TenLH LIKE '%áo%' OR ttslmh.TenLH LIKE '%quần%'
--         ORDER BY ttslmh.SoLuongMatHang DESC
--         LIMIT 2
-- )
-- SELECT * FROM ChiTietSoLuongCuaLoaiHangAoVaQuan;


-- SELECT * FROM ThongTinMatHang;






-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
SELECT ctdh.MaDH,
	GROUP_CONCAT(
    CONCAT(mh.MaMH, '-',
		   TenMH, '-',
           ctmh.MaKC, '-',
           ctmh.GiaBan, '-',
           ctdh.SoLuong, '-')) ChiTietDonHang_MaMH_TenMH_MaKC_GiaBan_SoLuong,
           SUM(ctmh.GiaBan * ctdh.SoLuong) ThanhTien
	FROM ChiTietDonHang ctdh
    JOIN ChiTietMatHang ctmh
    ON ctdh.MaMH = ctmh.MaMH
    AND ctdh.MaKC = ctmh.MaKC
    JOIN MatHang mh
    ON mh.MaMH = ctdh.MaMH
    GROUP BY ctdh.MaDH;

-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--         02   TenMH:GiaBan:SoLuong     100

-- -----------
/*
INDEX ?
how to create function
*/

-- ==============================================================
-- DML - Select until group by having -- 
-- SELECT -- 
/*
Syntax:
SELECT [ALL/DITINCT] <ColumnName1>, <ColumnName2>, ...
FROM <TableName>
-- optional -- 
[WHERE <Search condition>]
[GROUP BY grouping columns]		--> đưa về dạng như map<key, value>
[HAVING search condition]		--> điều kiện sau khi gom nhóm
[ORDER BY sort specification]   --> sắp xếp
[LIMIT offset, row_count]  		--> số dòng sẽ lấy

note:
+ thứ tự hoạt động của câu lệnh
+ tối thiểu có SELECT-FROM
+ không thay đổi thứ tự các mệnh đề trong câu truy vấn
+ không phân biệt hoa thường
+ join chỉ phục vụ select để get các table ra,  không dùng join để update delete
*/

SELECT * 
	FROM LoaiHang, MatHang; 
-- CROSS JOIN --> không quan tâm hai bảng ni có quan hệ j với nhau 
SELECT mh.* 
	FROM LoaiHang lh, MatHang mh
    WHERE lh.MaLH = mh.MaLH; -- default join: inner join 
SELECT *, GiaBan*0.2 GiaKhuyenMai
	FROM ChiTietMatHang;
-- biểu thức điều kiện --
/*
Syntax:
CASE biểu_thức
WHEN biểu_thức_kiểm_tra THEN kết_quả
[...]
[ELSE kết_quả_của_else]
END
*/
-- CASE WHEN --
SELECT MaMH,
	   GiaBan,
       SoLuong,
       CASE 
	       WHEN SoLuong < 50 THEN 'Bán nhanh'
           ELSE 'Bán chậm'
	   END TinhTrang
	FROM ChiTietMatHang;
-- đếm số lượng mặt hàng trong từng loại hàng với số lượng > 1
/*
- gom nhóm các mặt hàng theo mã loại hàng
- các mặt hàng có chung mã loại hàng --> đưa về 1 nhóm --> 1 hàng
- 1 hàng Map<MaLH, List<MatHang>>
- Nên in ra thuộc tính gom nhóm và các hàm như count, sum, avg, max, min
- Nếu in ra các thuộc tính ko phải gom nhóm 
--> in ra phần tử đầu tiên trong list map.get(tt).get(0);
*/
SELECT MaLH, COUNT(MaMH) SoLuong
    FROM MatHang
    GROUP BY MaLH
    HAVING SoLuong > 1
    ORDER BY MaLH ASC;
-- In ra các loại hàng có tổng số lượng mặt hàng > 200
SELECT lh.*,
	GROUP_CONCAT(DISTINCT mh.TenMH) DanhSachMatHang,
	SUM(ctmh.SoLuong) TongSoLuong
	FROM LoaiHang lh, MatHang mh, ChiTietMatHang ctmh
    WHERE lh.MaLH = mh.MaLH
    AND mh.MaMH = ctmh.MaMH
    GROUP BY lh.MaLH
    HAVING TongSoLuong > 200;

-- count -> đếm các giá trị khác null và return về 1 dòng, nếu group by thì nó sẽ count 
-- trên từng group đó

/*
các hàm tính toán
đặc điểm:
1. nhận tên một cột -return-> một giá trị
2. hàm sum(), avg(): chỉ áp dụng cho trường kiểu số
3. hàm count(), min(), max() có thể áp dụng cho trường kiểu số và kiểu dữ liệu khác
4. chỉ có hàm count(*) thực hiện được trên giá trị null, đếm số dòng
5. mệnh đề select chứa hàm tính toán nếu có group by -> chỉ sự liệt kê thuộc tính đơn trong group by
*/
-- UNION INTERSECT(not support in mysql) --
