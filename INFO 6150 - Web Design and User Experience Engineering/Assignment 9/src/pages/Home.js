import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActionArea from '@material-ui/core/CardActionArea';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import SearchBar from "material-ui-search-bar";
import logo from '../images/dunkin.jpg';
import logo1 from '../images/tatte.jpg';
import logo2 from '../images/starbucks.jpg';
import logo3 from '../images/coffee_inn.jpg';



import Grid from "@material-ui/core/Grid";



const useStyles = makeStyles((theme) =>({
    root: {
        flexGrow: 1,
        padding: theme.spacing(2)
      }
}));

export default function Home() {
  const classes = useStyles();

  const data = {
    name: [
      { restaurantName: "Dunkins", location: "East Boston" , img:logo},
      { restaurantName: "Tatte", location: "West Boston" , img: logo1},
      { restaurantName: "Starbucks", location: "Copley" , img:logo2},
      { restaurantName: "Coffee Inn", location: "Longwood" , img:logo3}
    ],
    id: [1]
  };

  return (
      <div>
        <SearchBar
            onChange={() => console.log('onChange')}
            onRequestSearch={() => console.log('onRequestSearch')}
            style={{
                margin: '0 auto',
                maxWidth: 800
            }}
            />
            <br>
            </br>
        {data.id.map((elem) => (
             <Grid
             container
             spacing={2}
             direction="row"
             justify="flex-start"
             alignItems="flex-start"
           >
        {data.name.map((elem) => (
            <Grid item xs={3} key={data.name.indexOf(elem)}>

    <Card className={classes.root}>
    
      <CardActionArea>
        <CardMedia
          component="img"
          alt="Restaurant Name"
          height="400"
          width="500"
          image={elem.img}
          title="Restaurant Name"
        />
        <CardContent>
          <Typography gutterBottom variant="h5" component="h2">
            {elem.restaurantName}
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p">
                {elem.location}
          </Typography>
        </CardContent>
      </CardActionArea>
      <CardActions>
        <Button size="small" color="primary">
          Share
        </Button>
        <Button size="small" color="primary">
          Order
        </Button>
      </CardActions>
       
    </Card>
    </Grid>
    ))}


    </Grid>
   ))}
    </div>
  );
}
