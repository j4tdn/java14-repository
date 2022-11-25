USE java15_shopping;
-- INSERT/DELETE/UPDATE--
/*
+ khi mình chạy các lệnh INSERT/DELETE/UPDATE thì nó sẽ có
hai quá trình: COMMIT và ROLLBACK
+ default: setAutoCommit(true) : khi run thì tự động hắn ăn vào database
+ setAutoCommit(false):
-> Affect: COMMIT
-> Unaffect: ROLLBACK
*/
INSERT INTO LoaiHang(MaLH, TenLH)
VALUES(1,'Loại hàng 01'),
	(2,'Loại hàng 02');
INSERT INTO MatHang(MaMH, TenMH, MauSac, MaLH)
VALUES(101, 'Mặt hàng 101', 'Xanh', 1),
	(102, 'Mặt hàng 102', 'Đỏ', 1),
    (103, 'Mặt hàng 103', 'Tím', 2),
    (104, 'Mặt hàng 104', 'Vàng', 2);
-- disable foreign key 
SET FOREIGN_KEY_CHECKS = 0;
-- enable foreign key
-- -> checks for next commands, ignore check for existed data
SET FOREIGN_KEY_CHECKS = 1;
-- TODO: delete elements from MatHang has FK not existed in LoaiHang
INSERT INTO MatHang(MaMH, TenMH, MauSac, MaLH)
VALUES(105, 'Mặt hàng 101', 'Xanh', 3);

-- Oracle support: merge into -> khi INSERT trùng PK thì nó sẽ báo lỗi

-- một cách INSERT khác:
-- CTE: common table expression
INSERT INTO LoaiHang(MaLH, TenLH)
WITH temp_data AS (
SELECT 3 ItemGroupID, 'Loại hàng 03' ItemGroupName
UNION
SELECT 4, 'Loại hàng 04'
)
SELECT * FROM temp_data;

INSERT INTO LoaiHang(MaLH, TenLH)
SELECT 5, 'Loại hàng 05';

-- default: khi delete all thì tool workbench nó không cho
-- vì đang trong trạng thái xóa an toàn
-- Edit-Preferences-SQL Editor-Safe Updates --> uncheck

-- DELETE --
-- set auto commit = false; -> có thể ROLLBACK data

DELETE FROM MatHang;
-- ROLLBACK; -- startTransaction --> endTransaction

/*
+ khi mình xóa ở bảng cha có PK mà PK đó đang dùng ở bảng con thì hắn sẽ 
có những trường hợp xảy ra như sau:
--> there are three types of on delete associated with foreign key:

	+ On Delete Cascade: when data is removed from a parent table, automatically
    data deleted from child table (foreign key table).
    
    + On Delete set Null: when data is removed from a parent table, the
    foreign key assoiated cell will be null in a child table.
    
    + On Delete Restrict: when data is removed from a parent table, and
    there is a foreign key assoiated with child table it gives error,
    you can not delete the record. --> Foreign Key Options: On Update: NO ACTION | On Delete: NO ACTION
*/
-- > hiểu đơn giản là khi mình xóa một hàng ở bảng cha mà tồn tại bảng con đang tham chiếu 
-- tới thì nó sẽ bị lỗi.

DELETE FROM MatHang WHERE MaMH = 101;
DELETE FROM LoaiHang WHERE MaLH = 1;

/*đầu tiên xóa FK đó vào tạo lại FK mới có tên như cũ và set lại các thuộc tính*/
ALTER TABLE MatHang
DROP FOREIGN KEY FK_MatHang_LoaiHang;
ALTER TABLE MatHang
ADD CONSTRAINT FK_MatHang_LoaiHang FOREIGN KEY(MaLH) REFERENCES LoaiHang(MaLH)
ON DELETE RESTRICT
ON UPDATE RESTRICT;
-- trước khi tạo ràng buộc thì nó sẽ kiểm tra xem dữ liệu có bị lỗi ko

-- TODO: delete elements from MatHang has FK not existed in LoaiHang
-- INSERT vào table MatHang mà có MaLH không tồn tại trong bảng LoaiHang

