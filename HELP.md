# Getting Started

### Reference Documentation

##commands for run :
* docker build -t jhooq-docker-demo .
* docker run -p 8081:8081 jhooq-docker-demo 
* docker run -e "SPRING_PROFILES_ACTIVE=prod" -e "MY_JOB=proggrammer" -p 8081:8081 jhooq-docker-demo
* docker-compose build
* docker-compose up

* docker images
* docker ps -a
* docker stop a1503f7b0b0f

* curl http://localhost:8081/hello


###Entry point 
* http://localhost:8081/hello 
