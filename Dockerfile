# Используем образ с установленным Gradle
FROM gradle:7.3.3-jdk17 AS build

# Копируем файлы проекта
COPY /src /home/gradle/src
COPY build.gradle settings.gradle /home/gradle/

# Устанавливаем рабочую директорию
WORKDIR /home/gradle

# Собираем проект с помощью Gradle
RUN gradle build --no-daemon

# Используем образ с установленной Java
FROM openjdk:17-jdk-slim

# Копируем собранные JAR-файлы из предыдущего этапа
COPY --from=build /home/gradle/build/libs/*.jar application.jar

# Устанавливаем порт, который будет использоваться приложением
EXPOSE 8082

# Команда для запуска приложения
ENTRYPOINT ["java", "-jar", "application.jar"]