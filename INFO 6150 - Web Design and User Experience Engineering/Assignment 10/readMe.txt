ASSIGNMENT-10

Task 1: React-Redux Lab

Task 2:Weather Forecast Application created using React with a search option to check weekly and hourly weather forecast of city based on city input.

Weather forecast -(Weekly,Daily,Hourly) consist of cards that displays day, date and time, Temperature which also includes Minimum and Maximum temperature as well as 'feels like' temperature. The card also displays icon(image) of weather forecasted as well as description of weather.Upon clicking the weekly weather forecast card, the days hourly (3-hour interval) weather is displayed.

React Router has been implemented in the application to display hourly forecast with /[name-of-day] and / to display 5-day weather forecast.(Using 'Router','Switch','Route' with path set to '/' for weekly(5 days forecast) and '/day/:day' for the day's hourly forecast in App.js)

Openweathermap API has been used to fetch weather forecast (weekly,daily,hourly) of different cities.

WeekDays.js is used to fetch and display weekly(5 day weather forecast data) for a city based on user input.

Days.js fetches and display weather data for a particular day

DayTemp.js fetches and display hourly (3-hour interval) weather forecasting data for a particular (selected) day
