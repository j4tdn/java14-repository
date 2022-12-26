persistence: những đối tượng liên quan đến việc mapping lưu trữ đối tượng trong java với sql

createStatement() -> don't pass sql parameter // -> executeQuery(sql) // --------------------------------------- // prepareStatement(sql) // -> set parameter

--> SQL Injection --> URL/UI --> SQL(SQL clause) --> Tiêm/truyền 1 câu lệnh SQL --> để thực hiện một tác vụ nào đó

VD: Đăng nhập: + ipUsername = a --> a' OR '1=1 + ipPassword = b --> SELECT * FROM user WHERE username = 'a' OR '1=1' AND password = 'b'

Cause --> JDBC --> Statement --> parameter as String Fix --> PrepareStatement

OOP: --> HAS-A --> Item has an ItemGroup VD: class Item { int id; ItemGroup ig; } --> IS-A (cái ni lúc runtime có thể là cái kia) VD: List is an ArrayList List is a LinkedList Shape is a Square
ORM: Object Relational Mapping CLASS --> TABLE DTO --> load from tables --> convert lines to DTO for using in service or UI transformer --> chuyển những rawData thành những dữ liệu cần lấy về

BATCH UPDATE: --> Được sử dụng trong trường hợp cần INSERT hoặc UPDATE dữ liệu có số lượng lớn

TRANSACTION MANAGEMENT: --> Khi thực hiện tương tác cơ sở dữ liệu --> INSERT/UPDATE/DELETE. Nếu mình có một tập các hành động/câu truy vấn khác nhau thì mình muốn đảm bảo khi thực hiện N thao tác thì:
1. Khi tất cả các thao tác được thực hiên thành công --> commit dữ liệu vào database
2. Khi tồn tại 1 trong N thao tác bị lỗi --> dữ liệu sẽ được rollback về trước khi mình thực hiên N truy vấn

VD: Điển hình về giao dịch của các tài khoản ngân hàng. Bạn cần chuyển 10$ từ một tài
khoản này sang tài khoản kia. Bạn thực hiện bằng các trừ 10$ từ tài khoản đầu tiên và 
thêm 10$ vào tài khoản thứ hai. Nếu quá trình này không thành công sau khi trừ 10$
từ tài khoản ngân hàng đầu tiên, 10$ sẽ không bao giờ được thêm vào tài khoản ngân
hàng thứ hai. Số tiền bị mất sẽ đi vào "secret space" 
-- --------------------------
Hibernate/JPA --> ALL operations(except Batch Update)
JDBC --> Batch Update








