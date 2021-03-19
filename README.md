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

The app fetches recent news from an API and lists them in a Recycler View. It implements the Volley library to send requests to the API through a RequestQueue, and performs image loading and caching using the functionalities of Glide library. 

The JSON data obtained from the API is parsed, and the news-image along with the headline and author is displayed. The user can then click on the news they want to read about which opens the article within the app. This is acheived by implementing CustomTabs to allow the user to seamlessly transition between native and web content.


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
|<img src="https://user-images.githubusercontent.com/53074235/106244199-97d1e680-6230-11eb-9976-32b5fe09a8cc.png" width="100%"> |<img src="https://user-images.githubusercontent.com/53074235/106244263-ac15e380-6230-11eb-841f-fa14cf2d8528.png" width="100%">|
|:-------------------------:|:-------------------------:|
