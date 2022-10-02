List là một interface chứa tập hợp các đối tượng có thể lưu trữ các giá trị trùng nhau

Cho phép lưu trữ tập hợp phần tử với dynamic size

List interface được thực thi bởi ArrayList, LinkedList, Vector, Stack

-------------------------ARRAYLIST-------------------------
(Bản chất là một mảng động)

-Lớp thực thi từ interface List

-Sử dụng bản chất của cấu trúc dữ liệu mảng với số lượng phần tử có thể thay đổi được

-Không bắt buộc khai báo trước số lượng phần tử như mảng

-Có thể khai báo trước sức chứa (opacity) cho lần khởi tạo mảng đầu tiên của ArrayList

-Phương thức size, isEmpty, get, set, iterator được thực thi với thời gian cố định O(1)

-Phương thức add, remove sẽ phụ thuộc vào vị trí xử lý. Cách hoạt động tương tự với mảng. 
-Và sẽ có sự nhanh, chậm hơn khi so sánh cấu trúc dữ liệu LinkedList

-------------------------LINKEDLIST-------------------------
 

-Là lớp thực thi của interface list

-Sử dụng cấu trúc danh sách liên kết đôi để lưu trữ các phần tử

-Thực thi từ List và Deque hỗ trợ truy cập phần tử từ 2 đầu của danh sách

-Các phương thức xử lý hầu hết tương tự với ArrayList

-Tốc độ xử lý các phương thức get, set, add, remove khác với ArrayList vì code base bên trong ArrayList(sử dụng mảng) và LinkedList(sử dụng danh sách liên kết đôi)

Câu trả lời SAI: Insertions and Removals in LinkedList are faster than ArrayList. Because, You don't need resize LinkedList after each insertions and removals

--> Độ nhanh chậm của add, remove trong LinkedList khi so sánh với ArrayList là phụ thuộc vào vị trí của phần tử đó mà việc duyệt hay dịch chuyển sẽ mất thời gian hơn 

--> Get, Set trong ArrayList sẽ nhanh hơn LinkedList vì với ArrayList là index base

------------------------------------------------------------
nếu cần lưu trữ danh sách các mặt hàng thì ta nên sử dụng ArrayList <và đa số trong thực tế cũng xử dụng ArrayList>

-------------------------GENERIC TYPE-------------------------

-Xuất hiện từ phiên bản Java1.5

-Là kiểu dữ liệu đối tượng đại diện cho các class, interface, method chung có thể được tham số hóa cho hầu hết các dữ liệu đối tượng.

-Tương tự Object và nhiều tiện ích khác.

-Hỗ trợ compile-time type safety, cho phép bắt lỗi invalid type tại compile time.

-Giải quyết vấn đề: chúng ta có thể viết một phương pháp sắp xếp, tìm độ dài mảng...Phương thức này có thể sắp xếp, tìm độ dài các phần tử của một mảng Integer, String, Employee hoặc bất kỳ kiểu dữ liệu gì hỗ trợ sắp xếp.

Generic Topics

-Generic Method, Class, Interface

-Generic Type

-Generic Bounded Type Parameters

-Generics, Inheritance and sub types

-Generics Wildcards

-Generic Method -> Method có tham số(parameter) vào là Generic Type

-Generic Class -> Class có tham số(parameter) vào là Generic Type

-------------------------GENERIC WILDCARD-------------------------

-Trong generic-question mark (?) được gọi là wildcard( kí tự đại diện) thể hiện một unknown type. Một wildcard có thể sử dụng ở nhiều tình huống khác nhau.

-Wildcard có thể là parameter, field, local variable, a return type

-Wildcard không bao giờ được sử dụng khi đứng một mình-giúp gọi và truyền tham số unknow type

-List<T>=List<?>=List<Object>
	Ex: void show(List<? super Integer>list)

- Các trường hợp lỗi:
	void show(? list)
	?A = 10
	public class List<?>
	
-------------------------MAP AND IMPLEMENTATION CLASSES-------------------------
Ex: khi mình lưu các từ vựng trong một từ điển
-->khi nào mình cần lưu cấu trúc dữ liệu có dạng key-value để dễ dàng tìm kiếm thì nên sử dụng map

-------------------------SET AND IMPLEMENTATION CLASSES-------------------------

- Trong cái list thì cần phải override hàm equals còn trong map thì cần phải override cả hai hàm equal và hash 

- Trong set mỗi phần tử là một đối tượng và các đối tượng này không được trùng nhau
- Sử dụng cơ chế mã băm giống như key của collection map
---------------------------------------------------------------------------------
Technique-Hashcode-Equals
-Mặc định: 
	+Equals: so sánh địa chỉ hai đối tượng
	+Hashcode: Địa chỉ của đối tượng
-Override:
	+Equals: so sánh đối tượng theo giá trị các thuộc tính mong muốn
	+Hashcode: Dãy số: là kết quả sau khi hashing giá trị của các thuộc tính, không còn là địa chỉ
-Yêu cầu:
	+Các thuộc tính trong equals và hashcode phải giống nhau
	+Nếu hai đối tượng equals với nhau thì hashcode sẽ bằng nhau

 



