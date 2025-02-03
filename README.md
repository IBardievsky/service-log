This repository contains Spring Boot microservice:

- The **Service Log** microservice receives and stores logs sent from Service Shuffle.

---

## 🗂️ Service Log
### 📋 **Description**
The **Service Log** microservice receives and stores logs sent from Service Shuffle.

### ⚙️ **Tech Stack**
- **Java 11**
- **Spring Boot 3.4.2**
- **Maven**

### 📥 **API Endpoints**

#### 📝 **Log Request**
- **URL:** `POST /log`
- **Request Body:**
  ```json
  {
    "number": 5
  }
  ```
- **Response:** `200 OK`

### 🧪 **Running Tests**
```bash
  mvn clean test
```

### 🚀 **Run Locally**
```bash
  mvn spring-boot:run
```

---

## ⚡ How to Run Both Services Together

1. **Start Service Log:**
   ```bash
   cd service-log
   mvn spring-boot:run
   ```

2. **Start Service Shuffle:**
   ```bash
   cd service-shuffle
   mvn spring-boot:run
   ```

3. **Test the Shuffle API:**
   ```bash
   curl -X POST http://localhost:8080/shuffle -H "Content-Type: application/json" -d '{"number": 5}'
   ```

---

## 🛠️ **Troubleshooting**
- Ensure both services are running.
- Check logs for error messages.
- Verify the `service-log.url` in Service Shuffle's `application.properties`.

---