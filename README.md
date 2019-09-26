[toc]

###**前言**
近来由于公司项目的需要，暂时放下了前端android的开发，慢慢投入到后台接口系统搭建，在经过与众兄弟的讨论下，决定就使用最常规的框架去搭建一个后台接口系统，这样一方面大家都比较的熟悉，另一方面对于新人和后期的维护都会相对比较容易一些，因此，针对这一系列框架最基础的搭建，在此做一个简单的总结，希望能对这一块儿还相对陌生的猿猿能有所帮助

###**软件安装及资源配置**
####**JDK安装**
- **jdk下载**
[jdk1.8下载](http://pan.baidu.com/s/1mimgmoS)之后，安装；
- **环境变量配置**
 - “我的电脑”-->右键-->属性-->高级系统设置-->环境变量-->系统变量-->新建-->添加一项“JAVA_HOME”路径为jdk的安装路径，如下图：
![](http://img.blog.csdn.net/20170624123023280?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
 - 然后path中添加 **%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;**,如下图：
![](http://img.blog.csdn.net/20170624123040769?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
 - 测试
 cmd下输入：java -version  如下图效果说明安装成功
 ![](http://img.blog.csdn.net/20170624114223745?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

---

####**MyEclipse10安装及破解**
- **资源下载**
	[MyEclipse10及破解工具下载入口](http://pan.baidu.com/s/1jIzb4VG)
- **安装及破解**
MyEclipse的安装就是next  next...finish即可；其中破解工具打开软件日志栏中写有相应的教程，请参考教程步骤；一步步破解，这是我目前发现最好用的一个破解工具。

---

####**Maven安装及配置**
（根据个人需要；可用可不用）
- **资源下载**
	[maven-3.2.1版本下载](http://pan.baidu.com/s/1slHKgaD)
- **解压压缩包**
	如下图：
	![](http://img.blog.csdn.net/20170624121300349?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
- **配置环境变量**
	- 如第一步中配置jdk一样，进入到环境变量配置页面
	- 添加“MAVEN_HOME”配置解压后maven的路径
		如下图：
		![](http://img.blog.csdn.net/20170624121708158?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
	- 将maven路径指定到path下
		如下图：
		![这里写图片描述](http://img.blog.csdn.net/20170624122015835?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
	- **测试**
		打开cmd （如果还是之前测试jdk的cmd窗口，请关闭了重新打开）输入：mvn -v 如果出现以下效果，说明已经安装成功：
		![](http://img.blog.csdn.net/20170624123311512?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
	- **调整maven的配置文件**
		- 找到解压路径下的conf文件，进去找到setting.xml配置文件
		- 将该配置文件拷贝至“C:\Users\Administrator\.m2”路径下
			配置到这里的目的是为了以后我们更新了maven的版本之后，不需要出现配置setting文件，至需要更换一下环境变量即可，如下图：
			![](http://img.blog.csdn.net/20170624124026717?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
		- 打开setting文件，找到“localRepository”配置自己本机maven仓库的路径（根据个人习惯配置），如果不配置这个路径，默认会在将以下路径“C:\Users\Administrator\.m2\repository“作为Maven仓库
		![](http://img.blog.csdn.net/20170624124427262?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
	- **Myeclipse配置Maven**
	打开MyEclipse，选择**Window-->Preferences-->Maven4MyEclipse-->User Settings**,配置上一步中修改的settings.xml文件，如下图:
	![](http://img.blog.csdn.net/20170624131108664?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

---
		
####**MySQL下载及安装**
- **资源下载**
	[MySQL安装版、免安装版及Navicat破解版下载](http://pan.baidu.com/s/1miwV8e8)
- **安装**
	- **MySQL安装版安装**
	以上链接中下载MySQL安装版，解压，安装，然后next next ...finish即可
    - **免安装版安装**
   请参考之前的博客[MySQL安装及可视化工具使用](http://blog.csdn.net/lupengfei1009/article/details/52625439)
   - **Navicat（MySQL）可视化工具安装及破解**
   下载以上链接中Navicat工具，根据个人电脑的情况选择32位或者64位的安装；安装完之后运行"patchNavicat.exe"即可完成工具破解

---

####**Tomcat下载及安装**
- **资源下载**
	[Tomcat 7.0资源下载](http://pan.baidu.com/s/1pLK5YGV)；rar和exe文件为安装版tomcat，zip包为免安装版tomcat；根据需要下载相应的文件；演示选择的exe安装版。
- **Tomcat安装**
	老规矩，next next.. finish即可;安装路径最好不要出现空格在里面；隐隐约约记得好像Tomcat的全路径中有空格在什么地方是会有问题；具体什么问题也记不清了；也可能是我记错了；唠叨一句，选择一个不含空格的路径安装；以防万一。
- **MyEclipse配置Tomcat**
	打开MyEclipse,选择Window-->Preferences-->MyEclipse-->service-->Tomcat 7.x;按如下图配置上面步骤中安装的路径；
![](http://img.blog.csdn.net/20170624221058513?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
注:记得要勾选上“Enable”选项，否则这个配置将不会生效；
- **测试Tomcat**
	- **启动服务**
	按下图步骤启动服务，见日志栏中出现下图中的日志，说明服务启动成功；
	![](http://img.blog.csdn.net/20170624221854885?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
	- **浏览器测试**
	 浏览器中输入：localhost:8080；如出现如下效果，说明tomcat配置成功；
	 ![](http://img.blog.csdn.net/20170624222136284?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

---

####**Redis下载及安装**
（根据个人需要，redis可用可不用）
可参考资料[Redis安装](http://www.runoob.com/redis/redis-install.html)

-  **资源下载**
[Redis-x64-3.2.100](http://pan.baidu.com/s/1i4XtlHF)下载，并解压安装包
- **启动服务**
cmd下进入解压目录，输入：redis-server.exe redis.windows.conf；见到如下图效果，说明服务已经启动成功了。
![](http://img.blog.csdn.net/20170624225137502?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
- **redis客户端测试**
新起一个cmd窗口（注意上面的服务cmd窗口不要关闭了）；输入：redis-cli.exe -h 127.0.0.1 -p 6379  链接到本地redis的服务；通过set、get指令测试存取值正常；如下图：
![](http://img.blog.csdn.net/20170624230228762?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

###项目搭建
####项目创建
- 创建maven项目
	 - 项目搭建
		 右键-->New-->Web Project；输入项目名，**选择j2ee 6.0，勾选上Add Maven support**，点击finish，如下图
		 ![](http://img.blog.csdn.net/20170702190256694?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
	 
	 - 创建成功之后为如下结构:
		 ![](http://img.blog.csdn.net/20170702190334810?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
- 项目结构调整
 - 创建基础的资源配置、测试代码、测试资源配置文件夹
   右键-->build Path-->New Source Folder
   ![](http://img.blog.csdn.net/20170702190617426?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
   或者右键-->New-->Source Folder
   ![](http://img.blog.csdn.net/20170702190725014?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
   然后分别创建**“src/main/resources”、"src/test/java"、"src/test/resources"** 如下图:
   ![](http://img.blog.csdn.net/20170702190950849?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

- 整理代码及资源配置文件结构
	![](http://img.blog.csdn.net/20170702191116014?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
	按以上结构分别创建文件夹即可

####数据库基础数据准备
 - 创建一个简单的用户表，用户测试即可，如下图：
![](http://img.blog.csdn.net/20170702192026931?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
创建脚本如下
	```
	Date: 2017-07-02 19:20:45
	*/
	
	SET FOREIGN_KEY_CHECKS=0;
	
	-- ----------------------------
	-- Table structure for userinfo
	-- ----------------------------
	DROP TABLE IF EXISTS `userinfo`;
	CREATE TABLE `userinfo` (
	  `ID` int(11) NOT NULL AUTO_INCREMENT,
	  `NAME` varchar(20) NOT NULL,
	  `AGE` int(5) DEFAULT NULL,
	  `SEX` int(1) DEFAULT NULL,
	  `ADD` varchar(255) DEFAULT NULL,
	  PRIMARY KEY (`ID`)
	) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
	
	-- ----------------------------
	-- Records of userinfo
	-- ----------------------------
	INSERT INTO `userinfo` VALUES ('1', '张三', '10', '0', '北京');
	INSERT INTO `userinfo` VALUES ('2', '李四', '20', '1', '上海');
	INSERT INTO `userinfo` VALUES ('3', '赵五', '23', '1', '广州');
	INSERT INTO `userinfo` VALUES ('4', '钱六', '50', '0', '台湾');
	```

####**插件配置**
- **Maven的pom.xml配置**
	```
	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<!-- spring版本号 -->
		<spring.version>3.2.8.RELEASE</spring.version>
		<!-- log4j日志文件管理包版本 -->
		<slf4j.version>1.6.6</slf4j.version>
		<log4j.version>1.2.12</log4j.version>
		<!-- junit版本号 -->
		<junit.version>4.10</junit.version>
		<!-- mybatis版本号 -->
		<mybatis.version>3.2.1</mybatis.version>
	</properties>

	<dependencies>
		<!-- 添加Spring依赖 -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context-support</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-aop</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-aspects</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-tx</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-web</artifactId>
			<version>${spring.version}</version>
		</dependency>

		<!--单元测试依赖 -->
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>${junit.version}</version>
			<scope>test</scope>
		</dependency>

		<!-- 日志文件管理包 -->
		<!-- log start -->
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>${log4j.version}</version>
		</dependency>
		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-api</artifactId>
			<version>${slf4j.version}</version>
		</dependency>
		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-log4j12</artifactId>
			<version>${slf4j.version}</version>
		</dependency>
		<!-- log end -->

		<!--spring单元测试依赖 -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-test</artifactId>
			<version>${spring.version}</version>
			<scope>test</scope>
		</dependency>

		<!--mybatis依赖 -->
		<dependency>
			<groupId>org.mybatis</groupId>
			<artifactId>mybatis</artifactId>
			<version>${mybatis.version}</version>
		</dependency>

		<!-- mybatis/spring包 -->
		<dependency>
			<groupId>org.mybatis</groupId>
			<artifactId>mybatis-spring</artifactId>
			<version>1.2.0</version>
		</dependency>

		<!-- mysql驱动包 -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.29</version>
		</dependency>

		<!-- javaee-api包 注意和项目使用的JDK版本对应 -->
		<dependency>
			<groupId>javax</groupId>
			<artifactId>javaee-api</artifactId>
			<version>6.0</version>
			<scope>provided</scope>
		</dependency>

		<!-- javaee-web-api包 注意和项目使用的JDK版本对应 -->
		<dependency>
			<groupId>javax</groupId>
			<artifactId>javaee-web-api</artifactId>
			<version>6.0</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.7.4</version>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-core</artifactId>
			<version>2.7.4</version>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-annotations</artifactId>
			<version>2.7.4</version>
		</dependency>
		<dependency>
	        <groupId>com.alibaba</groupId>
	        <artifactId>fastjson</artifactId>
	        <version>1.2.32</version>
	    </dependency>
	    
		<!-- redis -->
		<dependency>
			<groupId>org.springframework.data</groupId>
			<artifactId>spring-data-redis</artifactId>
			<version>1.3.0.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>redis.clients</groupId>
			<artifactId>jedis</artifactId>
			<version>2.6.2</version>
		</dependency>
	</dependencies>
	```
添加成功保存，Maven会自动下载相应的对应版本的包到本地仓库；由于部分资源包在不同的网络环境下下载会比较慢，如果Maven下载不下来，我在百度云盘共享了一份上面各个版本对应的包，可以下载下来解压到本地的仓库即可使用；[点击下载](http://pan.baidu.com/s/1miaBt7i)

- **MyBatis配置**
 - jdbc属性配置文件
 在properties文件夹下创建jdbc.properties，并配置以下参数：
	```
	jdbc_driverClassName=com.mysql.jdbc.Driver
	jdbc_url=jdbc:mysql://127.0.0.1:3306/springmvcdb
	jdbc_username=lpf
	jdbc_password=123456
	```
	- mybatis配置
		这里直接配置在application.xml；请参考后续的applocation配置

- **redis配置**
 - redis参数配置文件
 在redis文件夹下创建redis.properties，添加如下参数：
	```
	redis.pool.maxTotal=105
	redis.pool.maxIdle=10
	redis.pool.maxWaitMillis=5000
	redis.pool.testOnBorrow=true
	redis.host=127.0.0.1
	redis.port=6379
	redis.password=
	redis.db.index=0
	```
	- redis基础配置
	在redis下创建redis-config.xml文件，并添加一下配置文件：
	```
        <?xml version="1.0" encoding="UTF-8"?>
        <beans xmlns="http://www.springframework.org/schema/beans"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
            xsi:schemaLocation="http://www.springframework.org/schema/beans  
                http://www.springframework.org/schema/beans/spring-beans.xsd   
                http://www.springframework.org/schema/context   
                http://www.springframework.org/schema/context/spring-context.xsd">

            <!-- 缓存的层级 -->
            <context:component-scan base-package="com.lpf.springmvc" />
            <!-- 引入redis配置 -->
            <!-- <context:property-placeholder location="redis.properties" ignore-unresolvable="true" 
                /> -->

            <!-- Redis 配置 -->
            <bean id="jedisPoolConfig" class="redis.clients.jedis.JedisPoolConfig">
                <property name="maxTotal" value="${redis.pool.maxTotal}" />
                <property name="maxIdle" value="${redis.pool.maxIdle}" />
                <property name="maxWaitMillis" value="${redis.pool.maxWaitMillis}" />
                <property name="testOnBorrow" value="${redis.pool.testOnBorrow}" />
            </bean>

            <bean id="jedisPool" class="redis.clients.jedis.JedisPool">
                <constructor-arg name="poolConfig" ref="jedisPoolConfig" />
                <constructor-arg name="host" value="${redis.host}" />
                <constructor-arg name="port" value="${redis.port}" type="int" />
                <constructor-arg name="timeout" value="${redis.pool.maxWaitMillis}" type="int" />
                <constructor-arg name="password" value="#{'${redis.password}'!=''?'${redis.password}':null}" />
                <constructor-arg name="database" value="${redis.db.index}" type="int" />
            </bean>

            <!-- JedisCluster 集群高可用配置 -->
            <!--<bean id="jedisCluster" class="redis.clients.jedis.JedisCluster"> <constructor-arg 
                index="0"> <set> <bean class="redis.clients.jedis.HostAndPort"> <constructor-arg 
                index="0" value="${redis.ip1}" /> <constructor-arg index="1" value="${redis.port1}" 
                type="int" /> </bean> <bean class="redis.clients.jedis.HostAndPort"> <constructor-arg 
                index="0" value="${redis.ip2}" /> <constructor-arg index="1" value="${redis.port2}" 
                type="int" /> </bean> <bean class="redis.clients.jedis.HostAndPort"> <constructor-arg 
                index="0" value="${redis.ip3}" /> <constructor-arg index="1" value="${redis.port3}" 
                type="int" /> </bean> <bean class="redis.clients.jedis.HostAndPort"> <constructor-arg 
                index="0" value="${redis.ip4}" /> <constructor-arg index="1" value="${redis.port4}" 
                type="int" /> </bean> <bean class="redis.clients.jedis.HostAndPort"> <constructor-arg 
                index="0" value="${redis.ip5}" /> <constructor-arg index="1" value="${redis.port5}" 
                type="int" /> </bean> <bean class="redis.clients.jedis.HostAndPort"> <constructor-arg 
                index="0" value="${redis.ip6}" /> <constructor-arg index="1" value="${redis.port6}" 
                type="int" /> </bean> </set> </constructor-arg> <constructor-arg index="1" 
                value="2000" type="int"></constructor-arg> <constructor-arg index="2" value="100" 
                type="int"></constructor-arg> <constructor-arg index="3" ref="jedisPoolConfig"></constructor-arg> 
                </bean> -->

            <!--redis Sentinel主从高可用方案配置 -->
            <!-- <bean id="sentinelConfiguration" class="org.springframework.data.redis.connection.RedisSentinelConfiguration"> 
                <property name="master"> <bean class="org.springframework.data.redis.connection.RedisNode"> 
                <property name="name" value="master-1"></property> </bean> </property> <property 
                name="sentinels"> <set> <bean class="org.springframework.data.redis.connection.RedisNode"> 
                <constructor-arg name="host" value="${sentinel1.ip}"></constructor-arg> <constructor-arg 
                name="port" value="${sentinel1.port}"></constructor-arg> </bean> <bean class="org.springframework.data.redis.connection.RedisNode"> 
                <constructor-arg name="host" value="${sentinel2.ip}"></constructor-arg> <constructor-arg 
                name="port" value="${sentinel2.port}"></constructor-arg> </bean> <bean class="org.springframework.data.redis.connection.RedisNode"> 
                <constructor-arg name="host" value="${sentinel3.ip}"></constructor-arg> <constructor-arg 
                name="port" value="${sentinel3.port}"></constructor-arg> </bean> </set> </property> 
                </bean> <bean id="jedisConnectionFactory" class="org.springframework.data.redis.connection.jedis.JedisConnectionFactory" 
                p:use-pool="true"> <property name="password" value="${redis.pass}" /> <property 
                name="poolConfig"> <ref bean="jedisPoolConfig" /> </property> <constructor-arg 
                name="sentinelConfig" ref="sentinelConfiguration" /> </bean> -->

            <!-- redis单节点数据库连接配置 -->
            <bean id="jedisConnectionFactory"
                class="org.springframework.data.redis.connection.jedis.JedisConnectionFactory">
                <property name="hostName" value="${redis.host}" />
                <property name="port" value="${redis.port}" />
                <property name="password" value="${redis.password}" />
                <property name="poolConfig" ref="jedisPoolConfig" />
            </bean>

            <!-- redisTemplate配置，redisTemplate是对Jedis的对redis操作的扩展，有更多的操作，封装使操作更便捷 -->
            <bean id="redisTemplate" class="org.springframework.data.redis.core.StringRedisTemplate">
                <property name="connectionFactory" ref="jedisConnectionFactory" />
            </bean>

        </beans> 
	```
	- redis dao层相关配置
	  - 接口定义
	  在Dao文件加下创建一个用于获取redis下数据的接口（以获取一个文本型的数据为例）
	```
        package com.lpf.springmvc.dao;

        import org.springframework.stereotype.Repository;

        @Repository
        public interface RedisDao
        {
            String get(String key);
        }
	```
	 - 创建Jedis帮助对象
	 一个公共的帮助类，代码太长，放到网盘了，下载下来即可:[JedisUtil](http://pan.baidu.com/s/1dF1nRYL)
	 - 创建dao的具体实现
	 在dao文件下创建RedisDaoImpl，实现RedisDao接口，代码如下：
	```
        package com.lpf.springmvc.dao;

        import javax.annotation.Resource;

        import com.lpf.springmvc.utils.JedisUtil;

        import redis.clients.jedis.JedisPool;

        public class RedisDaoImpl implements RedisDao
        {
            @Resource
            JedisPool jedisPool;

            public String get(String key)
            {
                // TODO Auto-generated method stub
                JedisUtil jedisUtil = new JedisUtil(jedisPool);
                JedisUtil.Strings strings = jedisUtil.new Strings();
                System.out.println("cache: " + strings.get(key));
                return strings.get(key);
            }

        }
	```
	配置完成之后，为如下效果：
	![](http://img.blog.csdn.net/20170702201416495?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)


- **SpringMvc相关配置**
 - springmvc基础配置
	 在springmvc文件夹下创建spring-mvc.xml，并配置以下代码
	```
        <?xml version="1.0" encoding="UTF-8"?>
        <beans xmlns="http://www.springframework.org/schema/beans"
            xmlns:p="http://www.springframework.org/schema/p" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xmlns:context="http://www.springframework.org/schema/context"
            xmlns:mvc="http://www.springframework.org/schema/mvc"
            xsi:schemaLocation="
            http://www.springframework.org/schema/beans
            http://www.springframework.org/schema/beans/spring-beans-3.2.xsd
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context-3.2.xsd
            http://www.springframework.org/schema/mvc
            http://www.springframework.org/schema/mvc/spring-mvc-3.2.xsd">

            <!-- <mvc:annotation-driven /> -->
            <!-- 设置Jackson在返回的时候过滤掉null的数据 -->
            <mvc:annotation-driven>
                <mvc:message-converters register-defaults="true">
                    <bean
                        class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter">
                        <property name="objectMapper">
                            <bean class="com.fasterxml.jackson.databind.ObjectMapper">
                                <property name="serializationInclusion">
                                    <value type="com.fasterxml.jackson.annotation.JsonInclude.Include">NON_NULL</value>
                                </property>
                            </bean>
                        </property>
                    </bean>
                </mvc:message-converters>
            </mvc:annotation-driven>

            <!-- 启动Spring MVC的注解功能，完成请求和注解POJO的映射 -->
            <bean
                class="org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter">
                <property name="messageConverters">
                    <list>
                        <!--json转换器 -->
                        <ref bean="mappingJacksonHttpMessageConverter" />
                    </list>
                </property>
            </bean>
            <bean
                class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter">
                <property name="messageConverters">
                    <list>
                        <ref bean="mappingJacksonHttpMessageConverter" />
                    </list>
                </property>
            </bean>

            <bean id="mappingJacksonHttpMessageConverter"
                class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter">
                <property name="supportedMediaTypes">
                    <list>
                        <bean class="org.springframework.http.MediaType">
                            <constructor-arg index="0" value="text" />
                            <constructor-arg index="1" value="plain" />
                            <constructor-arg index="2" value="UTF-8" />
                        </bean>
                        <bean class="org.springframework.http.MediaType">
                            <constructor-arg index="0" value="*" />
                            <constructor-arg index="1" value="*" />
                            <constructor-arg index="2" value="UTF-8" />
                        </bean>
                        <bean class="org.springframework.http.MediaType">
                            <constructor-arg index="0" value="text" />
                            <constructor-arg index="1" value="*" />
                            <constructor-arg index="2" value="UTF-8" />
                        </bean>
                        <bean class="org.springframework.http.MediaType">
                            <constructor-arg index="0" value="application" />
                            <constructor-arg index="1" value="json" />
                            <constructor-arg index="2" value="UTF-8" />
                        </bean>
                    </list>
                </property>
            </bean>

            <!-- 扫描controller（controller层注入） -->
            <context:component-scan base-package="com.lpf.springmvc.controller" />

            <!-- 对模型视图添加前后缀 -->
            <bean id="viewResolver"
                class="org.springframework.web.servlet.view.InternalResourceViewResolver"
                p:prefix="/WEB-INF/view/" p:suffix=".jsp" />
        </beans>
	```

- **application.xml配置**
在配置文件根目录下创建一个application.xml配置文件，并添加如下的配置代码:
	```
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
		xmlns:aop="http://www.springframework.org/schema/aop"
		xsi:schemaLocation="  
	           http://www.springframework.org/schema/beans  
	           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd  
	           http://www.springframework.org/schema/aop  
	           http://www.springframework.org/schema/aop/spring-aop-3.0.xsd
	           http://www.springframework.org/schema/context  
	           http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	
		<!-- 引入jdbc配置文件 -->
		<bean id="propertyConfigurer"
			class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
			<property name="locations">
				<list>
					<value>classpath:properties/jdbc.properties</value>
					<value>classpath:redis/redis.properties</value>
					<!--要是有多个配置文件，只需在这里继续添加即可 -->
				</list>
			</property>
		</bean>
	
		<!-- 配置数据源 -->
		<bean id="dataSource"
			class="org.springframework.jdbc.datasource.DriverManagerDataSource">
			<!-- 使用properties来配置 -->
			<property name="driverClassName">
				<value>${jdbc_driverClassName}</value>
			</property>
			<property name="url">
				<value>${jdbc_url}</value>
			</property>
			<property name="username">
				<value>${jdbc_username}</value>
			</property>
			<property name="password">
				<value>${jdbc_password}</value>
			</property>
		</bean>
	
		<!-- 自动扫描了所有的XxxxMapper.xml对应的mapper接口文件，这样就不用一个一个手动配置Mpper的映射了，只要Mapper接口类和Mapper映射文件对应起来就可以了。 -->
		<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
			<property name="basePackage" value="com.lpf.springmvc.dao" />
		</bean>
	
		<!-- 配置Mybatis的文件 ，mapperLocations配置**Mapper.xml文件位置，configLocation配置mybatis-config文件位置 -->
		<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
			<property name="dataSource" ref="dataSource" />
			<property name="mapperLocations" value="classpath*:com/lpf/springmvc/mapper/**/*.xml" />
			<property name="configLocation" value="classpath:mybatis/mybatis-config.xml" />
		</bean>
	
		<!-- redis相关的注入 -->
		<bean id="redisDao" class="com.lpf.springmvc.dao.RedisDaoImpl">
		</bean>
		<import resource="redis/redis-config.xml" />
	
		<!-- 自动扫描注解的bean -->
		<context:component-scan base-package="com.lpf.springmvc.service" />
	
	</beans>
	
	```
- **项目web.xml配置**
打开src-->main-->webapp-->WEB-INF-->web.xml，配置如下代码：
	```
	<?xml version="1.0" encoding="UTF-8"?>
	<web-app version="3.0" 
		xmlns="http://java.sun.com/xml/ns/javaee" 
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
		xsi:schemaLocation="http://java.sun.com/xml/ns/javaee 
		http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd">
	  <display-name></display-name>	
	  <welcome-file-list>
	    <welcome-file>index.jsp</welcome-file>
	  </welcome-file-list>
	  
	  <context-param>
	    <param-name>contextConfigLocation</param-name>
	    <param-value>classpath:application.xml</param-value>
	  </context-param>
	  <context-param>
	    <param-name>webAppRootKey</param-name>
	    <param-value>springmvc.root</param-value>
	  </context-param>
	  <filter>
	    <filter-name>SpringEncodingFilter</filter-name>
	    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
	    <init-param>
	      <param-name>encoding</param-name>
	      <param-value>UTF-8</param-value>
	    </init-param>
	    <init-param>
	      <param-name>forceEncoding</param-name>
	      <param-value>true</param-value>
	    </init-param>
	  </filter>
	  <filter-mapping>
	    <filter-name>SpringEncodingFilter</filter-name>
	    <url-pattern>/*</url-pattern>
	  </filter-mapping>
	  <context-param>
	    <param-name>log4jConfigLocation</param-name>
	    <param-value>classpath:log4j.properties</param-value>
	  </context-param>
	  <context-param>
	    <param-name>log4jRefreshInterval</param-name>
	    <param-value>6000</param-value>
	  </context-param>
	  <listener>
	    <listener-class>org.springframework.web.util.Log4jConfigListener</listener-class>
	  </listener>
	  <listener>
	    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	  </listener>
	  <servlet>
	    <servlet-name>dispatcherServlet</servlet-name>
	    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	    <init-param>
	      <param-name>contextConfigLocation</param-name>
	      <param-value>classpath:springmvc/spring-mvc.xml</param-value>
	    </init-param>
	    <load-on-startup>1</load-on-startup>
	  </servlet>
	  <servlet-mapping>
	    <servlet-name>dispatcherServlet</servlet-name>
	    <url-pattern>/</url-pattern>
	  </servlet-mapping>
	  <error-page>
	    <error-code>404</error-code>
	    <location>/WEB-INF/errorpage/404.jsp</location>
	  </error-page>
	  <error-page>
	    <error-code>405</error-code>
	    <location>/WEB-INF/errorpage/405.jsp</location>
	  </error-page>
	  <error-page>
	    <error-code>500</error-code>
	    <location>/WEB-INF/errorpage/500.jsp</location>
	  </error-page>
	</web-app>
	
	```
- 配置简单测试
 - 将项目发布到tomcat
 ![](http://img.blog.csdn.net/20170702202049669?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
 ![](http://img.blog.csdn.net/20170702202225814?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
 - 页面测试
	打开浏览器，输入http://localhost:8080/SpringMvc；出现以下效果，说明基本的配置未编译出错
	![](http://img.blog.csdn.net/20170702202400802?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

####**代码编写**
主要用于梳理从前端-->controller-->service-->dao  处理完数据再回去的这么一个过程

- dao层相关代码编写
 - 用户 信息dao层接口定义
 定义2个方法,分别用于获取所有用户信息和根据id获取指定用户信息，代码如下
	```
	package com.lpf.springmvc.dao;
	
	import java.util.List;
	
	import com.lpf.springmvc.model.UserInfo;
	
	/**
	 * 操作用户消息的dao
	 * @author lupf
	 *
	 */
	public interface UserInfoDao {
		/**
		 * 获取所有的用户
		 * @return
		 */
		public List<UserInfo> getUserInfos();
	
		/**
		 * 根據用戶id获取用户消息
		 * @param id
		 * @return
		 */
		public UserInfo getUserInfoByID(int id);
	}
	
	```

 - MyBatis mapper配置文件
	添加用户信息相关的mapper配置文件，在mapper文件夹下创建user-info-mapper.xml，并添加以下代码:
	```
	<?xml version="1.0" encoding="UTF-8"?>    
	<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"    
	"http://mybatis.org/dtd/mybatis-3-mapper.dtd">
	<mapper namespace="com.lpf.springmvc.dao.UserInfoDao">
		<!--设置domain类和数据库中表的字段一一对应，注意数据库字段和domain类中的字段名称不致，此处一定要！ -->
		<resultMap id="BaseResultMap" type="com.lpf.springmvc.model.UserInfo">
			<id column="ID" property="id" jdbcType="INTEGER" />
			<result column="NAME" property="name" jdbcType="VARCHAR" />
			<result column="AGE" property="age" jdbcType="INTEGER" />
			<result column="SEX" property="sex" jdbcType="INTEGER" />
			<result column="ADD" property="add" jdbcType="VARCHAR" />
		</resultMap>
		<!-- 查询单条记录 -->
		<select id="getUserInfoByID" parameterType="int" resultMap="BaseResultMap">
			SELECT * FROM userinfo WHERE ID = #{id}
		</select>
		
		<!-- 查询所有 -->
		<select id="getUserInfos" resultMap="BaseResultMap">
			SELECT * FROM userinfo
		</select>
	</mapper>
	```
- 用户service配置
 - 定义service接口
	 用于获取用户信息的service，根本用来根据id获取和获取所以，service基本和到差不对匹配，但是不是绝对匹配
	```
        package com.lpf.springmvc.service;

        import java.util.List;

        import com.lpf.springmvc.model.UserInfo;

        /**
         * 操作用户消息的service
         * 
         * @author lupf
         * 
         */
        public interface UserInfoService {
		/**
		 * 获取所有的用户
		 * 
		 * @return
		 */
		public List<UserInfo> getUserInfos();
	
		/**
		 * 根據用戶id获取用户消息
		 * 
		 * @param id
		 * @return
		 */
		public UserInfo getUserInfoByID(int id);
		
		/**
		 * 根据redis的key获取redis的一个文本型value
		 * @param key
		 * @return
		 */
		public String getValueByRedisKey(String key);
	}
	
	```
	- 用户信息service的具体实现
	```
        package com.lpf.springmvc.service;

        import java.util.List;

        import javax.annotation.Resource;

        import org.springframework.stereotype.Service;

        import com.lpf.springmvc.dao.RedisDao;
        import com.lpf.springmvc.dao.UserInfoDao;
        import com.lpf.springmvc.model.UserInfo;

        @Service
        public class UserInfoServiceImpl implements UserInfoService {
		@Resource
		UserInfoDao userInfoDao;
		
		@Resource
		RedisDao redisDao;
	
		@Override
		public List<UserInfo> getUserInfos() {
			// TODO Auto-generated method stub
			return userInfoDao.getUserInfos();
		}
	
		@Override
		public UserInfo getUserInfoByID(int id) {
			// TODO Auto-generated method stub
			return userInfoDao.getUserInfoByID(id);
		}
	
		@Override
		public String getValueByRedisKey(String key) {
			// TODO Auto-generated method stub
			return redisDao.get(key);
		}
	
	}
	
	```
	记住，需要在类上添加@Service的注解，service才会被自动注入进来；在service中引入dao，即可操作数据；

- 用户信息controller
 - view层代码编写
	 在WEB-INF下的view文件夹（该文件的路径在spring-mvc.xml中配置了）下添加一个用于获取了一个用户之后，绑定用户信息的user.jsp页面，代码如下：
	```
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<html>
	<body>
	<h2>Hello World!</h2>
	 编号:${user.id}<br>
	 姓名:${user.name}<br>
	 年龄:${user.age}<br>
	 性别:${user.sex==0?"女":"男"}<br>
	 地址:${user.add}<br>
	</body>
	</html>
	```

 - controller代码编写
 主要用户和前段交互的入口，代码如下：
	```
	package com.lpf.springmvc.controller;
	
	import java.util.List;
	
	import javax.annotation.Resource;
	
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.servlet.ModelAndView;
	
	import com.alibaba.fastjson.JSON;
	import com.lpf.springmvc.model.UserInfo;
	import com.lpf.springmvc.service.UserInfoService;
	
	@Controller
	public class UserInfoController {
		protected Logger logger = LoggerFactory.getLogger(getClass());
	
		@Resource
		UserInfoService userInfoService;
	
		@RequestMapping("/userInfo")
		public ModelAndView getUserInfoByID(int id) {
			// 指定view层的页面,参数user即为对应的jsp的名称
			ModelAndView mav = new ModelAndView("user");
			if (id <= 0)
				id = 1;
			// 获取数据
			UserInfo userInfo = userInfoService.getUserInfoByID(id);
			// 将获取到的对象添加到ModelAndView对象中
			mav.addObject("user", userInfo);
			return mav;
		}
	
		@RequestMapping("/getUserInfos")
		@ResponseBody
		public List<UserInfo> getUserInfos() {
			List<UserInfo> users = userInfoService.getUserInfos();
			logger.info(""+JSON.toJSONString(users));
			return users;
		}
	
	}
	
	```
	 RequestMapping指明了前端请求该方法的路径。如getUserInfoByID方法配置了userInfo这个注解，那么前段请求时候的路径即为：http://localhost:8080/SpringMvc/userInfo
	
 - getUserInfoByID方法解析
	该方法主要用于前段jsp界面的请求；实例化的ModelAndView指明了绑定的view界面，上面方法中添加了 ;获取到数据添加到ModelAndView中即可自动绑定到相应的位置。
	前端测试地址为:http://localhost:8080/SpringMvc/userInfo?id=1；界面显示效果如下：
	![](http://img.blog.csdn.net/20170703163311540?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
	![](http://img.blog.csdn.net/20170703163328567?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

 - getUserInfos方法解析
 该接口主要用于给前端提供api接口时使用，添加了@ResponseBody即可，因为RequestMapping注解为getUserInfos；前端请求即以getUserInfos作为该方法的请求路径。
 前端测试地址为:http://localhost:8080/SpringMvc/getUserInfos；前端显示效果如下：
 ![](http://img.blog.csdn.net/20170703163651287?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

####**单元测试**
针对上面service的具体实现，我们通过Junit进行一下单元测试；在没有前端的情况下即可完成接口的调试。

- 代码编写
  在src/test/java目录下编写但愿测试代码
  - 创建测试代码的基类，代码如下：
	```
	package com.lpf.springmvc.test;
	
	import org.junit.runner.RunWith;
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.test.context.ContextConfiguration;
	import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
	import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
	
	//指定bean注入的配置文件
	@ContextConfiguration(locations = { "classpath:application.xml" })
	// 使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
	@RunWith(SpringJUnit4ClassRunner.class)
	public abstract class SpringTestCase extends AbstractJUnit4SpringContextTests {
		protected Logger logger = LoggerFactory.getLogger(getClass());
	}
	
	```
 - 编写service测试代码
	```
	package com.lpf.springmvc.test;
	
	import java.util.List;
	
	import javax.annotation.Resource;
	
	import org.junit.Test;
	
	import com.alibaba.fastjson.JSON;
	import com.lpf.springmvc.model.UserInfo;
	import com.lpf.springmvc.service.UserInfoService;
	
	public class UserInfoTest extends SpringTestCase {
		@Resource
		UserInfoService usersInfoService;
	
		@Test
		public void selectUserByIdTest() {
			UserInfo user = usersInfoService.getUserInfoByID(1);
			logger.debug("查找结果" + user);
		}
		
		@Test
		public void selectUserInfosTest() {
			List<UserInfo> users = usersInfoService.getUserInfos();
			logger.debug("查找结果" + JSON.toJSONString(users));
		}
		
		@Test
		public void getValueByRedisKey(){
			String va  =usersInfoService.getValueByRedisKey("name");
			logger.debug("key为name的redis数据:"+va);
		}
	}
	
	```
	 写好上面的测试代码，选择方法名，右键-->Run as -->JUnit test运行，如下图：
	![](http://img.blog.csdn.net/20170703161726248?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
	
	 运行出现下图效果，说明接口已经正常了：
	![](http://img.blog.csdn.net/20170703161924413?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
	另外两个接口的测试效果分别如下：
	![](http://img.blog.csdn.net/20170703162444462?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
	
	 ![](http://img.blog.csdn.net/20170703162536399?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
	 ![](http://img.blog.csdn.net/20170703162456539?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHVwZW5nZmVpMTAwOQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

###总结
到这里，一个基于SpringMvc+MyBatis+MySQL+Maven+Redis搭建一个常规的web项目就已经完成了，虽然没有写什么很牛的技术点；但是涵盖的每个技术所需要用到的东西；后续会对MyBatis和redis进行更详细的，便于更好的在项目中运用，提高项目的性能。
	 

