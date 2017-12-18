Implementation for Ratpack issue 1302 https://github.com/ratpack/ratpack/issues/1302
-----------------------------

Steps:
1. Start project with `gradle run`
2. Go to http://localhost:5050/

You should see something like:
```
Assertion failed: 

assert !it.contains(null)
       ||  |
       ||  true
       |[5, 7, 3, 6, 2, 8, 9, 10, 12, 11, 14, 15, 16, 13, 21, 20, 18, 22, 24, 25, 26, 28, 27, 30, 31, 29, 33, 36, 34, 38, 41, 42, 43, 46, 48, 45, 49, 50, null, null, null, null]
       false
```
