<h1 align="center">
  Location Master Poc Kafka
</h1>

System Location Master POC. 

The location-master project is a Spring Boot application that uses Kafka to send messages and manage locations, with api REST, Grafana, Azure e APIGEE

## Technologies
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Java 17](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Kafka](https://docs.spring.io/spring-kafka/reference/html/)
- [Zookeeper](https://kafka.apache.org)
- [Postgres](..)
- [Docker Compose](https://docs.docker.com/compose/)
- [Grafana http://localhost:3000/dashboards](http://localhost:3000/dashboards)
- [Unit Test JUnit ](https://kafka.apache.org)
- [Azure Pipelines](https://kafka.apache.org)
- [APIGEE API-GATEWAY](...)
## How to Run

- Exec  Kafka with  Docker Compose:
```
$ docker-compose up
```

- Add /etc/hosts the hostname `kafka`.
```
$ ./mvnw clean package
```
- Run application:

- Send Message: POST with Postman 
```
$ POST http://localhost:8080/location-master/save
{
  "name": "Central Mediterranean Area",
  "locationId": "PQCU004DWJOMB",
  "status": "InActive",
  "bdaType": "CLUSTER",
  "country": null,
  "geoType": "Business Defined Area",
  ...
}
```

200 OK
```

- View received messages in the log:
```
Consumer Message: send message locationLocation{id=null, name='Central Mediterranean Area', locationId='PQCU004DWJOMB', status='InActive', bdaType='CLUSTER'}

```

- View Data in Postgres
```
Using pgAdmin or DBeaver tool to view the data in the location_master database.
```


- Grafana
```
Access  Grafana in http://localhost:3000 (user: admin, password: admin).
```