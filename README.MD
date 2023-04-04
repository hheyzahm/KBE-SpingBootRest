SFG Beer Works - RESTful Brewery Service
This project is to support learning about Restful APIs.

You can access the API documentation here

Commands

`docker build  -f ./src/main/dockerBase/Dockerfile -t kbe-rest .`

`docker run -p 8080:8080 -d kbe-rest`

`docker image ls`

` docker run -it -p 8080:8080 kbe-rest`

From layers `docker build  -f ./src/main/docker/Dockerfile -t kbe-rest .`