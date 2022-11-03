import React, { Component } from 'react';
import { Link } from 'react-router-dom';

var moment = require('moment');

const Days = (props) => {
  const reading = props.reading;
  let newDate = new Date();
  const weekday = reading.dt * 1000;
  newDate.setTime(weekday)

  const fahrenheit = Math.round(reading.main.temp);
  const celsius = Math.round((fahrenheit - 32) * 5/9);
  const imgURL = `owf owf-${reading.weather[0].id} owf-5x`

  return (
    <div className="col-sm-2">
      <Link to={ {
        pathname: `/day/${moment(newDate).format('dddd')}`, 
        state: {
            fullData: props.fullData,
            city: props.city
        }
        }}>
        <div className="card">
          <div className="card-body">
            <h3 className="card-title">{moment(newDate).format('dddd')}</h3>
            <p className="text-muted">{moment(newDate).format('MMMM Do, hh:mm a')}</p>
            <i className={imgURL}></i>
            <h4>{fahrenheit} °F / {celsius} °C</h4>
            <h6>Min: {Math.round(reading.main.temp_min)} °F</h6>
            <h6>Max: {Math.round(reading.main.temp_max)} °F</h6>
            <h6>Feels like: {Math.round(reading.main.feels_like)} °F</h6>
            <div className="card-body">
              <p className="card-text">{reading.weather[0].description}</p>
            </div>
          </div>
        </div>
        </Link>
    </div>
  )

  
}


export default Days;