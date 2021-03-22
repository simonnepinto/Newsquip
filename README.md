<h1 align="center">Newsquip</h1>

<p align="center">
<img src="https://img.shields.io/badge/Built%20using-Android Studio-1f425f.svg">
<img src="https://travis-ci.org/fossasia/badge-magic-android.svg?branch=development">
<img src="https://img.shields.io/badge/Made%20with-Kotlin-1f425f.svg">
</p>


<p align="center">
<img src="https://user-images.githubusercontent.com/53074235/111645258-88315000-8826-11eb-8f27-14aaf7ffad37.png">
</p>


## Overview :memo:

Newsquip is a news aggregator that highlights and gathers latest news from multiple sources. Stay updated with the events happening around the country from the latest government policies to sports, science, entertainment and tech stories.

The app fetches recent news from an API and lists them in a Recycler View. It implements Volley library to send requests to the API through a RequestQueue, and performs image loading and caching using the functionalities of Glide library. 

The JSON data obtained from the API is parsed, and the news-image along with the headline and author is displayed. The user can then click on the news they want to read about, which opens the article within the app. This is acheived by implementing CustomTabs to allow the user to seamlessly transition between native and web content.

## Tools required
In order to use this application, you must have the following installed:
* [Android Studio](https://developer.android.com/studio/index.html)
* Android SDK version 29 (Can be installed from within Android Studio, or with homebrew `brew install android-sdk`)
* [JDK8](https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html)
* An Android device or emulator


## Getting Started 🚀

### How To Use 🔧

#### Clone the Project

From your command line:
```bash
# Clone this repository
$ git clone https://github.com/simonnepinto/Newsquip.git

```

This command  will copy the entire project to your local environment

#### Running the app

1.  Pull down the code locally.
2.  Open Android Studio and select 'Open an existing Android Studio Project'
3.  Navigate to checked out repository.
4.  Inside 'Newsquip' folder, select 'settings.gradle' file
5.  Run the application.


## Demo 🛠️
|<img src="https://user-images.githubusercontent.com/53074235/111863061-29331e80-897f-11eb-9203-4e750971238f.png" width="100%"> |<img src="https://user-images.githubusercontent.com/53074235/111863069-40720c00-897f-11eb-9e3a-b384857d36ab.png" width="100%">| <img src="https://user-images.githubusercontent.com/53074235/111863077-4bc53780-897f-11eb-9664-1e602cd01abc.png" width="100%">|
|:-------------------------:|:-------------------------:|:-------------------------:|
