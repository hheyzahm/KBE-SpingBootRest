SFG Beer Works - RESTful Brewery Service
This project is to support learning about Restful APIs.

You can access the API documentation here

Commands

`docker build  -f ./src/main/dockerBase/Dockerfile -t kbe-rest .`

`docker run -p 8080:8080 -d kbe-rest`

`docker image ls`

`docker run -it -p 8080:8080 kbe-rest`

For layers 

`docker build  -f ./src/main/dockerBaseLayer/Dockerfile -t kbe-rest-layer .`

`docker run -it -p 8080:8080 kbe-rest-layer`

###### Note: when using pom plugin for image in docker if ${project.artifactId} is used in name convention then name in ${project.artifactId} should be in small letters. 

KBE - Pushing to Docker Hub 

command to push on docker

`mvn clean package docker:build docker:push`


above command is used to clean, then build new image, run some tests and push it on docker 











`kubectl config get-contexts`

`kubectl config use-context docker-desktop`

`kubectl get nodes`

get cluster

`kubectl get all`

384 KBE - Create Deployment

Generate the yaml file for deployment

kubectl create deployment Name_0f_The_Application --image name_of_the_image_inside_docker_hub --dry-run=client -o=yaml > deployment.yml

--dry-run=client this part tells compiler run it locally

`kubectl create deployment KBE_SpringBootrest --image springboot_application/kbe_spring_boot_rest --dry-run=client -o=yaml > deployment.yml`

to run the above image 

`kubectl apply -f deployment.yml`

to check pod successfully created 

`kubectl get all`

``

``


``

``

``

