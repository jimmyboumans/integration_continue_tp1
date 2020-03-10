// TODO: Refacto en cours
const url = {
    articles : "https://pokeapi.co/api/v2/pokemon/1",
    clients : "url here",
    groupeContrat: "url here",
} 

// 
const articles =  {
    id: Number,
    prix: Number,
}

const clients =  {
    id: Number,
    nomSociete: String,
    idGroupe: Number,
}

const groupeContrat = {
    id: Number,
    taux: Number,
    libelle: Number,
}

/*
** @method : getData(url)
*/
const api = {
    getData(url) {
        const xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function() {
            
            // TODO : Gérer les codes retour
            if (this.readyState == 4 && this.status == 200) {
                const obj_resp = JSON.parse(this.responseText);
                const string_resp = JSON.stringify(obj_resp);
        
                // dev : Debug ( a supprimer )
                document.createElement('div')
                const newContent = document.createTextNode(test);
                btn.appendChild(newContent);
                console.log(myArr);
                // end debug

                return (string_resp)
            }
        };
        
        xmlhttp.open('GET', url, true);
        xmlhttp.send();
    },
}

api.getData(url.articles);
