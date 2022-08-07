Phân loại String 
+ Immutable (bất biến) thường xuất hiện với những kiểu dữ liệu có sẵn của java (integer, double, ..). Không thể thay đổi được giá trị của ô nhớ ở heap
    . String literal
		ex: String s1 = "hello";
		{với những giá trị trùng nhau thì sẽ được lưu trữ trong cùng một ô nhớ}
	. String object
		ex: String s2 = new String("hello");
		{luôn khởi tạo mới đối tượng}

+ Mutable (thay đổi được)
	. StringBuilder
	. StringBuffer
	
Khi có từ khóa final trước một biến (stack) thì không thể gán biến đó bằng giá trị khác

So sánh chuỗi

+ Tham chiếu (So sánh địa chỉ - ít khi được sử dụng)
	. sử dụng toán tử ==
----------------
Nội dung
	. CompareTo: sắp xếp theo alphabe
	. Equals: so sánh nội dung của chuỗi xem thử bằng or khác nhau hay không
	
	
-------------------
String with split method
có hai instances của split() method trong java string 

String split(String regex)

String split(String regex, int limit)

