# JPMSTest

Can we depend the same Java module on the different versions of a library under the Java Platform Module System?

My answer is __yes__, if the different versions can be wrappered in defferent modules.

This demonstration shows how to use both 
[apache commons math](https://commons.apache.org/proper/commons-math/) 2 and 3
in another Java module [mymath](https://github.com/walterxie/JPMSTest/blob/main/mymath/src/module-info.java).

Run `mydistr.MixVersion`, then 

```text
Using math3 ...
Calling math3 density(0.9) ...
math3 Density =  0.2660852498987548
Using math2 ...
Calling math2 density(0.9) ...
math2 Density = 0.2660852498987548
```


