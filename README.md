# Repo demostrating issue with HKT usage in java

The code in this repo compiles fine as it is currently. But if we comment out 

```
compileOrder := CompileOrder.ScalaThenJava
```

in `build.sbt`, it fails with the following error:

```
[error] 3 |class JavaContainerWrap implements Wrap<JavaContainer> {
[error]   |                                        ^^^^^^^^^^^^^
[error]   |Type argument scalac.issues.JavaContainer[?] does not have the same kind as its bound [_$1]
[error] one error found
```
