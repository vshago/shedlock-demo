# shedlock-demo

Start PostgreSQL:
```
docker run -d -p 5432:5432 --name db \
    -e POSTGRES_USER=admin \
    -e POSTGRES_PASSWORD=password \
    -e POSTGRES_DB=demo \
    postgres:alpine
```

Tune parameters in com.example.demo.task.ExampleTask

Run service:
```
./gradlew bootRun
```