# qa-final-project-java

![CI Pipeline](https://github.com/en-cdima/qa-final-project-java/actions/workflows/ci.yml/badge.svg)

---

## 📌 Overview

This project represents the first stage of a QA Automation Final Project using a Java/Maven-based test automation framework.

The goal is to demonstrate the ability to:

* structure a test automation project
* define configuration using YAML
* describe API test logic
* run tests using Maven
* containerize the project using Docker
* build and publish Docker images using GitHub Actions

---

## 🧱 Project Structure

```text
.
├── .github/workflows/ci.yml
├── config/app.yaml
├── data/
├── src/test/java/com/cdima/tests/
│   ├── ApiTest.java
│   └── ApiTest.txt
├── Dockerfile
├── pom.xml
└── README.md
```

---

## ⚙️ Configuration

The configuration file is located at:

```text
config/app.yaml
```

Example:

```yaml
env: qa

service:
  baseUrl: https://apps.qualiadept.eu/hapifyme

timeouts:
  connection: 5000
  read: 10000
```

---

## 🧪 API Test

### 📄 Pseudocode

Located in:

```text
src/test/java/com/cdima/tests/ApiTest.txt
```

### 💻 Java Implementation

Located in:

```text
src/test/java/com/cdima/tests/ApiTest.java
```

### ✔ Test Scenario

* Send GET request to:

  ```
  https://jsonplaceholder.typicode.com/todos/1
  ```
* Validate:

  * Status code is **200**
  * Response contains field **title**
  * Response is not empty

---

## ▶️ Run Tests Locally

```bash
mvn test
```

---

## 🐳 Docker Usage

### Build Docker image

```bash
docker build -t qa-final-project-java .
```

### Run container

```bash
docker run --rm qa-final-project-java
```

---

## 🚀 CI/CD Pipeline

Pipeline defined in:

```text
.github/workflows/ci.yml
```

### Workflow steps:

1. Run Maven tests
2. Build Docker image
3. Push image to Docker Hub

The Docker job runs only if tests pass.

---

## 🔐 Required Secrets

Set in:

```text
GitHub → Settings → Secrets and variables → Actions
```

Required secrets:

* `DOCKERHUB_USERNAME`
* `DOCKERHUB_TOKEN`

---

## 🛠 Technologies Used

* Java 17
* Maven
* Docker
* GitHub Actions
* REST API Testing

---

## 📦 Docker Image

```text
https://hub.docker.com/r/dimacorneliu/qa-final-project-java
```

