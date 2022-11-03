import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import WeekDays from './WeekDays';
import DayTemp from './DayTemp';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';

class App extends Component {
  render() {
    return(
      <Router>
      <div className="App">
        <Switch>
          <Route path="/" exact component={WeekDays}/>
          <Route path="/day/:day" component={DayTemp}/>
        </Switch>
      </div>
      </Router>
    )
  }
}

export default App;
