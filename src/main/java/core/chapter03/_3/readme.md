# MessageCodesResolver
## DefaultMessageCodesResolver
1. 如果需要使用errors中的errorCode，可以结合MessageSource取出错误信息时
2. 但是Spring不仅仅将代码中的errorCode注册到容器中，还注册了一些相关的错误码，具体取决于MessageCodesResolver的实现
默认实现是DefaultMessageCodesResolver
3. 举例：对于rejectValue("age", "too.darn.old")来说
注册了3个错误码
3.1 too.darn.old
3.2 too.darn.old.age
3.3 too.darn.old.age.int

