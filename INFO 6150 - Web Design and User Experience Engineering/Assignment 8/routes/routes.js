const express = require('express');
const Model = require('../models/model');
const router = express.Router();
const pattern = /^([0-9A-Za-z])+[0-9A-Za-z_\.\-]+\@(northeastern)\.(edu)$/;
const passwordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9])(?=.{8,})/

const emailError = 'Invalid Email, must be @northeastern.edu'
const passwordError = 'Ensure password has one uppercase letter, one special case letter, one digit, one lowercase letter, minimum length 8'
const bcrypt = require('bcrypt')


//Post Method
router.post('/create', async (req, res) => {
    const data = new Model({
        email: req.body.email,
        password: req.body.password
    })
    try {
        let errorMessage = validateInput(req)
        if(errorMessage !== '') {
            throw new Error(errorMessage);
        }
        const dataToSave = await data.save();
        res.status(200).json(dataToSave)
    }
    catch (error) {
        res.status(400).json({ message: error.message})
    }
})

//Get all Method
router.get('/getAll', async (req, res) => {
    try {
        const data = await Model.find();
        res.json(data)
    }
    catch (error) {
        res.status(500).json({ message: error.message })
    }
})

//Get by ID Method
router.get('/getOne/:id', async (req, res) => {
    try {
        const data = await Model.findById(req.params.id);
        res.json(data)
    }
    catch (error) {
        res.status(500).json({ message: error.message })
    }
})

//Update by ID Method
router.patch('/edit/:id', async (req, res) => {
    try {
        let errorMessage = validateInput(req)
        if(errorMessage !== '') {
            throw new Error(errorMessage);
        }
        if(typeof req.body.password === 'string') {
            const salt = await bcrypt.genSalt(10)
            const hashPassword = await bcrypt.hash(req.body.password, salt)
            req.body.password = hashPassword
        }
        const id = req.params.id;
        const updatedData = req.body;
        const options = { new: true };
        const result = await Model.findByIdAndUpdate(
            id, updatedData, options
        )

        res.send(result)
    }
    catch (error) {
        res.status(500).json({ message: error.message })
    }
})

//Delete by ID Method
router.delete('/delete/:id', async (req, res) => {
    try {
        const user = req.body
        const id = req.params.id;
        const dbUser = await Model.findById(id)
        if(bcrypt.compareSync(user.password, dbUser.password) && user.email === dbUser.email) {
        const data = await Model.findByIdAndDelete(id)
        res.send(`Document with ${user.email} has been deleted..`)
    } else {
        throw new Error('Invalid email or password')
    }
    }
    catch (error) {
        res.status(400).json({ message: error.message })
    }
})

function validateInput(req) {
    let errorMessage = ''
    if(!(typeof req.body.email==='undefined') && !pattern.test(req.body.email)) {
        errorMessage = emailError
    }
    if(!(typeof req.body.password==='undefined') && !passwordPattern.test(req.body.password)) {
        if(errorMessage !== '') {
            errorMessage = errorMessage + ' | ' + passwordError
        }
        else errorMessage = passwordError
    }
    return errorMessage
}

module.exports = router;