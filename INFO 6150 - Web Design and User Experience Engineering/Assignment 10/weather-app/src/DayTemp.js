import React, { Component } from 'react';
import Days from './Days';
import HourlyData from './HourlyData';

var moment = require('moment');

class DayTemp extends React.Component {

    state = {
        _data : []
    }

    fullData = this.props.location.state;
    selectedDay = this.props.match.params;
    render() {
        return(
            <div className="container">
                <h6 className="display-3 jumbotron">{this.selectedDay.day} (3-Hour interval) Weather Forecast</h6>
                <h3 id="cityName" className="display-5 text-muted">{this.fullData.city}</h3>
                <div className="row justify-content-center">
                    {this.displayData()}
                </div>
            </div>
        )
    }

    componentDidMount = () => {
        const data = this.fullData.fullData.filter(s => 
            s.day == this.selectedDay.day  
        );
        this.setState({
            _data: data
        });
    }

    displayData = () => {
         return this.state._data.map((value, index) => 
            <HourlyData reading ={value} key= {index} />
         )
        }
}



export default DayTemp;