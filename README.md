# data-analyser-microservice, data-store-microservice, data-generator-microservice

This is the official repository for 3x data-microservices.

## Prerequisites

Make sure you have Docker installed on your machine. You can download it [here](https://www.docker.com/get-started).

## How to Run

### 1. Clone the Repository
```bash
git clone https://github.com/artemnizhnyk/data-analyser-microservice.git 
```

### 2. Enter to the application directory
```bash
cd data-analyser-microservice
```

### 3. Enter to docker directory
```bash
cd .\docker\
```

### 3. Start docker-compose.yml file to start the app
```bash
docker-compose up -d
```

### 4. To send test data, use postman or another client, use Post method at:
```link
http://localhost:8081/api/v1/data/test/send
```
#### with body:
```
{
    "delayInSeconds": 3,
    "measurementTypes": [
        "POWER",
        "VOLTAGE",
        "TEMPERATURE"
    ]
}
```

### 5. Check stacktrace of data-analyser-microservice and data-store-microservice, you see what program does