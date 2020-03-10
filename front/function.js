const url = {
    articles: "http://localhost:3000/users",
    clients: "url here",
    groupeContrat: "url here",
}

var tableBody = document.getElementById("tableBody")
var col_filter = 1

async function createTab() {
    const res = await getData(url.articles)
    return new Promise(function (resolve, reject) {
        for (var i = 0; i < res.length; i++) {
            var tr = document.createElement('tr')
            var th = document.createElement('th')
            th.setAttribute("scope", "row")
            th.innerHTML = i + 1
            tr.appendChild(th)
            for (var j = 0; j < Object.keys(res[i]).length; j++) {
                var td = document.createElement('td')
                td.innerHTML = res[i][Object.keys(res[i])[j]]
                tr.appendChild(td)
            }
            tableBody.appendChild(tr)
        }
        resolve()
    })
}

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

async function getData(url) {
    try {
        const a = await fetch(url)
        return a.json()
    } catch (e) {
        console.error(e)
    }
}

function makeAsserts() {
    tr = tableBody.getElementsByTagName("tr");
    console.log("Nombre de lignes : " + tr.length)
    console.assert(tr.length === 3, "Le nombre de lignes est erroné")

    var total = 0
    for (i = 0; i < tr.length; i++) {
        total += parseInt(tr[i].getElementsByTagName("td")[4].textContent || tr[i].getElementsByTagName("td")[4].innerHTML);
    }
    console.log("Somme des prix de vente : " + total)
    console.assert(total === 1130, "La somme des prix de ventes est erronée")
}

createTab().then(() => makeAsserts())
