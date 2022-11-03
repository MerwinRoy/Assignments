import React , { Component } from 'react';

var moment = require('moment');

class HourlyData extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        const reading = this.props.reading;
        const newDate = new Date();
        const weekday = reading.dt * 1000;
        newDate.setTime(weekday)

        const fahrenheit = Math.round(reading.main.temp);
        const celsius = Math.round((fahrenheit - 32) * 5/9);
        const imgURL = `owf owf-${reading.weather[0].id} owf-5x`;

        return (
            <div className="col-md-3">
                <div className="card">
                    <div className="card-body">
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
            </div>
        )}
}

export default HourlyData;