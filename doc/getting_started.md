SmartAss Reference Guide
========


 
 
 * Literals
   SmartAss literals are mapped to their Java equivalent,
   you can also note that there is no primitive in SmartAss,
   everything is an Object
 
   ```
   print(true)              // Boolean
   print(false)             // Boolean
   print(2)                 // Integer
   print(3.14)              // Double
   print(10000000000)       // Long
   print(10000000000000000000000000000)  // BigInteger
   print('Hello SmartAss')  // String
   ```
   
 * if, while, return and throw
   As a concession to practicality, SmartAss provide these 4 constructs
   that you will find in most imperative languages.
   Using them is not require.
   
   There are two forms of if, the if with 2 branches,
   ```
   a = if(b == 3: 4: 7)
   ```
   and the if with only one branch that will be evaluated only
   if the condition is true, otherwise the result will be null.  
   ```
   a = 7
   if(b == 3:
     a = 3
   )
   ```
     
   The condition (here b == 3) can be any expression, evaluated to null, false
   or 0 it will be considered as false, any other values will be considered as true.
   
   The syntax of while loop is similar to the if syntax 
   ```
   i = 0
   while(i < 10:
     script.print(i)
     i = i + 1
   )
   ```
   and like if a while loop returns a value
   ```
   a = while(b == 3: b = 3)
   ```
   In the example above, if b = 0 before calling the code, the value
   of a is 3, if b = 3 then the value of a is null.
   
   'throw' and 'return' can be used to stop the control flow,
   ```
   if(a==3:
     return 2
   )
   ```
   or
   ```
   if(a==3:
     throw 2
   )
   ```
   
   'return' must be followed by an expression and 'throw' is able to throw
   any value indicating an unrecoverable error (there is no way to catch
   an exception in SmartAss).
    
   
 * Symbols
   In fact, a text between quotes (') is not always a String literal
   and you can create a String literal without using quotes. 
   SmartAss has the concept of symbol, a symbol is a sequence of characters
   that can be a local variable, a Klass literal or a String literal.
   
   By example, in the following code the symbol a denote a local variable
   ```
   a = 3
   print(a)   // prints 3
   ```
   while in this code the symbol a denote a String
   ```
   print(a)   // print a
   ```
   because there is not declaration of a local variable 'a' in the current
   environment.
   
   Another example, in the following code
   ```
     result = sum(3, 4)
   ```
   sum() is a method call with sum a String literal and
   ```
     lambda = (a, b: a + b)
     sum = lambda
     result = sum(3, 7)
   ```
   is a lambda call with sum a local variable.
   
   A symbol can also denote a Klass literal, that can be used to create
   an instance of a class. In the following code, Book is a String in the
   first line and a Klass in the 4th line.
   ```
   class(Book | author, title:
   )
   
   book = Book('Dan Brown', 'Da Vinci Code')
   ```
   
   This little trick allows to unify a method call, a lambda call and
   an instance creation using the same syntax.
   
   
   
 * Object oriented
   SmartAss is object oriented, so you can create a class, add methods
   to that class, create instances of that class, call methods on
   instance, obviously polymorphism works (also named virtual call
   or late binding) but there is no mechanism
   for doing inheritance or mixins by default
   (mostly because you can implement them yourself). 
   
   A class is defined by using the method named 'class' defined
   inside the class Script. By example, the following code creates
   a class Book with two fields author and name, 
   ```
   class(Book | author, title:
     // code
   )
   ```
   
   A class is represented by an instance of the class named Klass,
   a call to that class allows to instantiate an objet of that class
   ```
   b = Book('Dan Brown', 'Da Vinci Code')
   ```
   
   The lambda taken as parameter of the method class is called
   with the newly created class as receiver so
   the class object can be accessed using the keyword this
   ```
   script = this
   class(Book | author, title:
     script.print(this.getName())   // print Book
   )                                // the name of the class Book
   ```
   
   The parameter author (resp. title) contains a method that
   will return the value of the corresponding field
   
   A method is defined using the method 'def' defined in class Klass,
   by example, to get the author of a Book, one can write
   ```
   class(Book | author, title:
     def(giveMeYourAuthor:
       author()
     )
   )
   b = Book('Dan Brown', 'Da Vinci Code')
   b.giveMeYourAuthor()  // Dan Brown
   ```
   
   Like in Ruby, instead of using the parameter, it's possible
   to use the syntax @field.
   The following code does the same thing but in a more idiomatic way
   ```
   class(Book | author, title:
     def(author: @author )
   )
   b = Book('Dan Brown', 'Da Vinci Code')
   b.author()  // Dan Brown
   ```
   

   Like in Ruby, you can re-open any classes at your will,
   so the following code is valid
   ```
   class(Book | author, title:
     def(author: @author )
   )
   class(Book:                  // re-open the class Book
     def(title: @title )
   )
   ```
   But unlike in Ruby you can not add new fields when
   a class is re-opened (having the fields defined once
   forever allows to avoid to change the layout of all
   instances a runtime which is a performance hog
   because it requires a full GC). 
   
   A java class can be re-open too.
   By example, you can add a method '+' to java.lang.String
   ```
   class('java.lang.String':
     def('+' | other:
       this.concat(other)
     )
   )
   print(foo + bar)  // foobar
   ```


 * Lambdas
   In SmartAss, everything is an expression, there is no declaration,
   so SmartAss use the mechanism of lambda to represent a delayed
   computation. 
   
   By example, the following code represent an anonymous function
   (usually called a lambda) that prints its first argument
   ```
   p = (x: print(x))
   p(hello)
   ```
   
   In SmartAss, the class creation is in fact just a method call with a lambda.
   By example, the definition of the class Book
   ```
   class(Book | author, title:
   )
   ```
   can be re-written as a method call on the current script object
   with the symbol Book. The code above is just a shortcut for this code
   ```
   this.class('Book', (author, title:
   ))
   ```
   
   A lambda can also reference value of variable defined in the outer environment,
   so by example the local variable 'script' can be used inside the lambda body.  
   ```
   script = this
   p = (x: script.print(x))
   p(hello)
   ```
   
   A variable defined in the outer environment can not be changed inside the lambda,
   because the runtime copy the value of the variable when the lambda is created.
   By example
   ```
   x = 3
   l = (: x = 4)
   print(x)  // prints 3 
   ```
   
   And by the way, there is no function in SmartAss, only methods,
   so a lambda has always a hidden parameter 'this' and can always
   be called using the method call syntax
   ```
   script = this
   p = (: script.print(this))
   hello.p()
   ```
 
 
 * One expression to rule them all
   
   In SmartAss, everything is an expression and
   apart literal, local variable, if, while,
   return and throw, everything else is just
   a shortcut for a method call.
   
   ```
   a + b
   ```
   is transformed to
   ```
   a.'+'(b)
   ```
   
   ```
   foo(2, 3)
   ```
   is transformed to
   ```
   this.foo(2, 3)
   ```

   ```
   star = (text: '*' + text + '*')
   star(text)
   ```
   is transformed to
   ```
   star = (text: '*' + text + '*')
   this.star(text)
   ```
   
   and even a field access can be seen as a method call
   ```
   class(Point | x, y:
     def(x: @x)
   )
   Point(1, 2).x()  // 1
   ```
   is more or less equivalent to
   ```
   class(Point | x, y:
     oldx = x
     def(x: oldx())
   )
   Point(1, 2).x()  // 1
   ```
 
 
 
 
 * Java interoperability

   TODO
   