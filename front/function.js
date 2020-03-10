const url = {
    articles: "http://localhost:3000/users",
    clients: "url here",
    groupeContrat: "url here",
}

var tableBody = document.getElementById("tableBody")
var col_filter = 1

for (var i = 0; i < 5; i++) {
    var tr = document.createElement('tr')
    var th = document.createElement('th')
    th.setAttribute("scope", "row")
    th.innerHTML = i + 1
    tr.appendChild(th)
    for (var j = 0; j < 5; j++) {
        var td = document.createElement('td')
        td.innerHTML = ":)"
        tr.appendChild(td)
    }
    tableBody.appendChild(tr)

}

getData(url.articles)

makeAsserts();

function searchFunction() {

    var input, filter, table, tr, td, i, txtValue;
    input = document.getElementById("search");
    filter = input.value.toUpperCase();
    table = document.getElementById("table");
    tr = table.getElementsByTagName("tr");

    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[col_filter];
        if (td) {
            txtValue = td.textContent || td.innerText;
            if (txtValue.toUpperCase().indexOf(filter) > -1) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
}

function changeFilter(nbr) {
    col_filter = nbr
}

function getData(url) {
    const xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function () {
        // TODO : Gérer les codes retour
        if (this.readyState == 4 && this.status == 200) {
            const obj_resp = JSON.parse(this.responseText);

        }
    };
    xmlhttp.open('GET', url, true);
    xmlhttp.send();
}

function makeAsserts() {
    table = document.getElementById("table");
    tr = table.getElementsByTagName("tr");
    console.log("Nombre de lignes : " + tr.length)
    console.assert(tr.length == 6, "Le nombre de lignes est erroné")

    var total = 0
    for (i = 1; i < tr.length; i++) {
        total += tr[i].getElementsByTagName("td")[4].textContent || tr[i].getElementsByTagName("td")[4].innerHTML;
    }
    console.log("Somme des prix de vente : " + total)
    console.assert(total === 2000, "La somme des prix de ventes est erronée")
}
