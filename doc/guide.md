SmartAss Reference Guide
========


 
 
 * Literals
 
   SmartAss literals are mapped to their Java equivalent,
   you can also note that there is no primitive in SmartAss,
   everything is an Object
 
   ```
   null              // Void
   true              // Boolean
   false             // Boolean
   2                 // Integer
   3.14              // Double
   10000000000       // Long
   10000000000000000000000000000  // BigInteger
   "foo"             // String    
   'foo              // a symbol (a Klass or a String depending on the context)
   [1, 2, 3]         // List
   { "a": "b" }      // Map
   ```
   
   
 * Block of code and semicolon
 
   A block of code is a suite of expressions.
   The value of a block of code is the value of the last expression.
   
   Expressions are either separated by a end of line or by a semicolon,
   so the two codes below are equivalent
   ```
   b = 3
   print(b)
   ```
   ```
   b = 3; print(b)
   ```
   
   To make the grammar regular, an end of line is always considered
   as a separator of expressions if the text before the end of line
   is a valid expression.
   
   By example, for
   ```
   2
   + 3
   ```
   the result value is 3 (the last expression of the block)
   and not 5 because for the end of line after '2', '2' is
   a valid expression.
   
   And for
   ```
   2 +
   3
   ```
   the result value is 5 because 2 + is not a valid expression.
   
   
 * Local variable and Symbols
   
   A local variable exists from the first time the variable is assigned
   to the last time the local variable is read.
   ```
   a = 2      // a is created
   b = a      // b is created then a is destroyed
   print(b)   // then b is destroyed
   ```
   
   If a local variable is read without being assigned,
   SmartAss will try to consider the name as a symbol i.e.
   a reference to a Klass.
   By example, the code below
   ```
   print(a)   // a is not a valid symbol or a local variable
   ```
   will produce an error at the execution.
   
   If there is a Klass in the context with the same name,
   the class will be used, by example
   ```
   alias('java.lang.Integer, 'Int)
   print(Int)  // Int is not a valid local variable but it's a Klass name
   ```
   
   In case of a call of a method, if the name is neither a local variable
   nor a Klass name, it will be considered as a String.
   By example, in
   ```
   result = sum(3, 4)
   ```
   sum is a String.
   
   If there is a local variable in the current scope,
   it will be preferred to a symbol, thus the following
   code will calculate 3 + 7
   ```
   sum = (a, b: a + b)   // defined an anonymous method with two parameters 'a' and 'b'
   result = sum(3, 7)
   ```
   
   So the rule is, if there is a name, check first if it's a local variable,
   then if it's a Klass and when it can be a method name, considere that
   this is a String.
   
   
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
   
   A lambda can also reference value of variable defined in the outer environment,
   so by example the local variable 'script' can be used inside the lambda body.  
   ```
   script = this
   p = (x: script.print(x))
   p("hello")
   ```
   The first line may be weird, a simple explanation is that 'this' represent
   the current script, if you want the whole explanation,
   see the section about object orientation below.
   
   A variable defined in the outer environment can *not* be changed inside the lambda,
   because the runtime copy the value of the variable when the lambda is created.
   By example
   ```
   x = 3
   l = (: x = 4)
   print(x)  // prints 3 
   ```
   
   By default, you can not define a function in SmartAss, by the default environment
   (core.sms) adds a way to define something close to a function
   ```
   require("samples/core.sms")   // load core.sms niceties
   
   def('bestValue:
     42
   )
   print(bestValue())    // print 42
   ```
   
   the call to def use a shortcut syntax for this call
   ```
   def('bestValue, (:
     42
   ))
   ```
   so the interpreter will call 'def with the String 'destValue and a lambda
   that when called will return the value 42. 'def will associate the name
   'bestValue to the Function object corresponding to the lambda (: 42).
   
   At that point, you may think that SmartAss is a functional language,
   but it's not, SmartAss is a methodical language, all functions
   are in fact methods, i.e. are defined on a class, in our case,
   def which is a method of the class Script.
   
   so when writing the code above, the interpreter understands this code
   ```
   script.def('bestValue, (:
     42
   ))
   script.print(script.bestValue())    // print 42
   ```
   
   
   
 * Object Oriented
 
   SmartAss is object oriented, so you can create a class, add methods
   to that class, create instances of that class, call methods on
   instance, obviously polymorphism works (also named virtual call
   or late binding) but there is no mechanism
   for doing inheritance or mixins by default
   (mostly because you can implement something like that yourself). 
   
   A class is defined by using the method named 'class' defined
   inside the class Script. By example, the following code creates
   a class Book with two fields author and name, 
   ```
   class('Book, {'author, 'title}:
     // code
   )
   ```
   
   A class is represented by an instance of the class named Klass,
   a call to that class allows to instantiate an object of that class
   ```
   b = Book("Dan Brown", "Da Vinci Code")
   ```
   
   A method is defined using the method 'def' defined in class Klass.
   Like in Ruby, the syntax to access to a fied inside a class is @field.
   By example, to get the author of a Book, one can write
   ```
   class('Book, {'author, 'title}:
     def('author: @author )
   )
   b = Book("Dan Brown", "Da Vinci Code")
   b.author()  // Dan Brown
   ```
   
   Like in Ruby, you can re-open any classes at your will,
   so the following code is valid
   ```
   class('Book, {'author, 'title}:
     def('author: @author )
   )
   class('Book, {}:                // re-open the class Book
     def('str: @author.concat(" ").concat(@title))
   )
   ```
   But unlike in Ruby you can not add new fields when
   a class is re-opened (having the fields defined once
   forever allows to avoid to change the layout of all
   instances a runtime which is a performance hog
   because it requires a full GC). 
   
   A Java class can be re-open too,
   by example, you can add a method '+' to java.lang.String
   ```
   class('java.lang.String, {}:
     def('+ | other:
       this.concat(other)
     )
   )
   class('Book, {}:                // re-open the class Book
     def('str: @author + " ") + @title))
   )
   ```
   
   In SmartAss, the class creation is in fact just a method call with a lambda.
   By example, the definition of the class Book
   ```
   class(`Book, {'author, 'title}:
   )
   ```
   can be re-written as a method call on the current script object
   with the symbol Book. The code above is just a shortcut for this code
   ```
   this.class('Book, {'author, 'title}, (:
   ))
   ```
   
   Inside the lambda body, it's possible to execute any expression, not only call
   'def. By example to print the name of 'this' ('this' being the newly created Klass).
   ```
   script = this
   class('Book, {'author, 'title}:
     def('author: @author )
     
     script.print(this.getName())   
   )
   b = Book("Dan Brown", "Da Vinci Code")
   b.author()  // print Book (the name of the klass) and returns "Dan Brown"
   b.author()  // returns "Dan Brown"
   ```
   
   The evaluation of the initializer of a class, in fact the initializers
   because you can have more than one if you re-open a class,
   is not executed when the class is defined but the first time
   a method of the class is executed.
   This trick allows to defined a lot of classes but
   only pay for the ones used.
   
   SmartAss is methodical, not functional, so every call is a method call,
   even a call a lambda. By example this code
   ```
   script = this
   def('printIf | list, filter:
     list.stream().forEach(element:
       if(filter(element): print(element))
     )
   )
   printIf([0, 1, 2, 3, 4] | x: x % 3 == 0)
   ```
   can be rewritten to
   ```
   script = this
   def('printIf | list, filter:
     list.stream().forEach(element:
       if(element.filter(): print(element))
     )
   )
   printIf([0, 1, 2, 3, 4]: this % 3 == 0)
   ```
   Here, filter is called as a method call i.e. element.filter() and not
   filter(element), so the element is sent as 'this' inside the lambda,
   hence the code of the lambda is (:this % 3 == 0) and not
   (x: x % 3 == 0)
   
 
 * One expression to rule them all
   
   In SmartAss, almost everything is a method call or a shortcut to a method call.
   
   ```
   a + b
   ```
   is transformed to
   ```
   a.'+(b)
   ```
   
   ```
   foo(2, 3)
   ```
   is transformed to
   ```
   this.'foo(2, 3)
   ```

   ```
   star = (text: '*' + text + '*')
   star(text)
   ```
   is transformed to
   ```
   star = (text: '*' + text + '*')
   this.'star(text)
   ```

   

  * if, while, return and throw
 
   As a concession to practicality, SmartAss provide these 4 constructs
   that you will find in most imperative languages.
   Using them is obviously not require.
   
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
     print(i)
     i = i + 1
   )
   ```
   and like if a while loop returns a value
   ```
   a = while(b == 3: b = 3)
   ```
   In the example above, if b = 0 before calling the code, the value
   of a is 3, if b = 3 then the value of a is null.
   
   While the syntax of 'if' (or 'while') and a method call is
   very similar, the blocks defined inside an 'if' or a 'while' are
   not lambda thus share the same environment.
   So a block inside an 'if' can modify the variables declared
   before the 'if'. 
   
   'throw' and 'return' can be used to stop the control flow,
   ```
   if(a == 3:
     return 2
   )
   ```
   or
   ```
   if(a == 3:
     throw 2
   )
   ```
   
   'return' must be followed by an expression and 'throw' is able to throw
   any value indicating an unrecoverable error (there is no way to catch
   an exception in SmartAss).
    
 
 * Java interoperability

   TODO
   