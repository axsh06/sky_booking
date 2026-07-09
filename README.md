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
