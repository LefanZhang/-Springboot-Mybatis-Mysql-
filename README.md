# -Springboot-Mybatis-Mysql-
一个简单实现增删改查的小程序后端

这个项目是在imooc网的一个教程（https://www.imooc.com/learn/945）的基础上写的
算是第一次完成了前后端的交互，记录一下。

列一些在过程中帮助到自己的网站，以防再掉坑
########################################
1.标题：Spring boot 出现 "org.springframework.beans.factory.UnsatisfiedDependencyException" 错误
  网址：https://blog.csdn.net/csdn_tingou/article/details/84872046

2.标题：解决MySQL报错The server time zone value 'ÖÐ¹ú±ê×¼Ê±¼ä' is unrecognized or represents .....
  网址：https://www.cnblogs.com/smiler/p/9983146.html
  P.S.不知道为什么，我配置的Mysql每次重启电脑后都要重新设置时区...
  
3.标题：突然登不上去了，下次再改
  网址：https://www.bbsmax.com/A/mo5kk7g45w/

4.标题：springMVC出现HTTP Status 405 - Request method 'GET' not supported错误的解决方法
  网址：https://blog.csdn.net/ahwsk/article/details/79707807
  P.S.这个的意义就是，你完全不用多此一举加一个限定（除非是为了安全考虑）
  
5.标题：Spring配置c3p0数据源时出错报:java.lang.NoClassDefFoundError: com/mchange/v2/ser/Indirector
  网址：https://www.cnblogs.com/fingerboy/p/5284557.html
  P.S.这个问题在第二次搭建又遇到了，明明直接Ctrl+C上一个的pom文件，文件中也引入了文中的jar包，但是还没用，困扰了很久。
      可能是这个jar包就是得手动引入？下一个网页是引入jar包的方法。
  
6.标题：Eclipse中导入外部jar包——添加lib
  网址：https://blog.csdn.net/weixin_40997360/article/details/79644858
########################################
