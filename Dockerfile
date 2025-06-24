# ---- Build Stage: Angular ----
    FROM node:20 as angular-builder
    WORKDIR /app
    COPY snapcart_ui ./snapcart_ui
    WORKDIR /app/snapcart_ui
    RUN npm install
    RUN npm run build -- --configuration production
    
    # ---- Build Stage: Spring Boot ----
    FROM maven:3.9.6-eclipse-temurin-17-alpine as maven-builder
    WORKDIR /app
    COPY . .
    RUN mvn clean package -DskipTests
    
    # ---- Final Stage: Runtime ----
    FROM eclipse-temurin:17-jdk-alpine
    WORKDIR /app
    
    # Copy Spring Boot JAR
    COPY --from=maven-builder /app/target/snapcart-0.0.1-SNAPSHOT.jar app.jar
    
    # Copy Angular static files to Spring Boot static folder
    COPY --from=angular-builder /app/snapcart_ui/dist/snapcart_ui /app/static/
    
    EXPOSE 8080
    ENTRYPOINT ["java", "-jar", "app.jar"]
    