# qa-final-project-java

![CI Pipeline](https://github.com/en-cdima/qa-final-project-java/actions/workflows/ci.yml/badge.svg)

---

## 📌 Overview

This project represents the first stage of a QA Automation Final Project using a Java/Maven-based test automation framework.

The goal is to demonstrate the ability to:
- structure a test automation project
- define configuration using YAML
- describe API test logic
- run tests with Maven
- containerize the project using Docker
- build and publish Docker images via CI/CD pipeline

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
