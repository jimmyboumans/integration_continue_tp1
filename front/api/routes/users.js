var express = require('express');
var router = express.Router();

/* GET users listing. */
router.get('/', function (req, res, next) {

    const obj = [{
            "libelle": "Item1",
            categorie: "Categorie1",
            reference: "0001",
            prix_a: "50",
            prix_b: "80"
  },
        {
            "libele": "Item2",
            categorie: "Categorie2",
            reference: "0002",
            prix_a: "200",
            prix_b: "350"
  },
        {
            "libele": "Item3",
            categorie: "Categorie3",
            reference: "0003",
            prix_a: "425",
            prix_b: "700"
  },
];

    res.json(obj)
});

module.exports = router;
