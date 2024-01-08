# **Android MVVM Architecture: Kotlin Example**

## Project Overview
This project demonstrates the implementation of the **MVVM** (Model-View-ViewModel) architecture in Android app development using Kotlin. It focuses on fetching data from web services and showcases best practices in Android development.
![MVVMSchema](https://github.com/Hasnain17/MVVMDemoProject/assets/62245237/a7beda94-55d0-4a17-8b92-6ffd30e57d53)

## Key Features
- Utilization of **MVVM Architecture** for separation of concerns.
- Data fetching from web services using **Retrofit**.
- Implementation of **LiveData**, **ViewModel**, and **Fragment**.
- Use of **BindingAdapter** and **CallBacks** for responsive UI design.

## Technologies Used
- Kotlin
- Retrofit
- AndroidX Libraries
- Glide for image loading
- Gson Converter

## Getting Started
To get started with this project:
1. Clone the repository.
2. Open the project in your IDE (preferably Android Studio).
3. Sync Gradle and run the project on an emulator or physical device.

## Steps to Build the Project
- **Step 1:** Add dependencies in `build.gradle` and enable data binding.
- **Step 2:** Create `ApiEndPoint` interface for API calls.
- **Step 3:** Set up Retrofit client in `RetrofitClient.kt`.
- **Step 4:** Define data classes for the GitHub API response.
- **Step 5:** Implement `GithubRepository` for data abstraction.
- **Step 6:** Add `DataAdapter` for RecyclerView.
- **Step 7:** Create `BindingAdapterUtils` for image loading.
- **Step 8:** Develop `MainViewModel` for handling UI data.
- **Step 9:** Implement `MainViewModelFactory`.
- **Step 10:** Set up `MainActivity` and `activity_main.xml`.
- **Step 11:** Create `MainFragment` for UI interaction.

## Project Structure
The project follows a clean architecture, separating the code into different packages for `network`, `data`, `adapter`, `viewmodel`, and `ui`.

## Contributing
Feel free to fork this repository and contribute. Please make sure to follow the existing code structure and naming conventions.

## About the Author
Project developed by Muhammad Hasnain Altaf. Inspired by Abdul Qadir's article on Medium titled "Mastering Android MVVM: Kotlin example to Create High-Quality Android App for Fetching data from web service by using Best Practices".


Feel free to customize this template according to your project's specific details and requirements.
