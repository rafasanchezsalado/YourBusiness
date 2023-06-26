FROM eclipse-temurin:17-alpine

RUN mkdir /your-business-backend
WORKDIR /your-business-backend

COPY your-business/ .

# RUN ./gradlew build --parallel
# RUN ./gradlew.bat build

WORKDIR build/libs/

CMD ["java", "-jar", "your-business-FINAL.jar"]

EXPOSE 8080