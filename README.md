# Barista Service

## Create a container image:
mvn clean package -Dquarkus.container-image.build=true

## Deploy to k8s:
mvn clean package -DskipTests -Dquarkus.kubernetes.deploy=true

## Liveness:
curl -i localhost:8080/q/health/live

## Readiness:
curl -i localhost:8080/q/health/ready

## Metrics
curl -i localhost:8080/q/metrics
