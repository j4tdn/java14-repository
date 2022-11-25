-- 1. Tạo cơ sở dữ liệu java11_shopping_manually
CREATE DATABASE java14_shopping_manually CHAR SET utf8mb4;
USE java14_shopping_manually;
-- 2. Tạo table MatHang, LoaiHang
CREATE TABLE LoaiHang(
	MaLH INT PRIMARY KEY,
    TenLH VARCHAR(200) NOT NULL
);
CREATE TABLE MatHang(
	MaMH INT,
    TenMH VARCHAR(200) NOT NULL,
    MauSac VARCHAR(50) NOT NULL,
    MaLH INT,
    CONSTRAINT PK_MH PRIMARY KEY (MaMH),
    CONSTRAINT FK_MH_LH FOREIGN KEY (MaLH) REFERENCES LoaiHang(MaLH)
);
-- 3. Tạo ràng buộc PK, FK cho 2 tables trên
-- Done
-- 4. Thêm column NgayTao kiểu DATE vào table LoaiHang
ALTER TABLE LoaiHang ADD NgayTao DATE DEFAULT(curdate()); 
-- 5. Thay đổi tên tên column NgayTao thành DATE_CREATED trong bảng LoaiHang
-- và đổi tên tên column DATE_CREATED thành NgayTao
ALTER TABLE LoaiHang
RENAME COLUMN NgayTao TO DATE_CREATED;
-- ALTER TABLE LoaiHang CHANGE DATE_CREATED NgayTao DATE;
-- 6. Tạo table DonHang, MatHang
CREATE TABLE DonHang(
	MaDH INT,
	MaKH INT, 
	DiaChiGiaoHang TEXT,
	SDTNguoiNhan VARCHAR(20),
	MaLoaiHinhThanhToan INT,
    ThoiGianDatHang DATETIME,
	PhiVanChuyen DOUBLE,
	TongTien DOUBLE,
	MaNhanVienQuanLy INT,
    CONSTRAINT PK_DH PRIMARY KEY (MaDH)
);
-- 7. Tạo table ChiTietDonHang
CREATE TABLE ChiTietDonHang(
	MaDH INT,
    MaMH INT,
    SoLuong INT,
    CONSTRAINT PK_CTDH PRIMARY KEY (MaDH, MaMH)
    -- CONSTRAINT FK_CTDH_DH FOREIGN KEY (MaDH) REFERENCES DonHang(MaDH),
    -- CONSTRAINT FK_CTDH_MH FOREIGN KEY (MaMH) REFERENCES MatHang(MaMH)
);
-- 8. Tạo ràng buộc PK, FK trong bảng ChiTietDonHang
ALTER TABLE ChiTietDonHang ADD 
CONSTRAINT FK_CTDH_DH FOREIGN KEY (MaDH) REFERENCES DonHang(MaDH);
ALTER TABLE ChiTietDonHang ADD 
CONSTRAINT FK_CTDH_MH FOREIGN KEY (MaMH) REFERENCES MatHang(MaMH);
-- 9. Xóa column DATE_CREATED trong table LoaiHang
ALTER TABLE LoaiHang DROP COLUMN DATE_CREATED;
-- 10. Truncate table


-- update ---
