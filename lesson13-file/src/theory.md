file chia làm hai loại:
	+ Text-Readable
	+ Serializable-Unreadable
	
	
File operation:

String getName
String getPath
String getAbsolutePath (đường dẫn tuyệt đối)
String getCanonicalPath
String getParent
boolean renameTo[newName]
long lastModified
long length
boolean delete
boolean exists
boolean canWrite
boolean canRead


--------------------------------------------------

Note: 
	+ Trong generic type không có từ khóa implement dù là nó là interface hay class thì đều dùng từ khóa extends
	+ Iterable là một interface, cha của tất cả các cấu trúc dữ liệu trong collection


	
--------------------------------------------------
	
- InputStream -> Java application uses an input stream to read data from a source, it may be a file, an array, peripheral device or socket.

- OutputStream -> Java application uses an output stream to write data into a destination, it may be a file, an array, peripheral device or socket 	
	
	
transient -> non save
	
	