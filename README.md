# SkyBooking ✈️

[English](#english-version) | [Русский](#russian-version)

---

<div id="english-version"></div>

## English

### 📝 Description
**SkyBooking** is a modern Full-Stack flight booking web application prototype. The platform allows users to search for available flights between different cities, view directions, and manage bookings. It features a responsive and clean user interface, single-page navigation, and seamless integration with a backend REST API. 

The application includes a robust fallback mechanism: if the backend server is offline, the frontend automatically switches to **Demo Mode**, displaying mock flight data so the application remains fully testable.

### 🛠️ Tech Stack
* **Backend:** Java, Spring Boot (Spring Web, Spring Data JPA)
* **Frontend:** HTML5, CSS3, JavaScript (Fetch API for REST integration)
* **Data Layer:** In-memory Database / Mock Fallback System
* **Tools:** Maven, Git

### 🚀 Key Features
* **Flight Search:** Filter flights by departure city, destination, and date.
* **REST API:** Clean controller architecture with `@CrossOrigin` support for decoupled frontend connection.
* **Smart Demo Mode:** Visual alert banner and mock data rendering when the server is unreachable.
* **Responsive UI:** Minimalistic, user-friendly design optimized for various screens.

### 💻 How to Run Locally

#### 1. Backend Setup
1. Navigate to the backend directory: `cd skybooking-backend`
2. Run the Spring Boot application using Maven:
   ```bash
   mvn spring-boot:run
The server will start on http://localhost:8080.

2. Frontend Setup
Simply open the index.html file in any modern web browser.

If the backend is running, it will fetch real-time data from the API. Otherwise, it will seamlessly fall back to demo mode.

Русский
📝 Описание проекта
SkyBooking — это современный прототип Full-Stack веб-приложения для поиска и бронирования авиабилетов. Платформа позволяет пользователям искать доступные рейсы по городам и датам, просматривать направления и управлять бронированиями. Проект сочетает в себе чистый, минималистичный интерфейс и проработанную архитектуру серверной части.

В приложение встроен механизм отказоустойчивости: если бэкенд-сервер недоступен, фронтенд автоматически переключается в Демо-режим, отображая демонстрационные рейсы, что позволяет полностью протестировать интерфейс в любых условиях.

🛠️ Стек технологий
Бэкенд: Java, Spring Boot (Spring Web, Spring Data JPA)

Фронтенд: HTML5, CSS3, JavaScript (Fetch API для интеграции с REST)

База данных / Хранилище: In-memory БД / Система автопереключения на мок-данные

Инструменты: Maven, Git

🚀 Основные возможности
Поиск рейсов: Удобная фильтрация по месту вылета, назначению и дате.

REST API: Чистая архитектура контроллеров с поддержкой @CrossOrigin для связи с независимым фронтендом.

Умный демо-режим: Визуальное предупреждение (баннер) и подгрузка фейк-данных при отсутствии ответа от сервера.

Адаптивный интерфейс: Современный дизайн, обеспечивающий удобство работы на любых устройствах.

💻 Как запустить локально
1. Запуск бэкенда
Перейдите в директорию бэкенда: cd skybooking-backend

Запустите Spring Boot приложение с помощью Maven:

Bash
mvn spring-boot:run
Сервер поднимется на http://localhost:8080.

2. Запуск фронтенда
Просто откройте файл index.html в любом браузере.

Если сервер запущен, фронтенд подтянет живые данные через API. Если выключен — автоматически включится демонстрационный режим.
