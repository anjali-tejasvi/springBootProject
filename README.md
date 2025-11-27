# 📘 Microservices Fitness Application – Full Stack Project (Spring Boot + React + AI)

<img width="1266" height="572" alt="image" src="https://github.com/user-attachments/assets/0f14e620-70f2-486e-a13f-97cb1c7e4332" />


This project is a **Full Stack Microservices-based Fitness Application** built using:

- **Spring Boot**
- **Spring Cloud**
- **Apache Kafka**
- **MongoDB**
- **MySQL/PostgreSQL**
- **Eureka**
- **API Gateway**
- **Keycloak Authentication**
- **Generative AI (Spring AI + OpenAI/Gemini)**  
<br>

It simulates a complete real-world production microservices system with:

✔️ User management  
✔️ Activity tracking  
✔️ AI-powered recommendations  
✔️ Kafka-based asynchronous communication  
✔️ API Gateway routing & security  
✔️ React/Angular frontend  
✔️ OAuth2 + Keycloak authentication  



---

# 🚀 Project Overview

This application implements a scalable, secure, event-driven **microservices architecture**.

## 🔹 Microservices

### **1️⃣ User Service**
- Manages user data  
- SQL + JPA + Hibernate  
- Syncs user details with Keycloak  

### **2️⃣ Activity Service**
- Handles activity creation and listing  
- MongoDB for flexible document storage  
- Publishes events to Kafka  

### **3️⃣ AI Service**
- Listens to Kafka activity events  
- Generates AI-driven recommendations  
- Uses Spring AI with OpenAI/Gemini  

### **4️⃣ Config Server**
- Centralized configuration for all services  

### **5️⃣ Eureka Server**
- Service discovery and load balancing  

### **6️⃣ API Gateway**
- Single secure entry point  
- Routes requests to microservices  
- Validates tokens with Keycloak  

---

# 🏗️ Infrastructure Components

### **🗄️ Databases**
- **MongoDB** for Activity Service  
- **MySQL** for User Service  

### **📡 Event Streaming**
- **Apache Kafka** for asynchronous communication  

### **☁️ Spring Cloud**
- Eureka  
- Config Server  
- API Gateway  
- OpenFeign  

### **🔐 Security**
- Keycloak Identity Provider  
- OAuth2 Authorization Code + PKCE  

### **🎨 Frontend**
- React or Angular  
- Secure UI with Keycloak authentication  
- Activity creation & listing  
- Viewing AI recommendations  

---

# 🧠 Key Features

## ✔ 1. User Management
- Register, update, authenticate users  
- User data in SQL  
- Sync details with Keycloak  

## ✔ 2. Activity Tracking
- Create, update, delete activities  
- Store in MongoDB  
- Publish activity events to Kafka  

## ✔ 3. AI-Driven Recommendations
- Kafka event → AI Service → Recommendation  
- Uses:  
  - Spring AI  
  - OpenAI GPT Models  
  - Google Gemini  

## ✔ 4. Microservices Communication
- REST communication  
- Spring Cloud OpenFeign  
- Eureka service discovery  
- Gateway routing  

## ✔ 5. Secure Authentication
- Keycloak login  
- Token validation via Gateway  
- OAuth2 PKCE flow  

## ✔ 6. Fully Functional Frontend UI (In progress)
- Login with OAuth2  
- Create activities  
- List activities  
- View AI-generated recommendations  

---
