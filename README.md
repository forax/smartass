SmartAss
========

The goal of SmartAss is to be easily understandable so you can teach it yourself.
To achieve that goal SmartAss has a handful of concepts.

  * SmartAss is methodical as opposed to functional, every block of code
    is a method (with no name), most of the construction of the language are method calls.
 
  * Every syntax construction is an expression.
  
  * Variables are dynamically typed *and* locally scoped.
  
  * All values are objects.
  
  * Guarantee that the entropy of the behaviors can only grow (but not side effect free)
    
  
  
How to install it ?
---
SmartAss is hosted on GitHub, so a git clone will do the job
```
git clone git@github.com:forax/smartass.git
```

How to build it ?
---
just run the stupid ant script
```
ant
```
Note that it requires Java 8

How to run it ?
---
Let suppose you have written your script in a file myscript.sms
```
java -jar smartass.jar myscript.sms
```

Where is the manual ?
---
there is a [reference guide](/doc/guide.md) in the doc folder.

FAQ
---
 * I try to run the following script and it doesn't work
   ```
   print(1 + 2)
   ```
   
   That's normal, don't panic, by default, smartass comes with
   a very limited environment, if you want the default environment
   you have to load it using the method require() 
   ```
   require('samples/core.sms')
   
   print(1 + 2)
   ```
   
 * Where is formal grammar of SmartAss ?
 
   The [executable grammar](/grammar/smartass.ebnf) is defined
   using a custom extended BNF format in the grammar folder.
   
