import React, { Component } from 'react'
import jane from '../images/jane.jpg'
import mike from '../images/mike.jpg'
import merwin from '../images/merwin.JPG'
import '../index.css'

// const useStyles = makeStyles((theme) => ({

//   }));
class AboutUs extends Component {
  render() {
    return (
      <div>
        <div class='about-section'>
          <h1>About Us Page</h1>
          <p>Portal for best coffee recommendations,offers and shops around Boston.</p>
          <p>Given the love for Coffee, Merwin came up with the idea to create a portal for best coffee places at best prices.</p>
        </div>

        {/* <h2 style="text-align:center">Our Team</h2> */}
        <div class='row'>
          <div class='column'>
            <div class='card'>
              <img src={merwin} class='img-class' alt='Jane' />
              <div class='container'>
                <h2>Merwin Roy</h2>
                <p class='title'>CEO & Founder</p>
                <p>Merv's Coffee Shop is the brainchild of Merwin Roy.</p>
                <p>merwin@gmail.com</p>
                <p>
                  <button class='button'>Contact</button>
                </p>
              </div>
            </div>
          </div>

          <div class='column'>
            <div class='card'>
              <img src={mike} class='img-class' alt='Mike' />
              <div class='container'>
                <h2>Mike Ross</h2>
                <p class='title'>Market Analyst</p>
                <p>Mike is the marketing analyst of Merv's Coffee Portal</p>
                <p>mike@example.com</p>
                <p>
                  <button class='button'>Contact</button>
                </p>
              </div>
            </div>
          </div>

          <div class='column'>
            <div class='card'>
              <img src={jane} class='img-class' alt='Jane' />
              <div class='container'>
                <h2>Jane Doe</h2>
                <p class='title'>Designer</p>
                <p>Jane Doe is the designer of Merv's Coffee Portal.</p>
                <p>jane@example.com</p>
                <p>
                  <button class='button'>Contact</button>
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    )
  }
}

export default AboutUs
