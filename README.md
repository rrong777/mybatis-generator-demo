# mybatis-generator-demo
测试mybatis的代码生成器
0.参考文档：
	（1）SpringBoot使用MyBatis-Generator详解
	https://blog.csdn.net/qq_34666857/article/details/90142700
	（2）本地项目打包，依赖到了xxx.jar(你此时通过winrar打开了xxx.jar),此时打包本地项目的时候会失败（因为你这个jar包打开了。）
	（3）mysql驱动版本不一样，则driverClass存在的路径也不一样。
			mysql-connector-java 8.0.16 驱动类路径：com.mysql.cj.jdbc.Driver
			mysql-connector-java 5.1.38 驱动类路径：com.mysql.jdbc.Driver 
			// 其实maven依赖就是一个个jar包，而jar包就是程序，程序里面肯定有路径，com.mysql.jdbc.Driver就是驱动类的路径，jar包（依赖）加到程序里，就相当于程序里面的代码
	（4）generatorConfig.xml 配置说明
			https://www.cnblogs.com/sumlen/p/12448845.html
1. 添加依赖
    <dependencies>
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>2.1.0</version>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.16</version>
        </dependency>

    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-maven-plugin</artifactId>
                <version>1.3.2</version>
                <configuration>
                    <verbose>true</verbose>
                    <overwrite>true</overwrite>
                    <configurationFile>${basedir}/src/main/resources/generatorConfig.xml</configurationFile>
                </configuration>
                <dependencies>
                    <!-- 配置这个依赖主要是为了等下在配置MG的时候可以不用配置classPathEntry这样的一个属性，避免代码的耦合度太高 -->
                    <dependency>
                        <groupId>mysql</groupId>
                        <artifactId>mysql-connector-java</artifactId>
                        <version>8.0.16</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
    </build>
2. generatorConfig.xml 添加配置文件
3. maven生命周期-plugins-mybatis-generator 双击执行