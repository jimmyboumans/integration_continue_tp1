var tableBody = document.getElementById("tableBody")

for (var i = 0; i < 5; i++) {
    var tr = document.createElement('tr')
    var th = document.createElement('th')
    th.setAttribute("scope", "row")
    th.innerHTML = i + 1
    tr.appendChild(th)
    for (var j = 0; j < 5; j++) {
        var td = document.createElement('td')
        td.innerHTML = "testetest"
        tr.appendChild(td)
    }
    tableBody.appendChild(tr)

}

function searchFunction() {

    var input, filter, table, tr, td, i, txtValue;
    input = document.getElementById("search");
    filter = input.value.toUpperCase();
    table = document.getElementById("table");
    tr = table.getElementsByTagName("tr");

    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[1];
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
