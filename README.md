## Springboot-Maven-Demo

1. 在 `src\main\resources\application.yml` 配置表, 修改自己本地的配置
2. 执行 `init.sql`, 初始化数据库及表数据等操作
3. 打包

   ```bash
   $ mvn package -f "./pom.xml"
   ```

4. 运行服务

   ```bash
   $ java -jar ./target/user-0.0.1-SNAPSHOT.jar
   ```
