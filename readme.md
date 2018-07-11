## Простой пример ActiveMQ и Spring Boot

1. Запуск ActiveMQ 
```
  docker run --name demo-activemq -d -p 61616:61616 -p 8161:8161 webcenter/activemq:5.14.3
```

2. Запустить приложение
```
  mvn spring-boot:run
```

3. Отправить сообщение
```
  http://localhost:8080/producer?message=Привет
```

4. Принять сообщение
```
  http://localhost:8080/consumer
```