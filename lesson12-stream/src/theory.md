-----------Method reference-----------

	-Let you reuse existing method definitions and pass them just like lambdas. In some cares they appear more readable and feel more natural than using lambda expression
	
	-Method references can be seen as shorthand for lambdas calling only a specific method .The basic idea is that if a lambda represents "call this method directly", it's best to refer to the method by name rather than by description of how to call it.
	
	-Indeed, a method reference lets you create a lambda expression from an existing method implementation.
	
	--> khi nào ta gặp dạng:
	Class c -> c.getProperty(); --> Class::getProperty
	Function<T, R>

-----------------------------------------
	Các functional interface có sẵn trong java 
	
	Predicate: boolean nameMethod(T)
	Function: R apply(T)
-----------------------------------------

	+ method reference --> từ cái class hay là từ cái đối tượng mình về cái thuộc tính
	
	+ constructor reference --> từ nhiều or 1 thuộc tính mình đưa ra cái đối tượng


-----------Constructor reference-----------
	
	-You can create a reference to an existing constructor using its name and the keyword new as follows: ClassName::new. It works similarly to a reference to a static method

------------------Stream------------------
	
	-Stream: là một cấu trúc dữ liệu cho phép lưu trữ tập hợp các phần tử. Ngoài việc lưu trữ ra thì trong Stream hỗ trợ cho ta rất nhiều phương thức để mình xử lý bài toán nhanh hơn.
	
	-Stream sinh ra để giúp mình code java mà idea giống như code database
	
	-Sequence of elements: like a collection, a stream provides an interface to a sequenced set of values of a specific element type. Because collections are data structures, they're mostly about sorting and accessing elements with specific time/space complexities (for example, an ArrayList vs a LinkedList)
	
	-But streams are about expressing computations such as filter, sorted and map that you saw earlier. Collections are about data; Streams are about computations. We explain this idea in greater detail in the coming sections.

	--? Trả lời cho câu hỏi vì sao sau khi xử lý xong trong stream ta không lưu data ở stream mà lại chuyển về dạng collection
	--> Vì những dữ liệu trong stream mình chỉ xem 1 lần duy nhất rồi thôi (you cannot re-watch)

---------------------------------------------
	+ intermediate operations (ex: filter, map, limit) such as filter or sorted return another stream as the return type. This allows the operations to be connected to form a query. What's important is that intermediate operations don't perform any processing until a terminal operation is invoked on the stream pipeline--they're lazy. This is because intermediate operations can usually be merged and processed into a single pass by the terminal operation.
	
	+ terminal operations: collect

----------------------Finding&Matching----------------------

	   - allMatch: whether all the elements of the stream match the given predicate
	    
	   - anyMatch: whether is there an element in the stream matching the given predicate
		
	   - noneMatch: ensures that no elements in the stream match the given predicate
	   
	   - findFirst: returns the first element of the current stream, combine with filter, map ...
	   
	   - findAny: returns an arbitrary element of the current stream, combine with filter ...
   
----------------------Reducing----------------------

	- So far, the terminal operations you’ve seen return a boolean (allMatch and so on), void
	(forEach), int (count) or an Optional object (findAny and so on). You’ve also been using collect to
	combine all elements in a stream into a List.
	
	- In this section, you’ll see how you can combine elements of a stream to express more
	complicated queries such as “Calculate the sum of all calories in the menu,” or “What is the
	highest calorie dish in the menu?” using the reduce operation




