# java-pg

Access to Postgres DB in a different Docker container

## Build Setup

1. Check out this repository.

2. Add ".env" file and set environmental variables in it. Check .env.example for the list of variables to be set and/or use the section below.

3. Install Docker.

## Environment variables

Below is the list of recommended content for your local .env file.

JAVA_PG_CORE_BUILD_PROFILE=dev

JAVA_PG_CORE_SERVER_PORT=9091

JAVA_PG_CORE_SQL_USER=jpg

JAVA_PG_CORE_SQL_PASSWORD=1234567890

JAVA_PG_CORE_DB_URL=jdbc:postgresql://172.23.0.3:5432/jpgdb

TZ=America/Toronto

## Docker

### Start the system

```bash
docker compose up -d
```

### Shutdown the system

```bash
docker compose down
```

### Rebuild an individual service

```bash
docker compose build java-pg-core
```

### Check the latest build date of a service

```bash
docker inspect -f '{{.Created}}' java-pg-core
```

### Redeploy an individual service

```bash
docker compose up --no-deps -d java-pg-core
```

### Connect to logs of Spring Boot backend

```bash
docker logs --tail 50 --follow --timestamps java-pg-core
```

## Testing

Maven shall be used for unit testing.

```bash
mvn test
```
