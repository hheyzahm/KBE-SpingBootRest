SFG Beer Works - RESTful Brewery Service
This project is to support learning about Restful APIs.

You can access the API documentation here

Commands

`docker build  -f ./src/main/dockerBase/Dockerfile -t kbe-rest .`

`docker run -p 8080:8080 -d kbe-rest`

`docker image ls`

` docker run -it -p 8080:8080 kbe-rest`

From layers `docker build  -f ./src/main/dockerBaseLayer/Dockerfile -t kbe-rest-layer .`

` docker run -it -p 8080:8080 kbe-rest-layer`

###### Note: when using pom plugin for image in docker if ${project.artifactId} is used in name convention then name in ${project.artifactId} should be in small letters. 

KBE - Pushing to Docker Hub 

command to push on docker

`mvn clean package docker:build docker:push`


above command is used to clean, then build new image, run some tests and push it on docker 