# Android MVC 和MVP

#### MVC
经过写了一下简单的MVC的框架。对MVC有了简单的理解，其实并不是很难。 个人觉得核心思想就是`接口`，至于接口在MVC。 
在`Mode`层暴露相应的接口实现回调，在`control`层，持有对应`Mode`实现接口引用，`Control`控制`Mode`做了相应的事情，就通知`View`做相应的任务，并通知相应的`Control`
![Alt text](./MVC.png)


#### MVP
其实和MVC不是很大，主要就是通过`Presenter`,持有`Model`层的引用，这样就方便彼此间的调用。

![MVC-MVP](http://www.jcodecraeer.com/uploads/20150313/1426239008578777.png)
1. [MVP简单剖析](http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0313/2599.html)


api:

http://gank.io/api/day/2015/08/06
