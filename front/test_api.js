// TODO: Refacto en cours
const url = {
    articles: "http://localhost:3000/users",
    clients: "url here",
    groupeContrat: "url here",
}

function getData(url) {
    const results = []
    const xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function () {
        // TODO : Gérer les codes retour
        if (this.readyState == 4 && this.status == 200) {
            const obj_resp = JSON.parse(this.responseText);
            results.push(obj_resp)
        }
    };
    xmlhttp.open('GET', url, true);
    xmlhttp.send();
    return results;
}

const resp = getData(url.articles)

