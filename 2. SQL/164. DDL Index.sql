USE java15_shopping;

/*
INDEX (giống như chỉ mục)
- Được sử dụng để tăng tốc độ tìm kiếm trong database
- Được sử dụng hiệu quả khi mà tìm tất cả các dòng khi mà matching một số column trong query
  và khi đó nó chỉ đi qua những subset đó thôi và nó sẽ tìm chính xác những thứ cần matches
  thay vì phải duyệt qua toàn bộ table.
- Khi mk đánh index cho một column thì nó sẽ tạo ra những chỉ mục cho những dữ liệu trong 
  column đó.
- Trong một table khi ta đánh khóa chính cho column nào thì colum đó sẽ tự đánh index.
- Điều này dẫn đến cho chi phí inserts, updates and deletes cũng đc tăng lên làm tốn memory
  , thường thì chỉ đánh index cho column là primary key or foreign key và các column đc sử dụng tìm kiếm rất 
  nhiều
*/

-- execution(explain) plan --> show detail(memory data timing) sql running statement
-- lượng filtered cần thấp thì câu lệnh đó chưa tốt

SELECT * FROM MatHang WHERE MaMH = 1;
EXPLAIN SELECT * FROM MatHang WHERE TenMH LIKE "%Áo sơ mi%";
-- Syntax
ALTER TABLE MatHang ADD INDEX IDX_TenMH(TenMH);

ALTER TABLE MatHang DROP INDEX IDX_TenMH;
