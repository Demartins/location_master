<h1 align="center">
  Location Master Poc Kafka
</h1>

System Location Master

## technologies
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring for Kafka](https://docs.spring.io/spring-kafka/reference/html/)
- [Kafka](https://kafka.apache.org)
- [Docker Compose](https://docs.docker.com/compose/)

## Como Executar

- Exec  Kafka with  Docker Compose:
```
$ docker-compose up
```

- Add /etc/hosts the hostname `kafka`.
```
$ ./mvnw clean package
```
- Run application:

- Send a  hello
```
$ GET http://localhost:8080/location-master/kafka/diego
```

OK
```

- View received messages in the log:
```
Consumer Message: hello, diego
```

- Grafana
```
Acess  Grafana in http://localhost:3000 (user: admin, password: admin).
```