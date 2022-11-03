import React from "react";
import { Route, NavLink, HashRouter, Switch } from "react-router-dom";
import Home from "./pages/Home";
import AboutUs from "./pages/AboutUs";
import ContactUs from "./pages/ContactUs";
import Jobs from "./pages/Jobs";
import './index.css';

class App extends React.Component {
  render() {
    return (
      <HashRouter>
        <div class="bodyClass">
          <div class="navbarClass">
            <ul className="header">
              <li>
                <a href="/"><span class="title-color">MERV'S COFFEE PORTAL</span></a>
              </li>
              <li>
                <NavLink to="/">Home</NavLink>
              </li>
              <li>
                <NavLink to="/aboutUs">About us</NavLink>
              </li>
              <li>
                <NavLink to="/Jobs">Jobs</NavLink>
              </li>
              <li>
                <NavLink to="/contactUs">Contact</NavLink>
              </li>
            </ul>
          </div>
          <div className="content">
            <Switch>
              <Route exact path="/" component={Home} />
              <Route path="/aboutUs" component={AboutUs} />
              <Route path="/contactUs" component={ContactUs} />
              <Route path="/jobs" component={Jobs} />
            </Switch>
          </div>
        </div>
      </HashRouter>
    );
  }
}

export default App;
