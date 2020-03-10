var express = require('express');
var router = express.Router();

/* GET users listing. */
router.get('/', function(req, res, next) {

  const obj = [{
    "libele": "a", 
    categorie: "b", 
    reference: "c", 
    prix_a: "d", 
    prix_b: "e"
  },
  {
    "libele": "d", 
    categorie: "f", 
    reference: "g", 
    prix_a: "g", 
    prix_b: "h"
  },
  {
    "libele": "4", 
    categorie: "5", 
    reference: "6", 
    prix_a: "7", 
    prix_b: "8"
  },
];

  res.json(obj)
});

module.exports = router;
