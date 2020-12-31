## 실행
```bash

# 깃 클론
$ git clone https://github.com/somyungsub/springboot-vue-gradle.git

# 폴더 이동
$ cd springboot-vue-gradle

# [윈도우] 빌드 및 실행 
$ gradlew.bat npmClean clean build
$ java -jar backend\app-admin\build\libs\gostop.admin.jar

# [unix 계열] 빌드 및 실행 
$ ./gradlew npmClean clean build
$ java -jar backend/app-admin/build/libs/gostop.admin.jar

```