SET FOREIGN_KEY_CHECKS = 0;
SET FOREIGN_KEY_CHECKS = 1;
INSERT INTO MatHang(MaMH, TenMH, MauSac, MaLH)
VALUES(106, 'Mặt hàng 106', 'Xanh', 99);

-- remove items which have ig_id not exists in item_group table

SELECT MaLH FROM LoaiHang; -- 2 3 4 5 
SELECT MaLH FROM MatHang; -- 2 3 99

DELETE FROM MatHang
WHERE MaLH NOT IN (SELECT MaLH FROM LoaiHang);
-- clause not (1000 parameters)
-- > sub query
DELETE FROM MatHang
WHERE NOT EXISTS (SELECT MaLH FROM LoaiHang
						WHERE MatHang.MaLH = LoaiHang.MaLH);

-- thứ tự chạy
-- 1. FROM
-- 2. WHERE
-- 3. GROUP BY
-- 4. HAVING
-- 5. ORDER BY
-- 6. LIMIT
-- 7. SELECT
SELECT * FROM MatHang;
SELECT * FROM LoaiHang;

-- EXERCISE SQL - DML - Select until group by having -- 
-- ======================= REFRESH DATA =======================
-- run shopping refresh data.sql
-- B. DELETE
-- 1. Xóa nhân viên có tên 'Văn Hoàng' trong hệ thống
DELETE FROM NhanVien 
WHERE TenNV LIKE '%Văn Hoàng';
-- 2. Xóa chức vụ kiểm toán trong hệ thống
INSERT INTO ChucVu(MaCV, TenCV)
VALUES(4, 'Bộ phận kiểm toán');
-- = --> equals (chính xác)
-- startsWith --> LIKE 'value%'
-- endsWith   --> LIKE '%value'
-- contains   --> LIKE '%value%'
DELETE FROM ChucVu WHERE TenCV LIKE '%kiểm toán%';
-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
SELECT * FROM LoaiHang;
SELECT * FROM MatHang;
DELETE FROM MatHang 
WHERE MaLH IN (SELECT MaLH 
				FROM LoaiHang 
				WHERE TenLH LIKE '%mũ%'); -- > set On Delete: CASCADE để xóa bay luôn bên child table
-- 4. Xóa tất cả các mặt hàng trong hệ thống
-- > tắt chế độ xóa an toàn 
-- > Edit-Preferences-SQL Editor-Safe Updates --> uncheck
-- DELETE FROM MatHang;
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi
SELECT * FROM DonHang -- 2020-12-18 16:33:20
WHERE cast(ThoiGianDatHang AS DATE) = str_to_date('18/12/2020', '%d/%m/%y');
-- default format yyyy-mm-dd
-- khi để định dạng ngày tháng năm bằng với default format thì nó tự động convert sang
-- SELECT cast(current_timestamp() AS DATE); -- 2022-11-08

-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
-- 2. Cập nhật ghi chú của đơn hàng 02 thành 'Giao hàng sau 10H sáng'
UPDATE DonHang
	SET GhiChu = 'Giao hàng sau 10H sáng'
    WHERE MaDH = 02;
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--    thực hiện cập nhật trạng thái đơn hàng
SELECT * FROM ChiTietTinhTrangDonHang
	WHERE MaDH = 1;
SELECT * FROM TinhTrangDonHang;
INSERT INTO ChiTietTinhTrangDonHang(MaDH, MaTT, MaNV, ThoiGian)
VALUES(1, 4, 1, current_timestamp());
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
SELECT * FROM HoaDon;
UPDATE HoaDon
	SET SoTienCanThanhToan = 890
    WHERE MaDH = 01;
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Áo' với giá bán là 199K
SELECT * FROM ChiTietMatHang;
SELECT * FROM MatHang;
UPDATE ChiTietMatHang ctmh
	SET ctmh.GiaBan = 555
    WHERE EXISTS (SELECT * 
					FROM MatHang mh
                    WHERE mh.MaMH = ctmh.MaMH
                    AND EXISTS (SELECT * 
								FROM LoaiHang lh
                                WHERE lh.TenLH LIKE '%áo%'
                                AND lh.MaLH = mh.MaLH));
