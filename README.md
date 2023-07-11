# Spring Boot Application Deployment with Docker and Kubernetes (Minikube)

This repository demonstrates the build and deployment process of a Spring Boot application using Docker and Kubernetes with Minikube. It provides step-by-step instructions and necessary configuration files to set up a local Kubernetes cluster using Minikube and deploy the Spring Boot application as a containerized service.

## Prerequisites

To run this demo, you need to have the following prerequisites installed on your system:

- Docker: [Install Docker](https://docs.docker.com/install/)
- Minikube: [Install Minikube](https://minikube.sigs.k8s.io/docs/start/)

Make sure you have a compatible version of Kubernetes client installed with Minikube. You can check the version by running `kubectl version` in your terminal.

## Getting Started

Follow the steps below to get the Spring Boot application up and running on a local Kubernetes cluster:

1. Clone this repository:  
   ```
   git clone https://github.com/hssamconf/k8s-test-project.git
   ```

2. Navigate to the project directory:  
   ```
   cd k8s-test-project
   ```

3. Build the Docker image for the Spring Boot application:  
   ```
   docker build -t spring-boot-app-image .
   ```

4. Start Minikube cluster:  
   ```
   minikube start
   ```

5. Set the Docker environment to use Minikube's Docker daemon:  
   ```
   eval $(minikube docker-env)
   ```

6. Deploy & Expose the application as a service to the Kubernetes cluster:  
   ```
   kubectl apply -f k8s.yaml
   ```
   
7. Verify the deployment:  
   ```
   kubectl get deployments
   kubectl get services
   ```

8. Access the application:  
   ```
   minikube service spring-boot-app-svc --url
   ```

The application should now be accessible in your browser.

## Folder Structure

The repository contains the following files and folders:

- `src/`: Source code directory for the Spring Boot application.
- `Dockerfile`: Dockerfile for building the Docker image.
- `k8s.yaml`: Kubernetes deployment & service configuration for the Spring Boot application.

## Contributing

Contributions are welcome! If you have any suggestions or improvements, please create an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

This project is inspired by the [Spring Boot](https://spring.io/projects/spring-boot), [Docker](https://www.docker.com/), [Kubernetes](https://kubernetes.io/), and [Minikube](https://minikube.sigs.k8s.io/) projects.
