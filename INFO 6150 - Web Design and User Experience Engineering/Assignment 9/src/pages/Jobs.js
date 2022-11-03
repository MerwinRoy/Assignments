import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import clsx from 'clsx';
import Card from '@material-ui/core/Card';
import CardHeader from '@material-ui/core/CardHeader';
import CardMedia from '@material-ui/core/CardMedia';
import CardContent from '@material-ui/core/CardContent';
import CardActions from '@material-ui/core/CardActions';
import Collapse from '@material-ui/core/Collapse';
// eslint-disable-next-line
import Avatar from '@material-ui/core/Avatar';
import IconButton from '@material-ui/core/IconButton';
import Typography from '@material-ui/core/Typography';
import { red } from '@material-ui/core/colors';
import FavoriteIcon from '@material-ui/icons/Favorite';
import ShareIcon from '@material-ui/icons/Share';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
// eslint-disable-next-line
import MoreVertIcon from '@material-ui/icons/MoreVert';
import Grid from "@material-ui/core/Grid";
import logo from '../images/barista.jpg';
import logo1 from '../images/waiter.jpg';
import logo2 from '../images/manager.jpg';


// import images from '../public/images/elliot.png'



const useStyles = makeStyles((theme) => ({
  root: {
    maxWidth: 345,
    margin: 20
  },
  media: {
    height: 0,
    paddingTop: '56.25%', // 16:9
  },
  expand: {
    transform: 'rotate(0deg)',
    marginLeft: 'auto',
    transition: theme.transitions.create('transform', {
      duration: theme.transitions.duration.shortest,
    }),
  },
  expandOpen: {
    transform: 'rotate(180deg)',
  },
  avatar: {
    backgroundColor: red[500],
  },
}));

export default function RecipeReviewCard() {
  const classes = useStyles();
  const [expanded, setExpanded] = React.useState(false);
  const [expanded1, setExpanded1] = React.useState(false);
  const [expanded2, setExpanded2] = React.useState(false);


  const handleExpandClick = () => {
    setExpanded(!expanded);
  };

  const handleExpandClick1 = () => {
    setExpanded1(!expanded1);
  };

  const handleExpandClick2 = () => {
    setExpanded2(!expanded2);
  };

  return (

    <div>

<div>
      <Grid container spacing={24}>
        <Grid item md={3}>
        <Card className={classes.root}>
      <CardHeader
        title="Barista at Starbucks"
      />
      <CardMedia
        className={classes.media}
        image={logo}
        title="Barista at Starbucks"
      />
      <CardContent>
        <Typography variant="body2" color="textSecondary" component="p">
        Expand to to see the Job Description

        </Typography>
      </CardContent>
      <CardActions disableSpacing>
        <IconButton aria-label="add to favorites">
          <FavoriteIcon />
        </IconButton>
        <IconButton aria-label="share">
          <ShareIcon />
        </IconButton>
        <IconButton
          className={clsx(classes.expand, {
            [classes.expandOpen]: expanded,
          })}
          onClick={handleExpandClick}
          aria-expanded={expanded}
          aria-label="show more"
        >
          <ExpandMoreIcon />
        </IconButton>
      </CardActions>
      <Collapse in={expanded} timeout="auto" unmountOnExit>
        <CardContent>
          <Typography paragraph>Roles and Responsibility:</Typography>
          <Typography paragraph>
          1.	Preparing and serving hot and cold drinks such as coffee, tea, artisan and speciality beverages.
          <br></br>
2.	Cleaning and sanitising work areas, utensils and equipment.  <br></br>
3.	Excellent listening, interpersonal, written, and oral communication skills   <br></br>
4.	Cleaning service and seating areas.   <br></br>
5.	Describing menu items and suggesting products to customers.   <br></br>
          </Typography>
         
        </CardContent>
      </Collapse>

      
    </Card>
        </Grid>
        <Grid item md={3}>
        <Card className={classes.root}>
      <CardHeader
        // avatar={
        //   <Avatar aria-label="recipe" className={classes.avatar}>
        //     R
        //   </Avatar>
        // }
        // action={
        //   <IconButton aria-label="settings">
        //     <MoreVertIcon />
        //   </IconButton>
        // }
        title="Cafe Front of House Team at Tatte"
        // subheader="September 14, 2016"
      />
      <CardMedia
        className={classes.media}
        image={logo1}
        title="Cafe Front of House Team at Tatte"
      />
      <CardContent>
        <Typography variant="body2" color="textSecondary" component="p">
        Expand to to see the Job Description

        </Typography>
      </CardContent>
      <CardActions disableSpacing>
        <IconButton aria-label="add to favorites">
          <FavoriteIcon />
        </IconButton>
        <IconButton aria-label="share">
          <ShareIcon />
        </IconButton>
        <IconButton
          className={clsx(classes.expand1, {
            [classes.expandOpen]: expanded1,
          })}
          onClick={handleExpandClick1}
          aria-expanded={expanded1}
          aria-label="show more"
        >
          <ExpandMoreIcon />
        </IconButton>
      </CardActions>
      <Collapse in={expanded1} timeout="auto" unmountOnExit>
        <CardContent>
        <Typography paragraph>Roles and Responsibility:</Typography>
          <Typography paragraph>
          1. Delivering food from the kitchen to the guests.
          <br></br>
2.	
Image result for waiter responsibilities
Greeting guests and taking drink and food orders. Staying attentive to the needs of guests in the dining area.  <br></br>
3.	Excellent listening, interpersonal, written, and oral communication skills   <br></br>
4.	Ensuring the food order is made correctly by kitchen staff and looks presentable for guests.   <br></br>


          </Typography>
        </CardContent>
      </Collapse>

      
    </Card>
        </Grid>
        <Grid item md={3}>
        <Card className={classes.root}>
      <CardHeader
       
        title="Manager at Coffee Inn"
      />
      <CardMedia
        className={classes.media}
        image={logo2}
        title="Manager at Coffee Inn"
      />
      <CardContent>
        <Typography variant="body2" color="textSecondary" component="p">
          Expand to to see the Job Description
        </Typography>
      </CardContent>
      <CardActions disableSpacing>
        <IconButton aria-label="add to favorites">
          <FavoriteIcon />
        </IconButton>
        <IconButton aria-label="share">
          <ShareIcon />
        </IconButton>
        <IconButton
          className={clsx(classes.expand2, {
            [classes.expandOpen]: expanded2,
          })}
          onClick={handleExpandClick2}
          aria-expanded={expanded2}
          aria-label="show more"
        >
          <ExpandMoreIcon />
        </IconButton>
      </CardActions>
      <Collapse in={expanded2} timeout="auto" unmountOnExit>
        <CardContent>
        <Typography paragraph>Roles and Responsibility:</Typography>
          <Typography paragraph>
          1.	Effectively recruiting and managing employees, overseeing operations, handling customer complaints, and generating financial reports
          <br></br>
2.	Ensure health and safety regulations and manage inventory.  <br></br>
3.	Excellent listening, interpersonal, written, and oral communication skills   <br></br>
4.	Conducting guest satisfaction checks on the floor.  <br></br>
5.	Ability to effectively prioritize and execute tasks while under pressure   <br></br>
6.	Strong customer service orientation   <br></br>
7.	Experience working in a team-oriented, collaborative environment   <br></br>


          </Typography>
        </CardContent>
      </Collapse>

      
    </Card>
        </Grid>
      </Grid>
    </div>


    
    
    
    
    

    
    </div>
  );
}
