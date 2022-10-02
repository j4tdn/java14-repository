Lamda (anonymous function) là một cách viết code ngắn gọn để tạo ra 1 đối tượng của một Functional Interface thay vì new Interface và override abstract method

Syntax:

(parameters) -> {
}

Khi các hàm giống nhau về code nhưng chỉ khác ở chỗ điều kiện thì ta có thể sử dụng strategy pattern 

------------------------------------------------------------
Câu hỏi phỏng vấn: 
.Ta có thể thêm hoặc xóa 1 phần tử trong mảng được không?
-> Không, vì số lượng phần tử cố định
-> Nếu muốn thêm thì ta tạo một mảng mới và copy phần tử cũ qua mảng mới đồng thời thêm phần tử mới vào. Tương tự cho xóa.

.Nếu như trong JAVA không hỗ trợ một số cấu trúc dữ liệu mà nó giúp mình thêm, sửa, xóa thoải mái. Yêu cầu tự define ra các cấu trúc dữ liệu đó...?

------------------------------------------------------------

Thêm 1 phần tử mới vào mảng:
B1: Create a new array with size = preSize + 1
B2: Copy all elements from preArray to newArray
B3: Shift right ONE UNIT from k = index to length - 1
B4: Assign new element into index k = index

từ java8+ thì trong interface thì môt hàm có thể có thân hàm khi ta thêm từ khóa default hoặc static, đến java9 thì có thêm private


