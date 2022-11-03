import React from 'react';
import Days from './Days';
import TextField from '@material-ui/core/TextField';

var moment = require('moment');


class WeekDays extends React.Component {
    state = {
        fullData: [],
        dailyWeatherData: [],
        cityName: "Boston",
        hasError: false
    }

    componentDidMount = () => {
        this.getData();
        // const ApiURL = `http://api.openweathermap.org/data/2.5/forecast?zip=${this.state.cityName}&units=imperial&APPID=fd6d1426896cca4fb8b216fa4319e32a`

        // fetch(ApiURL)
        //     .then(res => res.json())
        //     .then(data => {
        //         const dailyWeatherData = data.list.filter(reading => reading.dt_txt.includes("00:00:00"));
        //         data.list.map(function(name){
        //             let _date = new Date();
        //             const weekday = name.dt*1000;
        //             _date.setTime(weekday);
        //             name.day = moment(_date).format('dddd');
        //         })
        //         this.setState({
        //             fullData: data.list,
        //             dailyWeatherData: dailyWeatherData
        //         }, () => console.log(this.state))
        //     }) 
    }

    getData = () =>{
        const _url = `http://api.openweathermap.org/data/2.5/forecast?q=${this.state.cityName}&units=imperial&APPID=74cee5dabb840bae619810a6107a97f8`;
        fetch(_url)
            .then(res => res.json())
            .then(data => {
                const dailyWeatherData = data.list.filter(reading => reading.dt_txt.includes("00:00:00"));
                data.list.map(function(name){
                    let _date = new Date();
                    const weekday = name.dt * 1000;
                    _date.setTime(weekday);
                    name.day = moment(_date).format('dddd');
                  })
                this.setState({
                    hasError: false,
                    fullData: data.list,
                    dailyWeatherData: dailyWeatherData
                }, () => console.log(this.state));

            }).catch(err=>{
                this.setState({
                    hasError: true,
                    fullData: [],
                    dailyWeatherData: []
                });
            });
    }

    changeText = (event) =>{
        this.setState(
            {cityName : event.target.value}
        );
    }

    weekDays = () => {
        return this.state.dailyWeatherData.map((reading, index) => <Days reading = {reading} key = {index} fullData={this.state.fullData} city={this.state.cityName}/>)
    }
    

    render() {

        let display;
        console.log(this.state.fullData);
        if(this.state.fullData.length>0 || this.state.hasError=='false'){
             display= this.weekDays();
        }else{
            display = <h5>No data Found</h5>;
        }

        return (
            <div>
                <div className="container-fluid">
                    <h1 className="display-3 jumbotron">Weather Forecast App - (5 Days)</h1>
                    <TextField id="first-name" label="City Name" value={this.state.cityName} onChange = {this.changeText}/>
                    <input id="submitBtn" type="button" className="btn btn-dark mt-2" value="Submit" onClick={this.getData} disabled={this.state.cityName==0}/>
                    <h5 id = "cityName" className="display-5 text-muted">{this.state.cityName}</h5>
                    <div className="row justify-content-center">
                        {this.weekDays()}
                    </div>
                </div>
            </div>
        )
    }
}

export default WeekDays;