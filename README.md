# Micro Marketplace: An E-commerce Microservices Application

## Solution Overview

Micro Marketplace is a robust e-commerce application built on a microservices architecture using Spring technologies and other open-source tools. 
- This platform leverages the power of **Spring Boot**, **Netflix Eureka**, **Spring Cloud Gateway**, and **KeyCloak** for service development, discovery, gateway management, and security, respectively. 
- It incorporates **Resilience4j** for resilient synchronous communication, and **Apache Kafka** for seamless event-driven asynchronous communication between services.
- It offers extensive observability into the application using **Micrometer** and **Zipkin** for distributed tracing, and **Prometheus** and **Grafana** for monitoring and visualization. 

With a focus on scalability, resilience, and real-time interaction, Micro Marketplace provides a robust foundation for creating feature-rich online marketplaces.


### Solution Architecture
![Solution Architecture](docs/images/architecture/SolutionArchitecture.png)

### Services
- **Product Service:** Responsible for managing product information, including creation, retrieval, and updates. It uses a MongoDB database.
- **Order Service:** Handles order management, including creating and retrieving orders. It uses a MySQL database.
- **Inventory Service:** Manages products inventory. It also uses a MySQL database.
- **Notification Service:** A stateless service responsible for sending notifications to users regarding their orders or other relevant updates.

### Major Components
- **Discovery Server:** Netflix Eureka is employed for service registration and discovery, allowing microservices to locate and interact with each other dynamically.
- **API Gateway:** Spring Cloud Gateway is deployed to serve as the entry point for all external requests, effectively routing traffic to the appropriate microservices.
- **Auth Server:** For robust authentication and authorization mechanisms, KeyCloak is used to secure the microservices and protect sensitive data.
- **Circuit Breaker:** Resilience4j is used to maintain system reliability by preventing cascading failures in microservices through circuit-breaking mechanisms.
- **Message Broker:** Apache Kafka forms the backbone of Micro Marketplace's event-driven architecture, facilitating asynchronous notification for orders.
- **Observability Stack:** Distributed tracing is implemented to monitor and troubleshoot requests as they traverse different microservices, using Micrometer for metrics and Zipkin for tracing. 
   Moreover, Prometheus is used for collecting metrics, and Grafana for providing a rich dashboard for visualizing and analyzing application performance data.

### Tech Stack Used
<div>
    <table>
        <tr>
            <td>
                <strong>Languages & Frameworks</strong>
            </td>
            <td>
                <a href="ttps://www.java.com/en/">
                    <img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://spring.io/projects/spring-boot" target="_blank">
                    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-6DB33F?style=flat&logo=springboot&logoColor=white">
                </a>
                &emsp;
                <a href="https://spring.io/projects/spring-cloud" target="_blank">
                    <img alt="Spring Cloud" src="https://img.shields.io/badge/Spring Cloud-6DB33F?style=flat&logo=spring&logoColor=white">
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>Databases & Message Queue</strong>
            </td>
            <td>
                <a href="https://mongodb.io/" target="_blank"> 
                    <img alt="MongoDB" src="https://img.shields.io/badge/MongoDB-4EA94B?style=flat&logo=mongodb&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://mysql.com/" target="_blank"> 
                    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-00000F?style=flat&logo=mysql&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://kafka.apache.org/" target="_blank"> 
                    <img alt="Apache Kafka" src="https://img.shields.io/badge/Apache%20Kafka-000?style=flat&logo=apachekafka"/>
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>API Gateway</strong>
            </td>
            <td>
                <a href="https://spring.io/projects/spring-cloud-gateway" target="_blank"> 
                    <img alt="Spring Cloud Gateway" src="https://img.shields.io/badge/Spring Cloud Gateway-6DB33F.svg?&style=flat&logo=spring&logoColor=white"/>
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>Service Discovery</strong>
            </td>
            <td>
                <a href="https://spring.io/projects/spring-cloud-netflix" target="_blank"> 
                    <img alt="Netflix Eureka" src="https://img.shields.io/badge/Eureka-DF162B.svg?&style=flat&logo=netflix&logoColor=white"/>
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>Circuit Breaker</strong>
            </td>
            <td>
                <a href="https://resilience4j.readme.io/" target="_blank"> 
                    <img alt="Resilience4J" src="https://img.shields.io/badge/Resilience4J-121212.svg?&style=flat&logo=resilience4j&logoColor=white"/>
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>Security</strong>
            </td>
            <td>
                <a href="https://www.keycloak.org/" target="_blank"> 
                    <img alt="KeyCloak" src="https://img.shields.io/badge/KeyCloak-00B8E3.svg?&style=flat&logo=keycloak&logoColor=white"/>
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>Observability</strong>
            </td>
            <td>
                <a href="https://micrometer.io/" target="_blank"> 
                    <img alt="Micrometer" src="https://img.shields.io/badge/Micrometer-117A71.svg?&style=flat&logo=micrometer&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://zipkin.io/" target="_blank"> 
                    <img alt="Zipkin" src="https://img.shields.io/badge/Zipkin-FE7139.svg?&style=flat&logo=zipkin&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://prometheus.io/" target="_blank"> 
                    <img alt="Prometheus" src="https://img.shields.io/badge/Prometheus-E6522C.svg?&style=flat&logo=prometheus&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://grafana.com/" target="_blank"> 
                    <img alt="Grafana" src="https://img.shields.io/badge/Grafana-F79A2F.svg?&style=flat&logo=grafana&logoColor=white"/>
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>Build & Containerization</strong>
            </td>
            <td>
                <a href="https://maven.apache.org/" target="_blank"> 
                    <img alt="Maven" src="https://img.shields.io/badge/Maven-C02748?style=flat&logo=apachemaven&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://www.docker.com/" target="_blank"> 
                    <img alt="Docker" src="https://img.shields.io/badge/Docker-2496ED?style=flat&logo=docker&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://github.com/GoogleContainerTools/jib" target="_blank"> 
                    <img alt="Jib" src="https://img.shields.io/badge/Jib-FF6444?style=flat&logo=googlecloud&logoColor=white"/>
                </a>
                &emsp;
            </td>
        </tr>
    </table>
