- strings with the same content share storage in a single pool to minimize creating a copy of the same value. That is to say, once a String is generated, its content cannot be changed and hence changing content will lead to the creation of a new String

- For example, database username, password are passed as String to get database connection and in socket programming host and port details passed as String. Since String is immutable, its value can't be changed otherwise any hacker could change the referenced value to cause security issues in the application.

- String pool is possible because String is immutable in Java.
(String pool is a storage space in the Java heap memory where string literals are stored. It is also known as String Constant Pool or String Intern Pool. It is privately maintained by the Java String class. By default, the String pool is empty)