</div>


## Getting Started

### Prerequisites
1. Docker and Docker Compose should be installed.
2. Docker should be running.

### Deployment

1. Navigate to the project directory:
   ```shell
   cd ecommerce-microservices
   ```

2. Start the containers:
   ```shell
   docker compose up -d
   ```


3. Confirm that the containers are up and running:
   ```shell
   docker ps
   ```


## Usage


### Interacting with Application

- **Getting Credentials from KeyCloak**
  - Access the KeyCloak Admin UI at http://localhost:8080/
  - Go to the Realm `spring-boot-microservices-realm`
  - Go to the Client `spring-cloud-client`
  - Go the the 'Credentials' section, and get the 'Client Secret'


- **Setup Postman Authentication** [Required in the next steps]
  - On the Request page, set Authorization:
    - Type: `OAuth 2.0`
    - Configure New Token with:
      - Token Name: `token`
      - Grant Type: `Client Credentials`
      - Access Token URL: `http://keycloak:8080/realms/spring-boot-microservices-realm/protocol/openid-connect/token`
      - Client ID: `spring-cloud-client`
      - Client Secret: `<client-secret>` (which you copied in the last step from KeyCloak)
    - Click on "Get New Access Token" and then click "Use Token"

    > NOTE: For getting the access token from the keycloak container with the local machine, it is required to add a row with `127.0.0.1 keycloak` in the file: `C:\Windows\System32\drivers\etc\hosts` or `/etc/hosts`  

- **Accessing API Endpoints**
  - **POST /api/product**
    - Method: POST
    - Endpoint: http://localhost:8181/api/product
    - Authorization: Use the OAuth 2.0 token fetched, following the previous step.
    - Body: 
      ```json
      {
         "name": "Iphone 15",
         "description": "Apple Iphone 15",
         "price": 1500
      } 
      ```
    - Output:
        ![Postman](docs/images/outputs/product_api_post_postman.png)
        ![Zipkin](docs/images/outputs/product_api_post_zipkin.png)
  
  - GET /api/product
    - Method: GET
    - Endpoint: http://localhost:8181/api/product
    - Authorization: Use the OAuth 2.0 token fetched, following the previous step.
    - Output:
        ![Postman](docs/images/outputs/product_api_get_postman.png)
 
  - POST /api/order
    - Method: POST
    - Endpoint: http://localhost:8181/api/order
    - Authorization: Use the OAuth 2.0 token fetched, following the previous step.
    - Body:
      ```json
      {
         "orderLineItemsDtoList": [
           {
              "skuCode": "iphone_15_pro",
              "price": 2000,
              "quantity": 1
            }
         ]
      }  
      ```
    - Output:
      ![Postman](docs/images/outputs/order_api_post_postman.png)
      ![Zipkin](docs/images/outputs/order_api_post_zipkin.png)
      ![Notification Service Logs](docs/images/outputs/order_api_post_notification_service_docker_logs.png)

### Components UI

- KeyCloak Admin UI
   - Keycloak UI can be accessed on http://localhost:8080/
   - Realm: `spring-boot-microservices-realm`
     ![KeyCloak Realm](docs/images/outputs/keycloak_realm.png)
   - Client: `spring-cloud-client`
    ![KeyCloak Client](docs/images/outputs/keycloak_client.png)


- Eureka Dashboard
   - Services (Clients) discovered can be viewed on http://localhost:8761/
    ![Eureka Dashboard](docs/images/outputs/eureka_dashboard.png)


- Zipkin UI
   - Traces for the API calls can be accessed on http://localhost:9411/zipkin/
    ![Zipkin UI](docs/images/outputs/zipkin_ui.png)


- Prometheus UI
    - Prometheus UI can be accessed on http://localhost:9090/
    - Prometheus Graph Query
      ![Graph Query](docs/images/outputs/prometheus_graph.png)
    - Prometheus Targets Health
      ![Targets Health](docs/images/outputs/prometheus_targets.png)
    - Prometheus Service Discovery Status
      ![Service Discovery Status](docs/images/outputs/prometheus_service_discovery.png)

- Grafana Dashboard
  - Grafana Dashboard can be accessed on http://localhost:3000/
  - To visualize the application, create a 'Data Source' and import the dashboard using `grafana-dashboard.json` file.
  - Data Source
    ![Data Source](docs/images/outputs/grafana_data_source.png)
  - Dashboard [Collapsed]
    ![Dashboard Collapsed](docs/images/outputs/grafana_dashboard_collapsed.png)
  - Dashboard
    ![Dashboard-1](docs/images/outputs/grafana_dashboard_pg1.png)
    ![Dashboard-5](docs/images/outputs/grafana_dashboard_pg5.png)


## Environment Cleanup

- To completely stop and remove the containers and other resources (network, volume, etc.), run the following command:
   ```shell
   docker compose down -v
   ```
